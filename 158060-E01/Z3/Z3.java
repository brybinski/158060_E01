package Z3;

import java.io.File;
import java.util.List;

public class Z3 {
    public static String[] printDir(String path, String extension){
        String[] result = {};
        try{
            File f = new File(path);

            // w javie 8 rozszerzenie było zawsze z dużych i wtedy robiłem .toUpperCase()
            // to mniejsza szansa była na błąd użytkownika, ale 17 tak nie ma albo jest z małej to już nie kombinowałem
            result = f.list((dir, name) -> name.endsWith(extension));
        }
        catch (Exception e){

        }
        return result;
    }

    public static void main(String[] Args){
        List.of(printDir("D:\\", ".txt")).forEach(System.out::println);
    }
}
