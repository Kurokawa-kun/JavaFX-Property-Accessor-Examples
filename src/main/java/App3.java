import io.github.kurokawa_kun.annotation.javafx.*;
import java.util.*;
import javafx.beans.property.*;

/*
    サンプルプログラム3：複雑な型情報を持つプロパティ
*/
public class App3<Z>
{
    @FxGetter
    private SetProperty<? extends Long> extendsProperty;
    @FxGetter
    private SetProperty<? super Long> superProperty;
    @FxGetter
    private ListProperty<String[]> arrayProperty;
    @FxGetter
    private ListProperty<Map<Map<String, Integer>, Set<Object>>> complicatedProperty;
    
    public static void main(String[] args)
    {
        System.out.println("App3 main called.");
    }
}
