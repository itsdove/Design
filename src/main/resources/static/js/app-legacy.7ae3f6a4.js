(function(){"use strict";var t={7330:function(t,e,a){a(6992),a(8674),a(9601),a(7727);var n=a(8935),r=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{attrs:{id:"app"}},[a("Navigation")],1)},i=[],l=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("el-tabs",{model:{value:t.activeName,callback:function(e){t.activeName=e},expression:"activeName"}},[a("el-tab-pane",{attrs:{label:"数字学生可视化",name:"first"}},[a("WaterPump")],1),a("el-tab-pane",{attrs:{label:"数据可视化",name:"second"}},[a("DataTable")],1)],1)},o=[],s=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{staticClass:"header"},[a("el-button",{attrs:{type:"primary",size:"mini"}},[t._v("上传")]),a("el-button",{attrs:{icon:"el-icon-full-screen",size:"mini"}},[t._v("全屏")]),a("el-input",{attrs:{placeholder:"请输入内容",id:"input"}})],1),a("el-table",{staticStyle:{width:"100%"},attrs:{border:"",data:t.waterPumpData}},[a("el-table-column",{attrs:{type:"index",label:"系统",width:"80",align:"center"}}),a("el-table-column",{attrs:{prop:"parameterType",label:"参数类型",width:"width"}}),a("el-table-column",{attrs:{prop:"parameterId",label:"参数ID",width:"width"}}),a("el-table-column",{attrs:{prop:"parameterName",label:"参数名称",width:"width"}}),a("el-table-column",{attrs:{prop:"date",label:"操作",width:"width"}},[a("el-button",{attrs:{icon:"el-icon-full-screen",size:"mini"},on:{click:function(e){t.isShow=!0}}},[t._v("数据可视化")])],1)],1),a("el-pagination",{staticStyle:{"text-align":"center","margin-top":"15px"},attrs:{"current-page":1,"page-sizes":[3,5,10],"page-size":3,total:t.dataTotal,layout:"prev, pager, next, jumper,->, sizes, total"}}),a("el-drawer",{attrs:{size:"50%",direction:"btt",title:t.lineChartTitle,visible:t.isShow},on:{"update:visible":function(e){t.isShow=e}}},[a("div",{staticStyle:{"background-color":"#FFFFBB",width:"100%",height:"100%"}},[a("LineCharts",{attrs:{lineChartTitle:t.lineChartTitle}})],1)])],1)},u=[],c=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",{ref:"charts",staticClass:"charts"})},p=[],m=a(727),d={name:"LineCharts",props:{},mounted:function(){var t=m.S1(this.$refs.charts);console.log(this.lineChartTitle),t.setOption({xAxis:{type:"category",data:["Mon","Tue","Wed","Thu","Fri","Sat","Sun"]},yAxis:{type:"value"},series:[{data:[51,130,224,500,344,256,855],type:"line"}]})}},f=d,b=a(1001),h=(0,b.Z)(f,c,p,!1,null,null,null),v=h.exports,y={name:"DataTable",components:{LineCharts:v},data:function(){return{waterPumpData:[{system:"CW1",parameterType:"---",parameterId:"001",parameterName:"dfff"},{system:"CW1",parameterType:"---",parameterId:"001",parameterName:"dfff"},{system:"CW1",parameterType:"---",parameterId:"001",parameterName:"dfff"},{system:"CW1",parameterType:"---",parameterId:"001",parameterName:"dfff"}],isShow:!1}},computed:{dataTotal:function(){return this.waterPumpData.length},lineChartTitle:function(){return"系统名称:"+this.waterPumpData[0].system+"  参数ID:"+this.waterPumpData[0].parameterId+"  参数名称:"+this.waterPumpData[0].parameterName}}},w=y,g=(0,b.Z)(w,s,u,!1,null,null,null),_=g.exports,S=function(){var t=this,e=t.$createElement,a=t._self._c||e;return a("div",[a("div",{staticClass:"header"},[a("div",{staticClass:"wheelBox"},[t._v(" 轮箱: "),a("el-button",{staticStyle:{"background-color":"green"},attrs:{size:"mini"}},[t._v("颜色Green")]),a("el-button",{staticStyle:{"background-color":"blue"},attrs:{size:"mini"}},[t._v("颜色Blue")]),a("el-button",{staticStyle:{"background-color":"red"},attrs:{size:"mini"}},[t._v("颜色Red")]),a("el-button",{staticStyle:{"background-color":"yellow"},attrs:{size:"mini"}},[t._v("颜色Yellow")]),a("el-button",{staticStyle:{"background-color":"gray"},attrs:{size:"mini"}},[t._v("颜色Gray")])],1),a("div",{staticClass:"bearing"},[t._v(" 轴承: "),a("el-button",{staticStyle:{"background-color":"green"},attrs:{size:"mini"}},[t._v("颜色Green")]),a("el-button",{staticStyle:{"background-color":"blue"},attrs:{size:"mini"}},[t._v("颜色Blue")]),a("el-button",{staticStyle:{"background-color":"red"},attrs:{size:"mini"}},[t._v("颜色Red")]),a("el-button",{staticStyle:{"background-color":"yellow"},attrs:{size:"mini"}},[t._v("颜色Yellow")]),a("el-button",{staticStyle:{"background-color":"gray"},attrs:{size:"mini"}},[t._v("颜色Gray")])],1)]),a("el-button",{attrs:{type:"primary"},on:{click:t.showTable}},[t._v("显示表格")]),a("el-drawer",{attrs:{size:"40%",title:t.partName,visible:t.isShow},on:{"update:visible":function(e){t.isShow=e}}},[a("el-table",{staticStyle:{width:"100%"},attrs:{data:t.someData,border:""}},[a("el-table-column",{attrs:{type:"index",label:"序号",width:"80",align:"center"}}),a("el-table-column",{attrs:{prop:"pointNum",label:"测点位号",width:"width"}}),a("el-table-column",{attrs:{prop:"pointName",label:"被测参数名称",width:"width"}}),a("el-table-column",{attrs:{label:"操作",width:"width"}},[a("el-button",{attrs:{size:"mini"}},[t._v("详情")])],1)],1)],1)],1)},T=[],N={name:"WaterPump",data:function(){return{isShow:!1,someData:[{system:"CW1",pointNum:"---",pointName:"001"},{system:"CW1",pointNum:"---",pointName:"001"},{system:"CW1",pointNum:"---",pointName:"001"}],partName:"齿轮箱"}},methods:{showTable:function(){this.isShow=!0}}},C=N,k=(0,b.Z)(C,S,T,!1,null,null,null),x=k.exports,z={name:"Navigation",components:{DataTable:_,WaterPump:x},data:function(){return{activeName:"first"}},methods:{}},O=z,D=(0,b.Z)(O,l,o,!1,null,null,null),P=D.exports,W={name:"App",components:{Navigation:P}},j=W,I=(0,b.Z)(j,r,i,!1,null,null,null),$=I.exports,E=a(4549),F=a.n(E);n["default"].config.productionTip=!1,n["default"].use(F()),new n["default"]({render:function(t){return t($)}}).$mount("#app")}},e={};function a(n){var r=e[n];if(void 0!==r)return r.exports;var i=e[n]={exports:{}};return t[n](i,i.exports,a),i.exports}a.m=t,function(){var t=[];a.O=function(e,n,r,i){if(!n){var l=1/0;for(c=0;c<t.length;c++){n=t[c][0],r=t[c][1],i=t[c][2];for(var o=!0,s=0;s<n.length;s++)(!1&i||l>=i)&&Object.keys(a.O).every((function(t){return a.O[t](n[s])}))?n.splice(s--,1):(o=!1,i<l&&(l=i));if(o){t.splice(c--,1);var u=r();void 0!==u&&(e=u)}}return e}i=i||0;for(var c=t.length;c>0&&t[c-1][2]>i;c--)t[c]=t[c-1];t[c]=[n,r,i]}}(),function(){a.n=function(t){var e=t&&t.__esModule?function(){return t["default"]}:function(){return t};return a.d(e,{a:e}),e}}(),function(){a.d=function(t,e){for(var n in e)a.o(e,n)&&!a.o(t,n)&&Object.defineProperty(t,n,{enumerable:!0,get:e[n]})}}(),function(){a.g=function(){if("object"===typeof globalThis)return globalThis;try{return this||new Function("return this")()}catch(t){if("object"===typeof window)return window}}()}(),function(){a.o=function(t,e){return Object.prototype.hasOwnProperty.call(t,e)}}(),function(){a.r=function(t){"undefined"!==typeof Symbol&&Symbol.toStringTag&&Object.defineProperty(t,Symbol.toStringTag,{value:"Module"}),Object.defineProperty(t,"__esModule",{value:!0})}}(),function(){var t={143:0};a.O.j=function(e){return 0===t[e]};var e=function(e,n){var r,i,l=n[0],o=n[1],s=n[2],u=0;if(l.some((function(e){return 0!==t[e]}))){for(r in o)a.o(o,r)&&(a.m[r]=o[r]);if(s)var c=s(a)}for(e&&e(n);u<l.length;u++)i=l[u],a.o(t,i)&&t[i]&&t[i][0](),t[i]=0;return a.O(c)},n=self["webpackChunkapp"]=self["webpackChunkapp"]||[];n.forEach(e.bind(null,0)),n.push=e.bind(null,n.push.bind(n))}();var n=a.O(void 0,[998],(function(){return a(7330)}));n=a.O(n)})();
//# sourceMappingURL=app-legacy.7ae3f6a4.js.map