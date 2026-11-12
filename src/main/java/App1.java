import io.github.kurokawa_kun.annotation.javafx.*;
import javafx.beans.property.*;

/*
    サンプルプログラム1：一般的な使い方

    ※ コンパイラオプションに -Averbose=true を指定すると
    ASTの情報が表示されるので仕組みを理解するのに役立ちます。
*/
public class App1
{
    @FxSetter
    @FxGetter
    @FxProperty
    private IntegerProperty fontSize = new SimpleIntegerProperty(20);  //  アクセサをつけるプロパティ
    private IntegerProperty boundFontSize = new SimpleIntegerProperty();  //  付加されたプロパティメソッドを用いて値をバインドする
    
    public App1()
    {
        //  ソースコード中に存在しない（App1クラスが保持していない）メソッドを呼び出している点に注目
        boundFontSize.bind(this.fontSizeProperty());        
        System.out.println("Current font size:" + this.getFontSize());
        this.setFontSize(30);
        System.out.println("Current font size:" + this.getFontSize());
        System.out.println("Current bound font size:" + this.boundFontSize.get());
    }
    
    public static void main(String[] args)
    {
        System.out.println("App1 main called.");
        new App1();
    }    
}
