# micrometer-prometheus-grafana
sample project to check on micrometer, prometheus and grafana

Springboor + micrometer + prometheus + grafana

Prometheus:
1. Installing prometheus in local:
   docker pull prom/prometheus
2. docker run -d -p 9090:9090 -v <local-path>/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus
3. http://localhost:9090

Grafana:
1. docker pull grafana/grafana
2. docker run -d -p 3000:3000 grafana/grafana
3. http://localhost:3000
