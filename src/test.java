import java.util.ArrayList;

/**
 * @Author huangqingjia
 * @Create 2019-12-12 20:58
 */
public class test {
    public static final int NUM = 1;

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("fafa");
        arrayList.add("das");
        arrayList.add("ada");
        arrayList.add("hqj");
        arrayList.add("hpq");
        arrayList.add("11");
        arrayList.add("11");
        arrayList.add("11");
        System.out.println(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }

    public void testUpdate(String str1) {
        //测试方法
    }
}
