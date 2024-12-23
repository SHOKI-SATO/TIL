# @Controllerと@RestControllerの違い

## ▼@Controllerと@RestControllerの違い
>・どちらも、付与することで「このクラスはコントローラ」として認識し、HTTPに関する様々な処理を自動で処理してくれる<br>
<br>

### ●違い
#### ○@Controller
>・Spring MVCのコントローラを指定するときに使用<br>
>・@Controllerは主にViewを返却するために使用<br>
<br>

#### ○@RestController
>・Spring MVC Controlleに@ResponseBodyが追加されたアノテーション(@Controller + @ResponseBody)<br>
>・＠RestControllerの主な用途はJson形式にデータを返却すること<br>
<br>

### ●まとめ
>HTMLをレスポンスする場合は`@Controller`<br>
>JSONをレスポンスする場合（APIなど）は`@RestController`<br>
<br>

