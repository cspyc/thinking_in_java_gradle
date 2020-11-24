package pyc.functionalprogram;

interface Description {
    String brief();
}

interface Body {
    String detailed(String head);
}

interface Multi {
    String twoArg(String head, Double d);
}

public class LambdaExpressions {
    static Body bod = head -> head + " No Parens!";
    static Body bod2 = (head) -> head + "More details";
    static Description desc = () -> "Short info";
    static Multi mult = (h, n) -> h + n;
    static Description moreLines = () -> {
        System.out.println("moreLines()Lambda多行方法体定义");
        return "from moreLines()";
    };

    public static void main(String[] args) {
        System.out.println(bod.detailed("Oh!"));
        System.out.println(bod2.detailed("Hi! "));
        System.out.println(desc.brief());
        System.out.println(mult.twoArg("testHHH",2.3223));
        System.out.println(moreLines.brief());
    }
}
