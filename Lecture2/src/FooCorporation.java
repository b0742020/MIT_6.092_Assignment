public class FooCorporation {

	// 檢查工資是否低於最低工資
	public static boolean payCheck(double basePay) {
		System.out.println("Checking pay");
		return basePay < 8.0;
	}

	// 檢查工時是否超過60小時
	public static boolean hoursCheck(double hours) {
		System.out.println("Checking hours");
		return hours > 60;
	}

	// 計算工資
	public static double wageCalculator(double basePay, double hours) {
		if (hours > 40) {
			return basePay * 40 + (hours - 40) * 1.5 * basePay;
		} else {
			return basePay * hours;
		}
	}

	// 處理員工邏輯
	public static void processEmployee(String employeeName, double basePay, double hours) {
		boolean payError = payCheck(basePay);
		boolean hoursError = hoursCheck(hours);

		if (payError) {
			System.out.println(employeeName + " ERROR: Base pay below minimum wage!");
		} else if (hoursError) {
			System.out.println(employeeName + " ERROR: Exceeded maximum working hours!");
		} else {
			double wage = wageCalculator(basePay, hours);
			System.out.println(employeeName + " Wage: " + wage);
		}
	}

	public static void main(String[] args) {
		processEmployee("Employee 1", 7.50, 35); // 錯誤：工資低於最低工資
		processEmployee("Employee 2", 8.20, 47); // 正常
		processEmployee("Employee 3", 10.00, 73); // 錯誤：工時超過60小時
	}
}
