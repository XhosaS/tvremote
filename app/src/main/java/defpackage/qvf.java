package defpackage;

import android.os.SystemClock;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class qvf {
    public static qvf c() {
        return new quj(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public static qvf d() {
        return new quj(SystemClock.elapsedRealtime(), Duration.ofMillis(SystemClock.uptimeMillis()).toMillis());
    }

    public abstract long a();

    public abstract long b();
}
