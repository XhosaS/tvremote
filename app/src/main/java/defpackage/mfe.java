package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mfe {
    public static void a(mfd mfdVar) {
        mfdVar.d();
        mfdVar.d();
        mfdVar.d();
        yqw.Y(true, "ThreadMonitoringConfiguration.threadCountSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        mfdVar.e();
        mfdVar.e();
        yqw.P(true, "ThreadMonitoringConfiguration.threadCountThreshold must be positive but found %s", 1000);
        mfdVar.a();
        mfdVar.a();
        mfdVar.a();
        yqw.Y(true, "ThreadMonitoringConfiguration.queueSizeSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        mfdVar.b();
        mfdVar.b();
        yqw.P(true, "ThreadMonitoringConfiguration.queueSizeThreshold must be positive but found %s", 1000);
        mfdVar.c();
        mfdVar.c();
        mfdVar.c();
        yqw.Y(true, "ThreadMonitoringConfiguration.taskTimeoutSamplesPerThousand() must be between [0, %s] but found %s", 1000, 1);
        mfdVar.f();
        mfdVar.f();
        yqw.Q(true, "ThreadMonitoringConfiguration.taskTimeoutDuration must be positive but found %s", 1L);
    }
}
