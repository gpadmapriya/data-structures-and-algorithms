package datastructures.stacksandqueues.utilities;

public class Animal {
    private String catOrDog;

    public Animal(){
        this.catOrDog = " ";
    }

    public Animal(String catOrDog){
        this.catOrDog = catOrDog;
    }
    public String getCatOrDog() {
        return catOrDog;
    }

    public void setCatOrDog(String catOrDog) {
        this.catOrDog = catOrDog;
    }

    @Override
    public String toString() {
        if (this.equals(null)) {
            return "This is not a cat ot dog";
        } else if (this.catOrDog.equals("dog") || this.catOrDog.equals("cat")) {
            return "This is a " + this.catOrDog;
        } else {
            return "This is not a cat or dog";
        }
    }
}
