# Git-Flow

![代替テキスト](https://image.itmedia.co.jp/ait/articles/1708/01/at-it-git-15-001.jpg)
<br>

## ブランチの用途と種類<br>
　git-flowを使用した開発では「メインブランチ」とそれ以外の「サポートブランチ」を使用します。<br>
<br>

&ensp;**●メインブランチ**<br>
&ensp;-メインブランチには「master」と「develop」の2つのブランチがあります。これらのブランチは常に存在します。<br>
>&ensp;--master:リリース済みのソースコードを管理する<br>
>&ensp;--develop:開発中のソースコードを管理する<br>
<br>

&ensp;**●サポートブランチ**<br>
&ensp;-タスクごとに「フィーチャー」「リリース」「ホットフィックス」のいずれかのブランチを作成し、作業を行います。<br>
>&ensp;--feature:機能実装やバグ修正などの開発作業を行う<br>
>&ensp;--release:リリース準備作業を行う<br>
>&ensp;--hotfix:緊急の修正作業を行う<br>
<br>

