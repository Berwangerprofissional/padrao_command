
import java.util.Objects;

public class TurnOffLightCommand implements Command {

    private Light light;

    public TurnOffLightCommand(Light light) {
        this.light = Objects.requireNonNull(
                light, "A lâmpada não pode ser nula."
        );
    }

    @Override
    public void execute() {
        light.turnOff();
    }
}
