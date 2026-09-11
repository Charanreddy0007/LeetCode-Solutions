var maxArea = function(height) {
    let left = 0;
    let right = height.length - 1;
    let max = 0;

    while (left < right) {
        let area = Math.min(height[left], height[right]) * (right - left);

        if (area > max) {
            max = area;
        }

        if (height[left] < height[right]) {
            left++;
        } else {
            right--;
        }
    }

    return max;
};