# Gitコマンド


### ●初期設定
```
git config --global user.name "XXXX"`
git config --global user.email "XXXX@hogehoge.com"`
```

### ●設定の確認
```
git config
```
>&emsp;op:<br>
>&emsp;--system	(Systemレベルの設定内容を対象とする)<br>
>&emsp;--global	(Globalレベルの設定内容を対象とする)<br>
>&emsp;--local	(Localレベルの設定内容を対象とする)<br>
>&emsp;-l (設定一覧を表示)<br>
>&emsp;--list	(設定一覧を表示)<br>
>&emsp;--help	(コマンドのヘルプを表示)<br>
>&emsp;--get	(設定値を表示)<br>
>&emsp;-e	(設定ファイルを編集)<br>

### ●ローカルリポジトリの新規作成（配下フォルダをGitの管理下に）
```
git init
git init ディレクトリ名
```

### ●リモートからクローン（コピー）を取得（メインブランチ）
```
git clone URL`(URLは、https://github.com/XXXX/XXXXXX.git)
git clone -b ブランチ名　URL`(クローンするブランチを指定（指定しない場合はmainブランチを取得）)
```
>&emsp;op:<br>
>&emsp;-b	(取得するブランチを指定)<br>

### ●リモートから変更を取得（ローカルにマージしない(作業フォルダに反映されない)）
```
git fetch
```
>&ensp;※ワークツリー（作業フォルダ）に反映させたい場合は、フェッチ後にマージするか、フェッチを行わずにプルする<br>

### ●リモートから変更を取得（今自分がいるブランチに取り込まれるので、必ずpullしたいブランチに移動してから行う）
```
git pull
git pull　origin ブランチ名
or
git fetch
git merge origin/master
```

### ●ローカルリポジトリをリモートリポジトリに登録（複数登録可能）
```
git remote add origin URL
git remote rm origin`（※削除する場合）
```

### ●リモートリポジトリの一覧を表示
```
git remote
git remote show リモート名` （より詳細なリモートリポジトリの情報）
```
>&emsp;op:<br>
>&emsp;-v	（URLを含めて表示）<br>

### ●リモートリポジトリ名前を変更
```
git remote rename 旧リモートの名前　新リモートの名前
```

### ●ファイルをインデックス（ステージングエリア）に登録
```
git add ファイル名
git add *.java` （javaファイル全て）
git add .
```
>&emsp;op:<br>
>&emsp;-i	（対話式で実行）<br>
>&emsp;-n	（追加されるファイルを表示(表示するのみで追加はしない)）<br>

### ●ローカルの変更を確認（ワークツリー/ローカルリポジトリ）
```
git status
```
>&emsp;op:<br>
>&emsp;-b (ブランチの情報を確認)<br>
>&emsp;--branch	(ブランチの情報を確認)<br>
>&emsp;-s (結果を省略形で表示)<br>
>&emsp;--short	(結果を省略形で表示)<br>

### ●ファイル差分を抽出
```
git diff`　（addの前に確認：ワークツリー/インデックスの差分）
git diff --cached`　（addの後に確認：インデックス/最新コミットの差分）
git diff --staged`　（addの後に確認：インデックス/最新コミットの差分）
git diff HEAD`　（commitの後に確認：最新コミット/ワークツリーの差分）
git diff HEAD^`　（commitの後に確認：最新コミット/前回のコミットの差分）
git diff　HEAD..origin/ブランチ名`　（最新コミット（ローカルリポジトリ）/リモートリポジトリ）
git diff　origin/ブランチ名..HEAD`　（pullの前に確認：リモートリポジトリ/最新コミックト（ローカルリポジトリ）の差分）
git diff　HEAD..origin/ブランチ名`　（pushの前に確認：最新コミット（ローカルリポジトリ）/リモートリポジトリの差分）
```
>&emsp;op:<br>
>&emsp;--name-only	(差分があったファイル名のみ表示)<br>

### ●ファイルの変更・追加をコミット
```
git commit .`(全てのファイル)
git commit ファイル名`(指定したファイル)
git commit ファイル名　-m "メッセージ"`(指定したファイルにコミットメッセージを指定)
```
>&emsp;op:<br>
>&emsp;-m "メッセージ" (メッセージを指定)<br>
>&emsp;--message	(メッセージを指定)<br>
>&emsp;--amend	(直前のコミットの修正)<br>
>&emsp;&emsp;&emsp;※リモートにPUSH済のコミットはNG、PUSH済のコミットを修正の場合は新しくコミットをする<br>
>&emsp;&emsp;&emsp;→手順は通常と同じく、ファイルの変更→add→commitで、commit時に'--amend'を指定する<br>

### ●commitの変更履歴を確認
```
git log
git log --oneline`（コミットの履歴を確認（コミットIDの確認時、またはコミットメッセージから探したい時））
git log　ファイル名`（指定したファイルのログを表示）
```
>&emsp;op:<br>
>&emsp;--oneline	(履歴のコミットハッシュ値の先頭7桁とコミットメッセージの一覧を表示)<br>
>&emsp;--decorate	(履歴のHEADの位置を明示)<br>
>&emsp;--graph	(履歴をグラフで表示)<br>
>&emsp;--grep 値	(コミットメッセージに＜値＞が含まれる履歴の一覧を表示)<br>
>&emsp;-数値	(直近から指定した回数分の履歴を表示)<br>
>&emsp;-p	(コミット間の差分(変更した内容)も表示)<br>
>&emsp;--stat	(コミット間の差分の統計情報を表示)<br>
>&emsp;--n 1	(指定したコミットの数だけ表示)<br>

### ●リモートにプッシュ
```
git push` (ブランチを追跡している場合)
git push origin ブランチ名` (指定したブランチをプッシュ)
git push -u origin ブランチ名` (指定したブランチをプッシュ(次回以降、`git push(pull)`のみでPUSH(PULL)が可能 ))
git push --delete origin ブランチ名`(指定したリモートブランチの削除)
```
>&emsp;op:<br>
>&emsp;-u	(上流ブランチの規定)<br>
>&emsp;（--set-upstreamと同義） 

### ●ブランチ操作
```
git branch`　（ローカルブランチ一覧の表示）
git branch ブランチ名`　（ブランチの作成）
git branch ブランチ名 origin/ブランチ名`　（ブランチの作成（リモートブランチを元に））
git branch -d ブランチ名`　（指定したブランチの削除（マスターへ反映されていないブランチは削除しない））
git branch -D ブランチ名`　（指定したブランチの強制削除)
git branch -m 旧ブランチ名　新ブランチ名`　（指定したブランチのブランチ名の変更）
&ensp;&ensp;※現在のブランチのブランチ名を変える場合は、`git branch -m 新ブランチ名`でOK<br>
```
>&emsp;op:<br>
>&emsp;-a (ローカルブランチとリモートブランチ（追跡ブランチ）の両方を一覧表示)
>&emsp;--all	(ローカルブランチとリモートブランチ（追跡ブランチ）の両方を一覧表示)<br>
>&emsp;-r (リモートブランチの一覧を表示)<br>
>&emsp;--remote	(リモートブランチの一覧を表示)<br>
>&emsp;--merged	(HEADにマージ済みのブランチ一覧を表示)<br>
>&emsp;--no-merged	(HEADにマージされていないブランチ一覧を表示)<br>
>&emsp;-d (ブランチを削除)<br>
>&emsp;--delete	(ブランチを削除)<br>
>&emsp;-D	(ブランチを強制的に削除)<br>
>&emsp;-m	(ブランチ名を変更)<br>
>&emsp;--help	(コマンドのヘルプを表示)<br>
>&emsp;-v	(ブランチ毎の最新コミットIDとメッセージを表示)<br>
>&emsp;-vv	(ローカルブランチと追跡ブランチの対応一覧を表示)<br>

### ●ローカルでブランチを切り替え
```
git checkout ブランチ名
git checkout -b ブランチ名`(ブランチの作成＆切り替え)
-git checkout -b ブランチ名 origin/ブランチ名`(ブランチの作成&切り替え（ローカルブランチを元に）)
```

### ●操作の取り消し
```
git checkout -- ファイル名` (ワークツリーをインデックスの状態に戻す)
git checkout .`(ワークツリーをインデックスの状態に戻す（全ファイル）)
git checkout HEAD ファイル名`(インデックスとワークツリーを最新コミットの状態に戻す)
※`--`としているのは、「ブランチ名」と「ファイル名/ディレクトリ名」が被ったときに対応するため
```

### ●操作のの取り消し
```
git reset HEAD` (インデックスを最新コミットの状態に戻す）)
git reset --hard HEAD` (ワークツリー、インデックス（、コミット）を最新コミットの状態に戻す（HEADではなくコミットIDを指定した場合は、指定時点以降のコミットを削除）)
git reset --hard HEAD^` (ワークツリー、インデックス、最新コミットを一つ前のコミットの状態に戻す（HEADではなくコミットIDを指定した場合は、指定時点以降のコミットを削除）)
git reset --soft HEAD^` (最新コミットを一つ前のコミットの状態に戻す（HEADではなくコミットIDを指定した場合は、指定時点以降のコミットを削除）)
git reset --hard ORIG_HEAD`　（最新コミットを誤ってリセットした場合（リセット前の状態に戻す））
```
>&emsp;op:<br>
>&emsp;--soft	(対象範囲：最新コミット（ワークツリー、インデックスはそのまま）)<br>
>&emsp;--mixed	(対象範囲：最新コミット、インデックス（ワークツリーはそのまま）)<br>
>&emsp;--hard	(対象範囲：最新コミット、インデックス、ワークツリー（全て）)<br>

![image](https://user-images.githubusercontent.com/81621944/204120446-a23a4ab5-dfbe-4d64-913d-5919100519e2.png)


### ●ブランチのマージ
```
git merge ブランチ名`　（マージ先となるブランチ上で実施（分岐元））
```

### ●リベース（ブランチを統合し、履歴を付け替える）
```
git rebase　リベース先のブランチ名`　（リベース先のブランチ上で（分岐先））
```
>&emsp;op:<br>
>&emsp;-i	対話モードでリベースを行う<br>
>&emsp;--abort	リベースをキャンセル<br>
>&emsp;--continue	リベースを続ける<br>

### ●変更を一旦退避（別ブランチに切り替えたいが、まだコミットしたくない時等）
```
git stash
※<stash名>: WIP on <stashを行ったブランチ名>: <ハッシュ値> <コミットメッセージ>が表示される
git stash save "スタッシュ名"`(スタッシュ名を設定して退避)
git stash list` (スタッシュへ退避した一覧の表示)
git stash pop`(全てのスタッシュを復元（スタッシュからは削除）)
git stash pop　スタッシュ名`(指定したスタッシュを復元（スタッシュからは削除）)
git stash apply` (全てのスタッシュを復元（スタッシュに残したまま）)
git stash apply ファイル名` (指定したスタッシュを復元（スタッシュに残したまま）)
git stash drop　stash名` （指定したスタッシュを削除）
git stash clear`　（全てのスタッシュを削除）
```

### ●ファイル削除（対象：Git管理下のファイル）
```
git rm ファイル名
git rm *.java` (.javaのファイルを全て削除)
git rm --cached ファイル名` (インデックス、リポジトリ（ローカル/リモート）からファイルを削除　※ワークツリーには残す)
```
>&emsp;op:<br>
>&emsp;--cached	(インデックスからのみ削除)<br>
>&emsp;-n	(実行結果のみ確認（処理は実行されません）)<br>

### ●ファイル削除（対象：Git管理外のファイル）
```
git clean -n` （削除対象ファイルを確認（カレントディレクトリ））
git clean -f` (削除対象ファイルを強制的に削除（カレントディレクトリ）)
git clean -f　ファイル名` (指定したファイルを強制的に削除)
```
>&emsp;op:<br>
>&emsp;-n	(削除対象ファイルを表示（削除は行わない）)<br>
>&emsp;-f	(強制的に削除)<br>
>&emsp;-d	(ディレクトリも削除対象に)<br>
>&emsp;-q	(削除時に削除したファイルを表示しない)<br>
>&emsp;-i	(対話モードで実行)<br>
>&emsp;-e ファイル名 (指定したファイルは削除しない)<br>

### ●ファイルの移動/名前の修正
```
git mv ファイル名　フォルダ名` (指定ファイルを指定フォルダに移動)
git mv 元のファイル名　新しいファイル名` (名前の変更)
```
<br>
