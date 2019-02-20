with Ada.Text_IO, Ada.Integer_Text_IO;
use Ada.Text_IO, Ada.Integer_Text_IO;
with Ada.Containers.Vectors;
use Ada.Containers;

-- Usage: Run `gnatmake adaprimes.abd` in the terminal.
-- Then run `./adaprimes` in the terminal.
-- Then enter the number you want prime partitions of.

procedure Adaprimes is
    package Integer_Vectors is new Vectors(Natural, Integer);
    cursor : Integer_Vectors.Cursor;
    lst : Integer_Vectors.Vector;

function isPrime(N: Integer) return Boolean is
    X : Integer := 2;

    begin
        if N = 1 then
            return false;
        end if;
        if N = 2 then
            return true;
        end if;
        for X in 2 .. N - 1 loop
            if N mod X = 0 then
                return false;
            end if;
        end loop;
    return true;
end isPrime;

function primes(bottom: Integer; top: Integer) return Integer_Vectors.Vector is
    prime_list : Integer_Vectors.Vector;
    
    begin
        for X in bottom .. top loop 
            if isPrime(X) then
                prime_list.append(X);
            end if;
        end loop;        
    return prime_list;
end primes;

procedure prime_partitions(n: Integer; k: Integer; lst: in out Integer_Vectors.Vector) is
    temp_lst : Integer_Vectors.Vector;
    prime_list : Integer_Vectors.Vector;
    this_element : Integer;

    begin
        temp_lst := lst;

        if n = 0 then
            Cursor := Integer_Vectors.First(lst);
            while Integer_Vectors.Has_Element(Cursor) loop
                Put(Integer_Vectors.Element(Cursor));
                Integer_Vectors.Next(Cursor);
            end loop;
            New_Line;

        elsif n > k then
            prime_list := primes(k+1, n);

            for i in prime_list.Iterate loop
                this_element := Integer_Vectors.Element(i);
                temp_lst := lst;
                temp_lst.Append(this_element);
                prime_partitions(n-this_element, this_element, temp_lst);
            end loop;
        end if;

end prime_partitions;

Input : Integer;
begin
    Put("Enter a number: ");
    Get(Input);  
    prime_partitions(Input, 1, lst);

end Adaprimes;
