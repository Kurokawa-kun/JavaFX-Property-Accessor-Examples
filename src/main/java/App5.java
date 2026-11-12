import io.github.kurokawa_kun.annotation.javafx.*;
import javafx.beans.property.*;

/*
    サンプルプログラム5：コンパイルエラーになるパターン
*/
public class App5
{
    //  ※ 以下はすべてコンパイルエラーになります。
    
    /*
    @FxGetter
    public int primitiveValue = 50;  //  プリミティブ型
    @FxGetter
    public Object notJavaFxProperty;  //  JavaFXのプロパティではない
    @FxSetter
    public ReadOnlyIntegerProperty readOnlyProperty;  //  ReadOnlyPropertyにsetterをつけようとしている
    */
    
    public static void main(String[] args)
    {
        System.out.println("App5 main called.");
    }
}
