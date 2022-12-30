# ERRORについて

### エラー発生原因と対応<br>
<br>

##### ●`git rm`でファイルを削除しようとした場合に発生
```
fatal: pathspec 'ファイル名' did not match any files
```
&ensp; <原因><br>
&emsp;&emsp; ○ファイル名が間違っている<br>
&emsp;&emsp; ○パスが間違っている<br>
&emsp;&emsp; ○指定ファイルがGit管理下にない<br>
&ensp; <対応><br>
&emsp;&emsp; ○そのまま削除<br>
```
-rm ファイル名
```
&emsp;&emsp; ○Gitに登録していないファイルを無視して削除する<br>
```
-git rm -r --ignore-unmatch ファイル名
```
<br>
<br>
