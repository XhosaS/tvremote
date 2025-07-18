package defpackage;

import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ptn {
    public final String a;
    public final List b;
    public final vsl c;
    public final List d;
    private final vll e;
    private final long f;
    private final long g;
    private final vld h;
    private final long i;
    private final String j;
    private final String k;
    private final String l;
    private final long m;
    private final long n;
    private final long o;
    private final vnz p;
    private final vsz q;
    private final Set r;
    private final int s;
    private final int t;
    private final int u;
    private final int v;

    public ptn(String str, int i, vll vllVar, int i2, int i3, long j, long j2, vld vldVar, List list, long j3, String str2, vsl vslVar, String str3, String str4, long j4, long j5, long j6, int i4, vnz vnzVar, List list2, vsz vszVar, Set set) {
        this.a = str;
        this.v = i;
        this.e = vllVar;
        this.s = i2;
        this.t = i3;
        this.f = j;
        this.g = j2;
        this.h = vldVar;
        this.b = list;
        this.i = j3;
        this.j = str2;
        this.c = vslVar;
        this.k = str3;
        this.l = str4;
        this.m = j4;
        this.n = j5;
        this.o = j6;
        this.u = i4;
        this.p = vnzVar;
        this.d = list2;
        this.q = vszVar;
        this.r = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ptn)) {
            return false;
        }
        ptn ptnVar = (ptn) obj;
        return yks.e(this.a, ptnVar.a) && this.v == ptnVar.v && this.e == ptnVar.e && this.s == ptnVar.s && this.t == ptnVar.t && this.f == ptnVar.f && this.g == ptnVar.g && yks.e(this.h, ptnVar.h) && yks.e(this.b, ptnVar.b) && this.i == ptnVar.i && yks.e(this.j, ptnVar.j) && yks.e(this.c, ptnVar.c) && yks.e(this.k, ptnVar.k) && yks.e(this.l, ptnVar.l) && this.m == ptnVar.m && this.n == ptnVar.n && this.o == ptnVar.o && this.u == ptnVar.u && yks.e(this.p, ptnVar.p) && yks.e(this.d, ptnVar.d) && yks.e(this.q, ptnVar.q) && yks.e(this.r, ptnVar.r);
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iHashCode = (((this.a.hashCode() * 31) + vmb.a(this.v)) * 31) + this.e.hashCode();
        int i = this.s;
        a.bw(i);
        int i2 = this.t;
        a.bw(i2);
        vld vldVar = this.h;
        if (vldVar.A()) {
            iJ = vldVar.j();
        } else {
            int iJ3 = vldVar.M;
            if (iJ3 == 0) {
                iJ3 = vldVar.j();
                vldVar.M = iJ3;
            }
            iJ = iJ3;
        }
        int iK = ((((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + a.k(this.f)) * 31) + a.k(this.g)) * 31) + iJ) * 31) + this.b.hashCode()) * 31) + a.k(this.i)) * 31;
        String str = this.j;
        int iJ4 = 0;
        int iHashCode2 = (iK + (str == null ? 0 : str.hashCode())) * 31;
        vsl vslVar = this.c;
        if (vslVar == null) {
            iJ2 = 0;
        } else if (vslVar.A()) {
            iJ2 = vslVar.j();
        } else {
            int iJ5 = vslVar.M;
            if (iJ5 == 0) {
                iJ5 = vslVar.j();
                vslVar.M = iJ5;
            }
            iJ2 = iJ5;
        }
        int i3 = (iHashCode2 + iJ2) * 31;
        String str2 = this.k;
        int iHashCode3 = (((((((((i3 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.l.hashCode()) * 31) + a.k(this.m)) * 31) + a.k(this.n)) * 31) + a.k(this.o)) * 31;
        int i4 = this.u;
        a.bw(i4);
        int i5 = (iHashCode3 + i4) * 31;
        vnz vnzVar = this.p;
        if (vnzVar != null) {
            if (vnzVar.A()) {
                iJ4 = vnzVar.j();
            } else {
                iJ4 = vnzVar.M;
                if (iJ4 == 0) {
                    iJ4 = vnzVar.j();
                    vnzVar.M = iJ4;
                }
            }
        }
        return ((((((i5 + iJ4) * 31) + this.d.hashCode()) * 31) + this.q.hashCode()) * 31) + this.r.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeThread(id=");
        sb.append(this.a);
        sb.append(", readState=");
        int i = this.v;
        sb.append((Object) (i != 0 ? vmb.toString$ar$edu(i) : "null"));
        sb.append(", deletionStatus=");
        sb.append(this.e);
        sb.append(", countBehavior=");
        sb.append((Object) ves.s(this.s));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) vfi.M(this.t));
        sb.append(", lastUpdatedVersion=");
        sb.append(this.f);
        sb.append(", lastNotificationVersion=");
        sb.append(this.g);
        sb.append(", androidSdkMessage=");
        sb.append(this.h);
        sb.append(", notificationMetadataList=");
        sb.append(this.b);
        sb.append(", creationId=");
        sb.append(this.i);
        sb.append(", payloadType=");
        sb.append(this.j);
        sb.append(", payload=");
        sb.append(this.c);
        sb.append(", updateThreadStateToken=");
        sb.append(this.k);
        sb.append(", groupId=");
        sb.append(this.l);
        sb.append(", expirationTimestampUsec=");
        sb.append(this.m);
        sb.append(", expirationDurationAfterDisplayMs=");
        sb.append(this.n);
        sb.append(", insertionTimeMs=");
        sb.append(this.o);
        sb.append(", storageMode=");
        sb.append((Object) ves.r(this.u));
        sb.append(", schedule=");
        sb.append(this.p);
        sb.append(", actionList=");
        sb.append(this.d);
        sb.append(", opaqueBackendData=");
        sb.append(this.q);
        sb.append(", externalExperimentIds=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
