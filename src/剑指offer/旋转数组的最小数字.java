package 剑指offer;

/**
 * Created by xieli on 2020/9/6.
 */
public class 旋转数组的最小数字 {

    public int minArray(int[] numbers) {
        int left = 0, right = numbers.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (numbers[mid] > numbers[right])
                left = mid + 1;

            else if (numbers[mid] < numbers[right])
                right = mid;
            //无法判断，缩小范围
            else if (numbers[mid] == numbers[right])
                right = right - 1;
        }
        return numbers[left];
    }

}
