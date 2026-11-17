# JavaFX-Property-Accessor-Examples
## 説明
[JavaFX-Property-Accessor](https://github.com/Kurokawa-kun/JavaFX-Property-Accessor) のサンプルプログラムです。JavaFX-Property-Accessorプロジェクトの中に格納するとビルド時に依存関係の問題が起きるため、別プロジェクトに分けました。

## 使用方法
### 前提条件：ビルドとローカルリポジトリへの公開
JavaFX-Property-Accessorページの当該ページをご覧ください。
- [ビルドとローカルリポジトリへの公開](https://github.com/Kurokawa-kun/JavaFX-Property-Accessor#%E3%83%93%E3%83%AB%E3%83%89%E3%81%A8%E3%83%AD%E3%83%BC%E3%82%AB%E3%83%AB%E3%83%AA%E3%83%9D%E3%82%B8%E3%83%88%E3%83%AA%E3%81%B8%E3%81%AE%E5%85%AC%E9%96%8B)

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
```
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
Java 9以降のモジュールシステムを利用するプログラムの場合は module-info.java に以下の記述を追加してください。
```
module yourmodulename
{
    requires io.github.kurokawa_kun.javafx.propertyaccessor;
}
```
### サンプルコードのビルド
以下のコマンドを実行してください。
```
gradle build
```
ソースファイルを個別にコンパイルすることも可能です。
```
gradle compileApp1
gradle compileApp2
gradle compileApp3
gradle compileApp4
gradle compileApp5
gradle compileApp6
```

### プログラムの実行
以下のコマンドを実行してください。
```
gradle runApp1
gradle runApp2
gradle runApp3
gradle runApp4
gradle runApp5
gradle runApp6
```
※ App6はコンパイルエラーとなる例を示したものなので実行しても意味はないですが…💧

コンパイラオプションに -Averbose=true を指定するとビルド時にASTの情報が表示されます。どのようなメソッドが追加されたのかが容易に分かると思います。
