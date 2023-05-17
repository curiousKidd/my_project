package my.project.demo;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.auth.oauth2.ServiceAccountCredentials;
import com.google.cloud.vision.v1.*;
import com.google.cloud.vision.v1.Feature.Type;
import com.google.protobuf.ByteString;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class DetectText {

    public static void main(String[] args) throws IOException {

        // 인증 정보 파일의 경로를 지정
        String jsonPath = "D:\\개인\\key.json";

        // 인증 정보를 읽어옴
        FileInputStream inputStream = new FileInputStream(jsonPath);
        GoogleCredentials credentials = ServiceAccountCredentials.fromStream(inputStream);

        // 이미지 파일의 경로를 지정
        String filePath = "D:\\개인\\test.png";

        // 이미지를 byte array로 변환
        Path path = Paths.get(filePath);
        byte[] data = Files.readAllBytes(path);
        ByteString imgBytes = ByteString.copyFrom(data);

        // 이미지 객체 생성
        Image image = Image.newBuilder().setContent(imgBytes).build();

        // 특징 설정 (이미지에서 텍스트 읽기)
        Feature feature = Feature.newBuilder().setType(Type.TEXT_DETECTION).build();

        // AnnotateImageRequest 객체 생성
        AnnotateImageRequest request =
                AnnotateImageRequest.newBuilder().addFeatures(feature).setImage(image).build();

        // ImageAnnotatorClient를 생성
        ImageAnnotatorSettings settings =
                ImageAnnotatorSettings.newBuilder().setCredentialsProvider(() -> credentials).build();

        // Vision API 클라이언트 생성
        try (ImageAnnotatorClient client = ImageAnnotatorClient.create(settings)) {
            // 이미지 주석 처리
            List<AnnotateImageRequest> requests = new ArrayList<>();
            requests.add(request);
            List<AnnotateImageResponse> responses = client.batchAnnotateImages(requests).getResponsesList();

            // 이미지에서 추출한 텍스트 출력
            for (AnnotateImageResponse res : responses) {
                if (res.hasError()) {
                    System.out.format("Error: %s%n", res.getError().getMessage());
                    return;
                }

                System.out.println("Text:");
                System.out.println(res.getTextAnnotationsList().get(0).getDescription());
            }
        }
    }
}