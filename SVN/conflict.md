# conflict

## ▼コンフリクトとは
>・作業コピーを更新した際に、同じファイルの同じ行に対して異なる編集を行ったときに発生する<br>
>（作業コピーのリビジョンが古い場合はそもそもコミットが出来ない）<br>
<br>

### ●表示
>・作業コピーが最新リビジョンでない状態でコミットしようとすると、以下のメッセージが表示される<br>
<br>
<img width="1051" alt="スクリーンショット 2022-12-30 21 27 01" src="https://user-images.githubusercontent.com/81621944/210070137-61447f1f-0e79-4c2a-afff-4639be16f994.png"><br>
<br>

>・その状態で作業コピーを更新すると、更新するコミットに含まれる変更箇所と作業コピーの変更箇所が重複してい場合にコンフリクトが発生し、以下のメッセージが表示される<br>
<br>
<img width="1057" alt="スクリーンショット 2022-12-30 21 33 30" src="https://user-images.githubusercontent.com/81621944/210070649-0895fd75-3b05-4dd1-9f61-bb6afc159b7c.png"><br>
<br>

>・エクスプローラーの表示は以下のように増えている<br>
>>・file0101.txt&emsp;&emsp;&ensp;：元のファイル　このファイルを修正する<br>
>>・file0101.txt.mine：今回修正した内容が表示される（修正後に自動で消える）<br>
>>・file0101.txtr2&emsp;&ensp;：修正前の内容が表示される（修正後に自動で消える）<br>
>>・file0101.txtr3&emsp;&ensp;：現在のリポジトリの内容が表示される（リポジトリはこれが最新となっている）（修正後に自動で消える）<br>
<br>
<img width="518" alt="スクリーンショット 2022-12-30 21 37 25" src="https://user-images.githubusercontent.com/81621944/210070949-5e88b186-b6f3-4590-b7b0-55c5013cddf3.png"><br>
<br>

### ●解消方法
>①対象のファイルを右クリックし、TortoiseSVN > 競合を編集　をクリック<br>
>②TortoiseSVN標準のMergeツール「TortoiseMerge」が開く（設定からWinMergeなど他のツールにも変更可能）<br>
>③コードにカーソルを合わせて右クリックすると対応案が出てくるので選択して修正、保存<br>
<br>
<img width="1338" alt="スクリーンショット 2022-12-30 23 46 19" src="https://user-images.githubusercontent.com/81621944/210082711-0be3890b-452f-41d5-80c2-2e65f7170c85.png"><br>
<br>
>④コンフリクトは解消したので、コミットする（作業コピーからファイル名.mine等のファイルは消えている）<br>
<br>

### ●解消方法（バイナリファイルの場合）
>①対象のファイルを右クリックし、TortoiseSVN > 競合を編集　をクリック（ファイル名.mine　は作成されない）<br>
>②TortoiseSVN標準のDiffツール「TortoiseDiff」が開く（設定からDiffPDFなど他のツールにも変更可能）<br>
>※ファイル名.mine　は作成されない<br>
<br>

