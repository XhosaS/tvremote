package defpackage;

import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vte extends vtq {
    public final long a;
    public final TimeUnit b;

    public vte(long j, TimeUnit timeUnit) {
        this.a = j;
        if (timeUnit == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.b = timeUnit;
    }

    @Override // defpackage.vtq
    public final long a() {
        return this.a;
    }

    @Override // defpackage.vtq
    public final TimeUnit b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vtq) {
            vtq vtqVar = (vtq) obj;
            if (this.a == vtqVar.a() && this.b.equals(vtqVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        return "TimeUnitPair{duration=" + this.a + ", timeUnit=" + this.b.toString() + "}";
    }
}
