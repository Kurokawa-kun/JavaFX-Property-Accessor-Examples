import io.github.kurokawa_kun.annotation.javafx.*;
import io.github.kurokawa_kun.annotation.javafx.type.*;
import javafx.beans.property.*;

/*
    サンプルプログラム1：一般的な使い方

    ※ コンパイラオプションに -Averbose=true を指定するとビルド時にASTの情報が表示されます。
       作成されるメソッドのコードも表示されるため仕組みを理解するのに役立ちます（おすすめ）。
*/
public class App1
{
    @FxGetter
    @FxSetter
    @FxProperty
    private IntegerProperty fontSize = new SimpleIntegerProperty(20);  //  アクセサをつけるプロパティ
    private IntegerProperty boundFontSize = new SimpleIntegerProperty();  //  付加されたプロパティメソッドを用いて値をバインドする
    
    public App1()
    {
        //  ソースコード中に存在しない（App1クラスが保持していない）メソッドを呼び出している
        boundFontSize.bind(this.fontSizeProperty());        
        System.out.println("Current font size: " + this.getFontSize());
        this.setFontSize(30);
        System.out.println("Current font size: " + this.getFontSize());
        System.out.println("Current bound font size: " + this.boundFontSize.get());
    }
    
    public static void main(String[] args)
    {
        System.out.println("App1 main called.");
        new App1();
    }    
}
