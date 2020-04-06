package java2_11;

import java.util.ArrayList;
import java.util.Iterator;

public class viewsach {
    public static void main(String[] args) {
        ArrayList<item> itemlist = new ArrayList<>();
        mua_hang m1 = new mua_hang();
        chekout c1 = new chekout();
        m1.hienthisach();
        c1.checkout();

    }
}
