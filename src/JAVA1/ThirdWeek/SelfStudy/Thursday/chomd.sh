 # d (디렉토리): 파일인 경우에는 첫 번째 문자가 -로 표시되기 때문에, 디렉토리와 파일을 구분하는 역할을 한다.

 # r (읽기 권한): 파일 내용을 읽거나 디렉토리 내 파일 목록을 확인할 수 있다.

 # w (쓰기 권한): 파일의 내용을 수정하거나 디렉토리 내 파일을 추가/삭제할 수 있다.

 # x (실행 권한): execute를 뜻하며, 파일을 실행할 수 있다. 디렉토리인 경우에는, 해당 디렉토리로 이동할 수 있다.

 # 파일의 소유자는 7의 권한을 가지므로 r(4), w(2), x(1) 권한을 가짐
 # 그룹은 5의 권한이므로 r(4), x(1) 권한을 가짐

 # 기타 사용자는 r(1) 권한만 가지게 됨

cd directory
chmod 754 hello.py


# best와 army 디렉토리 생성
mkdir best army
#best에 korea 빈 파일 army에 awesome 빈 파일 생성
touch best/korea army/awesome

# directory에 있는 파일들을 복사하여 elicer_infor에 붙여넣음
cp -r directory elicer_infor
# directory 삭제
rm -rf directory

# cat 명령어를 통해 해당 answer에 있는 내용을 hello.py에 내용을 추가
# > = 덮어쓰기 >> = 내용 추가
cat directory/greeting/answer.txt >>directory/greeting/hello.py

# grep을 사용하여 MAD라는 이니셜을 가진 사람의 전화번호를 address.txt.txt에 찾음
grep  MAD directory/address.txt

# input.txt에 있는 내욜을 add.py를 통해 출력한 내용을 output.txt에 덮어 씌운다.
python add.py < input.txt >output.txt
# cat을 사용해 output.txt를 출력
cat output.txt
# 똑같은 결과
cat input.txt | python add.py >> output.txt

#행의 시작이 영어 대문자로 이용하고 Cat이 포함되어있는 리스트를  encode.py를 통해 출력하여 그 값을 ans.txt에 덮어 씌움
grep ^[A-Z].*Cat pass.txt | python encode.py >>ans.txt

# 모든프로세스 확인
ps -ef
# 프로세스 27번 죽임
kill 27
