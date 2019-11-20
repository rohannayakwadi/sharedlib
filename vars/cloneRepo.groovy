def call(String repo = 'error'){
  git "${repo}"
  sh "echo this is 1st line"
  sh "date"
  sh "echo 'the files are'"
  sh "ls -l"
}

