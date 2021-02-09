class Main{
	public static void main(String[] args) {
		System.out.println("1-st task");
		task1();
		System.out.println("2-nd task");
		task2();
		System.out.println("3-rd task");
		task3();
		System.out.println("4-th task");
		task4();
		System.out.println("5-th task");
		task5();
		System.out.println("6-th task");
		task6();
		System.out.println("7-th task");
		task7();
		System.out.println("8-th task");
		task8();
		System.out.println("9-th task");
		task9();
		System.out.println("10-th task");
		task10();

	}
	public static void task1(){
		System.out.println(convert(5));
		System.out.println(convert(3));
		System.out.println(convert(2));
	}
	static int convert(int min){
		return min * 60;
	}
	public static void task2(){
		System.out.println(points(13, 12));
		System.out.println(points(17, 12));
		System.out.println(points(38, 8));
	}
	static int points(int d, int t){
		return d * 2 + t * 3;
	}
	public static void task3(){
		System.out.println(footballPoints(3, 4, 2));
		System.out.println(footballPoints(5, 0, 2));
		System.out.println(footballPoints(0, 0, 1));
	}
	static int footballPoints(int w, int d, int l){
		return w * 3 + d;
	}
	public static void task4(){
		System.out.println(divisibleByFive(5));
		System.out.println(divisibleByFive(-55));
		System.out.println(divisibleByFive(37));
	}
	static boolean divisibleByFive(int num){
		if (num % 5 == 0){
			return true;
		}else{
			return false;
		}
	}
	public static void task5(){
		System.out.println(and(true, false));
		System.out.println(and(true, true));
		System.out.println(and(false, true));
		System.out.println(and(false, false));
	}
	static boolean and(boolean a, boolean b){
		if ((a == true) && (b == true)){
			return true;
		}else{
			return false;
		}
	}
	public static void task6(){
		System.out.println(howManyWalls(54, 1, 43));
		System.out.println(howManyWalls(46, 5, 4));
		System.out.println(howManyWalls(100, 4, 5));
		System.out.println(howManyWalls(10, 15, 12));
		System.out.println(howManyWalls(41, 3, 6));
	}
	static int howManyWalls(int n, int w, int h){
		return n / (w * h);
	}
	public static void task7(){
		System.out.println(Challenge.squared(5));
		System.out.println(Challenge.squared(9));
		System.out.println(Challenge.squared(100));
	}
	public static void task8(){
		System.out.println(profitableGamble(0.2, 50, 9));
		System.out.println(profitableGamble(0.9, 1, 2));
		System.out.println(profitableGamble(0.9, 3, 2));
	}
	static boolean profitableGamble(double prob, int prize, int pay){
		if ((prob * prize) > pay)
			return true;
		return false;
	}
	public static void task9(){
		System.out.println(frames(1, 1));
		System.out.println(frames(10, 1));
		System.out.println(frames(10, 25));
	}
	static int frames(int fps, int min){
		return fps * min * 60;
	}
	public static void task10(){
		System.out.println(mod(5, 2));
		System.out.println(mod(218, 5));
		System.out.println(mod(6, 3));
	}
	static int mod (int a, int b){
		while(a >= 0){
			a -= b;
		}
		return a+=b;
	}
}
class Challenge {
	public static int squared(int a) {
		return a * a; // it was be fixed
	}
}