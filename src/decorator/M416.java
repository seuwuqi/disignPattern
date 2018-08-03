package decorator;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/**
 * @program: untitled
 * @description: ლ(′ ◉ ❥ ◉ ｀ ლ)16
 * @author: wuqi
 * @create: 2018-08-01 23:07
 **/
public class M416 extends Gun{

    @Override
    public void shot() {
        System.out.println("枪可以射击");
    }

    public static void main(String[] args) throws FileNotFoundException {

        DataInputStream inputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("")));

    }
}
