package defpackage;

import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qiq implements qip {
    public final vlt a;
    private final String b;
    private final vll c;
    private final long d;
    private final long e;
    private final long f;
    private final String g;
    private final vsl h;
    private final long i;
    private final vsz j;
    private final Set k;
    private final int l;
    private final int m;
    private final int n;
    private final int o;

    public qiq(String str, int i, vll vllVar, int i2, int i3, long j, long j2, long j3, String str2, vsl vslVar, long j4, int i4, vsz vszVar, Set set, vlt vltVar) {
        this.b = str;
        this.o = i;
        this.c = vllVar;
        this.l = i2;
        this.m = i3;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str2;
        this.h = vslVar;
        this.i = j4;
        this.n = i4;
        this.j = vszVar;
        this.k = set;
        this.a = vltVar;
    }

    @Override // defpackage.qip
    public final long a() {
        return this.f;
    }

    @Override // defpackage.qip
    public final long b() {
        return this.d;
    }

    @Override // defpackage.qip
    public final /* synthetic */ vko c() {
        return osk.X(this);
    }

    @Override // defpackage.qip
    public final vsz d() {
        return this.j;
    }

    @Override // defpackage.qip
    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qiq)) {
            return false;
        }
        qiq qiqVar = (qiq) obj;
        return yks.e(this.b, qiqVar.b) && this.o == qiqVar.o && this.c == qiqVar.c && this.l == qiqVar.l && this.m == qiqVar.m && this.d == qiqVar.d && this.e == qiqVar.e && this.f == qiqVar.f && yks.e(this.g, qiqVar.g) && yks.e(this.h, qiqVar.h) && this.i == qiqVar.i && this.n == qiqVar.n && yks.e(this.j, qiqVar.j) && yks.e(this.k, qiqVar.k) && yks.e(this.a, qiqVar.a);
    }

    @Override // defpackage.qip
    public final String f() {
        return null;
    }

    public final int hashCode() {
        int iJ;
        int iHashCode = (((this.b.hashCode() * 31) + vmb.a(this.o)) * 31) + this.c.hashCode();
        int i = this.l;
        a.bw(i);
        int i2 = this.m;
        a.bw(i2);
        String str = this.g;
        int iJ2 = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iK = ((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + a.k(this.d)) * 31) + a.k(this.e)) * 31) + a.k(this.f)) * 31) + iHashCode2) * 31;
        vsl vslVar = this.h;
        if (vslVar != null) {
            if (vslVar.A()) {
                iJ2 = vslVar.j();
            } else {
                iJ2 = vslVar.M;
                if (iJ2 == 0) {
                    iJ2 = vslVar.j();
                    vslVar.M = iJ2;
                }
            }
        }
        int iK2 = (((iK + iJ2) * 31) + a.k(this.i)) * 31;
        int i3 = this.n;
        a.bw(i3);
        int iHashCode3 = (((((iK2 + i3) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31;
        vlt vltVar = this.a;
        if (vltVar.A()) {
            iJ = vltVar.j();
        } else {
            int iJ3 = vltVar.M;
            if (iJ3 == 0) {
                iJ3 = vltVar.j();
                vltVar.M = iJ3;
            }
            iJ = iJ3;
        }
        return iHashCode3 + iJ;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeInboxThread(id=");
        sb.append(this.b);
        sb.append(", readState=");
        int i = this.o;
        sb.append((Object) (i != 0 ? vmb.toString$ar$edu(i) : "null"));
        sb.append(", deletionStatus=");
        sb.append(this.c);
        sb.append(", countBehavior=");
        sb.append((Object) ves.s(this.l));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) vfi.M(this.m));
        sb.append(", lastUpdatedVersion=");
        sb.append(this.d);
        sb.append(", lastNotificationVersion=");
        sb.append(this.e);
        sb.append(", creationId=");
        sb.append(this.f);
        sb.append(", payloadType=");
        sb.append(this.g);
        sb.append(", payload=");
        sb.append(this.h);
        sb.append(", insertionTimeMs=");
        sb.append(this.i);
        sb.append(", storageMode=");
        sb.append((Object) ves.r(this.n));
        sb.append(", opaqueBackendData=");
        sb.append(this.j);
        sb.append(", externalExperimentIds=");
        sb.append(this.k);
        sb.append(", inboxMessage=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
