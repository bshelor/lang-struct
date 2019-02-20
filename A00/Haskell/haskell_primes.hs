-- Usage: Run `ghci haskell_primes.hs` in the terminal.
-- Then run `main` in the interpreter.
-- Then enter a number that you want to get prime partitions of.

is_prime :: Int -> Bool
is_prime 1 = False
is_prime 2 = True
is_prime n | (length [x | x <- [2 .. n-1], mod n x == 0]) > 0 = False | otherwise = True

primes :: Int -> [Int]
primes end = filter (is_prime) [2..end]

prime_partitions :: Int -> [Int] -> [Int] -> IO()
prime_partitions n lst primes = do
    let current = head primes
        rest = tail primes in
            if n == 0 then do
                printList(lst)
            else if rest == [] || primes == [] then return ()
            else
                prime_partitions (n-current) (lst ++ [current]) rest >> 
                prime_partitions n lst rest

printList :: [Int] -> IO ()
printList [] = return ()
printList [x] = print(x)
printList (x:xs) = do
    putStr(show x)
    putStr " + "
    printList xs

main :: IO()
main = do
    putStrLn "Enter a number: "
    n <- getLine
    let intN = read n
    let prime_list = primes intN
    prime_partitions intN [] prime_list
