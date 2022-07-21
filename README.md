#Reference

##Maven Command

./mvnw

mvn compile

mvn clean package

mvn spring-boot:run

mvn clean package spring-boot:run

mvn spring-boot:run -Dspring-boot.run.arguments="--port=3000"

mvn spring-boot:run -Dspring-boot.run.arguments="--port=3000 --dataDir=c:\data"

mvn clean test



##Git command <if you need to push to heroku at the end of the day then create your system.properties file in the project root first>(java.runtime.version=18)

git init (initialize a local repo, doesn't link to remote yet)

git remote add origin https://github.com/NealGoh/d14wkshp.git (link your local repo with your remote repo)

git add . (adding new or updated files to the local repo)

git status (check files that will be commiting to local repo)

git commit -m "<commit message>" (commit new or updated files to local repo)

git push -u origin master (pushes your new and updated code to github master branch)

git checkout -b develop master (clone all files from master branch and create a develop branch locally)

git push -u origin develop (push from local develop branch to remote<github> develop branch)

git branch (check which branch are you in and shows all local branches)

git checkout develop (choose which branch you want to use)

git branch -a (shows all local and remote branch references)

git merge develop (merging files from develop branch to your current branch that you're in)

<remember to push your files again after the merge>


##Heroku command <requires system.properties file in project root>(java.runtime.version=18)

<make sure you are on your master branch>
heroku login

heroku apps:create

git remote -v (shows the different repo that you're linked too)

git push -u heroku master (pushing files from master into heroku repo)