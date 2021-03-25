package bublesort;

public class BubleSort {
  public static void main(String args[]) {
    int[] v = { 5, 2, 4, 3, 0, 9, 7, 8, 1, 6 };
    BubleSort bs = new BubleSort();
    bs.ordenar(v);

    for(int num : v) {
      System.out.print(num + " ");
    }
  }
  // big O(n^2)
  public void ordenar(int[] v) {
    for(int i = 0; i < v.length - 1; i++) {
      for(int j = 0; j < v.length - 1 - i; j++) {
        if(v[j] > v[j + 1]) {
          int aux = v[j];
          v[j] = v[j + 1];
          v[j + 1] = aux;
        }
      }
    }
  }
}
