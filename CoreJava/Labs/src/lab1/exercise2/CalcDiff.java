package lab1.exercise2;

public class CalcDiff {
	public static int calculateDifference(int n) {
		int Sum, SqrSum = 0, OnlySum = 0, OnlySumSqr = 0;
		for (int i = 1; i <= n; i++) {
			SqrSum = SqrSum + i * i;
		}
		for (int i = 1; i <= n; i++) {
			OnlySum = OnlySum + i;
		}
		OnlySumSqr = OnlySum * OnlySum;
		Sum = SqrSum - OnlySumSqr;
		return Sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 3;
		int sum = calculateDifference(number);
		System.out.println("Sum of numbers: " + sum);
	}

}
