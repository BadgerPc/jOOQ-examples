/**
 * This class is generated by jOOQ
 */
package com.loiane.mysql.generatedclasses;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class World extends org.jooq.impl.SchemaImpl {

	private static final long serialVersionUID = 426944485;

	/**
	 * The singleton instance of <code>world</code>
	 */
	public static final World WORLD = new World();

	/**
	 * No further instances allowed
	 */
	private World() {
		super("world");
	}

	@Override
	public final java.util.List<org.jooq.Table<?>> getTables() {
		java.util.List result = new java.util.ArrayList();
		result.addAll(getTables0());
		return result;
	}

	private final java.util.List<org.jooq.Table<?>> getTables0() {
		return java.util.Arrays.<org.jooq.Table<?>>asList(
			com.loiane.mysql.generatedclasses.tables.City.CITY,
			com.loiane.mysql.generatedclasses.tables.Country.COUNTRY,
			com.loiane.mysql.generatedclasses.tables.Countrylanguage.COUNTRYLANGUAGE);
	}
}