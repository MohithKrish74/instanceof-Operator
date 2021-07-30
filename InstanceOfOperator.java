package com.polymorphism;

class Car
{
    public void BrandName()
    {
        System.out.println("Name : Suzuki.");
    }
    public void FuelType()
    {
        System.out.println("Fuel Type : Petrol.");
    }
    public void MaxSpeed()
    {
        System.out.println("Maximum Speed : 90 km/hr.");
    }
    public void Mileage()
    {
        System.out.println("Mileage : 25 km/hr.");
    }
    public void Life()
    {
        System.out.println("Life : 30 Years");
    }
}
public class InstanceOfOperator
{
    public static void main(String[] args)
    {
        Car swift = new Car();
        System.out.println(swift instanceof Car);//instanceof Operator
        System.out.println("Car Description:");
        swift.BrandName();
        swift.FuelType();
        swift.MaxSpeed();
        swift.Mileage();
        swift.Life();
    }
}
