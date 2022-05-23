package ss11StackQueue.BaiTap.DemSoLanXuatHienCuaMoiTuTrongMotChuoiSuDungMap;

import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        TreeMap<Character, Integer> map = new TreeMap<>();
        String str = "Ngo Dinh Nhat Tuan";
        char[] newStr = str.toUpperCase().toCharArray();
        int key;
        for (char item : newStr) {
            if (map.containsKey(item)) {
                key = map.get(item) + 1;
            } else {
                key = 1;
            }
            map.put(item, key);
        }
    }
}
//    public static void main(String[] args) {
//        //Chương trình sử dụng một TreeMap để lưu trữ một mục bao gồm một từ và số lượng của nó.
//        TreeMap<Character, Integer> map = new TreeMap<>();
//        String str = "Ngo Dinh Nhat Tuan";
//        //Duyệt toàn bộ từ trong chuỗi.
//        //Mỗi từ lấy ra từ chuỗi, chuyển toàn bộ thành chữ hoa hoặc chữ thường.
//        //Coi mỗi từ được lấy ra từ chuỗi là 1 key
//        //Phương thức toCharArray() trong Java biến đổi chuỗi này thành một mảng ký tự mới.
//        char[] newStr = str.toUpperCase().toCharArray();
//        int key;
//        for (char item : newStr) {
//            //Kiểm tra xem trong map có key này hay chưa.
//            // Nếu có đẩy key này vào map và tăng value (số lượng từ) lên 1
//            // Nếu key này chưa có trong map thì đẩy key vào map mặc định gán value là 1.
//            //HashMap containsKey() dùng để kiểm tra một Key có tồn tại trong HashMap hay không.
//            // Nếu không tồn tại nó sẽ trả về false, ngược lại true.
//            if (map.containsKey(item)) {
//                key = map.get(item) + 1;
//            } else {
//                key = 1;
//            }
//            map.put(item, key);
//            //Như vậy sau khi thêm thì Treemap : {"item=key"}.
//        }
//        //Kết thúc duyệt chuỗi. Hiển thị map gồm key (từ) và value (số lượng mỗi từ).
//        System.out.println(map);
//
//        //Lớp TreeMap trong Java triển khai Map Interface bởi sử dụng một tree.
//        // Một TreeMap cung cấp các phương thức hiệu quả để lưu giữ các cặp key/value
//        // trong thứ tự được sắp xếp, và cho phép thu hồi nhanh chóng.
//
//        /**
//         * Lớp TreeMap trong Java hỗ trợ 4 constructor. Mẫu đầu tiên xây dựng
//         * một tree map trống mà sẽ được xếp thứ tự bởi sử dụng thứ tự tự nhiên cho các key.
//         * TreeMap( )
//         * Constructor thứ hai xây dựng một tree map trống
//         * mà sẽ được xếp thứ tự bởi sử dụng Comparator comp:
//         *
//         * TreeMap(Comparator comp)
//         * Constructor thứ ba khởi tạo một tree map với
//         * các entry từ m, mà sẽ được xếp thứ tự tự nhiên các key của nó.
//         *
//         * TreeMap(Map m)
//         * Constructor thứ 4 khởi tạo một tree map với các entry từ m,
//         * mà sẽ được xếp thứ tự giống như sm:
//         *
//         * TreeMap(SortedMap sm)
//         * Ngoài các phương thức được hỗ trợ bởi các lớp cha,
//         * lớp TreeMap cũng định nghĩa các phương thức sau:
//         * STT	Phương thức và Miêu tả
//         * 1	void clear()
//         * Gỡ bỏ tất cả ánh xạ (mapping) từ TreeMap này
//         *
//         * 2	Object clone()
//         * Trả về một shallow copy của TreeMap này
//         *
//         * 3	Comparator comparator()
//         * Trả về comparator được sử dụng để xếp thứ tự map này,
//         * hoặc trả về null nếu map này sử dụng cách sắp xếp
//         * theo thứ tự tự nhiên các key của nó
//         *
//         * 4	boolean containsKey(Object key)
//         * Trả về true nếu map này chứa một ánh xạ cho key đã xác định
//         *
//         * 5	boolean containsValue(Object value)
//         * Trả về true nếu map này so khớp một hoặc nhiều key tới value đã cho
//         *
//         * 6	Set entrySet()
//         * Trả về một tập hợp các ánh xạ được chứa trong map này
//         *
//         * 7	Object firstKey()
//         * Trả về key đầu tiên (thấp nhất) trong sorted map này
//         *
//         * 8	Object get(Object key)
//         * Trả về value từ đó map này so khớp với key đã cho
//         *
//         * 9	SortedMap headMap(Object toKey)
//         * Trả về một phần map này có các key nhỏ hơn toKey
//         *
//         * 10	Set keySet()
//         * Trả về một Set các key được chứa trong map này
//         *
//         * 11	Object lastKey()
//         * Trả về key cuối cùng (cao nhất) trong sorted map này
//         *
//         * 12	Object put(Object key, Object value)
//         * Liên kết value đã cho với key đã xác định trong map này
//         *
//         * 13	void putAll(Map map)
//         * Sao chép tất cả ánh xạ từ map đã cho tới map này
//         *
//         * 14	Object remove(Object key)
//         * Gỡ bỏ ánh xạ cho key này từ TreeMap nếu có mặt
//         *
//         * 15	int size()
//         * Trả về số ánh xạ key-value trong map này
//         *
//         * 16	SortedMap subMap(Object fromKey, Object toKey)
//         * Trả về một phần map này mà có các key từ fromKey tới toKey
//         *
//         * 17	SortedMap tailMap(Object fromKey)
//         * Trả về một phần map này mà có key lớn hơn hoặc bằng fromKey
//         *
//         * 18	Collection values()
//         * Trả về một tập hợp các value được chứa trong map này
//         * @param args
//         */
//    }
//}
