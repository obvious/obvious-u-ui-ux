# Introduction to Ui/Ux on Android

### Prerequisites for taking the course

- Install `git-lfs` before cloning the repository.
  ```
  $ brew install git-lfs
  $ git lfs install
  ```
- Have the latest stable Android Studio
- Install the "EduTools" plugin and restart the Android Studio

### Accessing the course materials

- Once you have cloned the repository, open the project in Android Studio and select "Course"
  preview from "Project" panel.
- Double click on a "task" from "lesson" to open the task related files in studio.

### FAQ

#### How to check if `git-lfs` is configured successfully?

Click the following image link to
verify. [sample-image](lesson1/task1/library/src/test/snapshots/images/com.example.android.library_MainActivityLayoutTest_button.png)

#### How to verify the task implementation?

- You can run the app by selecting appropriate run configuration from the "Run" panel.
  Eg `lesson1-task1`
- From the "Task" panel, click on "Check" button to run pre-defined tests (if present) and verify
  your implementation.
- Run the tests manually from terminal
  ```
  # replace '*' with appropriate lesson and task numbers
  ./gradlew lesson*-task*-library:testDebugUnitTest
  
  # eg. for lesson 2, task 1
  ./gradlew lesson2-task1-library:testDebugUnitTest 
  ```

