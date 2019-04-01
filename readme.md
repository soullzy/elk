#elk demo
1、ElasticSearch
  是一个高度可扩展的开源全文搜索和分析引擎。它允许您快速、实时地存储、搜索和分析大量数据。
  它通常用作底层引擎/技术，为具有复杂搜索特性和需求的应用程序提供动力，完成诸如搜索，日志收集，反向搜索，智能分析等功能
  下载安装包、解压，
  ./bin/elasticsearch 启动
  
  https://www.dalaoyang.cn/article/78

2、Logstash
  用于收集、处理和转发日志信息，可以动态地将来自不同数据源的数据统一起来，并将数据规范化后(通过Filter过滤)传输到您选择的目标。
  a、下载安装包、解压
  b、cd config& mv logstash-sample.conf logstash.conf 
  c、vi logstash.conf 具体配置项参考springboot.conf
  d、bin/logstash -f logstash.conf 启动
  
  https://www.dalaoyang.cn/article/80
  

3、Kibana
  提供可搜索的Web可视化界面
  
  https://www.dalaoyang.cn/article/79
  
logback-spring
  destination 配置项必须要和logstash配置的一致
  index 也必须和配置文件匹配
  
#kafka elk
  项目将产生的日志发送到 Kafka，Logstash 消费 Kafka 中的消息，再推给 Elasticsearch，最终使用 Kibana 查看日志

4、zkServer
  zkServer.sh start 启动
  zkServer.sh status 查看状态

5、kafka
  接收用户日志的消息队列
  启动前需要启动zookeeper
  
  修改server.properties 日志目录
  kafka-server-start.sh config/server.properties 
  创建主题logger-channel
  kafka-topics.sh --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic logger-channel
  查看已创建的主题
  kafka-topics.sh --list --zookeeper localhost:2181 
  
6、启动顺序
zookeeper 
Kafka
Elasticsearch
Logstash
Kibana


  
