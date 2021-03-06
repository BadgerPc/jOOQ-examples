/**
 * This class is generated by jOOQ
 */
package com.loiane.mysql.generatedclasses.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(value    = { "http://www.jooq.org", "3.2.2" },
                            comments = "This class is generated by jOOQ")
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Country extends org.jooq.impl.TableImpl<com.loiane.mysql.generatedclasses.tables.records.CountryRecord> {

	private static final long serialVersionUID = 383429080;

	/**
	 * The singleton instance of <code>world.Country</code>
	 */
	public static final com.loiane.mysql.generatedclasses.tables.Country COUNTRY = new com.loiane.mysql.generatedclasses.tables.Country();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<com.loiane.mysql.generatedclasses.tables.records.CountryRecord> getRecordType() {
		return com.loiane.mysql.generatedclasses.tables.records.CountryRecord.class;
	}

	/**
	 * The column <code>world.Country.Code</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> CODE = createField("Code", org.jooq.impl.SQLDataType.CHAR.length(3).nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.Name</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> NAME = createField("Name", org.jooq.impl.SQLDataType.CHAR.length(52).nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.Continent</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, com.loiane.mysql.generatedclasses.enums.CountryContinent> CONTINENT = createField("Continent", org.jooq.util.mysql.MySQLDataType.VARCHAR.asEnumDataType(com.loiane.mysql.generatedclasses.enums.CountryContinent.class), this);

	/**
	 * The column <code>world.Country.Region</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> REGION = createField("Region", org.jooq.impl.SQLDataType.CHAR.length(26).nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.SurfaceArea</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Double> SURFACEAREA = createField("SurfaceArea", org.jooq.impl.SQLDataType.FLOAT.nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.IndepYear</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Short> INDEPYEAR = createField("IndepYear", org.jooq.impl.SQLDataType.SMALLINT, this);

	/**
	 * The column <code>world.Country.Population</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Integer> POPULATION = createField("Population", org.jooq.impl.SQLDataType.INTEGER.nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.LifeExpectancy</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Double> LIFEEXPECTANCY = createField("LifeExpectancy", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>world.Country.GNP</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Double> GNP = createField("GNP", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>world.Country.GNPOld</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Double> GNPOLD = createField("GNPOld", org.jooq.impl.SQLDataType.FLOAT, this);

	/**
	 * The column <code>world.Country.LocalName</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> LOCALNAME = createField("LocalName", org.jooq.impl.SQLDataType.CHAR.length(45).nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.GovernmentForm</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> GOVERNMENTFORM = createField("GovernmentForm", org.jooq.impl.SQLDataType.CHAR.length(45).nullable(false).defaulted(true), this);

	/**
	 * The column <code>world.Country.HeadOfState</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> HEADOFSTATE = createField("HeadOfState", org.jooq.impl.SQLDataType.CHAR.length(60), this);

	/**
	 * The column <code>world.Country.Capital</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.Integer> CAPITAL = createField("Capital", org.jooq.impl.SQLDataType.INTEGER, this);

	/**
	 * The column <code>world.Country.Code2</code>. 
	 */
	public final org.jooq.TableField<com.loiane.mysql.generatedclasses.tables.records.CountryRecord, java.lang.String> CODE2 = createField("Code2", org.jooq.impl.SQLDataType.CHAR.length(2).nullable(false).defaulted(true), this);

	/**
	 * Create a <code>world.Country</code> table reference
	 */
	public Country() {
		super("Country", com.loiane.mysql.generatedclasses.World.WORLD);
	}

	/**
	 * Create an aliased <code>world.Country</code> table reference
	 */
	public Country(java.lang.String alias) {
		super(alias, com.loiane.mysql.generatedclasses.World.WORLD, com.loiane.mysql.generatedclasses.tables.Country.COUNTRY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<com.loiane.mysql.generatedclasses.tables.records.CountryRecord> getPrimaryKey() {
		return com.loiane.mysql.generatedclasses.Keys.KEY_COUNTRY_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<com.loiane.mysql.generatedclasses.tables.records.CountryRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<com.loiane.mysql.generatedclasses.tables.records.CountryRecord>>asList(com.loiane.mysql.generatedclasses.Keys.KEY_COUNTRY_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public com.loiane.mysql.generatedclasses.tables.Country as(java.lang.String alias) {
		return new com.loiane.mysql.generatedclasses.tables.Country(alias);
	}
}
