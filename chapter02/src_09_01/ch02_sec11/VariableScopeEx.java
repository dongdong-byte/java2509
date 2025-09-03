package ch02_sec11;

public class VariableScopeEx {

    public static void main(String[] args) {
        int v1 = 15;
        int v2 = 10;

        if (v1 > 10) {
            // 블록 내부에서 임시로 사용할 변수 이름을 v2와 다르게 변경하거나,
            // 기존 v2를 재할당하는 방식으로 처리해야 합니다.
            int temp = v1 - 10;
            // 예: temp를 사용하여 출력하거나 추가 계산을 할 수 있습니다.
            System.out.println("temp = " + temp);
        }

        // 이미 위에서 선언한 v2를 계속 사용합니다.
        // int v2 = 10; <- 중복 선언은 에러이므로 제거했습니다.

        int v3 = v1 + v2 + 5;
        System.out.println("v3 = " + v3);
    }
//    교재 예시가 잘못되어서 gpt 에게 수정해달라고 요청한것
//    교재는 오류나는 케이스를 싫어 놓은것임
}