public class Animal extends A1083323_0331{
        public String name;
        public double height;
        public double weight;
        public double speed;

        public Animal(String name,double height,double weight,double speed){
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