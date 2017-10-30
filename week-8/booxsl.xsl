<?xml version="1.0"?>
<xsl:stylesheet
	version="1.0"
	xmlns:xsl="http://www.w3.org/1999/XSL/Transform"
	xmlns="http://www.w3.org/TR/REC-html40">
	<xsl:template match="bookstore">
		<HTML>
			<BODY>
				<H1> BOOKSTORE</H1>
				<xsl:for-each select="book">
					<SPAN style="font-style:italic">ID:</SPAN>
					<xsl:value-of select="id"/>
					<SPAN style="font-style:italic">Title:</SPAN>
					<xsl:value-of select="title"/>
					<SPAN style="font-style:bold">Author:</SPAN>
					<xsl:value-of select="author"/>
					<SPAN style="font-style:italic">Cost:</SPAN>
					<xsl:value-of select="price"/>
				</xsl:for-each>
			</BODY>
		</HTML>
	</xsl:template>
</xsl:stylesheet>
