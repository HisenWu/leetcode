package sy.leetcode;

import java.util.HashMap;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
		//��hashMap����Ϊ��ȡֵ��ʱ�临�Ӷ�ΪO(1)
		int[] indexs = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i=0; i<numbers.length; i++) {
			Integer n = map.get(numbers[i]);
			if (n == null) {
				map.put(numbers[i], i);
				System.out.println("what we put: numbers[i]" + numbers[i] + "  i" + i);
				
			}
			Integer n2 = map.get(target - numbers[i]);
			if (n2 != null && n2 < i) {
				indexs[0] = i;
				indexs[1] = n2;
				break;
			}
		}
		System.out.println(indexs[0]);
		System.out.println(indexs[1]);
		return indexs;
		//����ķ���ʱ����Ѿ��ź�������飬ʱ�临�Ӷ�ΪO(n)
		/*int low = 0;
		int high = numbers.length-1;
		int[] indexs = new int[2];
		while(low != high) {
			if(numbers[low]+numbers[high] == target) {
				indexs[0] = low;
				indexs[1] = high;
		System.out.println(low);
		System.out.println(high);
				return indexs;
			} else if (numbers[low] + numbers[high] < target) {
				low++;
			} else if (numbers[low] + numbers[high] > target) {
				high--;
			}
		}
		return null;*/
	}

	public static void main (String[] args) {
		int[] num = new int[] {3,2,4};
		int[] num1 = new int[] {1,2,3,4,5,6,7,8,9,10};
		
		TwoSum.twoSum(num, 6);
		TwoSum.twoSum(num1, 11);
	}
}
