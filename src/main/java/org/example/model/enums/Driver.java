package org.example.model.enums;

import org.apache.commons.lang3.StringUtils;

public enum Driver {
	POSTGRESQL, MYSQL, ORACLE;

	public static Driver of(String jdbcUrl) {
		if (StringUtils.isBlank(jdbcUrl)) {
			throw new IllegalArgumentException("jdbcUrl must not be blank");
		}

		if (jdbcUrl.contains("jdbc:postgresql")) {
			return Driver.POSTGRESQL;
		}
		throw new IllegalArgumentException("jdbcUrl is not supported");
	}
}
