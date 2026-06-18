
class Car {

    // Composition -> Declaring Engine class inside the car
    Engine eng = new Engine();

    void drive() {
        eng.startEngine();
        System.out.println("Car is moving");
    }
}

