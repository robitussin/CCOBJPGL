
# JavaFX Requirements

**1. Install Java SDK. 
  https://docs.microsoft.com/en-us/java/openjdk/download**  

**2. Install Microsoft Visual Studio Code.
https://code.visualstudio.com/** 

**3. In Microsoft Visual Studio Code, install "Extension Pack for Java".** 

**4. Install Scene Builder.
https://gluonhq.com/products/scene-builder/#download** 

**5. Download JavaFX. 
https://gluonhq.com/products/javafx/** 

**6. Extract the JavaFX folder to your local drive** (example: ***C:/openjfx-20.0.1_windows-x64_bin-sdk***)


# How to create a JavaFX Project?

1. Open **Microsoft Visual Studio Code**

2. Press **F1** and type **Create Java Project**

3. Click ***Java: Create Java Project..***

4. Select ***no build tools***

5. **Select a folder** where you want to put your project (example: ***My Documents***)

6. In VS Code, enter ***Java Project name*** and press ***Enter***

7. Copy all files inside the lib folder from the downloaded JavaFX folder (example: ***C:/openjfx-20.0.1_windows-x64_bin-sdk/javafx-sdk-20.0.1/lib***).

8. Paste all the files to the lib folder in your Java Project (example: ***C:/myjavaproject/lib***).

9. Go to **Run and Debug** and click ***create a launch.json file***.

10. In the launch.json file, add a ***vmArgs*** parameter after ***projectName*** and add the file path of the lib folder of the downloaded JavaFX file.

***"vmArgs": "--module-path C:/openjfx-20.0.1_windows-x64_bin-sdk/javafx-sdk-20.0.1/lib --add-modules javafx.controls,javafx.fxml"***

<img src="https://media.giphy.com/media/ObNTw8Uzwy6KQ/giphy.gif" width="30px">&nbsp; Good luck! You can do it! <img src="https://media.giphy.com/media/VgCDAzcKvsR6OM0uWg/giphy.gif" width="50" />

<img align="left" width=300px alt="Unicorn" src="https://media4.giphy.com/media/KztT2c4u8mYYUiMKdJ/200.webp?cid=ecf05e47d58zqgktot00yjcj2foe4lb6kqjmr8ofls9whzxu&rid=200.webp&ct=g"/>

<img align="center" width=300px alt="Unicorn" src="https://media3.giphy.com/media/Y3wzF9erUbjfvs3QFo/200w.webp?cid=ecf05e47o8nlgy4qxxlq00zw19typkw5vr929z0mv02ors3v&rid=200w.webp&ct=g"/>








