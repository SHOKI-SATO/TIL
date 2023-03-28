//テーブルにカラムを追加する
ALTER TABLE user_info ADD COLUMN create_flg varchar(1) not null deault`1`;

//カラムのコメント（説明等）を追加する
COMMENT ON COLUMN user_info.create_flg IS `作成フラグ：0:未作成 1:作成済`;


//※Postgresの場合はカラム追加位置の指定は出来ず、最後のカラムの後に追加となる
//　→どうしても順序を指定したい場合は　①既存のカラムの定義を変更し、データを変更する or　②新規でテーブルを作り直すか
