# 下载并配置Maven

## 1.下载：

https://maven.apache.org/download.cgi，下载[apache-maven-x.x.x-bin.zip]

## 2.环境配置

在系统环境变量中配置：

* M2_HOME	maven目录下的bin目录
* MAVEN_HOME    maven的目录
* 在系统的path中配置 %MAVEN_HOME%\bin
* 测试:**mvn -v** 如果出现一大串就是配置成功

## 3.Maven配置

### 1.配置阿里云镜像地址

* 在conf文件夹里的settings.xml文件中的<mirrors></mirrors>标签里添加

  ```xml
  <mirror>
  
  		 <id>alimaven</id>
  
  		 <name>aliyun maven</name>
  
  		 <url>http://maven.aliyun.com/nexus/content/groups/public/</url>
  
  		 <mirrorOf>central</mirrorOf>
  
  	</mirror>
  ```

## 2.添加本地仓库

* 在maven文件下创建文件夹maven-repo

* 在conf文件夹里的settings.xml文件中添加

  ~~~xml
  <localRepository>maven目录\maven-repo</localRepository>
  ~~~

  

