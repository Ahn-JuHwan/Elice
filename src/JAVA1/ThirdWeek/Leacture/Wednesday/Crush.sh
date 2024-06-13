
# soccer-leagues 디렉토리로 이동
cd soccer-leagues

# git branch -v 명령어를 활용하여 커밋 로그를 확인하고 충돌한 파일을 찾음
git branch -v
git commit -am "aaa"

#master 브랜치와 bugfix/spaces-before-name 브랜치 모두 병합된 커밋
git checkout master
git merge bugfix/spaces-before-name