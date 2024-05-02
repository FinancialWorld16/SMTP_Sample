# 🌟 Spring SMTP 이메일(네이버) 전송 프로젝트 🚀

![Spring SMTP 프로젝트](https://example.com/spring-smtp-project-logo.png)

이 프로젝트는 Spring Framework를 사용하여 SMTP(Simple Mail Transfer Protocol)를 통해 이메일을 전송하는 간단한 예제입니다. 📧💌

## 🎯 프로젝트 목표

- Spring을 통한 이메일 전송 기능 구현
- SMTP 서버 설정 및 연동
- 사용자 친화적인 웹 인터페이스 제공

## 🛠️ 사전 요구사항

이 프로젝트를 로컬 환경에서 실행하기 위해서는 다음이 필요합니다:

- ☕ Java 8 이상
- 🍃 Maven
- 📧 이메일 발송을 위한 SMTP 서버 설정 (예: Gmail SMTP)

## 🚀 설치 및 실행

1. 저장소 클론:
   ```bash
   git clone https://github.com/FinancialWorld16/SMTP_Sample.git
   ```

2. `application.properties` 파일에 SMTP 서버 설정 추가:
   ```properties
   spring.mail.host=smtp.naver.com
   spring.mail.port=465
   spring.mail.username=# 내 이메일 계정
   spring.mail.password=# 내 계정 비밀 번호
   spring.mail.properties.mail.smtp.auth=true
   spring.mail.properties.mail.smtp.starttls.enable=true
   ```

3. 프로젝트 빌드 및 실행:
   ```bash
   cd spring-smtp-project
   mvn spring-boot:run
   ```

4. 브라우저에서 `http://localhost:8080/emailForm` 접속하여 이메일 발송 페이지로 이동

## 📝 사용 방법

1. 웹 브라우저에서 `http://localhost:8080/emailForm` 접속
2. 이메일 수신자 주소와 내용 입력 후 "Send Email" 버튼 클릭
3. 이메일 전송 성공 시 성공 메시지 표시

## ⚠️ 주의사항

- 이 예제는 보안을 고려하지 않고 구현되었습니다. 실제 프로덕션 환경에서는 보안 강화가 필요합니다.
- Gmail 등 외부 SMTP 서버 사용 시 보안 설정 확인 및 애플리케이션에 적절한 권한 부여 필요

## 🤝 기여

기여는 언제나 환영합니다! 버그 발견 또는 새로운 기능 추가 시 이 저장소에 Pull Request 제출 바랍니다.

## 📄 라이선스

이 프로젝트는 [MIT 라이선스](LICENSE)에 따라 배포됩니다.

---

문의사항이나 제안이 있다면 언제든 연락 주세요! 😊✨
