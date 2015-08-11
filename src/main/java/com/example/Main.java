package com.example;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import java.io.*;

class Main {
    public static void main(String[] args) throws Exception {

        //標準出力のキャプチャ
        StdoutSnatcher snatcher = new StdoutSnatcher();

        //デフォルトのものはとっておく
        PrintStream defaultStream = System.out;

        //切り替え
        System.setOut(snatcher);

        //rhino 準備
        ScriptEngineManager m = new ScriptEngineManager();
        ScriptEngine e = m.getEngineByExtension("js");

        //JSファイルを実行
        e.eval(new BufferedReader(new FileReader(new File("src/main/js/app.js"))));

        //JSスクリプト文字列の直接実行
        e.eval("print('hello rhino')");

        System.setOut(defaultStream); //キャプチャここまで

        String line = null;
        while((line = snatcher.readLine()) != null){
            System.out.println("aaa:" + line);
        }
    }
}
