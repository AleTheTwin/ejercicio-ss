FROM alethetwin/jdk8-mariadb
WORKDIR /app
EXPOSE 8080
CMD ["/app/script.sh"]
ADD scripts/script.sql /app/script.sql
ADD scripts/script.sh /app/script.sh
RUN chmod 755 /app/script.sql
RUN chmod 755 /app/script.sh
RUN /etc/init.d/mysql start; mysql < /app/script.sql
ADD app/app.jar /app/
