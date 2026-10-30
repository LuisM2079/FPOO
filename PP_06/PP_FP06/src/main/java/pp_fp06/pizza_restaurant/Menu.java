/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pp_fp06.pizza_restaurant;
import java.util.Scanner;
import pp_fp06.pizza_restaurant.enums.Origem;
import pp_fp06.pizza_restaurant.enums.Tamanho;
/**
 *
 * @author luism
 */
public class Menu {

    private static final Scanner SC = new Scanner(System.in);
    private static final GestorEmentas GESTOR = new GestorEmentas();
    private static Pizza[] catalogo;

   
    public static void main(String[] args) {
        catalogo = criarCatalogo();
        int opcao;
        do {
            System.out.println("\n===== GESTÃO DE EMENTAS =====");
            System.out.println("1 - Criar ementa");
            System.out.println("2 - Listar ementas");
            System.out.println("3 - Consultar ementa (detalhe)");
            System.out.println("4 - Ativar ementa");
            System.out.println("5 - Desativar ementa");
            System.out.println("6 - Ver ementa ativa");
            System.out.println("0 - Sair");
            opcao = lerInt("Opção: ");

            switch (opcao) {
                case 1: criarEmenta(); break;
                case 2: System.out.println(GESTOR.listar()); break;
                case 3: consultarEmenta(); break;
                case 4: ativar(); break;
                case 5: desativar(); break;
                case 6: verAtiva(); break;
                case 0: System.out.println("Adeus!"); break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    
    private static Pizza[] criarCatalogo() {
        Ingrediente queijo = new Ingrediente(1, "Queijo Mozzarella", Origem.ANIMAL, 250);
        Ingrediente tomate = new Ingrediente(2, "Molho de Tomate", Origem.VEGETAL, 80);
        Ingrediente manjericao = new Ingrediente(3, "Manjericão Fresco", Origem.VEGETAL, 15);
        Ingrediente fiambre = new Ingrediente(4, "Fiambre", Origem.ANIMAL, 300);
        Ingrediente cogumelos = new Ingrediente(5, "Cogumelos", Origem.VEGETAL, 50);

        Pizza p1 = new Pizza(101, "Margherita", "Queijo e manjericão", 8.50, Tamanho.MEDIA);
        p1.adicionarIngrediente(queijo);
        p1.adicionarIngrediente(tomate);
        p1.adicionarIngrediente(manjericao);

        Pizza p2 = new Pizza(102, "Capricciosa", "Fiambre e cogumelos", 9.80, Tamanho.FAMILIAR);
        p2.adicionarIngrediente(queijo);
        p2.adicionarIngrediente(fiambre);
        p2.adicionarIngrediente(cogumelos);

        Pizza p3 = new Pizza(103, "Fiambre", "Queijo e fiambre", 7.00, Tamanho.PEQUENA);
        p3.adicionarIngrediente(queijo);
        p3.adicionarIngrediente(tomate);
        p3.adicionarIngrediente(fiambre);

        return new Pizza[]{p1, p2, p3};
    }

    private static void criarEmenta() {
        int codigo = lerInt("Código: ");
        if (GESTOR.encontrarEmenta(codigo) != null) {
            System.out.println("Já existe uma ementa com esse código.");
            return;
        }
        System.out.print("Nome: ");
        String nome = SC.nextLine();
        System.out.print("Descrição: ");
        String descricao = SC.nextLine();

        Ementa ementa = new Ementa(codigo, nome, descricao, false);

        System.out.println("Pizzas disponíveis (0 para terminar):");
        for (int i = 0; i < catalogo.length; i++) {
            System.out.println((i + 1) + " - " + catalogo[i]);
        }
        int escolha;
        do {
            escolha = lerInt("Adicionar pizza nº: ");
            if (escolha >= 1 && escolha <= catalogo.length) {
                ementa.adicionarPizza(catalogo[escolha - 1]);
            } else if (escolha != 0) {
                System.out.println("Pizza inválida.");
            }
        } while (escolha != 0);

        if (GESTOR.adicionarEmenta(ementa)) {
            System.out.println("Ementa criada (inativa). Use a opção 4 para a ativar.");
        } else {
            System.out.println("Não foi possível criar a ementa.");
        }
    }

    private static void consultarEmenta() {
        Ementa e = GESTOR.encontrarEmenta(lerInt("Código da ementa: "));
        System.out.println(e == null ? "Ementa não encontrada." : e.getDescricaoDetalhada());
    }

    private static void ativar() {
        boolean ok = GESTOR.ativarEmenta(lerInt("Código da ementa a ativar: "));
        System.out.println(ok ? "Ementa ativada (as outras foram desativadas)." : "Ementa não encontrada.");
    }

    private static void desativar() {
        boolean ok = GESTOR.desativarEmenta(lerInt("Código da ementa a desativar: "));
        System.out.println(ok ? "Ementa desativada." : "Ementa não encontrada.");
    }

    private static void verAtiva() {
        Ementa e = GESTOR.getEmentaAtiva();
        System.out.println(e == null ? "Não há nenhuma ementa ativa." : e.getDescricaoDetalhada());
    }

    
    private static int lerInt(String msg) {
        while (true) {
            System.out.print(msg);
            try {
                return Integer.parseInt(SC.nextLine().trim());
            } catch (NumberFormatException ex) {
                System.out.println("Valor inválido.");
            }
        }
    }
}
