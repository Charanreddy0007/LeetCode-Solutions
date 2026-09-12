var reverseWords = function(s) {
    let words = s.trim().split(/\s+/);
    let left = 0;
    let right = words.length - 1;
    while (left < right) {
        let temp = words[left];
        words[left] = words[right];
        words[right] = temp;
        left++;
        right--;
    }
    return words.join(" ");
};