
import java.util.Objects;

public class TurnOnLightCommand implements Command {

    private Light light;

    public TurnOnLightCommand(Light light) {
        this.light = Objects.requireNonNull(
                light, "A lâmpada não pode ser nula."
        );
    }

    @Override
    public void execute() {
        light.turnOn();
    }
}
