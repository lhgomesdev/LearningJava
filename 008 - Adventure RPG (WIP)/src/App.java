import java.util.*;

public class App {
    public static void orcQuest(){
        System.out.println("""
            Você chega de frente ao grande batalhão do general orc, você percebe que tem 0 chance de derrotar ele sozinho.
            Você Deseja chamar ajuda?
            [1] - Sim
            [2] - Não
            """);
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("""
                    Você escolheu chamar ajuda!
                    Chegando no reino mais próximo, você foi correndo ao Rei Prepucius e ele te ajudou a derrotar o grande gener
                    al Orc.
                    Parabéns você terminou o jogo!!!
                    """);
                break;
            case 2:
                System.out.println("""
                    Você escolheu não chamar ajuda.
                    Você foi correndo em direção ao batalhão de milhares de soldados orcs, eles te eliminaram como se você fosse um inseto...
                    Você morreu.
                    Tente Novamente.
                    """);
                break;
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua ação.");
                break;
        }
        input.close();
    }

    public static void goblinQuest(){
        System.out.println("""
            Você chega de frente a caverna goblin, onde ouve vários gritos humanos pedindo socorro.
            Você percebe que há algumas formas de derrotar os goblins e salvar os habitantes da vila.
            Como deseja prosseguir?
            [1] - Furtivamente
            [2] - Enfrentar todos os goblins de uma vez só
            """);
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("""
                    Você escolheu ir de maneira furtiva!
                    Você foi tentar ser furtivo e acabou pisando em uma clara armadilha dos goblins, ela foi acionada e explodiu.
                    Você morreu.
                    Tente Novamente.
                    """);
                break;
            case 2:
                System.out.println("""
                    Você foi enfrentar os goblins frente a frente, você deu um super grito e todos eles olharam pra ti.
                    Eles foram correndo em direção a ti e pisaram em uma armadilha deles, eles explodiram.
                    você adentrou a caverna de goblins e salvou os habitantes, você foi um herói!
                    Parabéns você terminou o jogo!!!
                    """);
                break;
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua ação.");
                break;
        }
        input.close();
    }
    
    public static void tomeQuest(){
        System.out.println("""
            Você foi em busca do lendário Tomo da mágia infinita, por algum motivo todos que buscaram ele nunca mais retornaram...
            Chegando no local aonde circulam as lendas desse tal tomo, você percebe que é uma grande montanha, você percebe que pode escalar ela...
            Deseja escalar a montanha? 
            [1] - Escalar a montanha
            [2] - Usar uma magia para subir a montanha
            """);
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("""
                    Enquanto escalava a montanha, você percebe que um grande bode estava te acompanhando nesse momento todo.
                    Quando olha melhor para o bode, ele começa a correr pra cima de ti e te dá uma cabeçada, caindo da montanha e morrendo
                    Você morreu.
                    Tente Novamente.
                    """);
                break;
            case 2:
                System.out.println("""
                    Você como um sábio mago, resolve usar uma magia para subir a montanha, você usa a mágia "Elevador mágico".
                    Enquanto sobe você vê um escalador tomando uma cabeçada do bode e caindo da montanha, você pensa (uff que bom que não fui eu.)
                    Chegando ao topo, você acha o tomo e quando abre percebe que só tem uma frase escrita nele; 1
                    - A Verdadeira mágia são os amigos que fizemos pelo caminho...
                    Parabéns você terminou o jogo!!!
                    """);
                break;
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua ação.");
                break;
        }
        input.close();
    }
    
    public static void villageQuest(){
        System.out.println("""
            Você escolheu ir descobrir o segredo da vila!
            Chegando na porteira da vila, você sente um clima estranho, você percebe que no centro da vila tem um grande cajado sugando toda a energia vital da mesma...
            Você sendo um grande mago se percebe podendo fazer duas coisas:
            [1] - Rejeitar o poder do cajado e tentar remover ele.
            [2] - Aceitar o poder do cajado e se tornar o novo imperador das sombras.
            """);
        Scanner input = new Scanner(System.in);
        int resposta = input.nextInt();
        switch (resposta) {
            case 1:
                System.out.println("""
                    Você escolheu rejeitar o poder do cajado e tentar remover ele.
                    A vontade de aceitar ele é muito forte, mas você rejeita e se torna o mago supremo.
                    Parabéns você terminou o jogo!!!
                    """);
                break;
            case 2:
                System.out.println("""
                    Você escolheu aceitar o poder do cajado e se tornar o novo imperador das sombras.
                    Você agora governa o mundo das sombras, o seu dever é lutar contra o mago supremo e impedir que ele acabe com o seu reinado.
                    Parabéns você terminou o jogo!!!
                    """);
                break;
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua ação.");
                break;
        }
        input.close();
    }
    
    public static void warriorQuests() {
        System.out.println("Bem vindo, Guerreiro! Escolha uma missão:");
        System.out.println("[1] Derrote o General Orc");
        System.out.println("[2] Salve os habitantes da vila de goblins");

        Scanner input = new Scanner(System.in);
        int missao = input.nextInt();
        switch (missao) {
            case 1:
                System.out.println("Você escolheu enfrentar o General orc!");
                orcQuest();
                break;
            case 2:
                System.out.println("Você escolheu ir salvar os habitantes!");
                goblinQuest();
                break;
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua ação.");    
                break;
        }
        input.close();
        
    }

    public static void mageQuests() {
        System.out.println("Bem vindo, Mago! Escolha uma missão:");
        System.out.println("[1] Recupere o Tomo da mágia infinita");
        System.out.println("[2] Descubra o Segredo da vila fantasma");

        Scanner input = new Scanner(System.in);
        int missao = input.nextInt();
        switch (missao) {
            case 1:
                System.out.println("Você escolheu recuperar o Tomo!");
                tomeQuest();
                break;
            case 2:
                System.out.println("Você escolheu ir descubrir o Segredo da vila fantasma!");
                villageQuest();
                break;
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua ação.");
                break;
        }
        input.close();
        
    }



    public static void main(String[] args) throws Exception {
        System.out.println("""
            BEM VINDO AO SUPER RPG!!! 
            Escolha sua classe:
            [1] - Guerreiro
            [2] - Mago
            (Mais Classes futuramente...)
            """);
        Scanner input = new Scanner(System.in);
        int classe = input.nextInt();
        

        switch (classe) {
            case 1:
                System.out.println("CLASSE GUERREIRO ESCOLHIDA!!!");
                warriorQuests();
                break;
            case 2:
                System.out.println("CLASSE MAGO ESCOLHIDA!!!");
                mageQuests();
                break;
            
            default:
                System.out.println("Escolha inválida, insira um numero para confirmar sua classe.");
                break;
        }
    input.close();
    }
}
