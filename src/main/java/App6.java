import io.github.kurokawa_kun.annotation.javafx.*;
import io.github.kurokawa_kun.annotation.javafx.type.*;
import javafx.beans.property.*;

/*
    サンプルプログラム6：コンパイルエラーになるパターン
*/
public class App6
{
    //  ※ 以下はすべてコンパイルエラーになります。    
    /*
    @FxGetter
    public int primitiveValue = 50;  //  プリミティブ型
    
    @FxGetter
    public Object notJavaFxProperty;  //  JavaFXのプロパティではない
    
    @FxSetter
    public ReadOnlyIntegerProperty readOnlyProperty;  //  ReadOnlyPropertyにsetterをつけようとしている
    
    @FxSetter
    private MapProperty<? extends String, ? super Integer> wildcard;    //  上限/下限境界ワイルドカードを持つプロパティのsetterメソッド    
    */    
    public static void main(String[] args)
    {
        System.out.println("App6 main called.");
    }
}
