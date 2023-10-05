public class FlowerTurtle extends Turtle {
    @Override
    public void run() {
    
        int petalLength = 100; 
        int petalWidth = 50;
        int flowerAngle = 170; 

        for (int i = 0; i <11; i++) {
            forward(petalLength);
            left(flowerAngle);
            forward(petalWidth);
            left(flowerAngle);
        }

        
    }

}

