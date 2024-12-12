### 음식 카테고리
- 카테고리를 저장 (일식, 한식, 중식, 아시안, 양식)
- 정해진 일수만큼 섞어서 제공
  - 5일 -> 일 한 중 아 아
  - 6일 -> 한 중 일 중 한 일
  - ...

### 음식
- 음식을 저장(비빔밥, ...)
- 음식 카테고리에 대하여 음식 하나를 추천해줄 수 있음
  - 단, 입력값으로 들어오는 음식들은 빼고 추천해야 함
    - 못 먹는 메뉴, 이미 먹은 것 제외

### 코치
- 이름 2~4자
- 못 먹는 음식 0~2개
- 음식 카테고리들에 대하여 음식들을 뽑아서 제공
  - 음식 카테고리(일한중아아)가 입력되었다면, 스시 비빔밥 짜장면 ... 을 제공
  - 이때 자신이 먹지 못하는 것이나 이미 고른 것은 제외해야 한다.
- 못 먹는 것을 세팅할 수 있다.
  - 음식들로 입력되면 세팅한다.
  - 2개까지만 세팅해야 한다.

### 점심메이트
- 코치 2~5명으로 구성
- 점심 메뉴를 추천할 수 있다.
- 음식 카테고리들에 대하여 각 코치이름과 고른 메뉴들을 반환