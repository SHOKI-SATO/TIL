# EL

## ▼EL（Expression Language）とは
>・変数やJavaBeansクラスのプロパティ値など、指定された式の出力を行うための言語<br>
>・HTMLファイルで文字列が書けるところであれば、どこでも書くことができる<br>
<br>

### ●定義方法
```jsp
${式}
```
<br>

### ●記載例
```jsp
${"Hello World"}
<br>
${'Hello World'}
<br>
${42 * 42}
<br>
I'm ${20 + 3} years old.
<br>
Hello World has ${"Hello World".length()} characters.
```
<br>

#### ●ポイント
>・文字列を`'(シングルクォーテーション)`で囲むのは、ダブルクォーテーションの中に入れられるようにする為<br>
>>`"${bloodType == "A"}" `とすることは出来ないが<br>
>>`"${bloodType == 'A'}"` あるいは`'${bloodType == "A"}'`とすることが出来る<br>
<br>

### ●演算子
>○算術演算子<br>
<img width="939" alt="スクリーンショット 2023-03-30 23 39 56" src="https://user-images.githubusercontent.com/81621944/228872491-4a863489-ae3e-4c67-89f4-b1e1f5de2935.png"><br>
<br>

>○関係演算子<br>
>・基本はJavaと同じだが、ELには別表記がある<br>
>>HTMLの中に入れた時にも関係演算子を見やすくする為<br>
>>`==`　で文字列の比較も可能<br>
<img width="941" alt="スクリーンショット 2023-03-30 23 40 04" src="https://user-images.githubusercontent.com/81621944/228872566-2a043417-e4db-4eeb-a2dd-ae146d208195.png"><br>
<br>

>○論理演算子<br>
>・基本はJavaと同じだが、こちらもELには別表記がある<br>
<img width="943" alt="スクリーンショット 2023-03-30 23 40 12" src="https://user-images.githubusercontent.com/81621944/228872642-04ee1eac-beb1-4e05-ac8f-6285e9199516.png"><br>
<br>

### ●JavaBeansの出力
>・JavaBeansのプロパティを簡単に出力できる<br>
```jsp
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="p06.CustomerBean"%>
<%
    CustomerBean cb1 = new CustomerBean();
    cb1.setCustomerId(1);
    cb1.setName("今井");
    request.setAttribute("customer1", cb1);
    CustomerBean cb2 = new CustomerBean();
    request.setAttribute("customer2", cb2);
%>

${customer1}
<br>
${customer1.getName()}
<br>
${customer1.name}
<hr>
${customer2.name}
```
<br>

>・また、以下のようにHTMLタグの属性値にも指定可能<br>
```html
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    request.setAttribute("color", "pink");
    request.setAttribute("message", "Hello World");
    request.setAttribute("tag", "h1");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>elAndHTML.jsp</title>
        <style>
            body{
                background-color: ${color};
            }
        </style>
    </head>
    <body>
        <input type="text" value="${message}">

        <${tag}>${message}</${tag}>

    </body>
</html>
```

>・JavaScriptの中に記述も可能<br>
```html
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>elAndJavaScript</title>
    </head>
    <body>
        <button id="logout">logout?</button>
        <%
            request.setAttribute("name", "田渕");
        %>
        <script>
            const button = document.querySelector("#logout");
            button.addEventListener("click", function () {
                let logout = confirm("${name}さん本当にログアウトしますか？");
                if (logout) {
                    window.location.href = "https://saycon.co.jp";
                }
            });
        </script>
    </body>
</html>
```
<br>
