package homework3.phonefactory;

public class Samsung {
    Processor processorSamsung = new Processor();
    Camera cameraSamsung = new Camera();
    Case caseSamsung = new Case();

    Camera.takePhoto();

    public Samsung(Processor processorSamsung, Camera cameraSamsung, Case caseSamsung) {
        this.processorSamsung = processorSamsung;
        this.cameraSamsung = cameraSamsung;
        this.caseSamsung = caseSamsung;
    }
}