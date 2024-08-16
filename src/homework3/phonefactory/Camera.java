package homework3.phonefactory;

public class Camera {
    int megapixelCount;

    public Camera(int megapixelCount) {
        this.megapixelCount = megapixelCount;
    }

    public Camera() {
    }

    public void takePhoto() {
        System.out.println("сделано фото");
    }
}