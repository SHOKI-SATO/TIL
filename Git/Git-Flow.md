# Git-Flow

![代替テキスト](https://image.itmedia.co.jp/ait/articles/1708/01/at-it-git-15-001.jpg)
<br>

## ブランチの用途と種類<br>
　git-flowを使用した開発では「メインブランチ」とそれ以外の「サポートブランチ」を使用します。<br>
<br>

&ensp;**●メインブランチ**<br>
&ensp;-メインブランチには「master」と「develop」の2つのブランチがあります。これらのブランチは常に存在します。<br>
>&ensp;-master:リリース済みのソースコードを管理する<br>
>&ensp;-develop:開発中のソースコードを管理する（準備が出来たらmasterへマージ）<br>
<br>

&ensp;**●サポートブランチ**<br>
&ensp;-タスクごとに「フィーチャー」「リリース」「ホットフィックス」のいずれかのブランチを作成し、作業を行います。<br>
>&ensp;-feature:機能実装やバグ修正などの開発作業を行う(developから分岐し、developにマージ)<br>
>&ensp;-release:リリース準備作業を行う（開発間ん量したdevelopから分岐し、masterにマージしタグ付け後、developにマージ）<br>
>&ensp;-hotfix:緊急の修正作業を行う（masterから分岐し、masterにマージしタグ付け後、developにマージ）<br>
<br>

## 開発の流れ<br>
1. 開発<br>
    1. developブランチからfeatureブランチを切る（feature/XXXXXXブランチ）<br>
  ```
  git checkout develop
  git checkout -b feature/XXXXXX
  git push -u origin feature/XXXXXX
  ```
  <br>
    2. feature/XXXXXXブランチで開発<br>
  ```
  git add
  git status
  git commit
  git push
  ```
   <br>
    3. 開発終了後、feature/XXXXXXブランチをdevelopブランチにマージ（ローカルリポジトリ）<br>
   ```
   git checkout develop
   git pull
   git merge feature/XXXXXX
   ```
   <br>
    4. developリポジトリをリモートにpushする（リモートブランチ）<br>
   ```
   git push
   ```
   <br>
   
2. リリース
   1. developブランチからreleaseブランチを切る（release-XXXXXXXブランチ）<br>
   2. 確認し、問題なければrelease-XXXXXXXブランチをdevelopブランチ、masterブランチにマージ<br>
   3. masterブランチにタグ付け<br>
   <br>
 
3. 緊急対応
   1. masterブランチからhotfixesブランチを切る（hotfixes/XXXXXXXブランチ）<br>
   2. 修正対応後、hotfixes/XXXXXXXブランチをdevelopブランチ、masterブランチにマージ<br>
   3. masterブランチにタグ付け<br>
   <br>
<br>

