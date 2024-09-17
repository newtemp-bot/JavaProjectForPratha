package E2Pack;

import Encapsulation.*;
import Encapsulation.SubPack.*;

public class Test extends Students{
    public static void main(String[] args) {
        Students s,s2;
        s = new Students();
        s2 = new Students();
        s.setId(1110);
        System.out.println(s.getId());
        Hello h = new Hello();
    }
}
