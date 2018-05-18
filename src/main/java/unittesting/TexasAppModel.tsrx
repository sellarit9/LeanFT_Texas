<?xml version="1.0" encoding="utf-8" standalone="yes"?>
<applicationModel>
    <name>Application Model</name>
    <className>unittesting.TexasAppModel</className>
    <objects>
        <object type="Page" technology="Web">
            <name>Texas.gov | The Official Website of the State of Texas</name>
            <codeName>texasGovTheOfficialWebsiteOfTheStateOfTexasPage</codeName>
            <description></description>
            <identification/>
            <children>
                <object type="Link" technology="Web">
                    <name>Info</name>
                    <codeName>infoLink</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="InnerText" type="string" isRegExp="false">Info</property>
                            <property name="TagName" type="string" isRegExp="false">A</property>
                        </properties>
                    </identification>
                </object>
                <object type="Image" technology="Web">
                    <name>Texas</name>
                    <codeName>texasImage</codeName>
                    <description></description>
                    <identification>
                        <properties>
                            <property name="Alt" type="string" isRegExp="false">Texas.gov Home</property>
                            <property name="TagName" type="string" isRegExp="false">IMG</property>
                            <property name="Type" type="enum" isRegExp="false">Link</property>
                        </properties>
                    </identification>
                </object>
            </children>
        </object>
    </objects>
</applicationModel>
