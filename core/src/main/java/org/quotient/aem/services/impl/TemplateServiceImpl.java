package org.quotient.aem.services.impl;

import org.apache.sling.api.resource.ResourceResolver;
import org.apache.sling.api.resource.ResourceResolverFactory;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import org.osgi.service.metatype.annotations.Designate;
import org.quotient.aem.services.TemplateConfiguration;
import org.quotient.aem.services.TemplateService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = TemplateService.class, immediate = true)
@Designate(ocd = TemplateConfiguration.class)
public class TemplateServiceImpl implements TemplateService
{
    @Reference
    private ResourceResolverFactory resolverFactory;

    private javax.jcr.Session session;
    private ResourceResolver resourceResolver;

    /**
     * Logger
     */
    private static final Logger log = LoggerFactory.getLogger(TemplateServiceImpl.class);

    /**
     * Instance of the OSGi configuration class
     */
    private TemplateConfiguration configuration;

    @Activate
    protected void activate(TemplateConfiguration configuration)
    {
        this.configuration = configuration;
    }
}
