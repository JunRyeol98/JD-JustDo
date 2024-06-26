package com.justdo.climbing.view;

/**
 * 화면에 표시되는 메뉴들을 모아둔 클래스
 * */
public class MenuView {

    /**
     * 시스템 실행 후 권한을 선택하는 메뉴를 표시
     * */
    public void authorityMenuView(){
        System.out.println("""
                =================================
                안녕하세요.
                신세계 클라이밍 센터입니다.
                =================================
                1. 관리자
                2. 강사
                3. 고객
                9. 종료
                ==================================""");
    }

    /**
     * 로그인전 관리자,강사 메인메뉴 표시
     * */
    public void mainMenuView(){
        System.out.println("""
                =========================================
                메 인 메 뉴
                =========================================
                1. 로그인
                9. 뒤로가기
                =========================================""");
    }

    /**
     * 로그인후 관리자 전용메뉴 표시
     * */
    public  void adminLoginMenuView(){
        System.out.println("""
                    =========================================
                    관리자 전용 메뉴
                    =========================================
                    1. 회원 등록
                    2. 강사 등록
                    3. 회원 정보 수정
                    4. 강사 정보 수정
                    5. 회원 정보 조회
                    6. 강사 정보 조회
                    7. 물품 관리
                    9. 로그아웃
                    =========================================""");
    }

    /**
     * 회원정보 수정 메뉴 표시
     * */
    public void updateClientMenu(){
        System.out.println("""
                    =========================================
                    회원 정보 수정 메뉴
                    =========================================
                    1. 이름 수정
                    2. 성별 수정
                    3. 나이 수정
                    4. 회원 탈퇴
                    5. 뒤로가기
                    =========================================""");


    }

    public void clientMenuView(){
        System.out.println("""
                    =========================================
                    메인 메뉴
                    =========================================
                    1. 회원가입
                    2. 로그인
                    9. 뒤로가기
                    =========================================""");
    }

    public void clientLoginMenuView(){
        System.out.println("""
                    =========================================
                    회원 전용 메뉴
                    =========================================
                    1. 내정보
                    2. 회원권 구매
                    3. 물품 구매
                    4. 입장하기
                    9. 로그아웃
                    =========================================
                    """);
    }

    public void instructorLoginMenuView(){
        System.out.println("""
                    =========================================
                    강사 전용 메뉴
                    =========================================
                    1. 내 정보
                    2. 회원 조회
                    9. 로그아웃
                    =========================================
                    """);
    }

    public void searchMenuView(){
        System.out.println("""
                    =========================================
                    조회 조건
                    =========================================
                    1. 전체 조회
                    2. 핸드폰번호로 조회
                    9. 뒤로가기
                    =========================================
                    """);
    }
}
