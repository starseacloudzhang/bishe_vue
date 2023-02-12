//导入模块
const Websocket = require('ws')
//引入Server类实例化
const  wss = new Websocket.Server({port:5000})//定义服务器端口号
wss.on('connection',function (ws){
    ws.on('message',function (message){
        console.log('success')
    })
})

