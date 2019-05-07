-- Possible prods implementation
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


-- Possible firstn implementation
-- firstn :: Int -> [Int]
-- firstn n = sieve [2..primesto n][]

-- Possible primesto implementation
-- primesto :: Int -> [Int]
-- primesto n | n < 2 = []
--             | sieve [2..n][]

printList :: [Int] -> IO ()
printList [] = return ()
printList [x] = print(x)
printList (x:xs) = do
    putStr(show x)
    putStr " + "
    printList xs

main :: IO()
main = do
    -- let prodsList = prods 5
    let finalList = mix [1,3,5,8] [2,3,4,7,9]
    printList finalList