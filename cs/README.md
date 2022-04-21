# C# 프로젝트 디렉토리

## 개발 환경

### Visual Studio Code

#### 프로젝트 생성 방법

1. 터미널에서 프로젝트 폴더를 생성할 위치로 이동
2. 다음 명령어를 입력

    ```shell
    dotnet new console --output 프로젝트이름
    ```

또 다른 방법으로 디렉토리를 프로젝트로 만드는 방법입니다.

```shell
dotnet new console --framework net6.0
```

#### 프로젝트 실행 방법

1. 실행할 프로젝트 폴더 위치로 이동
2. 다음 명령어를 입력

    ```shell
    dotnet run
    ```

    또는

    ```shell
    dotnet run --project 프로젝트이름
