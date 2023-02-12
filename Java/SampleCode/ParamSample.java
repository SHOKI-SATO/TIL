//ソースファイルのサンプル

import java.util.Arrays;

//複数のアウタークラスを１つのソースファイルに書くことはできるが、publicなアウタークラスはファイル名と同名の一つのみである必要がある
//→　ParamSampleクラスとDummyクラスがあるが、publicなのはParamSampleクラスなので、ParamSample.javaというファイル名で保存する必要がある

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
    }
}

class Dummy{

}
