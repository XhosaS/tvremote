package defpackage;

import java.util.Set;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gpy {
    public final gpx a;
    private final UUID b;
    private final Set c;
    private final gox d;
    private final gox e;
    private final int f;
    private final int g;
    private final gou h;
    private final long i;
    private final gpw j;
    private final long k;
    private final int l;

    public gpy(UUID uuid, gpx gpxVar, Set set, gox goxVar, gox goxVar2, int i, int i2, gou gouVar, long j, gpw gpwVar, long j2, int i3) {
        goxVar2.getClass();
        this.b = uuid;
        this.a = gpxVar;
        this.c = set;
        this.d = goxVar;
        this.e = goxVar2;
        this.f = i;
        this.g = i2;
        this.h = gouVar;
        this.i = j;
        this.j = gpwVar;
        this.k = j2;
        this.l = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !yks.e(getClass(), obj.getClass())) {
            return false;
        }
        gpy gpyVar = (gpy) obj;
        if (this.f == gpyVar.f && this.g == gpyVar.g && yks.e(this.b, gpyVar.b) && this.a == gpyVar.a && yks.e(this.d, gpyVar.d) && yks.e(this.h, gpyVar.h) && this.i == gpyVar.i && yks.e(this.j, gpyVar.j) && this.k == gpyVar.k && this.l == gpyVar.l && yks.e(this.c, gpyVar.c)) {
            return yks.e(this.e, gpyVar.e);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((((((((((this.b.hashCode() * 31) + this.a.hashCode()) * 31) + this.d.hashCode()) * 31) + this.c.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f) * 31) + this.g) * 31) + this.h.hashCode();
        gpw gpwVar = this.j;
        return (((((((iHashCode * 31) + a.k(this.i)) * 31) + (gpwVar != null ? gpwVar.hashCode() : 0)) * 31) + a.k(this.k)) * 31) + this.l;
    }

    public final String toString() {
        return "WorkInfo{id='" + this.b + "', state=" + this.a + ", outputData=" + this.d + ", tags=" + this.c + ", progress=" + this.e + ", runAttemptCount=" + this.f + ", generation=" + this.g + ", constraints=" + this.h + ", initialDelayMillis=" + this.i + ", periodicityInfo=" + this.j + ", nextScheduleTimeMillis=" + this.k + "}, stopReason=" + this.l;
    }
}
