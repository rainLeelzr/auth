<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <title>用户角色列表</title>
  <meta http-equiv="content-type" content="text/html; charset=UTF-8"/>
  <script type="text/javascript" src="/js/miniUI/boot.js"></script>
  <link rel="icon" href="favicon.ico" type="image/x-icon">
</head>
<body>
  <form id="form1" method="post">
    <div style="width:100%;">
      <div class="mini-toolbar" style="border-bottom:0;padding:0px;">
        <table style="width:100%;">
          <tr>
            <td style="white-space:nowrap;">              <a class="mini-button" onclick="search()">查询</a>
            </td>
          </tr>
          <tr>
            <td style="width:100%;">
              <a class="mini-button" iconCls="icon-add" onclick="add()">增加</a>
              <a class="mini-button" iconCls="icon-edit" onclick="edit()">编辑</a>
              <a class="mini-button" iconCls="icon-remove" onclick="remove()">删除</a>
              <a class="mini-button"  onclick="view()">查看</a>
            </td>
          </tr>
        </table>
      </div>
    </div>
    <div class="mini-datagrid" id="datagrid1" style="width:100%;height:400px;" url="/auth/userRole!query.action" idField="id" allowResize="true" multiSelect="true">
      <div property="columns">
        <div type="checkcolumn" width="30px"></div>        <div field="userId" headerAlign="center" allowSort="true" width="60px">用户id</div>
        
            <div field="roleId" headerAlign="center" allowSort="true" width="60px">角色id</div>
        
          </div>
    </div>
  </form>

  <script type="text/javascript">
    mini.parse();

    var grid = mini.get("datagrid1");
    grid.load();
      
    /*
    *功能：新增
    */
    function add() {
      mini.open({
        url: "/auth/userRole!edit.action",
        title: "新增用户角色",
        width: 1000,
        height: 600,
        onload: function() {
          var iframe = this.getIFrameEl();
          var data = {
            action: "new"
          };
          iframe.contentWindow.SetData(data);
        },
        ondestroy: function(action) {
          grid.reload();
        }
      });
    }
        
    /**
    *功能：编辑
    */
    function edit() {
      var row = grid.getSelected();
      if (row) {
        mini.open({
          url: "/auth/userRole!edit.action",
          title: "编辑用户角色",
          width: 1000,
          height: 600,
          onload: function() {
            var iframe = this.getIFrameEl();
            var data = {
              action: "edit",
              id: row.id
            };
            iframe.contentWindow.SetData(data);
          },
          ondestroy: function(action) {
            grid.reload();
          }
        });
      } else {
        alert("请选中一条记录");
      }
    }

    /**
    *功能：删除选中的记录
    */
    function remove() {
      var rows = grid.getSelecteds();
      if (rows.length > 0) {
        if (confirm("确定删除选中记录？")) {
          var ids = [];
          for (var i = 0, l = rows.length; i < l; i++) {
            var r = rows[i];
            ids.push(r.id);
          }
          var id = ids.join(',');
          grid.loading("操作中，请稍后......");
          $.ajax({
            url: "/auth/userRole!delete.action",
            type: 'post',
            data: {
              id: id
            },
            cache: false,
              success: function (text) {
                alert("成功删除!")
                grid.reload();
              },
              error: function (text) {
                alert("删除失败!");
              }
          });
        }
      } else {
        alert("请选中一条记录");
      }
    }
        
    /**
     *功能：查看
     */
    function view() {
      var row = grid.getSelected();
      if (row) {
        mini.open({
          url: "/auth/userRole!edit.action",
          title: "查看用户角色",
          width: 1000,
          height: 600,
          onload: function() {
            var iframe = this.getIFrameEl();
            var data = {
              action: "view",
              id: row.id
            };
            iframe.contentWindow.SetData(data);
          },
          ondestroy: function(action) {
            grid.reload();
          }
        });
      } else {
        alert("请选中一条记录");
      }
    }
        
    function search() {
      var form = new mini.Form("form1");
      var o = form.getData(); 
       grid.load(o);
    }

    function onKeyEnter(e) {
      search();
    }
  </script>
  </body>
</html>