# Stash

### ▼Stashとは<br>
&ensp;・作業の一時退避（コミット前の変更の退避（ワークツリー、インデックスの両方））<br>
<br>

#### ●stashの実行
```
-git stash
```
<br>
<br>

#### ●stashの確認<br>
```
-git stash list
```
&ensp;※`stash@{0}`の形式で表示される<br>
<br>
<br>

#### ●stashの復元<br>
&ensp;・最新の作業を復元<br>
```
-git stash apply
```
<br>
&ensp;・ステージの状況も復元<br>

```
-git stash apply --index
```

<br>

&ensp;・特定の作業を復元<br>
```
-git stash apply　スタッシュ名
-git stash apply　stash@{0}
```

<br>
<br>


#### ●stashの削除<br>
&ensp;・最新のstashを削除<br>
```
-git stash drop
```
<br>
&ensp;・特定のstashを削除<br>

```
-git stash drop　スタッシュ名
-git stash drop stash@{0}
```
<br>

&ensp;・全stashを削除<br>
```
-git stash clear
```
<br>
<br>
