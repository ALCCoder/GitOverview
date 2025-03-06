***GIT***

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

**6) Push commit:**

    git push origin master"

**7) Create Tag:**

    git tag "version_1.0"

**8) Branch working:**

create branch: 

    git branch myBranch
rename branch
    
    git branch -m newMyBranch

**Git error push/update -  create token & push without cred input**

    https://stackoverflow.com/questions/68775869/message-support-for-password-authentication-was-removed
    https://stackoverflow.com/questions/46878457/adding-git-credentials-on-windows
    git config --global credential.helper manager-core

    # Since Git 2.39+
    git config --global credential.helper manager
    git add --all  && git commit -m "add sout" && git push origin master
    git config --global credential.helper store
