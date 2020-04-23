
public class Hairetu3 {

	public static void main(String[] args) {
		//intの配列numsに8,5,9,2,4を入れる
		int[] nums = {8,5,9,2,4};

		//配列の中身を全て表示
		System.out.print("numsの中身：");
		for(int value:nums) {
			System.out.print(value + " ");
		}
		System.out.println();
		System.out.println();

		//配列の中身の合計値を表示
		int sum = 0;
		for(int value:nums) {
			sum += value;
		}
		System.out.println("配列の中身の合計値：" + sum);
		System.out.println();

		//5以上の個数を表示
		int count = 0;
		for(int value:nums) {
			if(value >= 5) {
				count++;
			}
		}
		System.out.println("5以上の個数:" + count);
		System.out.println();

		//全ての要素を2倍に書き換える
		System.out.print("2倍に書き換えた配列：");
		for(int i=0; i<nums.length; i++) {
			nums[i] = nums[i] * 2;
			System.out.print(nums[i] + " ");
		}
		System.out.println();
		System.out.println();

		//要素の最大値を求める
		int max = 0;
		for(int value:nums) {
			if(max < value) {
				max = value;
			}
		}
		System.out.println("最大値は：" + max);

	}

}
