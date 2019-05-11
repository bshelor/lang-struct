prods :: Int -> [Int]
prods n = [n*n, (n*n)+n ..]

mix :: [Int] -> [Int] -> [Int]
mix [] [] = []
mix xs [] = xs
mix [] ys = ys
mix (x:xs) (y:ys) = do
    if x == y then do 
        x : (mix xs ys)
    else if x < y then do 
        x : (mix xs (y:ys))
    else
        y : (mix (x:xs) ys)

inList :: Int -> [Int] -> Bool
inList n [] = False
inList n (x:xs)
    | n == x = True
    | n < x = False
    | otherwise = inList n xs

sieve :: [Int] -> [Int] -> [Int]
sieve [] ys = []
sieve (x:xs) ys = do
    let addProdsList = prods x
    let mixList = mix ys addProdsList in
        if inList x ys == False then do
            let ys = mixList in
                x : (sieve xs ys)
        else
            let ys = mixList in
                sieve xs ys

concatToLimit :: Int -> [Int] -> [Int] -> [Int]
concatToLimit limit (x:xs) zs 
    | length zs == limit = zs
    | otherwise = concatToLimit limit xs (zs++[x])

firstn :: Int -> [Int]
firstn n = do
    let primesList = sieve [2..] [] in
        concatToLimit n primesList []

primesto :: Int -> [Int]
primesto 1 = []
primesto n = sieve [2..n] []
            
printList :: [Int] -> IO ()
printList [] = return ()
printList [x] = print(x)
printList (x:xs) = do
    putStr(show x)
    putStr ","
    printList xs

main :: IO()
main = do
    -- let prodsList = prods 5
    -- printList prodsList
    -- let finalList = mix [1,3,5,8] [2,3,4,7,9]
    -- printList finalList
    -- let finalList = sieve [2..7] []
    -- printList finalList
    -- let finalList = firstn 6
    -- printList finalList
    -- let finalList = primesto 30
    -- printList finalList
    -- let result = inList 11 prodsList
    -- print result