import io.github.kurokawa_kun.annotation.javafx.*;
import io.github.kurokawa_kun.annotation.javafx.type.*;
import java.util.*;
import javafx.scene.paint.Color;
import java.net.URI;
import javafx.beans.property.*;
/*
    サンプルプログラム3：トップレベルクラス以外での宣言
*/
public class App3
{
    public class InnerClass
    {
        //  内部クラスの中でのメソッド作成
        @FxGetter
        @FxSetter
        @FxProperty
        private FloatProperty innerFloat = new SimpleFloatProperty(0.00f);
    }
    
    public enum TestEnum
    {
        //  列挙型の中でのメソッド作成
        RED("red"),
        ORANGE("orange"),
        WHITE("white");
        
        @FxGetter
        @FxSetter
        private final ObjectProperty<Color> color = new SimpleObjectProperty<>();
        
        TestEnum(String colorName)
        {
            this.setColor(Color.web(colorName));
        }
    }
    
    public interface TestInterface
    {
        //  インターフェースの中でのメソッド作成
        @FxGetter
        public static final ObjectProperty<URI> uri = new SimpleObjectProperty<>(URI.create("https://www.wikipedia.org/"));
        @FxGetter
        ObjectProperty<UUID> uuid = new SimpleObjectProperty<>(UUID.randomUUID());
        
        /*
            補足：
            本当はインターフェース内で宣言されている、staticのついていないフィールドのアクセサメソッドの修飾子は
            public defaultにしたかったのだが、フィールドに修飾子をつけなくてもコンパイラが自動で
            public static finalをつけるため、アノテーションプロセッサから判別がつかない。
        */
    }    
    
    public record TestRecord()
    {
        //  レコードの中でのメソッド作成
        @FxGetter
        @FxSetter
        @FxProperty
        private static IntegerProperty recordInteger = new SimpleIntegerProperty(5);
    }
    
    public App3()
    {
        InnerClass innerClass = new InnerClass();
        System.out.println("Current value of innerFloat: " + innerClass.getInnerFloat());
        innerClass.setInnerFloat(35.00f);
        System.out.println("Current value of innerFloat: " + innerClass.getInnerFloat());
        
        System.out.printf("The red value of 'orange'  : %.2f\n", TestEnum.ORANGE.getColor().getRed());
        System.out.printf("The green value of 'orange': %.2f\n", TestEnum.ORANGE.getColor().getGreen());
        System.out.printf("The blue value of 'orange' : %.2f\n", TestEnum.ORANGE.getColor().getBlue());                
        
        System.out.println("Current value of TestRecord.recordInteger: " + TestRecord.getRecordInteger());
        TestRecord.setRecordInteger(15);
        System.out.println("Current value of TestRecord.recordInteger: " + TestRecord.getRecordInteger());
        
        System.out.println("Current value of TestInterface.showUri : " + TestInterface.getUri());
        System.out.println("Current value of TestInterface.showUuid: " + TestInterface.getUuid());
    }
    
    public static void main(String[] args)
    {
        System.out.println("App3 main called.");
        new App3();
    }
}
