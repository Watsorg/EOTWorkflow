package com.myspace.eotworkflow;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Document implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Quote Option Type")
	private java.lang.String quoteoptiontype;
	@org.kie.api.definition.type.Label("Description")
	private java.lang.String description;

	@org.kie.api.definition.type.Label("Doc Name")
	private java.lang.String docname;

	@org.kie.api.definition.type.Label("Relationship Name")
	private java.lang.String relationshipname;

	@org.kie.api.definition.type.Label(value = "Auto Gen")
	private java.lang.Boolean autogen;

	public Document() {
	}

	public java.lang.String getQuoteoptiontype() {
		return this.quoteoptiontype;
	}

	public void setQuoteoptiontype(java.lang.String quoteoptiontype) {
		this.quoteoptiontype = quoteoptiontype;
	}

	public java.lang.String getDescription() {
		return this.description;
	}

	public void setDescription(java.lang.String description) {
		this.description = description;
	}

	public java.lang.String getDocname() {
		return this.docname;
	}

	public void setDocname(java.lang.String docname) {
		this.docname = docname;
	}

	public java.lang.String getRelationshipname() {
		return this.relationshipname;
	}

	public void setRelationshipname(java.lang.String relationshipname) {
		this.relationshipname = relationshipname;
	}

	public java.lang.Boolean getAutogen() {
		return this.autogen;
	}

	public void setAutogen(java.lang.Boolean autogen) {
		this.autogen = autogen;
	}

	public Document(java.lang.String quoteoptiontype,
			java.lang.String description, java.lang.String docname,
			java.lang.String relationshipname, java.lang.Boolean autogen) {
		this.quoteoptiontype = quoteoptiontype;
		this.description = description;
		this.docname = docname;
		this.relationshipname = relationshipname;
		this.autogen = autogen;
	}

}