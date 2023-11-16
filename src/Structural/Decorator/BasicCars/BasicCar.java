package Structural.Decorator.BasicCars;

public class BasicCar implements Car{
   private String model;
   public BasicCar(String model){
       this.model = model;
   }

    @Override
    public void create() {
        System.out.println(model);
    }
}
