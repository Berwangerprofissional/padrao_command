
public class Main {

    public static void main(String[] args) {

        // 1. Criando as lâmpadas
        Light livingRoom = new Light("Living room");
        Light kitchen = new Light("Kitchen");

        // 2. Criando os comandos
        Command turnOnLivingRoom =
                new TurnOnLightCommand(livingRoom);

        Command turnOffLivingRoom =
                new TurnOffLightCommand(livingRoom);

        Command turnOnKitchen =
                new TurnOnLightCommand(kitchen);

        // 3. Criando o controle remoto
        RemoteControl remote = new RemoteControl();

        // 4. Associando os comandos aos botões
        remote.setCommand("A", turnOnLivingRoom);
        remote.setCommand("B", turnOffLivingRoom);
        remote.setCommand("C", turnOnKitchen);

        System.out.println("=== ACIONANDO OS BOTOES ===");

        // 5. Acionando os três botões
        remote.pressButton("A");
        remote.pressButton("B");
        remote.pressButton("C");

        // 6. Exibindo os estados das lâmpadas
        System.out.println("\n=== ESTADOS DAS LAMPADAS ===");

        System.out.println(
                "Sala ligada: " + livingRoom.isOn()
        );

        System.out.println(
                "Cozinha ligada: " + kitchen.isOn()
        );

        // 7. Reconfigurando o botão A
        System.out.println("\n=== RECONFIGURANDO O BOTAO A ===");

        Command turnOffKitchen =
                new TurnOffLightCommand(kitchen);

        remote.setCommand("A", turnOffKitchen);

        // A configuração não executou o comando.
        System.out.println("Botao A reconfigurado.");

        // 8. Verificando os estados antes de pressionar A
        System.out.println("\n=== ANTES DE PRESSIONAR A ===");

        System.out.println(
                "Sala ligada: " + livingRoom.isOn()
        );

        System.out.println(
                "Cozinha ligada: " + kitchen.isOn()
        );

        // 9. Agora A desliga a cozinha
        remote.pressButton("A");

        // 10. Verificando os estados depois da reconfiguração
        System.out.println("\n=== DEPOIS DE PRESSIONAR A ===");

        System.out.println(
                "Sala ligada: " + livingRoom.isOn()
        );

        System.out.println(
                "Cozinha ligada: " + kitchen.isOn()
        );

        // 11. Testando um botão não configurado
        System.out.println("\n=== BOTAO NAO CONFIGURADO ===");

        remote.pressButton("X");
    }
}
