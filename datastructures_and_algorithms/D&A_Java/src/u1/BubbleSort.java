package u1;

import java.util.ArrayList;

public class BubbleSort {
  
  public ArrayList<Integer> sort(ArrayList<Integer> list_1) {
    int size = list_1.size();
    for (int i = 0; i < size - 1; i++) {
      int iterater = 0;
      for (int j = 0; j < size - 1 - iterater; j++) {
        int tmp = list_1.get(j);
        int tmp_plus = list_1.get(j + 1);

        if (tmp > tmp_plus) {
          // switch
          list_1.set(j, tmp_plus);
          list_1.set(j + 1, tmp);
        }
      }
      iterater += 1;
    }
    return list_1;
  }
}