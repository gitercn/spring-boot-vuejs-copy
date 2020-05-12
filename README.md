## spring-boot-vuejs-copy

前端使用Vue，后端使用Spring Boot  

前后端分离的架构目录结构参考Github上加星很多的这个项目： https://github.com/jonashackt/spring-boot-vuejs  

# 环境搭建

安装以下开发环境与工具：  
Eclipse 用于Spring Boot后台开发  
https://www.eclipse.org/downloads/packages/

Visual Studio Code 用于Vue前台开发  
https://code.visualstudio.com/download

PostgreSQL 用作数据库  
https://www.enterprisedb.com/downloads/postgres-postgresql-downloads  
参考安装方法：https://www.runoob.com/postgresql/windows-install-postgresql.html

(可选) DBeaver 用于管理数据库  
https://dbeaver.io/download/

Node.js version manager (nvm) 用于安装nodejs和npm  
https://github.com/coreybutler/nvm-windows

通过nvm安装最新lts版nodejs  
```
nvm list available
nvm install 12.16.3
nvm use 12.16.3
```

# 运行项目

数据库导入  
用DBeaver把 ./database文件夹下最新的数据库文件导入

启动前台  
用vscode打开 ./frontend文件夹，运行 `npm install` 然后运行 `npm run serve` 启动前台，浏览器通过 http://localhost:8080/ 访问前台页面

启动后台  
用Eclipse打开 ./backend文件夹，启动后台，后台服务在8098端口


# 项目搭建

目录结构：

```
spring-boot-vuejs-copy
├─┬ backend     → Spring Boot 后台
│ ├── src
│ └── pom.xml
├─┬ frontend    → Vue.js 前台
│ ├── src
│ └── pom.xml
├── database    → 数据库备份
└── pom.xml     → 管理整个项目的Maven文件
```

## 后台搭建
在 https://start.spring.io/ 获取一个Spring Boot的空工程

## 前台搭建
运行`npm install -g @vue/cli` 安装@vue/cli到全局
使用 `vue create frontend --no-git` 创建一个vue项目，使用--no-git的原因是整个项目已经是git项目，不用再新建为git项目，创建vue项目的时候注意添加router插件

# 其他配置

UI界面替换为 Vuetify, 参考教程： https://github.com/iamshaunjp/vuetify-playlist  

源码自动部署到Heroku平台： http://spring-boot-vuejs-copy.herokuapp.com/  

