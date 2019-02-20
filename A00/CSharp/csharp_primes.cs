using System;
using System.Collections.Generic;
using System.Linq;

// Usage: Run `mcs csharp_primes.cs` in the terminal to compile.
// Then run `mono csharp_primes.exe` in the terminal to execute. 
// Then enter the number that you want to find prime partitions of.

public class Program {
	public static void Main(string[] args) {
		Console.WriteLine ("Enter a number: ");
		var input = Int32.Parse(Console.ReadLine());

		List<int> lst = new List<int>();
		prime_partitions(input, 1, lst);
	}

	public static Boolean is_prime(int n) {
		if (n <=1) { 
			return false;
		}
		for (int x = 2; x <= (int)(Math.Sqrt(n)); x++) {
			if (n % x == 0) {
				return false;
			}
		}
		return true;
	}
	
	public static List<int> primes(int a, int b) {
		var prime_list = new List<int>();
		for (int i = a; i < b + 1; i++) {
			if (is_prime(i)) {
				prime_list.Add(i);
			}
		}
		return prime_list;		
	}

	public static void prime_partitions(int n, int k, List<int> lst = null) {
		lst = lst ?? new List<int>();
		if (n == 0) {
			Console.WriteLine(String.Join(" + ", lst));
		}
		else if (n > k) {
			var prime_list = primes(k + 1, n);

			foreach (int p in prime_list) {
				var temp_list = new List<int>(lst);
				temp_list.Add(p);
				prime_partitions(n - p, p, temp_list);
			}
		}
	}
}
