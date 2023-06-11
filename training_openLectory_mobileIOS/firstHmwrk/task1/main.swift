/*
 math soulution;
 we'll use S=k*(k+1)/2 arithmetic formula
 where S = amout of blocks, k = steps
 n >= k*(k+1)/2
 2n >= k*(k+1)
 0 >= k*(k+1) - 2n
 k^2 + k - 2n
 D = 1 + 8n
 k = -1 + sqrt(D) / 2
 */
import Foundation

func solv(n: Int) -> Int {
    let D = 1 + 8*n
    let k = (-1 + sqrt(Double(D)))/2
    return Int(k)
}

if let input = readLine(), var n = Int(input) {
    print(solv(n: n))
}

