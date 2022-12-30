# CONFLICT

### ▼コンフリクトとは<br>
&ensp;・mergeした際に、同じファイルの同じ行に対して異なる編集を行ったときに発生する<br>
<br>

#### ●表示
&ensp;・ターミナル
```
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
Automatic merge failed; fix conflicts and then commit the result.
```
&ensp;・エディタ
```
<h1>コンフリクトの例</h1>
<<<<<<< HEAD
<p> # 作業ブランチでの変更内容</p>
・・・
=======
<p> # develop(マージしたブランチ)での変更内容</p>
・・・
>>>>>>> develop
<p>解消する</p>
```
<br>

#### ●解消方法
&ensp;①`-git status`でコンフリクトが発生したファイルを探す（`both modified：　で表示されるファイル`）<br>
&ensp;②ファイルの内容を最終的なものに書き換える<br>
&ensp;③「<<」「==」「>>」の記述を削除する<br>
```
<h1>コンフリクトの例</h1>
<p> # 作業ブランチでの変更内容</p>
<p> # develop(マージしたブランチ)での変更内容</p>
<p>解消する</p>
```
<br>

#### ●予防策
&ensp;複数人で同じファイルを変更しない<br>
&ensp;pullやmergeをする前に変更中の状態を無くしておく<br>
&ensp;pullする際は、pullするブランチに移動してからpullする<br>
<br>
