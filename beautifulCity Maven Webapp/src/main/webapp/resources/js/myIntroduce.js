window.onload=function(){
    document.getElementById("down").onclick=function(){
        document.getElementById("navFloat").style.top=0+"px";
        this.style.display="none";
    }
    document.getElementById("navFloat").onmouseout=function(){
        this.style.top=-55+"px";
        document.getElementById("down").style.display="block";
    }
    document.getElementById("navFloat").onmouseover=function(){
        this.style.top=0+"px";
        document.getElementById("down").style.display="none";
    }

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/bws",
        async:false,
        success:function(data,status,jqXHR){
            var bws=data;
            var panel1=document.getElementById("panel1");
            for(var i=0;i<bws.length;i++){
                var pt=document.createElement("p");
                var pc=document.createElement("p");
                pt.className="infoHead";
                pc.className="infoContent";
                pt.innerHTML=bws[i].infoTitle;
                pc.innerHTML=bws[i].infoContent;
                panel1.appendChild(pt);
                panel1.appendChild(pc);
            }
            var tm=document.createElement("label");
            tm.className="tipMiddle";
            tm.innerHTML="乡村美图集:";
            panel1.appendChild(tm);
       }
    });

    $.ajax({
         method: "GET",
         dataType:"json",
         url:"http://localhost:8080/beautifulCity/bps",
         async:false,
         success:function(data,status,jqXHR){
             var bps=data;
             var view=document.createElement("div");
             var panel1=document.getElementById("panel1");
             view.id="view";
             for(var i=0;i<bps.length;i++){
                var img=document.createElement("img");
                img.src=bps[i].infoImg;
                view.appendChild(img);
             }
             panel1.appendChild(view);
              $('#view').bigSlider({
                 focusType:'enlarge',
                 animationDuration:400
             });
         }
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/cws",
        async:false,
        success:function(data,status,jqXHR){
            var cws=data;
            var panel2=document.getElementById("panel2");
            for(var i=0;i<cws.length;i++){
                var ct=document.createElement("p");
                var cc=document.createElement("p");
                ct.className="infoHead";
                cc.className="infoContent";
                ct.innerHTML=cws[i].infoTitle;
                cc.innerHTML=cws[i].infoContent;
                panel2.appendChild(ct);
                panel2.appendChild(cc);
            }
            var cm=document.createElement("label");
            cm.className="tipMiddle";
            cm.innerHTML="乡村文化进程:";
            panel2.appendChild(cm);
        }
    });

    $.ajax({
         method: "GET",
         dataType:"json",
         url:"http://localhost:8080/beautifulCity/cps",
         async:false,
         success:function(data,status,jqXHR){
            var cps=data;
            var panel2=document.getElementById("panel2");
            var culture=document.createElement("div");
            culture.className="culture";
            var cultureUl=document.createElement("ul");
            for(var i=0;i<cps.length;i++){
                var cultureLi=document.createElement("li");
                var cultureImg=document.createElement("img");
                cultureImg.src=cps[i].infoImg;
                cultureLi.appendChild(cultureImg);
                cultureUl.appendChild(cultureLi);
            }
            culture.appendChild(cultureUl);
            panel2.appendChild(culture);
            imgScroll.rolling({
                name:'culture',
                width:'200px',
                height:'180px',
                direction:'right',
                speed:15,
                addcss:true
            });
         }
    });


    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/sws",
        async:false,
        success:function(data,status,jqXHR){
            var sws=data;
            var panel3=document.getElementById("panel3");
            for(var i=0;i<sws.length;i++){
                var st=document.createElement("p");
                var sc=document.createElement("p");
                st.className="infoHead";
                sc.className="infoContent";
                st.innerHTML=sws[i].infoTitle;
                sc.innerHTML=sws[i].infoContent;
                panel3.appendChild(st);
                panel3.appendChild(sc);
            }
            var sTip=document.createElement("label");
            sTip.className="tip";
            sTip.innerHTML="注:图片移到大框内可放大看美食特产";
            panel3.appendChild(sTip);
        }
    });

    $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/sps",
        async:false,
        success:function(data,status,jqXHR){
            var sps=data;
            var panel3=document.getElementById("panel3");
            var drag=document.createElement("div");
            drag.className="drag_div";
            drag.id="drag_div";
            for(var i=1;i<=sps.length;i++){
                var s=document.createElement("div");
                s.className="s"+i;
                var pb=document.createElement("p");
                pb.className="bottom-15";
                var sImg=document.createElement("img");
                sImg.src=sps[i-1].infoImg;
                var pC=document.createElement("p");
                pC.className="text-center";
                pC.innerHTML=sps[i-1].imgTitle;
                pb.appendChild(sImg);
                s.appendChild(pb);
                s.appendChild(pC);
                drag.appendChild(s);
            }
            panel3.appendChild(drag);
        }
    });

     $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/tws",
        async:false,
        success:function(data,status,jqXHR){
            var tws=data;
            var panel4=document.getElementById("panel4");
            for(var i=0;i<tws.length;i++){
                var tpt=document.createElement("p");
                var tpc=document.createElement("p");
                tpt.className="infoHead";
                tpc.className="infoContent";
                tpt.innerHTML=tws[i].infoTitle;
                tpc.innerHTML=tws[i].infoContent;
                panel4.appendChild(tpt);
                panel4.appendChild(tpc);
            }
            var tl=document.createElement("label");
            tl.className="tip";
            tl.innerHTML="注:点击可观看旅游详情!!!!";
            panel4.appendChild(tl);
        }
     });

     $.ajax({
        method: "GET",
        dataType:"json",
        url:"http://localhost:8080/beautifulCity/tps",
        async:false,
        success:function(data,status,jqXHR){
            var tps=data;
            var panel4=document.getElementById("panel4");
            var tripImg=document.createElement("div");
            tripImg.id="tripImg";
            tripImg.setAttribute("align","center");
            for(var i=0;i<tps.length;i++){
                var at=document.createElement("a");
                at.className="vlightbox";
                at.innerHTML=tps[i].imgTitle;
                var mt=document.createElement("img");
                mt.src=tps[i].infoImg;
                at.appendChild(mt);
                tripImg.appendChild(at);
                at.onclick=openItem;
            }
            panel4.appendChild(tripImg);
        }
     });


     function openItem(){
        var spot=this.innerText;
        $.ajax({
            method: "GET",
            url:"http://localhost:8080/beautifulCity/itemIn",
            data:{'spotsName':spot},
            success:function(data,status,jqXHR){
                var itemsIn=data;
                var itemContainer=document.getElementsByClassName("itemContainer")[0];
                for(var i=0;i<itemsIn.length;i++){
                    var itemDiv=document.createElement("div");
                    itemDiv.className="item";
                    var typeDiv=document.createElement("div");
                    typeDiv.className="img-type";
                    var img=document.createElement("img");
                    img.src=itemsIn[i].tripIcon;
                    var typeSpan=document.createElement("span");
                    (itemsIn[i].tripType=="跟团游")?typeSpan.className="type-tuan":typeSpan.className="type-free";
                    typeSpan.innerHTML=itemsIn[i].tripType;
                    var tcDiv=document.createElement("div");
                    tcDiv.className="title-content";
                    var h3=document.createElement("a");
                    h3.className="title";
                    h3.innerHTML=itemsIn[i].tripTitle;
                    h3.href="http://localhost:8080/beautifulCity/travel";
                    h3.target = "_blank";
                    h3.onclick=openTravel;
                    var c1Div=document.createElement("div");
                    c1Div.className="content1";
                    c1Div.innerHTML=itemsIn[i].tripContent;
                    var c2Div=document.createElement("div");
                    c2Div.className="content2";
                    c2Div.innerHTML=itemsIn[i].tripStart;
                    var c3Div=document.createElement("div");
                    c3Div.className="content3";
                    c3Div.innerHTML=itemsIn[i].tripEnd;
                    var priceAll=document.createElement("div");
                    priceAll.className="price-all";
                    var priceSpan=document.createElement("span");
                    priceSpan.className="price";
                    priceSpan.innerHTML="<span class=\"fa fa-cny\"></span>"+itemsIn[i].tripPrice;

                    typeDiv.appendChild(img);
                    typeDiv.appendChild(typeSpan);
                    itemDiv.appendChild(typeDiv);

                    tcDiv.appendChild(h3);
                    tcDiv.appendChild(c1Div);
                    tcDiv.appendChild(c2Div);
                    tcDiv.appendChild(c3Div);
                    itemDiv.appendChild(tcDiv);

                    priceAll.appendChild(priceSpan);
                    itemDiv.appendChild(priceAll);

                    itemContainer.appendChild(itemDiv);
                }
            }
        });
     }

     function openTravel(){
        var tl=this.innerText;
        $.ajax({
            method: "GET",
            url:"http://localhost:8080/beautifulCity/getTitle",
            data:{'tl':tl}
        });
     }

    //拖拽实现！！
    var oUl= document.getElementById("drag_div");        //最外层
    var aLi = oUl.getElementsByTagName('div');       //最外层中所有div
    var disX = 0;
    var disY = 0;
    var minZindex = 1;
    var aPos =[];
    var top=[0,0,0,0,225,225,225];
    var left=[0,586,858,1130,586,858,1130];          //41%  60%  79%
    for(var i=0;i<aLi.length;i++){
        // var t = aLi[i].offsetTop;
        // var l = aLi[i].offsetLeft;
        // // console.log(t);
        // // console.log(l);
        // aLi[i].style.top = t+"px";
        // aLi[i].style.left = l+"px";
        // aPos[i] = {left:l,top:t};
        var t=top[i];
        var l=left[i];
        aLi[i].style.top = t+"px";
        aLi[i].style.left = l+"px";
        aPos[i] = {left:l,top:t};
        aLi[i].index = i;
    }
    for(var i=0;i<aLi.length;i++){
        // aLi[i].style.position = "absolute";
        aLi[i].style.margin = 0;
        setDrag(aLi[i]);
    }
    //拖拽
    function setDrag(obj){
        obj.onmouseover = function(){
            obj.style.cursor = "move";
        }
        obj.onmousedown = function(event){
            var scrollTop = document.documentElement.scrollTop||document.body.scrollTop;
            var scrollLeft = document.documentElement.scrollLeft||document.body.scrollLeft;
            obj.style.zIndex = minZindex++;
            //当鼠标按下时计算鼠标与拖拽对象的距离
            disX = event.clientX +scrollLeft-obj.offsetLeft;
            disY = event.clientY +scrollTop-obj.offsetTop;
            document.onmousemove=function(event){
                //当鼠标拖动时计算div的位置
                var l = event.clientX -disX +scrollLeft;
                var t = event.clientY -disY + scrollTop;
                obj.style.left = l + "px";
                obj.style.top = t + "px";
                // for(var i=0;i<aLi.length;i++){
                //  aLi[i].className = "";
                //  if(obj==aLi[i])continue;//如果是自己则跳过自己不加红色虚线
                //  if(colTest(obj,aLi[i])){
                //      aLi[i].className = "active";
                //  }
                // }
                for(var i=0;i<aLi.length;i++){
                    aLi[i].className = aLi[i].className;
                }
                var oNear = findMin(obj);


                if(oNear){
                    //oNear.className = "active";
                }
            }
            document.onmouseup = function(){
                document.onmousemove = null;//当鼠标弹起时移出移动事件
                document.onmouseup = null;//移出up事件，清空内存
                //检测是否普碰上，在交换位置
                var oNear = findMin(obj);
                if(oNear){
                    var width1=oNear.clientWidth;
                    var height1=oNear.clientHeight;
                    var width2=obj.clientWidth;
                    var height2=obj.clientHeight;
                    // console.log(width1+width2);
                    // console.log(oNear.className);
                    // console.log(obj.className);
                     var className1=obj.className;
                     var className2=oNear.className;
                    obj.className=className2;
                    oNear.className=className1;
                    oNear.style.zIndex = minZindex++;
                    obj.style.zIndex = minZindex++;
                    startMove(oNear,aPos[obj.index]);
                    startMove(obj,aPos[oNear.index]);
                    //交换index
                    oNear.index += obj.index;
                    obj.index = oNear.index - obj.index;
                    oNear.index = oNear.index - obj.index;


                    obj.clientWidth=width2;
                    obj.clientHeight=height2;

                    oNear.clientWidth=width1;
                    oNear.clientHeight=height1;

                }else{

                    startMove(obj,aPos[obj.index]);
                }
            }
            clearInterval(obj.timer);
            return false;                            //低版本出现禁止符号
        }
    }
    //碰撞检测
    function colTest(obj1,obj2){
        var t1 = obj1.offsetTop;
        var r1 = obj1.offsetWidth+obj1.offsetLeft;
        var b1 = obj1.offsetHeight+obj1.offsetTop;
        var l1 = obj1.offsetLeft;

        var t2 = obj2.offsetTop;
        var r2 = obj2.offsetWidth+obj2.offsetLeft;
        var b2 = obj2.offsetHeight+obj2.offsetTop;
        var l2 = obj2.offsetLeft;

        if(t1>b2||r1<l2||b1<t2||l1>r2){
            return false;
        }else{
            return true;
        }
    }
    //勾股定理求距离
    function getDis(obj1,obj2){
        var a = obj1.offsetLeft-obj2.offsetLeft;
        var b = obj1.offsetTop-obj2.offsetTop;
        return Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
    }
    //找到距离最近的
    function findMin(obj){
        var minDis = 999999999;
        var minIndex = -1;
        for(var i=0;i<aLi.length;i++){
            if(obj==aLi[i])continue;
            if(colTest(obj,aLi[i])){
                var dis = getDis(obj,aLi[i]);
                if(dis<minDis){
                    minDis = dis;
                    minIndex = i;
                }
            }
        }
        if(minIndex==-1){
            return null;
        }else{
            return aLi[minIndex];
        }
    }


    $('.vlightbox').on('click',function(event){
        event.preventDefault();
        $('#tripItem').addClass('is-visible');
    });

    $('#tripItem').on('click',function(event){
        if($(event.target).is('.itemClose')||$(event.target).is('#tripItem')){
            event.preventDefault();
            $(this).removeClass('is-visible');
            $('.item').remove();
        }
    });
}