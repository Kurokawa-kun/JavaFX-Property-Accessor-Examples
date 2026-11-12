# JavaFX-Property-Accessor-Examples
## 説明
[JavaFX-Property-Accessor](https://github.com/Kurokawa-kun/JavaFX-Property-Accessor) のサンプルプログラムです。ひとつのプロジェクトに纏めるとビルド時に依存関係の問題が起きるため、別プロジェクトに分けました。

## 使用方法

javafx-property-accessor-plugin がローカルリポジトリから使用可能な状態になっているものとします
（手順は [こちら](https://github.com/Kurokawa-kun/JavaFX-Property-Accessor) をご覧ください）。

### プラグインの利用
利用する側のプロジェクトの build.gradle に以下の記述を追加してください。
```
plugins
{
    id 'io.github.kurokawa_kun.javafx-property-accessor-plugin' version '0.9.0'
}

repositories
{
    mavenLocal()
    gradlePluginPortal()
}

```
デバッグ用の詳細メッセージを出力する場合は build.gradle に以下の記述も追加してください。
``` build.gradle
tasks.withType(JavaCompile)
{
    options.compilerArgs += '-Averbose=true'
}
```

Gradleがローカルのリポジトリからプラグインを探せるよう settings.gradle に以下の記述を追加してください。
```
pluginManagement
{
    repositories 
    {
        mavenLocal()
        gradlePluginPortal()
    }
}
```
Java 9以降のモジュールシステムを利用する場合は module-info.java に以下の記述を追加してください。
```
module yourmodulename
{
    requires JavaFxPropertyAccessor;
}
```

### サンプルコードのビルド
以下のコマンドを実行してください。
```
gradle build
```
ソースファイルを個別にコンパイルすることも可能です。
```
gradle compileApp1 ～ compileApp5
```

### プログラムの実行
以下のコマンドを実行してください。
```
gradle runApp1
gradle runApp2
gradle runApp3
gradle runApp4
gradle runApp5
```
※ App5はコンパイルエラーとなる例を示したものなので実行しても意味はないですが…💧

コンパイラオプションに -Averbose=true を指定するとビルド時にASTの情報が表示されます。どのようなメソッドが追加されたのかが容易に分かります。
