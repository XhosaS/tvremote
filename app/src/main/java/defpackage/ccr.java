package defpackage;

import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ccr {
    public final UUID a;
    public final ccq b;
    public final Set c;
    public final caq d;
    private final caz e;
    private final caz f;
    private final int g;
    private final int h;
    private final long i;
    private final ccp j;
    private final long k;
    private final int l;

    public ccr(UUID uuid, ccq ccqVar, Set set, caz cazVar, caz cazVar2, int i, int i2, caq caqVar, long j, ccp ccpVar, long j2, int i3) {
        cazVar2.getClass();
        this.a = uuid;
        this.b = ccqVar;
        this.c = set;
        this.e = cazVar;
        this.f = cazVar2;
        this.g = i;
        this.h = i2;
        this.d = caqVar;
        this.i = j;
        this.j = ccpVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !agvy.c(getClass(), obj.getClass())) {
            return false;
        }
        ccr ccrVar = (ccr) obj;
        if (this.g == ccrVar.g && this.h == ccrVar.h && agvy.c(this.a, ccrVar.a) && this.b == ccrVar.b && agvy.c(this.e, ccrVar.e) && agvy.c(this.d, ccrVar.d) && this.i == ccrVar.i && agvy.c(this.j, ccrVar.j) && this.k == ccrVar.k && this.l == ccrVar.l && agvy.c(this.c, ccrVar.c)) {
            return agvy.c(this.f, ccrVar.f);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.e.hashCode()) * 31) + this.c.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g) * 31) + this.h) * 31) + this.d.hashCode();
        ccp ccpVar = this.j;
        int iHashCode2 = ccpVar != null ? ccpVar.hashCode() : 0;
        long j = this.i;
        int i = ((((iHashCode * 31) + ((int) (j ^ (j >>> 32)))) * 31) + iHashCode2) * 31;
        long j2 = this.k;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.a + "', state=" + this.b + ", outputData=" + this.e + ", tags=" + this.c + ", progress=" + this.f + ", runAttemptCount=" + this.g + ", generation=" + this.h + ", constraints=" + this.d + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
