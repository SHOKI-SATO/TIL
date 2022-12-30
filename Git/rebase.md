# rebase

### ▼リベースとは<br>
&ensp;・コミット履歴を移動・修正するコマンド<br>
&ensp;・作業が完了したブランチを分岐元のブランチにくっつける（作業ブランチを分岐元（master 等）にくっつける）<br>
&ensp;・ブランチの起点となるコミットを別のコミットに移動する<br>
```
git rebase ブランチ名
```
<br>

#### ▼２つの使い方<br>
&ensp;①別々のブランチで伸ばしていた開発コミットを繋げ直す<br>
&ensp;②複数のコミットを1コミットにまとめる<br>
<br>

**①別々のブランチで伸ばしていた開発コミットを繋げ直す**<br>
&ensp;※開発をブランチBで行う場合<br>
![image](https://user-images.githubusercontent.com/81621944/205926765-91f1c0f0-3355-484d-821a-b10a668c28ab.png)<br>
&ensp;コマンドは以下<br>

```
git rebase 繋ぐ元にするブランチ名

```
&ensp;※具体的なコマンドは以下<br>
```
git rebase ブランチA

//以下のコマンドを実行することで、ブランチAのHEADもコミットDに移動する
git checkout ブランチA
git merge ブランチB

```
<br>

**②複数のコミットを1コミットにまとめる**<br>
&ensp;※開発をブランチAで行う場合(コミットAーDをまとめる)<br>
![image](https://user-images.githubusercontent.com/81621944/205923349-7c192968-9a56-4f33-9623-ef07ce756fa7.png)<br>
&ensp;コマンドは以下(`ひとまとめにする地点の一つ前のコミットID`は、この場合「開始地点」のコミットIDを指定)<br>
```
git rebase -i ひとまとめにする地点の一つ前のコミットID

```
&ensp;※具体的なコマンドは以下<br>
```
git rebase -i 「開始地点」のコミットID

```
<br>

#### ▼注意点<br>
&ensp;**★GitHubにPUSHしたコミットをリベースすると履歴が矛盾し、その後PUSH出来なくなるので絶対NG**<br>
&ensp;→PUSH出来ないからといって、`git push -f（強制PUSH）`は絶対NG<br>
&ensp;rebase元とrebase先を誤るとコミットログがごちゃごちゃになってしまうので、注意<br>
<br>


#### ▼mergeとの違い（どちらを使うかは運用方法次第）<br>
&ensp;○**merge**<br>
&ensp;&ensp;・コンフリクトの解決が比較的簡単<br>
&ensp;&ensp;・マージコミットが多くなると、履歴が複雑化する<br>
&ensp;&ensp;'→作業の履歴を残したいならマージ、コンフリクトが発生しそうならマージ'<br>
&ensp;○**merge**<br>
&ensp;&ensp;・コンフリクトの解決が若干面倒（複数のコミットでコンフリクトした場合、それぞれのコミットで解消が必要）<br>
&ensp;&ensp;・履歴をきれいに保つことが出来る<br>
&ensp;&ensp;'→PUSHしていないローカルの変更で、履歴を綺麗に保ちたいならリベース'<br>
<br>
&ensp;改めて、、、<br>
&ensp;&ensp;→リベースの使用OK：まだPUSHしていない、ローカルの開発内容<br>
&ensp;&ensp;→リベースの使用NG：一度でもPUSHされている（他の人の目に触れている）、他の人の修正が入っている<br>
<br>

#### ▼誤ってPUSH済みのコミットをリベースした場合<br>
&ensp;`git push`した際に以下のエラーが発生する <br>
<br>
<img width="473" alt="スクリーンショット 2022-12-08 22 51 34" src="https://user-images.githubusercontent.com/81621944/206463289-92577ea5-2b71-4545-b95c-424318578afa.png"><br>
&ensp;※ローカルブランチがリモートブランチに追いついていない（遅れている）<br>
<br>

**対処方法**<br>
&ensp;①`git log --oneline`でローカルのコミット履歴を確認<br>
&ensp;②GitHubに移動し、対象リポジトリの「commits」を開き、リモートのコミット履歴を確認<br>
&ensp;③差分を確認し、`git rebase -i コミットID`を指定し、差分のコミットを削除<br>
&ensp;④再度`git log --oneline`でローカルのコミット履歴を確認し、差分が解消されていることを確認<br>
&ensp;⑤`git pull リポジトリ名　ブランチ名`でリモートの状態にローカルを合わせる<br>
<br>






