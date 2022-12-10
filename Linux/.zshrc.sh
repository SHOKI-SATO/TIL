#　ホームディレクトリの「.zshrc」に記載することでzshの設定を変更可能
#（※隠しファイルの表示は「⌘+Shift+.」）

#　home-brew
export PATH="/opt/homebrew/opt/mysql@5.7/bin:$PATH"
export PATH="/opt/homebrew/opt/mysql@5.7/bin:$PATH"
export PATH=$PATH:/opt/homebrew/bin




#　プロンプトの変更（色、改行）
PROMPT="%F{235}[%n@%m]　%B%F{14}%~%b"$'\n'"%F{245}%# %f"

#　プロンプト右側に時間表示を追加
right-prompt() {
  local time="%F{242}%T%f"
  echo "${time}"
}
# RPROMPT=`right-prompt`
#　↑Gitの記載した関係で、下部にて記載

# PROMPT='左側に表示%% '
# PROMPT2='複数行の場合%% '
# RPROMPT='右側に表示されます。'

#コマンド実行後に改行を挿入
add_newline() {
  if [ -z $PS1_NEWLINE_LOGIN ]; then
    PS1_NEWLINE_LOGIN=true
  else
    printf '\n'
  fi
}
precmd() { add_newline }

#　コマンド補完機能
autoload -Uz compinit
compinit -u
if  -e /usr/local/share/zsh-completions ; then
  fpath=(/usr/local/share/zsh-completions $fpath)
fi

# 補完候補をできるだけ詰めて表示する
setopt list_packed

#　選択中の候補を塗りつぶす
autoload -Uz compinit
compinit
zstyle ':completion:*' menu select


#　小文字・大文字関係なく補完
zstyle ':completion:*' matcher-list 'm:{a-z}={A-Z}'


#　コマンドのスペル誤り指摘
setopt correct
export PATH="/usr/local/opt/mysql-client/bin:$PATH"


# 直前と同じコマンドの場合はヒストリに追加しない
setopt hist_ignore_dups
 
# 同じコマンドをヒストリに残さない
setopt hist_ignore_all_dups
 
# スペースから始まるコマンド行はヒストリに残さない
# setopt hist_ignore_space
 
# ヒストリに保存するときに余分なスペースを削除する
setopt hist_reduce_blanks

# cdの後にlsを実行
chpwd() { ls --color=auto }

# git
# autoload -Uz vcs_info
# setopt prompt_subst
# zstyle ':vcs_info:git:*' check-for-changes true
# zstyle ':vcs_info:git:*' stagedstr "%F{magenta}!"
# zstyle ':vcs_info:git:*' unstagedstr "%F{yellow}+"
# zstyle ':vcs_info:*' formats "%F{cyan}%c%u[%b]%f"
# zstyle ':vcs_info:*' actionformats '[%b|%a]'
# precmd () { vcs_info }

# git ブランチ名を色付きで表示させるメソッド
function rprompt-git-current-branch {
  local branch_name st branch_status
 
  if [ ! -e  ".git" ]; then
    # git 管理されていないディレクトリは何も返さない
    return
  fi
  branch_name=`git rev-parse --abbrev-ref HEAD 2> /dev/null`
  st=`git status 2> /dev/null`
  if [[ -n `echo "$st" | grep "^nothing to"` ]]; then
    # 全て commit されてクリーンな状態
    branch_status="%F{green}"
  elif [[ -n `echo "$st" | grep "^Untracked files"` ]]; then
    # git 管理されていないファイルがある状態
    branch_status="%F{red}?"
  elif [[ -n `echo "$st" | grep "^Changes not staged for commit"` ]]; then
    # git add されていないファイルがある状態
    branch_status="%F{red}+"
  elif [[ -n `echo "$st" | grep "^Changes to be committed"` ]]; then
    # git commit されていないファイルがある状態
    branch_status="%F{190}!"
  elif [[ -n `echo "$st" | grep "^rebase in progress"` ]]; then
    # コンフリクトが起こった状態
    echo "%F{red}!(no branch)"
    return
  else
    # 上記以外の状態の場合
    branch_status="%F{blue}"
  fi
  # ブランチ名を色付きで表示する
  echo "${branch_status}[$branch_name]"
}
 
# プロンプトが表示されるたびにプロンプト文字列を評価、置換する
setopt prompt_subst
 
# プロンプトの右側にメソッドの結果を表示させる
RPROMPT='`right-prompt``rprompt-git-current-branch`'
