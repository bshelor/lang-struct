% Usage: Run `swipl prolog_primes.pl` in the terminal. 
% Then run `main().` in the terminal.
% Then enter the number that you want to find prime partitions of.

isPrime(N) :-
    N < 2 -> false;             % Less than 2 is false
    isPrimeRecursive(N, 2).     % Call recursive function

isPrimeRecursive(N, M) :-
    N is M -> true;                 % If M gets incremented to N, it hasn't hit false yet so it's prime
    0 is N mod M -> false;          % If N can be divded evenly by any M, it's not prime
    isPrimeRecursive(N, M + 1).     % Call recursive with incrementing M    

% ----------------------------------------------------------------------------------------------------------

primes(Max, Primes) :-
    primesRecursive(Max, 2, [], Primes).        % Call recursive function

primesRecursive(Max, TestPrime, PrimesList, Primes) :-
    Max < 2 -> Primes = [];                                                 % If Max is less than 2, return empty list
    TestPrime > Max -> Primes = PrimesList;                                 % If TestPrime is greater than Max, assign Primes to PrimeList 
    isPrime(TestPrime) -> append(PrimesList, [TestPrime], UpdatedPrimes),   % If TestPrime is Prime, add TestPrime to PrimesList - called UpdatedPrimes 
    NewTest is TestPrime+1,                                                 % Increment TestPrime
    primesRecursive(Max, NewTest, UpdatedPrimes, Primes);                   % Call recursively (with UpdatedPrimes)
    NewTest is TestPrime+1,                                                 % Increment TestPrime        
    primesRecursive(Max, NewTest, PrimesList, Primes).                      % Call recursively (with PrimesList)

% ----------------------------------------------------------------------------------------------------------

main() :-
    write("Enter a number: \n"),              % Ask user for input
    read(N),                                % Read user input and assign it to N                
    primes(N, Primes),                      % Call primes to get all primes from 2 to N -> assign it to Primes            
    primePartition(N, [], Primes, []).      % Call primePartition

primePartition(N, WorkingList, PrimesList, PrimePartition) :-
    N = 0 -> atomic_list_concat(WorkingList, ' + ', Formatted),     % If N = 0, create a Formatted list
    write(Formatted),                                               % Write Formatted list if it exists
    nl;                                                             % New line
    N < 0 -> PrimePartition = [];                                   % If N is less than 0, reset PrimePartition
    PrimesList = [] -> PrimePartition = [];                         % If PrimesList is empty, reset PrimePartition
    PrimesList = [M | End],                                         % Splits PrimesList into M and End (M is first element)
    append(WorkingList, [M], NewList),                              % Add M to WorkingList -> assign it to NewWorkingList
    Diff is N - M,                                                  % Assign Diff to N - M    
    primePartition(Diff, NewList, End, PrimePartition),             % Call primePartition recursively with Diff and NewList
    primePartition(N, WorkingList, End, PrimePartition).            % Call primePartition recursively with N and WorkingList
