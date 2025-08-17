public  abstract class Fish {
    protected String name;
    protected int age;
    protected String favFood;

    public Fish(String name, int age, String favFood) {
        this.name = name;
        this.age = age;
        this.favFood = favFood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public String takeTheCar(){
        return "Car";
    }

    public String takeTheTrain(){
        return "Train";
    }

    public String walkByFoot(){
        return "walking";
    }

    public abstract void goToWork();
}

