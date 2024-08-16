package homework3.phonefactory;

public class Iphone {
    Processor processorIphone1 = new Processor();
    Processor processorIphone2 = new Processor();
    Camera cameraIphone = new Camera();
    Case caseIphone = new Case();

    Camera.takePhoto();

    public void printIphoneProcessorInfo(){
        System.out.println("Информация о процессорах: " + "\nПроцессор 1: " + processorIphone1.getMhz() + " Mhz"
                +"\nПроцессор 2: " + processorIphone2.getMhz() + " Mhz");
    }

    public Iphone(Processor processorIphone1, Processor processorIphone2, Camera cameraIphone, Case caseIphone) {
        this.processorIphone1 = processorIphone1;
        this.processorIphone2 = processorIphone2;
        this.cameraIphone = cameraIphone;
        this.caseIphone = caseIphone;
    }
}