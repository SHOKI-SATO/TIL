# Gitの流れ<br>
<br>

### ▼ローカル→リモートの流れ

**①ローカルリポジトリの新規作成orコピー**. <br>
&emsp;　`-cd フォルダ名`<br>
&emsp;　`-mkdr フォルダ名`<br>
&emsp;　`-git init`（作成）<br>
&emsp;　`-git clone リポジトリURL`（コピー）<br>
<br>

**②リモートリポジトリの作成**. <br>
　&emsp;GitHub上で「Create new repository」を選択<br>
<br>

**③ローカルリポジトリとリモートリポジトリの紐付け**. <br>
&emsp;　`-git remote add リモートリポジトリ名（任意）　　リポジトリURL`<br>
※ここで設定したリポジトリ名で、今後指定可能<br>
<br>
>>既存のリモートリポジトリを紐づけた場合<br>
><br>
>・現在のブランチがmainブランチであることの確認<br>   
>&emsp; `-git branch`<br>
>（違うブランチの場合は `git checkout main` でブランチ切り替える） <br>
><br>
>・現在のブランチのファイルに変更がないことを確認    <br>
>&emsp;　`-git status` <br>
><br>
>・ブランチを最新の状態にする    <br>
>&emsp;　`-git pull origin main`   <br>
<br>

**④新しいブランチを作成（ブランチ名はなんでも）**   <br>
&emsp;　　`-git checkout -b newブランチ名`   <br>
<br>

---

ファイルの編集

---

<br>

**⑤変更ファイルをステージング、コミット**. <br> 
&emsp;　`-git add ファイル名`<br>
&emsp;　`-git add .`<br> 
&emsp;　`-git commit ファイル名`<br>
&emsp;　`-git commit .`  
&emsp;　`-git commit -m "メッセージ"`<br>
&emsp;　`-git commit -ｖ`　&emsp;&emsp;　変更内容の確認が可能<br>
&emsp;　`-git commit .`<br>
&emsp;※エディタが開くので、メッセージを入力したら終了
<br>

**⑥リモートへプッシュ（先程作成したブランチ名（＝作業中のブランチ名））**. <br>
　&emsp;　`-git push origin newブランチ名` <br>
<br>

**⑦GitHubへ移動、プルリクエストをする**. <br>
　&emsp;　Pullrequestタブからnew pull request ➞create pull request <br> 
　&emsp;　依頼したい人を選択して送信（なければなし）  <br>
<br>

**⑧プルリクエストの確認**. <br>
　&emsp;　Filechangedタブから変更を確認、Conversationからマージ（Merge Pullrequest）    <br>
　&emsp;　マージ後はデリートブランチ    <br>
<br>
※通常はすぐにデプロイ   <br>
<br>
<br>

### ▼後作業

**①ローカルでmainブランチに切り替える**. <br> 
　&emsp;　`-git checkout main` <br>
<br>
**②ローカルに最新のリモート（meinブランチ）を取り込む**. <br>
　&emsp;　`-git pull origin main` <br>
<br>
**③ローカルのnewブランチ名（先程使ったブランチ）を削除**. <br>
　&emsp;　`-git branch -d newブランチ名` <br>
