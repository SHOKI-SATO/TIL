# CONFLICT

## ▼コンフリクトとは
>・mergeした際に、同じファイルの同じ行に対して異なる編集を行ったときに発生する<br>
<br>

### ●表示
>・ターミナル
```
Auto-merging index.html
CONFLICT (content): Merge conflict in index.html
Automatic merge failed; fix conflicts and then commit the result.
```
>・エディタ
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

### ●解消方法
>①`-git status`でコンフリクトが発生したファイルを探す（`both modified：　で表示されるファイル`）<br>
>②ファイルの内容を最終的なものに書き換える<br>
>③「<<」「==」「>>」の記述を削除する<br>
```
<h1>コンフリクトの例</h1>
<p> # 作業ブランチでの変更内容</p>
<p> # develop(マージしたブランチ)での変更内容</p>
<p>解消する</p>
```
<br>

### ●予防策
>・複数人で同じファイルを変更しない<br>
>・pullやmergeをする前に変更中の状態を無くしておく<br>
>・pullする際は、pullするブランチに移動してからpullする<br>
<br>
