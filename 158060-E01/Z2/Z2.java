package Z2;

import java.util.*;
import java.util.stream.Stream;

public class Z2 {
    public static <E> void printWithSemicolon(Iterable<E> toprint){
        StringBuffer buf = new StringBuffer();
        toprint.forEach(i -> buf.append(';').append(i.toString()));

        buf.append(';');
        //buf.length()-1 jeśli bez średnika na końcu
        System.out.println(buf.substring(1,buf.length()).toString());
    }

    public static void main(String[] Args) {
        ArrayList<Character> chr = new ArrayList<>(List.of(new Character[]{'f', 'f', 'g'}));
        LinkedList<Integer> ll = new LinkedList<>();
        Stream.iterate(0,i -> i).limit(10).forEach(ll::push);

        printWithSemicolon(chr);
        printWithSemicolon(ll);
        printWithSemicolon(new TreeSet<Character>(chr));
        printWithSemicolon(new HashSet<Character>(chr));
    }
}
