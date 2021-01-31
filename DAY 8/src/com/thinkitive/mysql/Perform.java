package com.thinkitive.mysql;

public class Perform {

	public static void main(String[] args) {

		DbOperation op = new DbOperation();

		op.insertEmp(10, "admin", 2000);
		op.displayEmp();
		op.updateEmp(2, "nikita");
		op.displayEmp();
		op.deleteEmp(2);
		op.displayEmp();

	}
}

/*OUTPUT
Sun Jan 31 17:39:12 IST 2021 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.
Sun Jan 31 17:39:12 IST 2021 WARN: Establishing SSL connection without server's identity verification is not recommended. According to MySQL 5.5.45+, 5.6.26+ and 5.7.6+ requirements SSL connection must be established by default if explicit option isn't set. For compliance with existing applications not using SSL the verifyServerCertificate property is set to 'false'. You need either to explicitly disable SSL by setting useSSL=false, or set useSSL=true and provide truststore for server certificate verification.

1 nik 3333
 3 root 3333
 111 admin 6666
 10 admin 2000
 10 admin 2000
*/