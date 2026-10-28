
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class RemoteControl {

    private Map<String, Command> commands = new HashMap<>();

    public void setCommand(String button, Command command) {

        if (button == null || button.isBlank()) {
            throw new IllegalArgumentException(
                    "O nome do botão não pode ser nulo ou vazio."
            );
        }

        Objects.requireNonNull(
                command, "O comando não pode ser nulo."
        );

        commands.put(button, command);
    }

    public void pressButton(String button) {

        Command command = commands.get(button);

        if (command == null) {
            System.out.println(
                    "Button not configured: " + button
            );
            return;
        }

        command.execute();
    }
}
