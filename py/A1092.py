#https://codeforces.com/contest/1092/problem/A

for _ in iters():
    n, k = stdin()
    print joint('', ([chr(ord('a') + i%k) for i in xrange(n)]))
