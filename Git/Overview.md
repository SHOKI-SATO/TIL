# Gitの流れ<br>
<br>
 **ローカル→リモートの流れ** 
 <br>
&ensp;1.ローカルにリモートリポジトリを作成（git remote add）   <br>
&ensp;2.ローカルリポジトリを最新化(git pull)   <br>
&ensp;3.ローカルのファイルをワークツリーへステージング（git add）    　<br>
&ensp;4.ステージングファイルをローカルリポジトリへコミット（git commit）   <br>
&ensp;5.ローカルリポジトリをリモートリポジトリへプッシュ（git push）    <br>
&ensp;6.GitHubへ移動しプルリクエスト   <br>
&ensp;(7.プルリクエストの確認（マージ後はデリートブランチ）)<br>
<br>
<br>
<br>
<br>
**▼具体的な流れ**<br>
・リモートをコピー   <br>
　-git clone URL<br>
<br>
もしくは（すでにフォルダ作成済の場合は）    <br>
<br>
＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝ <br>  
<br>
・ローカルにリモートリポジトリを新規追加    <br>
　-git remote add origin URL    <br>
<br>
・現在のブランチがmainブランチであることの確認<br>   
　-git branch   <br>
（違うブランチの場合は git checkout main でブランチ切り替える）   <br>
<br>
・現在のブランチのファイルに変更がないことを確認    <br>
　-git status   <br>
<br>
・ブランチを最新の状態にする    <br>
　-git pull origin main   <br>
＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝   <br>
<br>
・新しいブランチを作成（ブランチ名はなんでも）   <br>
　-git checkout -b newブランチ名   <br>
<br>
〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜   <br>
〜〜〜〜〜ファイルを編集〜〜〜〜〜   <br>
〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜   <br>
<br>
・変更を追加<br>    
　-git add .   <br> 
　-git commit .   <br>
<br>
・リモートへプッシュ（先程作成したブランチ名（＝作業中のブランチ名））   <br>
　-git push origin newブランチ名   <br>
<br>
・GitHubへ移動、プルリクエストをする   <br>
　Pullrequestタブからnew pull request ➞create pull request <br>  
　依頼したい人を選択して送信（なければなし）    <br>
<br>
・プルリクエストの確認   <br>
　Filechangedタブから変更を確認、Conversationからマージ（Merge Pullrequest）    <br>
　マージ後はデリートブランチ    <br>
<br>
<br>
※通常はすぐにデプロイ   <br>
<br>
<br>
**▼後作業** <br>
・ローカルでmainブランチに切り替える<br>    
　-git checkout main    <br>
<br>
・ローカルに最新のリモート（meinブランチ）を取り込む    <br>
　-git pull origin main   <br>
<br>
・ローカルのnewブランチ名（先程使ったブランチ）を削除    <br>
　-git branch -d newブランチ名   <br>
