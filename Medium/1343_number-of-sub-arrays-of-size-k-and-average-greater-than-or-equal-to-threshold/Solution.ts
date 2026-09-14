function numOfSubarrays(arr: number[], k: number, threshold: number): number {
    let count = 0;
    let sum = 0;

    for (let i = 0; i < k; i++) {
        sum += arr[i];
    }

    if (sum >= threshold * k) {
        count++;
    }

    for (let i = k; i < arr.length; i++) {
        sum -= arr[i - k];
        sum += arr[i];

        if (sum >= threshold * k) {
            count++;
        }
    }

    return count;
}