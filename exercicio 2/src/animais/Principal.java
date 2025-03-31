package animais;

// 2. Crie uma classe Animal com um metodo emitirSom(). Em seguida, crie duas subclasses:
//Cachorro e Gato, que herdam da classe Animal. Adicione o metodo emitirSom() nas subclasses,
//utilizando a anotação @Override para indicar que estão sobrescrevendo o metodo. Além disso,
//adicione métodos específicos para cada subclasse, como abanarRabo() para o Cachorro e arranharMoveis()
//para o Gato.

public class Principal {
    public static void main(String [] args) {
        Cachorro cachorroUm = new Cachorro();
        Gato gatoUm = new Gato ();

        cachorroUm.emiteSom();
        cachorroUm.abanarRabo();

        gatoUm.emiteSom();
        gatoUm.arranharMoveis();
    }
}
