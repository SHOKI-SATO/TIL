# Gitの流れ<br>
<br>

### ▼ローカル→リモートの流れ

**①ローカルリポジトリの新規作成orコピー**. <br>
-cd フォルダ名<br>
-mkdr フォルダ名<br>
-git init　（作成）<br>
git clone リポジトリURL（コピー）<br>
<br>

**②リモートリポジトリの作成**. <br>
　　GitHub上で「Create new repository」<br>
<br>

**③ローカルリポジトリとリモートリポジトリの紐付け**. <br>
-git remote add リモートリポジトリ名（任意）　　リポジトリURL<br>
※ここで設定したリポジトリ名で、今後指定可能<br>
<br>
>>既存のリモートリポジトリを紐づけた場合
>・現在のブランチがmainブランチであることの確認<br>   
> git branch   <br>
>（違うブランチの場合は git checkout main でブランチ切り替える）   <br>
><br>
>・現在のブランチのファイルに変更がないことを確認    <br>
> git status   <br>
><br>
>・ブランチを最新の状態にする    <br>
> git pull origin main   <br>
<br>

**④新しいブランチを作成（ブランチ名はなんでも）**   <br>
　-git checkout -b newブランチ名   <br>
<br>

---

ファイルの編集

---

<br>

**⑤変更を追加**. <br> 
　-git add .   <br> 
　-git commit .   <br>
<br>

**⑥リモートへプッシュ（先程作成したブランチ名（＝作業中のブランチ名））**. <br>
　-git push origin newブランチ名   <br>
<br>

**⑦GitHubへ移動、プルリクエストをする**. <br>
　Pullrequestタブからnew pull request ➞create pull request <br> 
　依頼したい人を選択して送信（なければなし）  <br>
<br>

**⑧プルリクエストの確認**. <br>
　Filechangedタブから変更を確認、Conversationからマージ（Merge Pullrequest）    <br>
　マージ後はデリートブランチ    <br>
<br>
※通常はすぐにデプロイ   <br>
<br>
<br>

### ▼後作業

**①ローカルでmainブランチに切り替える**. <br> 
　-git checkout main <br>
<br>
**②ローカルに最新のリモート（meinブランチ）を取り込む**. <br>
　-git pull origin main   <br>
<br>
**③ローカルのnewブランチ名（先程使ったブランチ）を削除**. <br>
　-git branch -d newブランチ名   <br>
