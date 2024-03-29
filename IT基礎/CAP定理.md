# CAP定理

## ▼CAP定理とは
>・分散処理システムにおいては、一貫性・可用性・分断耐性の3つの特性のうち、最大でも同時に2つまでしか満たすことができないとする定理<br>
<br>

### ●見出し
>●一貫性（Consistency）<br>
>>データの整合性が常に保たれていること<br>
>>データ読み込みは最新の結果、またはエラーを返す<br>

>●可用性（Availability）<br>
>>利用したいときに求める分だけ利用できること<br>
>>データ読み込みは必ず何らかの結果を返す<br>

>●分断耐性（Partition Tolerance）<br>
>>データを複数のサーバに分散して保管していること<br>
>>ネットワーク分断の発生時も動作が保証される<br>
<br>

![image](https://user-images.githubusercontent.com/81621944/235273631-f9d9a749-eb88-4dad-b8fe-061c5bdc833e.png)<br>

>これらは最大でも同時に２つまでしか満たすことができない<br>
>>一貫性と可用性を保証しようとすると、必然的に単一のデータベースとなり、分断耐性がない<br>
>>一貫性と分断耐性を保証しようとすると、データベースの２相ロックや３相ロックが必要となり可用性が損なわれる（ロック中は利用できない）<br>
>>可用性と分断耐性を保証しようとすると、ロックをかけないので一貫性が損なわれる<br>
<br>
