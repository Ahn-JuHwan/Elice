package JAVA1.OneWeek.TEST.oneWeek;


class Book{
    //책 제목, 저자, 출판년도
    public String title;
    public String author;
    public int publicationYear;

    // 세 가지 정보를 받아 해당 멤버 변수들을 초기화
    public Book(String title, String author, int publicationYear ){
        this.title=title;
        this.author=author;
        this.publicationYear=publicationYear;
    }
    // 메서드는 책의 세부 정보를 출력
    public void printDetails(){
        System.out.println("제목 : "+this.title);
        System.out.println("작가 : "+this.author);
        System.out.println("출판년도 : " + this.publicationYear);

    }
}

//Book 클래스를 상속 받음
class AudioBook extends Book{
    public int playTime;

    //부모 클래스의 생성자를 호출하여 공통 정보를 초기화하고, playTime 정보를 초기화
    public AudioBook(String title, String author, int publicationYear, int playTime ){
        super(title,author,publicationYear);
        this.playTime=playTime;

    }

    //서드는 오디오북의 세부 정보를 출력
    // 부모 클래스의 printDetails 메서드를 오버라이딩하여 재정의
    @Override
    public void printDetails(){
        System.out.println("제목 : "+this.title);
        System.out.println("작가 : "+this.author);
        System.out.println("출판년도 : " + this.publicationYear);
        System.out.println("출판년도 : " + this.playTime);

    }
}

public class BookManagementSystem {
    public static void main(String args[]) {
        Book book = new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        AudioBook audiobook = new AudioBook("To Kill a Mockingbird", "Harper Lee", 1960, 745);
        //printDetails 메서드를 호출하여 정보를 출력
        book.printDetails();
        audiobook.printDetails();
    }
}
