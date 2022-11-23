# Gitコマンド一覧<br>
<br>
<br>

**●初期設定**<br>
&ensp;`-git config --global user.name "XXXX"`<br>
&ensp;`-git config --global user.email "XXXX@hogehoge.com"`<br>
<br>
**●設定の確認**<br>
&ensp;`-git config`<br>
>&emsp;op:<br>
>&emsp;--system	(Systemレベルの設定内容を対象とする)<br>
>&emsp;--global	(Globalレベルの設定内容を対象とする)<br>
>&emsp;--local	(Localレベルの設定内容を対象とする)<br>
>&emsp;-l (設定一覧を表示)<br>
>&emsp;--list	(設定一覧を表示)<br>
>&emsp;--help	(コマンドのヘルプを表示)<br>
>&emsp;--get	(設定値を表示)<br>
>&emsp;-e	(設定ファイルを編集)<br>
<br>
**●ローカルリポジトリの新規作成（配下フォルダをGitの管理下に）**<br>
&ensp;`-git init`<br>
&ensp;`-git init ディレクトリ名`<br>
<br>
**●リモートからクローン（コピー）を取得**<br>
&ensp;`-git clone https://github.com/XXXX/XXXXXX.git`<br>
<br>
**●リモートから変更を取得（ローカルにマージしない(作業フォルダに反映されない)）**<br>
&ensp;`-git fetch`<br>
>&ensp;※ワークツリー（作業フォルダ）に反映させたい場合は、フェッチ後にマージするか、フェッチを行わずにプルする<br>
<br>
**●リモートから変更を取得**<br>
&ensp;`-git pull`<br>
&ensp;`-git pull　origin ブランチ名`<br>
&ensp;or<br>
&ensp;`-git fetch`<br>
&ensp;`-git merge origin/master`<br>
<br>
**●ファイルをインデックス（ステージングエリア）に登録**<br>
&ensp;`-git add ファイル名`<br>
&ensp;`-git add *.java` （javaファイル全て）<br>
&ensp;`-git add .`<br>
>&emsp;op:<br>
>&emsp;-i	（対話式で実行）<br>
>&emsp;-n	（追加されるファイルを表示(表示するのみで追加はしない)）<br>
<br>
**●ローカルの変更を確認（ワークツリー/ローカルリポジトリ）**<br>
&ensp;`-git status`<br>
>&emsp;op:<br>
>&emsp;-b (ブランチの情報を確認)<br>
>&emsp;--branch	(ブランチの情報を確認)<br>
>&emsp;-s (結果を省略形で表示)<br>
>&emsp;--short	(結果を省略形で表示)<br>
<br>
**●ファイル差分を抽出**<br>
&ensp;`-git diff`　（addの前に確認：ワークツリー/インデックスの差分）<br>
&ensp;`-git diff --cathed`　（addの後に確認：インデックス/最新コミットの差分）<br>
&ensp;`-git diff --staged`　（addの後に確認：インデックス/最新コミットの差分）<br>
&ensp;`-git diff HEAD`　（commitの後に確認：最新コミット/ワークツリーの差分）<br>
&ensp;`-git diff HEAD^`　（commitの後に確認：最新コミット/前回のコミットの差分）<br>
&ensp;`-git diff　HEAD..origin/ブランチ名`　（最新コミット（ローカルリポジトリ）/リモートリポジトリ）<br>
&ensp;`-git diff　origin/ブランチ名..HEAD`　（pullの前に確認：リモートリポジトリ/最新コミックト（ローカルリポジトリ）の差分）<br>
&esnp;`-git diff　HEAD..origin/ブランチ名`　（pushの前に確認：最新コミット（ローカルリポジトリ）/リモートリポジトリの差分）<br>
>&emsp;op:<br>
>&emsp;--name-only	(差分があったファイル名のみ表示)<br>
<br>
**●ファイルの変更・追加をコミット**<br>
&ensp;`-git commit .`(全てのファイル)<br>
&ensp;`-git commit ファイル名`(指定したファイル)<br>
&ensp;`-git commit ファイル名　-m "メッセージ"`(指定したファイルにコミットメッセージを指定)<br>
>&emsp;op:<br>
>&emsp;-m "メッセージ" (メッセージを指定)<br>
>&emsp;--message	(メッセージを指定)<br>
>&emsp;--amend	(直前のコミットのメッセージを修正)<br>
<br>
**●commitの変更履歴を確認**<br>
&ensp;`-git log`<br>
&ensp;`-git log　ファイル名`（指定したファイルのログを表示）<br>
>&emsp;op:<br>
>&emsp;--oneline	(履歴のコミットハッシュ値の先頭7桁とコミットメッセージの一覧を表示)<br>
>&emsp;--decorate	(履歴のHEADの位置を明示)<br>
>&emsp;--graph	(履歴をグラフで表示)<br>
>&emsp;--grep 値	(コミットメッセージに＜値＞が含まれる履歴の一覧を表示)<br>
>&emsp;-数値	(直近から指定した回数分の履歴を表示)<br>
>&emsp;-p	(コミット間の差分も表示)<br>
>&emsp;--stat	(コミット間の差分の統計情報を表示)<br>
<br>
**●リモートにプッシュ**<br>
&ensp;`-git push` (ブランチを追跡している場合)<br>
&ensp;`-git push origin ブランチ名` (指定したブランチをプッシュ)<br>
&ensp;`-git push --delete origin ブランチ名`(指定したリモートブランチの削除)<br>
<br>
**●操作のの取り消し**<br>
&ensp;`-git reset ファイル名` (addした処理の取り消し)<br>
&ensp;`-git reset --soft HEAD^` (直前のcommitの取り消し（ワークツリーはそのまま）)<br>
&ensp;`git reset --hard ORIG_HEAD`　（誤ってリセットした場合：リセット前の状態に戻す）<br>
>&emsp;op:<br>
>&emsp;--soft	(対象範囲：最新コミット（ワークツリー、インデックスはそのまま）)<br>
>&emsp;--mixed	(対象範囲：最新コミット、インデックス（ワークツリーはそのまま）)<br>
>&emsp;--hard	(対象範囲：最新コミット、インデックス、ワークツリー（全て）)<br>
<br>
**●ブランチ操作**<br>
&ensp;`-git branch`　（ローカルブランチ一覧の表示）<br>
&ensp;`-git branch ブランチ名`　（ブランチの作成）<br>
&ensp;`-git branch ブランチ名 origin/ブランチ名`　（ブランチの作成（リモートブランチを元に））<br>
&ensp;`-git branch -d ブランチ名`　（指定したブランチの削除）<br>
&ensp;`-git branch -D ブランチ名`　（指定したブランチの強制削除)<br>
&ensp;`-git branch -m 新ブランチ名`　（現在のブランチのブランチ名の変更）<br>
&ensp;`-git branch -m 現ブランチ名　新ブランチ名`　（指定したブランチのブランチ名の変更）<br>
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
<br>
**●ローカルでブランチを切り替え**<br>
&ensp;`-git checkout ブランチ名`<br>
&ensp;`-git checkout -b ブランチ名`(ブランチの作成＆切り替え)<br>
&ensp;`-git checkout -b ブランチ名 origin/ブランチ名`(ブランチの作成&切り替え（ローカルブランチを元に）)<br>
<br>
**●ファイルを最新のコミットの状態に戻す**<br>
&ensp;`-git checkout HEAD ファイル名`()<br>
<br>
**●ブランチのマージ**<br>
&ensp;`-git merge ブランチ名`　（マージ先となるブランチ上で実施（分岐元））<br>
<br>
**●リベース（ブランチを統合し、履歴を付け替える）**<br>
&ensp;`-git rebase　リベース先のブランチ名`　（リベース先のブランチ上で（分岐先））<br>
>&emsp;op:<br>
>&emsp;-i	対話モードでリベースを行う<br>
>&emsp;--abort	リベースをキャンセル<br>
>&emsp;--continue	リベースを続ける<br>
<br>
**●変更を一旦退避（別ブランチに切り替えたいが、まだコミットしたくない時等）**<br>
&ensp;`-git stash`<br>
&ensp;※<stash名>: WIP on <stashを行ったブランチ名>: <ハッシュ値> <コミットメッセージ>が表示される<br>
&ensp;`-git stash save "スタッシュ名"`(スタッシュ名を設定して退避)<br>
&ensp;`-git stash list` (スタッシュへ退避した一覧の表示)<br>
&ensp;`-git stash pop`(全てのスタッシュを復元（スタッシュからは削除）)<br>
&ensp;`-git stash pop　スタッシュ名`(指定したスタッシュを復元（スタッシュからは削除）)<br>
&ensp;`-git stash apply` (全てのスタッシュを復元（スタッシュに残したまま）)<br>
&ensp;`-git stash apply ファイル名` (指定したスタッシュを復元（スタッシュに残したまま）)<br>
&ensp;`-git stash drop　stash名` （指定したスタッシュを削除）<br>
&ensp;`-git stash clear`　（全てのスタッシュを削除）<br>
<br>
<br>
<br>
**●ファイル削除（対象：Git管理下のファイル）**<br>
&ensp;`-git rm ファイル名`<br>
&ensp;`-git rm *.java` (.javaのファイルを全て削除)<br>
&ensp;`-git rm --cached ファイル名` (インデックスからファイルを削除)<br>
>&emsp;op:<br>
>&emsp;--cached	(インデックスからのみ削除)<br>
>&emsp;-n	(実行結果のみ確認（処理は実行されません）)<br>
<br>
**●ファイル削除（対象：Git管理外のファイル）**<br>
&ensp;`-git clean -n` （削除対象ファイルを確認（カレントディレクトリ））<br>
&ensp;`-git clean -f` (削除対象ファイルを強制的に削除（カレントディレクトリ）)<br>
&ensp;`-git clean -f　ファイル名` (指定したファイルを強制的に削除)<br>
>&emsp;op:<br>
>&emsp;-n	(削除対象ファイルを表示（削除は行わない）)<br>
>&emsp;-f	(強制的に削除)<br>
>&emsp;-d	(ディレクトリも削除対象に)<br>
>&emsp;-q	(削除時に削除したファイルを表示しない)<br>
>&emsp;-i	(対話モードで実行)<br>
>&emsp;-e ファイル名 (指定したファイルは削除しない)<br>
<br>
**●ファイルの移動/名前の修正**<br>
&ensp;`-git mv ファイル名　フォルダ名` (指定ファイルを指定フォルダに移動)<br>
&ensp;`-git mv 元のファイル名　新しいファイル名` (名前の変更)<br>
<br>
