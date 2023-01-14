# ERRORについて

## ▼エラー発生原因と対応
<br>

### ●`git rm`でファイルを削除しようとした場合に発生
```shell
fatal: pathspec 'ファイル名' did not match any files
```
#### ○原因
>・ファイル名が間違っている<br>
>・パスが間違っている<br>
>・指定ファイルがGit管理下にない<br>
#### ○対応
>そのまま削除<br>
```shell
-rm ファイル名
```

### ○Gitに登録していないファイルを無視して削除する
```shell
-git rm -r --ignore-unmatch ファイル名
```
<br>
