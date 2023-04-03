import java.util.Scanner;

public class A1083323_0324_1{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
        animal animal1 = new animal("雪寶", 1.1, 52, 100);
        animal animal2 = new animal("驢子", 1.5, 99, 200);
        animal animal3 = new animal("安那", 1.7, 48, 120);
        animal animal4 = new animal("愛沙", 1.7, 50, 120);

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
        animal3.show();
	System.out.println("輸入"+animal3.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+animal3.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+animal3.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+animal3.distance(x));
	}
    System.out.println();
        animal4.show();
	System.out.println("輸入"+animal4.name+"的時間:");
        x = sc.nextInt();
        System.out.println("輸入"+animal4.name+"的加速度(不須加速度則輸入0):");
        y = sc.nextDouble();
	if(y!=0){
		System.out.println("奔跑距離: "+animal4.distance(x,y));
	}else{
		System.out.println("奔跑距離: "+animal4.distance(x));
	}

    }
    public static class animal{
        private String name;
        private double height;
        private double weight;
        private double speed;

        public animal(String name,double height,double weight,double speed){
            this.name = name;
            this.height = height;
            this.speed = speed;
            this.weight = weight;
        }
        public void show(){
            System.out.println("項目姓名: "+name);
            System.out.println("身高(m): "+height);
            System.out.println("體重(kg): "+weight);
            System.out.println("速度(m/mins): "+speed);
        }
        public double distance(int time,double a){
            return time*a*speed;
        }
        public double distance(int time){
            return time*speed;
        }
    }
}

