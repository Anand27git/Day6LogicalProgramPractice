
public class CouponNo {

	public static void main(String[] args) {
		// declaring an Array values
		int[] cuponNumber = { 2, 5, 6, 8 };
		int[] randomList = new int[cuponNumber.length];
		int totalRandoms = 0;
		int checkCount = 0;
		while (checkCount < cuponNumber.length) {
			System.out.println(checkCount);
			totalRandoms++;
			int randomNum = (int) (Math.random() * (9)) + 1;
			System.out.println("Random value:" + randomNum);
			if (checkValue(randomNum, cuponNumber) && !checkValue(randomNum, randomList)) {
				randomList[checkCount] = randomNum;
				checkCount = checkCount + 1;
			}
		}
		System.out.println("Total Randoms" + totalRandoms);
	}

	public static boolean checkValue(int randomNum, int[] arrayObj) {
		for (int i = 0; i < arrayObj.length; i++) {
			if (arrayObj[i] == randomNum) {
				return true;
			}
		}
		return false;
	}
}
