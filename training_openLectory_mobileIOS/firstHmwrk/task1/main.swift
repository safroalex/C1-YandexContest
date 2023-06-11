var countSteps = 1;

if let input = readLine(), var blocks = Int(input) {
    while blocks > 0 {
        blocks -= countSteps
        if blocks - countSteps <= 0 {
            break
        }
        countSteps += 1
    }
}
print(countSteps)

