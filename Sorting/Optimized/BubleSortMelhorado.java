public class BubleSortMelhorado {
  public static void main(String args[]) {
    int[] v = { 0, 1, 2, 3 };
    BubleSortMelhorado bs = new BubleSortMelhorado();
    bs.ordenar(v);
    for(int n : v) {
      System.out.print(n + " ");
    }
  }
  
  public void ordenar(int[] v) {
    
    for(int i = 0; i < v.length - 1; i++) {
      boolean estaOrdenado = true;
      for(int j = 0; i < v.length - 1 - i; j++) {
        if(v[j] > v[j + 1]) {
          int aux = v[j];
          v[j] = v[j+1];
          v[j + 1] = aux;
          estaOrdenado = false;
        }
      }
      if(estaOrdenado) {
        break;
      }
    }
  }
}
