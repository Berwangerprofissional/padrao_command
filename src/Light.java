
public class Light {

    private String location;
    private boolean on;

    public Light(String location) {
        this.location = location;
        this.on = false;
    }

    public void turnOn() {
        on = true;
        System.out.println(location + ": light on");
    }

    public void turnOff() {
        on = false;
        System.out.println(location + ": light off");
    }

    public boolean isOn() {
        return on;
    }
}
