package ss11StackQueue.BaiTap.DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap;

import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String str = "Ngo Dinh Nhat Tuan";
        char[] newStr = str.toUpperCase().toCharArray();
        int key;
        for (char newStr1 : newStr) {
            if (map.containsKey(newStr1)) {
                key = map.get(newStr1) + 1;
            } else {
                key = 1;
            }
            map.put(newStr1, key);
        }
        System.out.println(map);
    }
}
