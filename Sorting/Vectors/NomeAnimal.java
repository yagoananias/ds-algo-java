public class NomeAnimal {
  public static void main(String args[]) {
    Animal bidu = new Animal ("Cachorro", "Bidu");
    Animal fred = new Animal ("Peixe", "Fred");
    Animal rex = new Animal ("Cachorro", "Rex");
    Animal akamaru = new Animal ("Cachorro", "Akamaru");
    Animal mingau = new Animal ("Gato", "Mingau");
    
    Animal[] animais = new Animal[] { bidu, fred, rex, akamaru, mingau };
    
    NomeAnimal na = new NomeAnimal();
    na.ordenarAnimaisPorNome(animais);
    
    for(int tamanho = 0; tamanho < animais.length; tamanho++) {
      System.out.println("Especie: " + animais[tamanho].getEspecie() + " - Nome: " + animais[tamanho].getNome());
    }
  }
  
    /**
   * Método que ordena um vetor de Animal utilizando o algortimo Bubble Sort,
   * a ordenação é feita de acordo com o nome de cada animal.
   * 
   * @param animais - Vetor de Animal.
   */
  
  public void ordenarAnimaisPorNome(Animal[] animais) {
    for(int i = 0; i < animais.length - 1; i++) {
      boolean estaOrdenado = true;
      
      for(int j = 0; j < animais.length; j++) {
        if(animais[j].getNome().compareToIgnoreCase(animais[j + 1].getNome()) > 0) {
          Animal aux = animais[j];
          animais[j] = animais[j + 1];
          animais[j + 1]; = aux;
          estaOrdenado = false;
        }
      }      
      if(estaOrdenado)
        break;
    }
  }  
}
