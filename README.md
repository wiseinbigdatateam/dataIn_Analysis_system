# springboot with R

### R 연동
- 연동을 위해 libs 디렉토리 생성후 jar 파일들 추가
- gradle 빌드시 해당 jar 파일 적용
  - build.gradle에 implementation fileTree(dir: 'libs', includes:['*.jar']) 추가