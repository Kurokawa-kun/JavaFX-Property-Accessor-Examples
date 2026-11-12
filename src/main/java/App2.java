import io.github.kurokawa_kun.annotation.javafx.*;
import io.github.kurokawa_kun.annotation.javafx.type.*;
import javafx.beans.property.*;

/*
    サンプルプログラム2：オプションの使用と型情報を持つプロパティ
*/
public class App2
{
    @FxGetter(prefix = "has")
    private DoubleProperty doubleValue = new SimpleDoubleProperty(50.00d);   //  getterメソッドのプリフィックスをgetからhasに変更
    
    @FxGetter(prefix = "can")
    private BooleanProperty booleanValue = new SimpleBooleanProperty(true);   //  getterメソッドのプリフィックスをisからcanに変更
    
    @FxSetter(valueType = ValueType.PRIMITIVE)
    private DoubleProperty primitiveDouble = new SimpleDoubleProperty(135.00d); //  引数にプリミティブ型の値を取る
    
    @FxSetter(valueType = ValueType.OBJECT)
    private DoubleProperty objectDouble  = new SimpleDoubleProperty(Double.valueOf(175.00d));  //  引数にオブジェクト型の値を取る
    
    @FxGetter(access = Access.PROTECTED)
    private IntegerProperty protectedInteger = new SimpleIntegerProperty(1000);   //  作成されるメソッドのアクセス指定子がprotected
    
    @FxGetter(access = Access.PACKAGE)
    private IntegerProperty packageInteger = new SimpleIntegerProperty(1500); //  作成されるメソッドにアクセス指定子がつかない（パッケージアクセス）
    
    @FxGetter
    private static IntegerProperty staticInteger = new SimpleIntegerProperty(10);   //  メソッド内部でthisではなくクラスメンバーを参照する
    
    @FxProperty(readOnly = true)
    private FloatProperty readOnlyFloat = new SimpleFloatProperty(123.45f); //  ReadOnlyFloatPropertyにキャストしてから返す
    
    public static void main(String[] args)
    {
        System.out.println("App2 main called.");
        new App2();
    }
}
