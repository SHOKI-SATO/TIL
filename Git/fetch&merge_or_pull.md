# fetch&merge_or_pull

### ▼fetch→mergeとは<br>
#### ●fetchとは
```
git fetch リモート名　ブランチ名
```

&ensp;・ローカルリポジトリのリモート追跡ブランチ（remotes/リモート名/ブランチ名)に反映される<br>
&ensp;　（ `remotes/origin/master`等のブランチに反映される、ワークツリーには反映されていない）<br>
&ensp;・ワークツリーに反映させる場合には、`git merge`が必要<br>
<br>

#### ●mergeとは
```
git merge リモート名　ブランチ名
```

&ensp;・`git fetch`で取得したリモートリポジトリとの　内容をワークツリーに取り込む<br>
&ensp;　（ワークツリーには反映されていない）<br>
&ensp;・ワークツリーに反映させる場合には、`git merge`が必要<br>
<br>
#### ○エラー発生時（コンフリクト等）
&ensp;・`git fetch`でエラーが発生した場合<br>
&ensp;&ensp;→まだワークツリーまで更新されていない（mergeされていない）為、以下のコマンドで最新のコミットまで戻す（無かったことに）<br>
```
git reset --hard HEAD
```


### ▼pullとは
```
git pull リモート名　ブランチ名
```

&ensp;・`git fetch`と`git pull`の操作をまとめて実行可能<br>
&ensp;　（毎回同じ位置、同じサイズにファイルを開く、等）<br>
&ensp;・フォルダ/ファイルのコピー・移動、何らかのアプリケーションで開いた時・保存した時に自動生成される<br>
<br>

####　※実行時の注意点※

&ensp;・pullで指定したブランチに関わらず、今いるブランチにpullされる為、必ずブランチを切り替えてからpullする<br>
***
&ensp;例) 現在のブランチ:master　<br>
&ensp;&ensp;&ensp;ローカルのhogeブランチにリモートのhogeブランチを取り込む為、`-git pull origin hoge`を実行<br>
&ensp;&ensp;&ensp;→**ローカルのmasterブランチにリモートのhogeブランチの内容が取り込まれてしまう**
***
<br>

#### ○エラー発生時（コンフリクト等）

&ensp;・`git pull`でエラーが発生した場合<br>
&ensp;&ensp;→`pull = fetch + merge`なので、まずは`merge`を取り消す<br>

```
git merge --abort
```
&ensp;&ensp;→その後、以下のコマンドで最新のコミットまで戻す（無かったことに）<br>
```
git reset --hard HEAD
```
<br>

