class Human extends Animal{
        public String gender;
        public Human(String name,double height,double weight,String gender,double speed){
            super(name,height,weight,speed);
            this.gender = gender;
        }

        public void show(){
            System.out.println("項目姓名: "+this.name);
            System.out.println("身高(m): "+this.height);
            System.out.println("體重(kg): "+this.weight);
            System.out.println("性別: "+this.gender);
            System.out.println("速度(m/mins): "+this.speed);
        }
    
}
