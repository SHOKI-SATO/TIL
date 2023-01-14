# Stash

## ▼Stashとは
>・作業の一時退避（コミット前の変更の退避（ワークツリー、インデックスの両方））<br>
<br>

### ●stashの実行
```
-git stash
```
<br>

### ●stashの確認
```
-git stash list
```
>※`stash@{0}`の形式で表示される<br>
<br>

### ●stashの復元
>・最新の作業を復元<br>
```
-git stash apply
```

>・ステージの状況も復元<br>
```
-git stash apply --index
```
<br>

>・特定の作業を復元<br>
```
-git stash apply　スタッシュ名
-git stash apply　stash@{0}
```
<br>


### ●stashの削除
>・最新のstashを削除<br>
```
-git stash drop
```
<br>

>・特定のstashを削除<br>
```
-git stash drop　スタッシュ名
-git stash drop stash@{0}
```
<br>

>・全stashを削除<br>
```
-git stash clear
```
<br>
