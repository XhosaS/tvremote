package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class zds {
    public final int a;
    public final TimeUnit b;

    public zds(int i, TimeUnit timeUnit) {
        this.a = i;
        timeUnit.getClass();
        this.b = timeUnit;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zds) {
            zds zdsVar = (zds) obj;
            if (this.a == zdsVar.a && this.b == zdsVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a * 37) ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a + " " + this.b.toString();
    }
}
