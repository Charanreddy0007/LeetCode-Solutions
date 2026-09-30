function reverseString(s: string[]): void {
    let first = 0;
    let last = s.length - 1;
    while (first < last) {
        let temp = s[first];
        s[first] = s[last];
        s[last] = temp;
        first++;
        last--;
    }
};