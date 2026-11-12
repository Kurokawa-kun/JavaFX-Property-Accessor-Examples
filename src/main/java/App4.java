import io.github.kurokawa_kun.annotation.javafx.*;
import io.github.kurokawa_kun.annotation.javafx.type.Access;
import javafx.beans.property.*;
import javafx.collections.FXCollections;

/*
    サンプルプログラム4：ビルドは成功するが警告メッセージが出力される
*/
public class App4
{
    @FxGetter
    public IntegerProperty publicInteger = new SimpleIntegerProperty(5);  //  プロパティがpublic
    @FxGetter
    private IntegerProperty StartsUpperCase = new SimpleIntegerProperty(5);  //  名前が大文字で始まっている
    @FxProperty
    private IntegerProperty endsWithProperty = new SimpleIntegerProperty(5);  //  名前が"Property"で終わっている
    @FxGetter(access = Access.PRIVATE)
    protected IntegerProperty lowerAccessPrivileges = new SimpleIntegerProperty(5);  //  プロパティよりアクセス権限の低いメソッド
    @FxProperty(readOnly = true)
    private ListProperty<String> mutable = new SimpleListProperty<>(FXCollections.observableArrayList());  //  ミュータブルな値をReadOnlyPropertyに変換している
    
    public static void main(String[] args)
    {
        System.out.println("App4 main called.");
    }
}
