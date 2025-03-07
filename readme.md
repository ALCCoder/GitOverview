***GIT***

    git sudo apt-get install git

auto LF CRLF

    git config core.autocrlf false

[https://stackoverflow.com/questions/1967370/git-replacing-lf-with-crlf ](https://stackoverflow.com/questions/1967370/git-replacing-lf-with-crlf)

`warning: LF will be replaced by CRLF in .gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in pom.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in src/main/java/com/pgcompany/Main.java.
The file will have its original line endings in your working directory`


# Команды

    echo "# geekbrains-java" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/ALCCoder/geekbrains-java.git
    git push -u origin main

Флаг **_-u_** в команде git push -u origin main является сокращением от --set-upstream. Этот флаг выполняет две важные функции:

1) Запушит изменения в удалённый репозиторий:
Команда git push отправляет изменения из вашего локального репозитория в удалённый репозиторий (в данном случае в ветку main на origin).

2) Устанавливает связь между локальной и удалённой веткой:

**Флаг** **_-u_** связывает текущую локальную ветку (например, main) с удалённой веткой (например, origin/main). После этого Git запоминает эту связь, 
и в будущем вы сможете использовать просто git push или git pull без указания удалённого репозитория и ветки, 
так как Git будет знать, куда отправлять или откуда забирать изменения.

3) **Флаг -M** в команде git branch -M main используется для принудительного переименования ветки, даже если ветка с таким именем уже существует. Давайте разберём подробнее:
   
Принудительное выполнение:
Флаг **_-M_** (или **_--move --force_**) означает, что Git выполнит переименование, даже если ветка с именем main уже существует. Без этого флага Git выдаст ошибку, если ветка main уже есть.


Разница между `-m` и `-M`:
`-m (или --move)`: Переименовывает ветку, но только если ветка с новым именем не существует. Если ветка с таким именем уже есть, Git выдаст ошибку.

`-M` `(или --move --force)`: Переименовывает ветку принудительно, даже если ветка с новым именем уже существует. Старая ветка будет перезаписана.

**1) Create git user info:**


    #command --global is optional, without it will be local name in project not in all projects on your device

    git config --global user.name "Some User"
    git config --global user.email "someMail@yahoo.com"
**2) For initialize project enter:** 

    git init
    
then 
    
    git status
**3) Create add all files:**

    git add --all

**4) Create commit:**
    
    git commit -m "Info about commit"

**5) Create commit:**

    git commit -m "Info about commit"
add repository (alliasName (may be origin) link on repository)

    git remote add origin https://github.com/userName/nameRepository

**6) Push commit:**

    git push origin master"

**7) Create Tag:**

    git tag "version_1.0"

**8) Branch working:**

create branch: 

    git branch myBranch
rename branch
    
    git branch -m newMyBranch

checkout branch

    git checkout branchName

merge branch

    git merge branchName

**Git error push/update -  create token & push without cred input**

    https://stackoverflow.com/questions/68775869/message-support-for-password-authentication-was-removed
    https://stackoverflow.com/questions/46878457/adding-git-credentials-on-windows
    git config --global credential.helper manager-core

    # Since Git 2.39+
    git config --global credential.helper manager
    git add --all  && git commit -m "add sout" && git push origin master
    git config --global credential.helper store
