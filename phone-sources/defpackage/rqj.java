package defpackage;

import android.os.SystemClock;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rqj {
    public final long a;
    public final long b;

    public rqj() {
        throw null;
    }

    public static rqj a() {
        return new rqj(SystemClock.elapsedRealtime(), SystemClock.uptimeMillis());
    }

    public static rqj b() {
        return new rqj(SystemClock.elapsedRealtime(), Duration.ofMillis(SystemClock.uptimeMillis()).toMillis());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof rqj) {
            rqj rqjVar = (rqj) obj;
            if (this.a == rqjVar.a && this.b == rqjVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a;
        return ((int) (j ^ (j >>> 32))) ^ ((((int) (j2 ^ (j2 >>> 32))) ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "PrimesInstant{elapsedRealtimeMs=" + this.a + ", uptimeMillis=" + this.b + "}";
    }

    public rqj(long j, long j2) {
        this.a = j;
        this.b = j2;
    }
}
