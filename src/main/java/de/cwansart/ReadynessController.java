package de.cwansart;

import javax.enterprise.context.ApplicationScoped;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;
import org.eclipse.microprofile.health.Readiness;

@Readiness
@Liveness
@ApplicationScoped
public class ReadynessController implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("success");
    }
}
