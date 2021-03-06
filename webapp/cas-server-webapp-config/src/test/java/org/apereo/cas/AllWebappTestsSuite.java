package org.apereo.cas;

import org.apereo.cas.config.WiringConfigurationTests;
import org.apereo.cas.web.security.CasWebSecurityConfigurerAdapterTests;
import org.apereo.cas.web.security.CasWebSecurityExpressionHandlerTests;
import org.apereo.cas.web.security.CasWebSecurityExpressionRootTests;
import org.apereo.cas.web.security.authentication.MonitorEndpointLdapAuthenticationProviderDefaultRolesTests;
import org.apereo.cas.web.security.authentication.MonitorEndpointLdapAuthenticationProviderGroupsBasedTests;
import org.apereo.cas.web.security.authentication.MonitorEndpointLdapAuthenticationProviderRolesBasedTests;
import org.apereo.cas.webflow.CasWebflowClientSessionContextConfigurationTests;
import org.apereo.cas.webflow.CasWebflowServerSessionContextConfigurationTests;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

/**
 * This is {@link AllWebappTestsSuite}.
 *
 * @author Misagh Moayyed
 * @since 5.3.0
 */
@SelectClasses({
    MonitorEndpointLdapAuthenticationProviderDefaultRolesTests.class,
    WiringConfigurationTests.class,
    CasWebSecurityExpressionRootTests.class,
    CasWebSecurityExpressionHandlerTests.class,
    CasWebflowServerSessionContextConfigurationTests.class,
    CasWebSecurityConfigurerAdapterTests.class,
    CasWebflowClientSessionContextConfigurationTests.class,
    MonitorEndpointLdapAuthenticationProviderRolesBasedTests.class,
    MonitorEndpointLdapAuthenticationProviderGroupsBasedTests.class
})
@RunWith(JUnitPlatform.class)
public class AllWebappTestsSuite {
}
