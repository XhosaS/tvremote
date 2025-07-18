package defpackage;

import java.io.Serializable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mfa implements Serializable, mfd {
    private static final TimeUnit a = TimeUnit.MINUTES;
    private static final long serialVersionUID = 0;

    @Override // defpackage.mfd
    public final int a() {
        return 1;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return mfd.class;
    }

    @Override // defpackage.mfd
    public final int b() {
        return 1000;
    }

    @Override // defpackage.mfd
    public final int c() {
        return 1;
    }

    @Override // defpackage.mfd
    public final int d() {
        return 1;
    }

    @Override // defpackage.mfd
    public final int e() {
        return 1000;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof mfd) {
            mfd mfdVar = (mfd) obj;
            mfdVar.d();
            mfdVar.e();
            mfdVar.a();
            mfdVar.b();
            mfdVar.c();
            mfdVar.f();
            if (a.equals(mfdVar.g())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.mfd
    public final long f() {
        return 1L;
    }

    @Override // defpackage.mfd
    public final TimeUnit g() {
        return a;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (a.hashCode() ^ (-810573619)) - 1944263094;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.libraries.concurrent.monitoring.ThreadMonitoringConfiguration()";
    }
}
