function reverseWords(s: string): string {
    let words: string[] = s.trim().split(/\s+/);
    let left: number = 0;
    let right: number = words.length - 1;
    while (left < right) {
        let temp: string = words[left];
        words[left] = words[right];
        words[right] = temp;
        left++;
        right--;
    }
    return words.join(" ");
}