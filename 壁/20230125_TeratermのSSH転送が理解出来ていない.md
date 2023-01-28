# ▼TeratermのSSH転送が理解出来ていない<br>
<br>

●詳細（画像があれば）<br>
>TeratermのSSH接続はわかっているが、`SSH転送`が理解出来ていない<br>
>デモ環境に接続する際に、`端末　→ 踏み台サーバ　→ デモ環境`とSSH接続していることは分かるが、LocalHostを挟む理由が分からない<br>
>また、SSH接続した先でSSH転送？の仕組み？が分からない<br>
<br>

●解説<br>
>以下を解説していく<br>
>![image](https://user-images.githubusercontent.com/81621944/215250893-78f6ea32-424f-4fc2-b172-128089e6b668.png)<br>
<br>

>①端末はサーバBへSSH接続<br>
>![image](https://user-images.githubusercontent.com/81621944/215250963-6e99df57-0021-4e22-b132-4b711fb637a6.png)<br>

>②端末はサーバBへ接続後、SSH転送を選択<br>
>![image](https://user-images.githubusercontent.com/81621944/215251031-056b043c-f697-4fdd-a9ba-1a5fd82f5a8b.png)<br>

>③端末はSSHポート転送の設定を確認して反映<br>
>![image](https://user-images.githubusercontent.com/81621944/215251108-e679b2b6-71db-432d-840e-9e164bbd7afc.png)<br>
>![image](https://user-images.githubusercontent.com/81621944/215251118-d99a33c5-5619-4f7f-b430-c81d7f177193.png)<br>

>④接続確認（端末でWEBサーバAへアクセス）<br>
>![image](https://user-images.githubusercontent.com/81621944/215251157-8a32ad6e-3a54-4a96-9bcf-72b9d0a3561b.png)<br>
>![image](https://user-images.githubusercontent.com/81621944/215251168-5ef40bde-f9f8-4f90-be46-9e5a4caa8f19.png)<br>
<br>

●参考URL<br>
>https://isleofhoso.com/teraterm-portforward-web/<br>
>https://www.j-oosk.com/teraterm/port-forward/787/<br>
<br>
