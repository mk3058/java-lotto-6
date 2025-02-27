# 🎱로또 게임

---

## 🗓️ 개요

- 랜덤하게 생성되는 로또 번호를 맞추는 게임입니다.
- 사용자가 로또를 구매하면, 임의의 번호를 가진 로또가 발행됩니다.
- 로또의 번호는 1~45 까지의 중복되지 않는 6개의 숫자 입니다.
- 이후 사용자가 당첨 번호와 보너스 번호를 입력하면 결과가 출력됩니다.

## 🛠️ 진행 방식

```
1. 플레이어가 로또 구매 금액을 입력 (장당 1000원)
2. 해당 갯수만큼 로또 발행
3. 플레이어가 당첨 번호와 보너스 번호 입력
4. 사용자의 당첨 내역 및 수익률 출력
```

## ⌨️ 입력

- 금액 입력
  ```
  한 개의 숫자만 입력될 수 있으며,
  금액은 1000원 단위로 입력되어야 합니다.
    5000 -> 로또 5장 발행
    10000 -> 로또 10장 발행
    1100 -> 입력 불가
  ```
- 당첨 번호 입력
  ```
  숫자와 쉼표(,) 만 입력될 수 있으며,
  총 6개의 수가 쉼표를 기준으로 구분되어 입력되어야 합니다.
    1,2,3,4,5,6      -> (O)
    123456           -> (X)
    1, 2, 3, 4, 5, 6 -> (X)
    1 2 3 4 5 6      -> (X)
  ```
- 보너스 번호 입력
    ```
    한 개의 숫자만 입력되어야 합니다.
    7 -> (O)    
    ```

## 🖥️ 출력

- 로또 발행 결과
    - 발행된 로또의 개수와 번호가 출력됩니다.
      (번호는 오름차순으로 정렬됩니다)
    ```
    8개를 구매했습니다.
    [8, 21, 23, 41, 42, 43] 
    [3, 5, 11, 16, 32, 38] 
    [7, 11, 16, 35, 36, 44] 
    [1, 8, 11, 31, 41, 42] 
    [13, 14, 16, 38, 42, 45] 
    [7, 11, 30, 40, 42, 43] 
    [2, 13, 22, 32, 38, 45] 
    [1, 3, 5, 14, 22, 45]
    ```

- 당첨 내역
    ```
    3개 일치 (5,000원) - 1개
    4개 일치 (50,000원) - 0개
    5개 일치 (1,500,000원) - 0개
    5개 일치, 보너스 볼 일치 (30,000,000원) - 0개
    6개 일치 (2,000,000,000원) - 0개
    ```
- 수익률
    - 수익률은 소수점 둘째 자리에서 반올림하여 소수점 아래 한자리 까지 표시됩니다.
  ```
  총 수익률은 62.5%입니다.
  ```
- 오류
    - 게임 진행 중 오류 발생시 아래와 같은 형식의 메시지가 출력됩니다.
    - 오류 발생시 해당 부분부터 값을 다시 입력 받습니다.
  ```
  [ERROR] _"오류 메시지"_
  ```

## 📚기능 정리

- [x] 로또 발행

    - [x] 사용자로부터 1000원 단위의 로또 금액 입력
        - [x] 예외 발생시 재입력
    - [x] 1~45 사이의 중복되지 않는 난수 6개 생성
    - [x] 입력된 금액 만큼의 로또 발행

- [x] 당첨 번호 입력

    - [x] 사용자로부터 1~45 사이의 쉼표로 구분된 당첨 번호 6개 입력
        - [x] 예외 발생시 재입력
    - [x] 사용자로부터 1~45 사이의 보너스 번호 한개 입력
        - [x] 예외 발생시 재입력

- [x] 당첨 통계

    - [x] 사용자의 로또와 당첨 번호를 비교하여 일치하는 수의 갯수 판단
    - [x] 당첨 내역을 바탕으로 수익률 계산

## ⚠️️ 예외 처리 (IllegalArgumentException)

- 금액 입력

```
1. 숫자 형식이 아닌 경우
2. 로또 구매 금액이 1000원 단위로 나누어 떨어지지 않는 경우
3. 로또 구매 금액이 양수가 아닌경우
```

- 당첨/보너스 번호 입력

```
1. 입력 형식이 잘못된 경우
2. 입력이 숫자가 아닌 경우
3. 입력된 수의 범위가 1~45 가 아닌 경우
4. (당첨 번호) 중복된 수가 있는 경우
5. 입력된 수의 개수가 잘못된 경우
6. (보너스 번호) 보너스 번호와 당첨 번호가 중복되는 경우
```

## ✅ 2주차 피드백 체크리스트

- [x] README.md 를 상세히 작성한다
- [x] 함수, 메서드의 설계가 아닌 구현해야 할 기능 목록을 정리하는데 집중한다
- [x] 코드를 작성하며 README.md를 지속적으로 업데이트 한다
- [x] 값을 하드코딩하는 대신 상수를 활용한다
- [x] 구현 순서를 일치시킨다 (상수-멤버 변수-생성자-메서드)
- [x] 변수 이름에 자료형을 사용하지 않는다
- [x] 한 함수가 한가지 기능만 담당하게 한다
    - [x] 함수의 길이가 15라인을 넘지 않게 한다
- [x] 핵심 기능부터 작은 단위로 테스트를 만든다