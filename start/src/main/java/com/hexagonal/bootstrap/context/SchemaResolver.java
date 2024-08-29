package com.hexagonal.bootstrap.context;

import org.hibernate.context.spi.CurrentTenantIdentifierResolver;
import org.springframework.stereotype.Component;

@Component
public class SchemaResolver implements CurrentTenantIdentifierResolver {

    private static final String DEFAULT_TENANT_ID = "public"; // default schema

    private static final ThreadLocal<String> currentTenant = new ThreadLocal<>();

    public static void setCurrentTenant(String tenant) {
        currentTenant.set(tenant);
    }

    @Override
    public String resolveCurrentTenantIdentifier() {
        String tenantId = currentTenant.get();
        return (tenantId != null) ? tenantId : DEFAULT_TENANT_ID;
    }

    @Override
    public boolean validateExistingCurrentSessions() {
        return true;
    }
}
