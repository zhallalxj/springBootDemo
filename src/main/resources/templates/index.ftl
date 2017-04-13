<!DOCTYPE html>
<html>
<header>
    <title>测试页面</title>
<#include "layout/default.ftl">

</header>

<body>

<div id="content-wrapper">

    <div class="row">
        <div class="col-sm-12">

            <div class="panel-body panel form-horizontal">
                <div class="form-group">
                <#--  <label for="serverId" class="col-sm-2 control-label">获取</label>
-->
                    <button type="button" id="get" class="btn btn-primary">获取</button>

                    <div class="col-sm-6">
                        <div class="col-sm-6">
                            <input id="key" type="text" placeholder="输入查询的key" class="form-control">
                        </div>

                        <div class="col-sm-6">
                            <textarea id="get_result" placeholder="查询结果" class="form-control"></textarea>
                        </div>


                    </div>
                </div> <!-- / .form-group -->

                <div class="panel-body panel form-horizontal">
                    <div class="form-group">
                    <#--  <label for="serverId" class="col-sm-2 control-label">获取</label>
  -->
                        <button type="button" id="set" class="btn btn-primary">设置</button>

                        <div class="col-sm-6">
                            <div class="col-sm-6"><input id="set_key" type="text" placeholder="输入key"
                                                         class="form-control"></div>
                            <div class="col-sm-6"><input id="set_value" type="text" placeholder="输入value"
                                                         class="form-control"></div>
                        </div>
                    </div>


                <#--<div class="form-group">
                    <label for="serverId" class="col-sm-2 control-label">服务器ID</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="serverId" placeholder="服务器ID">
                    </div>
                </div> -->

                <#--<div class="form-group" style="margin-bottom: 0;">
                    <div class="col-sm-offset-2 col-sm-10">
                        <button type="submit" class="btn btn-primary">提交</button>
                        <a class="btn btn-default" onclick="history.back()" role="button">取消</a>
                    </div>
                </div>--> <!-- / .form-group -->
                </div>

            </div>
        </div>

    </div> <!-- / #content-wrapper -->

</body>

<script>
    $(function () {
        $("#get").click(function () {

            if ($("#key").val() == "") {
                alert("KEY 不能为空");
            } else {
                $.ajax({
                    url: "/get/" + $("#key").val(),
                    type: "post",
                    contentType: "application/json;charset=utf-8",
                    dataType: "json",
                    success: function (data) {
                        $("#get_result").text(data);
                    }
                })
            }


        });

        $("#set").click(function () {

            if ($("#set_key").val() == "") {
                alert("KEY 不能为空");
            } else {
                $.ajax({
                    url: "/set/" + $("#set_key").val() + "/" + $("#set_value").val(),
                    type: "post",
                    contentType: "application/json;charset=utf-8",
                    dataType: "json",
                    success: function (data) {
                        alert(data);
                    }
                })
            }


        });
    });

</script>

</html>
