<?xml version="1.0" encoding="UTF-8" ?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="CottonDesk">
        <html>
        <body>
            <p>
                <xsl:text>NAME: </xsl:text>
                <xsl:value-of select="child::*[2]/Name"/>
                <xsl:text> AGE: </xsl:text>
                <xsl:value-of select="child::*[2]/Age"/>
                <xsl:text> Your Commision is $500</xsl:text>
            </p>
            <p>
                <xsl:text>NAME: </xsl:text>
                <xsl:value-of select="child::*[3]/Name"/>
                <xsl:text> AGE: </xsl:text>
                <xsl:value-of select="child::*[3]/Age"/>
                <xsl:text> Your Commision is $5000</xsl:text>
            </p>

            <p>
                <xsl:text>NAME: </xsl:text>
                <xsl:value-of select="child::*[4]/Name"/>
                <xsl:text> AGE: </xsl:text>
                <xsl:value-of select="child::*[4]/Age"/>
                <xsl:text> Your Commision is $0</xsl:text>
            </p>

            <p>
                <xsl:text>NAME: </xsl:text>
                <xsl:value-of select="child::*[last()]/Name"/>
                <xsl:text> AGE: </xsl:text>
                <xsl:value-of select="child::*[last()]/Age"/>
                <xsl:text> Your Commision is $5000</xsl:text>
            </p>

        </body>
        </html>
    </xsl:template>
</xsl:stylesheet>