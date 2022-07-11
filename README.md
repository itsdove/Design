# README
## 数据库设置
该后端程序默认连接的DBMS使用的设置为:
* 类型：MySQL
* IP：`127.0.0.1`
* 端口：`3306`
* 用户名：`root`
* 密码：（无）
* 数据库名称：`design`

## 后端设置
默认端口为`8080`

以上的设置可以在`/src/main/resources/application.properties`处修改。

## 部署
请将`/src/main/resources/static`文件夹中的`static.zip`解压，将里面的文件放入前述`static`文件夹中。

正确的文件结构应当为前述`static`文件夹下有`unity`，`css`，`js`和`examples`四个文件夹，`index.html`和`favicon.ico`两个文件。

即如果打开`css`文件夹的话，路径是`/src/main/resources/static/css`
