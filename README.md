# pdf-sign
pdf增加签名图片合成pdf


需求来源  需要在文件上用输入仪签字/需要pdf上添加图片

注：输入仪签字返回的是 base64格式的图片

流程：

1.通过使用 itextpdf

2.结合 TestRenderListener 获取pdf里的文字坐标 ，增加偏移量，并控制图片大小，使签名图片落在合适位置，保存文件

 

 

<dependency>
    <groupId>com.itextpdf</groupId>
    <artifactId>itextpdf</artifactId>
    <version>5.4.3</version>
</dependency>
<dependency>
    <groupId>org.jodd</groupId>
    <artifactId>jodd-core</artifactId>
    <version>5.1.4</version>
</dependency>
 

注：jodd使用来处理base64 图片的

文章地址 ： https://blog.csdn.net/Mickys_/article/details/109444924
