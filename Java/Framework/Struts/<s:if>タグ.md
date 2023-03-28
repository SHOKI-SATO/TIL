# <s:if>タグ

## ▼<s:if>タグ
>・JSP中にテキストやボタンを条件に応じて表示させる方法<br>
<br>

### ●見出し
>・ifタグのtestは、プロパティ名<br>
>・testプロパティがtrueの場合、ifタグに囲まれている部分を表示<br>
>・falseの場合はelseタグで囲まれている部分を表示<br>
<br>

#### ●使用例
```javascript
<s:if test="%{hoge=='aaa'}">
　　aaaaaaa
</s:if>
<s:elseif test="%{hoge=='bbb'}">
　　bbbbbb
</s:elseif>
<s:else>
　　hogehoge
</s:else>
```
