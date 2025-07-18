package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class pvi {
    public final Long a;
    public final Long b;
    public final vhm c;
    public Long d = 0L;
    public Long e = 0L;
    public Long f = 0L;
    public Long g = 0L;
    public Long h = 0L;

    public pvi(Long l, Long l2, vhm vhmVar) {
        this.a = l;
        this.b = l2;
        this.c = vhmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pvi)) {
            return false;
        }
        pvi pviVar = (pvi) obj;
        return a.Q(this.a, pviVar.a) && a.Q(this.b, pviVar.b) && a.Q(this.c, pviVar.c) && a.Q(this.d, pviVar.d) && a.Q(this.e, pviVar.e) && a.Q(this.f, pviVar.f) && a.Q(this.g, pviVar.g) && a.Q(this.h, pviVar.h);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h});
    }
}
