# Gitの流れ<br>
<br>

### ▼ローカル→リモートの流れ

&ensp;①ローカルにリモートリポジトリを作成（git remote add）   <br>
&ensp;②ローカルリポジトリを最新化(git pull)   <br>
&ensp;③ローカルのファイルをワークツリーへステージング（git add）    　<br>
&ensp;④ステージングファイルをローカルリポジトリへコミット（git commit）   <br>
&ensp;⑤ローカルリポジトリをリモートリポジトリへプッシュ（git push）    <br>
&ensp;⑥GitHubへ移動しプルリクエスト   <br>
&ensp;(⑦プルリクエストの確認（マージ後はデリートブランチ）)<br>
<br>
<br>
<br>
<br>

### ▼具体的な流れ

①リモートをコピー   <br>
　-git clone URL<br>
<br>
>もしくは（すでにフォルダ作成済の場合は） <br>
>><br>
>>・ローカルにリモートリポジトリを新規追加    <br>
>>git remote add origin URL    <br>
>><br>
>>・現在のブランチがmainブランチであることの確認<br>   
>> git branch   <br>
>>（違うブランチの場合は git checkout main でブランチ切り替える）   <br>
>><br>
>>・現在のブランチのファイルに変更がないことを確認    <br>
>> git status   <br>
>><br>
>>・ブランチを最新の状態にする    <br>
>> git pull origin main   <br>
<br>
②新しいブランチを作成（ブランチ名はなんでも）   <br>
　-git checkout -b newブランチ名   <br>
<br>
---
ファイルの編集
---
<br>
<br>
③変更を追加<br>    
　-git add .   <br> 
　-git commit .   <br>
<br>
④リモートへプッシュ（先程作成したブランチ名（＝作業中のブランチ名））   <br>
　-git push origin newブランチ名   <br>
<br>
⑤GitHubへ移動、プルリクエストをする   <br>
　Pullrequestタブからnew pull request ➞create pull request <br>  
　依頼したい人を選択して送信（なければなし）    <br>
<br>
⑥プルリクエストの確認   <br>
　Filechangedタブから変更を確認、Conversationからマージ（Merge Pullrequest）    <br>
　マージ後はデリートブランチ    <br>
<br>
<br>
※通常はすぐにデプロイ   <br>
<br>
<br>

### ▼後作業

①ローカルでmainブランチに切り替える<br>    
　-git checkout main    <br>
<br>
②ローカルに最新のリモート（meinブランチ）を取り込む    <br>
　-git pull origin main   <br>
<br>
③ローカルのnewブランチ名（先程使ったブランチ）を削除    <br>
　-git branch -d newブランチ名   <br>
