●大まかな流れ   
1.ローカルにリモートリポジトリを作成（git remote add）   
2.ローカルリポジトリを最新化(git pull)
3.ローカルのファイルをワークツリーへステージング（git add）    　
4.ワークツリーをローカルリポジトリへコミット（git commit）   
5.ローカルリポジトリをリモートリポジトリへプッシュ（git push）    
6.GitHubへ移動しプルリクエスト   
(7.プルリクエストの確認（マージ後はデリートブランチ）)



    
        
            
                
                    
                    
＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝   


・リモートをコピー   
　git clone URL


もしくは（すでにフォルダ作成済の場合は）    

＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝   

・ローカルにリモートリポジトリを新規追加    
　git remote add origin URL    

・現在のブランチがmainブランチであることの確認   
　git branch   
（違うブランチの場合は git checkout main でブランチ切り替える）   

・現在のブランチのファイルに変更がないことを確認    
　git status   

・ブランチを最新の状態にする    
　git pull origin main   
＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝＝   

・新しいブランチを作成（ブランチ名はなんでも）   
　git checkout -b newブランチ名   

〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜   
〜〜〜〜〜ファイルを編集〜〜〜〜〜   
〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜〜   

・変更を追加    
　git add .    
　git commit .   

・リモートへプッシュ（先程作成したブランチ名（＝作業中のブランチ名））   
　git push origin newブランチ名   

・GitHubへ移動、プルリクエストをする   
　Pullrequestタブからnew pull request ➞create pull request   
　依頼したい人を選択して送信（なければなし）    

・プルリクエストの確認   
　Filechangedタブから変更を確認、Conversationからマージ（Merge Pullrequest）    
　マージ後はデリートブランチ    


※通常はすぐにデプロイ   


●後作業    
・ローカルでmainブランチに切り替える    
　git checkout main    

・ローカルに最新のリモート（meinブランチ）を取り込む    
　git pull origin main   

・ローカルのnewブランチ名（先程使ったブランチ）を削除    
　git branch -d newブランチ名   
