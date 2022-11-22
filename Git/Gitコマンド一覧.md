# Gitコマンド一覧<br>
<br>
<br>

##### ●初期設定<br>
&ensp;`-git config --global user.name "XXXX"`<br>
&ensp;`-git config --global user.email "XXXX@hogehoge.com"`<br>
<br>
### ●設定の確認<br>
&ensp;`-git config --list`<br>
<br>
 **●ローカルリポジトリの新規作成**<br>
&ensp;`-git init`<br>
<br>
#### ●リモートからクローン（コピー）を取得<br>
&ensp;`-git clone https://github.com/XXXX/XXXXXX.git`<br>
<br>
#### ●リモートから変更を取得（ローカルにマージしない）<br>
&ensp;`-git fetch`<br>
<br>
#### ●リモートから変更を取得<br>
&ensp;`-git pull`<br>
&ensp;or<br>
&ensp;`-git fetch`<br>
&ensp;`-git merge origin/master`<br>
<br>
#### ●ファイルの登録<br>
&ensp;`-git add ファイル名`<br>
&ensp;`-git add *.java` （javaファイル全て）<br>
&ensp;`-git add .`<br>
<br>
#### ●ローカルの変更を確認<br>
&ensp;`-git status`<br>
<br>
#### ●ローカル/リモートのファイル差分を抽出<br>
&ensp;`-git diff`　（git addする前）<br>
&ensp;`-git diff　ファイル名`　（git addする前）<br>
&ensp;`-git diff　--staged`　（git addした後）<br>
<br>
#### ●ファイルの変更・追加をコミット<br>
&ensp;`-git commit`<br>
<br>
#### ●commitの変更履歴を確認<br>
&ensp;`-git log`<br>
<br>
#### ●リモートにプッシュ<br>
&ensp;`-git push` (ブランチを追跡している場合)<br>
&ensp;`-git push origin ブランチ名` (ブランチを指定する場合)<br>
<br>
#### ●addの取り消し<br>
&ensp;`-git reset HEAD ファイル名` (ブランチを追跡している場合)<br>
<br>
#### ●commitの取り消し<br>
&ensp;`-git reset --head HEAD^`　（直前の場合）<br>
<br>
#### ●コミットメッセージの修正<br>
&ensp;`-git commit --amend "新しいコミットメッセージ"`<br>
<br>
#### ●ローカルでブランチを作成<br>
&ensp;`-git branch ブランチ名`<br>
<br>
#### ●ローカルでブランチを切り替え<br>
&ensp;`-git checkout ブランチ名`<br>
<br>
#### ●ローカルでブランチを作成＆切り替え<br>
&ensp;`-git branch -b ブランチ名`<br>
<br>
#### ●ブランチ名の変更<br>
&ensp;`-git branch -m 古いブランチ名　新しいブランチ名`<br>
<br>
#### ●ブランチの削除<br>
&ensp;`-git branch -d ブランチ名`<br>
<br>
#### ●ローカルのブランチをリモートに反映<br>
&ensp;`-git push -u origin ローカルのブランチ名`<br>
<br>
#### ●リモートのブランチをローカルに反映<br>
&ensp;`-git branch ブランチ名　origin/ブランチ名`<br>
<br>
#### ●リモートのブランチを持ってくる＆切り替え<br>
&ensp;`-git checkout -b ブランチ名　origin/ブランチ名`<br>
<br>
#### ●全てのブランチを確認<br>
&ensp;`-git branch -a`<br>
<br>
#### ●ブランチの比較<br>
&ensp;`-git diff ブランチ名　ブランチ名`<br>
<br>
#### ●ブランチのマージ<br>
&ensp;`-git merge ブランチ名`　（マージ先となるブランチ上で実施（分岐元））<br>
<br>
#### ●リベース<br>
&ensp;`-git rebase　リベース先のブランチ名`　（リベースするブランチ上で（分岐先））<br>
<br>
#### ●変更を一旦退避（別ブランチに切り替えたいが、まだコミットしたくない時等）<br>
&ensp;`-git stash save`　（saveは省略可）<br>
<br>
#### ●退避した作業一覧の確認<br>
&ensp;`-git stash list`<br>
&ensp;※<stash名>: WIP on <stashを行ったブランチ名>: <ハッシュ値> <コミットメッセージ>が表示される<br>
<br>
#### ●退避し作業を戻す<br>
&ensp;`-git stash apply stash名`<br>
<br>
#### ●退避した作業を消す<br>
&ensp;`-git stash drop　stash名`<br>
&ensp;`-git stash clear`　（全て消す）<br>
<br>
#### ●ファイル削除<br>
&ensp;`-git rm -f ファイル名`<br>
<br>
#### ●ファイルリネーム<br>
&ensp;`-git mv 元のファイル名　新しいファイル名`<br>
<br>
#### ●ファイルを最新のコミットの状態に戻す<br>
&ensp;`-git checkout HEAD ファイル名`<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>

