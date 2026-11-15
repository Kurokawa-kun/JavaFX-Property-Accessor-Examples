import io.github.kurokawa_kun.annotation.javafx.*;
import io.github.kurokawa_kun.annotation.javafx.type.*;
import java.util.*;
import java.nio.file.Files;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.beans.property.*;

/*
    サンプルプログラム4：型情報を持つプロパティ
*/
public class App4
{
    @FxGetter
    @FxSetter
    @FxProperty
    private MapProperty<String, Image> testMap;
    
    @FxGetter
    @FxSetter
    @FxProperty
    private ListProperty<Files> testList;
    
    @FxGetter
    @FxSetter
    @FxProperty
    private SetProperty<Color> testSet;
    
    @FxGetter
    @FxSetter
    @FxProperty
    private ObjectProperty<Font> testObject;
    
    @FxGetter
    @FxProperty
    private SetProperty<? extends Long> testExtends;
    
    @FxGetter
    @FxSetter
    @FxProperty
    private ListProperty<String[]> testArray;
    
    @FxGetter
    @FxSetter
    @FxProperty
    private ListProperty<Map<String, Object>> complicated;
    
    @FxGetter
    @FxSetter
    @FxProperty
    private MapProperty<Map<Map<String, Integer>, Set<Object>>, ListProperty<Map<String, Integer>>> tooComplicated;
    
    public static void main(String[] args)
    {
        System.out.println("App4 main called.");
    }
}
