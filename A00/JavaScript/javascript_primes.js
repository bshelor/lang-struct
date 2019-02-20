// Usage: Run `node javascript_primes.js` in the terminal. 
// Then enter the number that you want to find prime partitions of.

const readline = require('readline');

function is_prime(n) {
    if (n <= 1) { return false; }
    for (var x = 2; x < parseInt(Math.sqrt(n) + 1); x++) {
        if (n % x == 0) {
            return false;
        }
    }
    return true;
}

function primes(a, b) {
    var prime_list = [];
    for (var i = a; i < b + 1; i++) {
        if (is_prime(i)) {
            prime_list.push(i);
        }
    }
    return prime_list;
} 

function prime_partitions(n, k = 1, lst = []) {
    if (n == 0) {
        console.log(lst.join(" + "));
    }
    else if (n > k) {
        var prime_list = primes(k + 1, n);

        prime_list.forEach (function(p) {
            prime_partitions(n - p, p, lst.concat([p]));
        });
    }
}

function main() {
    const rl = readline.createInterface({
        input: process.stdin,
        output: process.stdout
    });
    
    rl.question('Enter a number: ', (input) => {        
        prime_partitions(input);
        rl.close();
    });
}

main();
