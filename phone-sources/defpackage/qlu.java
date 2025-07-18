package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qlu {
    public final int a;
    public final String b;
    public final vll c;
    public final long d;
    public final long e;
    public final long f;
    public final String g;
    public final vsl h;
    public final long i;
    public final vsz j;
    public final qlv k;
    public final vsz l;
    public final String m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;

    public qlu(int i, String str, int i2, vll vllVar, int i3, int i4, long j, long j2, long j3, String str2, vsl vslVar, long j4, int i5, vsz vszVar, qlv qlvVar, vsz vszVar2, String str3) {
        if (i2 == 0) {
            throw null;
        }
        vllVar.getClass();
        qlvVar.getClass();
        this.a = i;
        this.b = str;
        this.q = i2;
        this.c = vllVar;
        this.n = i3;
        this.o = i4;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = str2;
        this.h = vslVar;
        this.i = j4;
        this.p = i5;
        this.j = vszVar;
        this.k = qlvVar;
        this.l = vszVar2;
        this.m = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qlu)) {
            return false;
        }
        qlu qluVar = (qlu) obj;
        return this.a == qluVar.a && yks.e(this.b, qluVar.b) && this.q == qluVar.q && this.c == qluVar.c && this.n == qluVar.n && this.o == qluVar.o && this.d == qluVar.d && this.e == qluVar.e && this.f == qluVar.f && yks.e(this.g, qluVar.g) && yks.e(this.h, qluVar.h) && this.i == qluVar.i && this.p == qluVar.p && yks.e(this.j, qluVar.j) && this.k == qluVar.k && yks.e(this.l, qluVar.l) && yks.e(this.m, qluVar.m);
    }

    public final int hashCode() {
        int iHashCode = (((((this.a * 31) + this.b.hashCode()) * 31) + vmb.a(this.q)) * 31) + this.c.hashCode();
        int i = this.n;
        a.bw(i);
        int i2 = this.o;
        a.bw(i2);
        String str = this.g;
        int iJ = 0;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iK = ((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + a.k(this.d)) * 31) + a.k(this.e)) * 31) + a.k(this.f)) * 31) + iHashCode2) * 31;
        vsl vslVar = this.h;
        if (vslVar != null) {
            if (vslVar.A()) {
                iJ = vslVar.j();
            } else {
                iJ = vslVar.M;
                if (iJ == 0) {
                    iJ = vslVar.j();
                    vslVar.M = iJ;
                }
            }
        }
        int iK2 = (((iK + iJ) * 31) + a.k(this.i)) * 31;
        int i3 = this.p;
        a.bw(i3);
        return ((((((((iK2 + i3) * 31) + this.j.hashCode()) * 31) + this.k.hashCode()) * 31) + this.l.hashCode()) * 31) + this.m.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeThreadEntity(databaseId=");
        sb.append(this.a);
        sb.append(", threadId=");
        sb.append(this.b);
        sb.append(", readState=");
        int i = this.q;
        sb.append((Object) (i != 0 ? vmb.toString$ar$edu(i) : "null"));
        sb.append(", deletionStatus=");
        sb.append(this.c);
        sb.append(", countBehavior=");
        sb.append((Object) ves.s(this.n));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) vfi.M(this.o));
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
        sb.append((Object) ves.r(this.p));
        sb.append(", opaqueBackendData=");
        sb.append(this.j);
        sb.append(", threadType=");
        sb.append(this.k);
        sb.append(", typeSpecificData=");
        sb.append(this.l);
        sb.append(", externalExperimentIds=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }
}
