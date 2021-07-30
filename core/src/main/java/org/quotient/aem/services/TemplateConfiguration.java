package org.quotient.aem.services;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.Option;
import org.apache.commons.lang3.StringUtils;

public @interface TemplateConfiguration
{
    @AttributeDefinition(
            name = "Text input",
            description = "A single configuration text field.")
    public String[] get_single_text();

    @AttributeDefinition(
            name = "Multiple Text Inputs",
            description = "Multiple configuration text fields.")
    public String[] get_multi_text();

    @AttributeDefinition(
            name = "Dropdown",
            description = "Select configuration field.",
            options = {
                    @Option(label = "Option 1", value = "option1"),
                    @Option(label = "Option 2", value = "option2")
            }
    )
    String[] get_select() default StringUtils.EMPTY;

    @AttributeDefinition(
            name = "Multiselect",
            description = "Multi-select configuration field.",
            options = {
                    @Option(label = "Option 1", value = "option1"),
                    @Option(label = "Option 2", value = "option2")
            }
    )
    String[] get_multi_select() default StringUtils.EMPTY;

    @AttributeDefinition(
            name = "Checkbox",
            description = "Checkbox configuration field.")
    public boolean get_boolean();
}
