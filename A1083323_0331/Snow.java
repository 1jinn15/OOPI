public class Snow extends Human{
    public boolean skill;
    public Snow(String name,double height,double weight,String gender,boolean skill,double speed){
            super(name,height,weight,gender,speed);
            this.skill = skill;
    }

    public void show(){
        System.out.println("項目姓名: "+this.name);
        System.out.println("身高(m): "+this.height);
        System.out.println("體重(kg): "+this.weight);
        System.out.println("性別: "+this.gender);
        System.out.println("冰凍技能: "+this.skill);
        System.out.println("速度(m/mins): "+this.speed);
    }

    public double distance(int time,double a){
        return (time*a*speed)*2;
    }
    public double distance(int time){
        return (time*speed)*2;
    }
}