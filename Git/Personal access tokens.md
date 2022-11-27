# Personal access tokens

### ▼Personal access tokens　とは
&ensp;GitHubにファイル等をPUSHする際に、GitHubの **「ユーザー名」** と **「パーソナルアクセストークン」** を使って本人であるという認証を行う<br>
&ensp;　（パスワードの代わり）<br>
<br>
### ▼設定の流れ
&ensp;① GitHubを開き、自分のアイコンのプルダウンから`Settings`をクリック<br>
&ensp;② 画面左側のメニューより、`Developper settings`をクリック<br>
&ensp;③ 画面左側のメニューよりｍ`Personal access tokens`をクリック<br>
&ensp;④ `Generate Personal access tokens`の`Tokens(classic)`をクリック<br>
&ensp;⑤ Note(使用目的)やExpiration(有効期限)などを入力し、必要項目（どの操作を許可するか）を選択（なんでもよければ全部選択でOK）し、`Generate token`をクリック<br>
&ensp;⑥ 遷移後画面で以下のようなトークンが発行されるので、必ずコピ-　<br>
&ensp;&ensp;※PUSHの実行に必要となるので、必ず控える
&ensp;&ensp;※紛失時は同じ手順で再発行する
```
ghp_P3at1LSCQ4K5Wyt7ghgwBNV2rHTFDr2O2grs
```
<br>
### ▼使用方法
&ensp;初回PUSH時、`git push origin　ファイル名`を実行すると、「ユーザー名」「パスワード」を聞かれる<br>
&ensp;「ユーザー名」にはGitHubのユーザー名、「パスワード」にはPersonal access token　を入力し実行<br>
