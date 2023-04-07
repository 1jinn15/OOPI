import java.util.Scanner;

public class A1083323_0331{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        showinfo();

        Animal animal1 = new Animal("雪寶", 1.1, 52, 100);
        Animal animal2 = new Animal("驢子", 1.5, 99, 200);

        Human human1 = new Human("阿克", 1.9, 80, "男", 150);
        Human human2 = new Human("漢斯", 1.8, 78, "男", 130);
        Human human3 = new Human("安那", 1.7, 48, "女", 120);

        Snow snow = new Snow("愛沙", 1.7, 50, "女", true, 120);
        

        animal1.show();
        System.out.println("輸入"+animal1.name+"的時間:");
        int x = sc.nextInt();
        System.out.println("輸入"+animal1.name+"的加速度(不須加速度則輸入0):");
        double y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+animal1.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+animal1.distance(x));
	}
        System.out.println();
        
        animal2.show();
	System.out.println("輸入"+animal2.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+animal2.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+animal2.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+animal2.distance(x));
	}
        System.out.println();
        

    human1.show();
    System.out.println("輸入"+human1.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+human1.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+human1.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+human1.distance(x));
	}
    System.out.println();

    human2.show();
    System.out.println("輸入"+human2.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+human2.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+human2.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+human2.distance(x));
	}
    System.out.println();
       
    human3.show();
    System.out.println("輸入"+human3.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+human3.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+human3.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+human3.distance(x));
	}
    System.out.println();

    snow.show();
    System.out.println("輸入"+snow.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+snow.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+snow.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+snow.distance(x));
	}
    System.out.println();
        
    }
        public static void showinfo(){
            System.out.println("歡迎進入冰雪奇緣系統");
            System.out.println();
        }

}