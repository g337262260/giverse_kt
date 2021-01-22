<#--
  Created by IntelliJ IDEA.
  User: liuyong
  Date: 2021/1/20
  Time: 下午8:15
  To change this template use File | Settings | File Templates.
-->
<!DOCTYPE html>
<html>
<head>
    <title>Blog!!!</title>
    <meta name="description"
          content="Blog, using Flat UI Kit Free is a Twitter Bootstrap Framework
              design and Theme, this responsive framework includes a PSD and
              HTML version."/>
    <meta name="viewport" content="width=1000, initial-scale=1.0, maximum-
        scale=1.0">
    <!-- Loading Bootstrap -->
    <link href="/flatui/dist/css/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <!-- Loading Flat UI -->
    <link href="/flatui/dist/css/flat-ui.css" rel="stylesheet">
    <link href="/flatui/docs/assets/css/demo.css" rel="stylesheet">
    <link rel="shortcut icon" href="/flatui/app/favicon.ico">
    <script src="/flatui/dist/js/vendor/jquery.min.js"></script>
    <script src="/flatui/dist/js/flat-ui.js"></script>
    <script src="/flatui/dist/js/vendor/html5shiv.js"></script>
    <script src="/flatui/dist/js/vendor/respond.min.js"></script>
<#--    <link rel="stylesheet" href="/blog/blog.css">-->
<#--    <script src="/blog/blog.js"></script>-->
</head>
<body>
<div class="container">
<table class="table table-responsive table-bordered">
    <thead>
    <th>序号</th>
    <th>标题</th>
    <th>作者</th>
    <th>发表时间</th>
    <th>操作</th>
    </thead>
    <tbody>
    <#-- 使用FTL指令 -->
    <#list articles as article>
        <tr>
            <td>${article.id}</td>
            <td>${article.title}</td>
            <td>${article.author}</td>
            <td>${article.gmtModified}</td>
            <td><a href="#" target="_blank">编辑</a></td>
        </tr>
    </#list>
    </tbody>
</table>
</div>
</body>
</html>