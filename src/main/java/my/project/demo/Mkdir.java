package my.project.demo;

import java.io.File;
import java.io.FileWriter;

public class Mkdir {

    public void fileCreateTest() {
        String folderPath = "D:\\Dev\\test\\dev.txt";
        try {
            // 파일 객체 생성
            File file = new File(folderPath);

            // true 지정시 파일의 기존 내용에 이어서 작성
            FileWriter fw = new FileWriter(file, true);

            // 파일안에 문자열 쓰기
            fw.write("남건우입니다");
            fw.flush();

            // 객체 닫기
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void folderCreateTest() {
        String folderPath = "D:\\Dev\\test\\test2222";

        File file = new File(folderPath);

        if (!file.exists()) {
            try {
                if (!file.isFile()) {
                    file.mkdirs(); //폴더 생성합니다.
                    System.out.println("폴더1 생성");
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            if (!file.isDirectory()) {
                file.mkdirs(); //폴더 생성합니다.
                System.out.println("폴더 생성");
            } else {
                System.out.println("파일 확인");
            }
        }
    }
}
