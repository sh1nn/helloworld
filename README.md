# helloworld
fizzbuzz
这是一个简单的猜数字游戏。

想象你是个小学5年级的学生，现在还有5分钟就要下课，数学老师带全班同学玩一个小游戏。他会用手指挨个指向每个学生，被指着的学生就要依次报数：第一个被指着的学生说“1”，第二个被指着的学生说“2”，以此类推。

呃……并不完全“以此类推”……如果一个学生被指着的时候，应该报的数是3的倍数，那么他就不能说这个数，而是要说“Fizz”。同样的道理，5的倍数也不能被说出来，而是要说“Buzz”。

于是游戏开始了，老师的手指向一个个同学，他们开心地喊着：“1！”，“2！”，“Fizz！”，“4！”，“Buzz！”……终于，老师指向了你，时间仿佛静止，你的嘴发干，你的掌心在出汗，你仔细计算，然后终于喊出“Fizz！”。运气不错，你躲过了一劫，游戏继续进行。

为了避免在自己这儿失败，我们想了一个作弊的法子：最好能提前把整个列表打印出来，这样就知道到我这儿的时候该说什么了。全班有33个同学，游戏可能会玩2到3轮。现在，赶紧去写代码吧！

任务：写一个程序，打印出从1到100的数字，将其中3的倍数替换成“Fizz”，5的倍数替换成“Buzz”。既能被3整除、又能被5整除的数则替换成“FizzBuzz”。

示例输出：
1
2
fizz
4
buzz
fizz
7
8
fizz
buzz
...
14
fizzbuzz


第二阶段：需求变更。

如果一个数能被3整除，或者包含数字3，那么这个数就是“Fizz”
如果一个数能被5整除，或者包含数字5，那么这个数就是“Buzz”
