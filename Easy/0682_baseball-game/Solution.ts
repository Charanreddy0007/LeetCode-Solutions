function calPoints(operations: string[]): number {
    const stack: number[] = [];
    for (const op of operations) {
        if (op === "C") {
            stack.pop();
        } else if (op === "D") {
            stack.push(2 * stack[stack.length - 1]);
        } else if (op === "+") {
            stack.push(stack[stack.length - 1] + stack[stack.length - 2]);
        } else {
            stack.push(parseInt(op, 10));
        }
    }
    return stack.reduce((sum, score) => sum + score, 0);
}