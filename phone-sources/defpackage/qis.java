package defpackage;

import android.support.v7.widget.RecyclerView;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qis implements qip {
    public final String a;
    public final vll b;
    public final long c;
    public final long d;
    public final long e;
    public final String f;
    public final vsl g;
    public final long h;
    public final vsz i;
    public final String j;
    public final Set k;
    public final vld l;
    public final List m;
    public final String n;
    public final long o;
    public final long p;
    public final vnz q;
    public final List r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;

    public qis(String str, int i, vll vllVar, int i2, int i3, long j, long j2, long j3, String str2, vsl vslVar, long j4, int i4, vsz vszVar, String str3, Set set, vld vldVar, List list, String str4, long j5, long j6, vnz vnzVar, List list2) {
        str.getClass();
        if (i == 0) {
            throw null;
        }
        vllVar.getClass();
        if (i2 == 0 || i3 == 0 || i4 == 0) {
            throw null;
        }
        vszVar.getClass();
        set.getClass();
        vldVar.getClass();
        list.getClass();
        str4.getClass();
        list2.getClass();
        this.a = str;
        this.v = i;
        this.b = vllVar;
        this.s = i2;
        this.t = i3;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = str2;
        this.g = vslVar;
        this.h = j4;
        this.u = i4;
        this.i = vszVar;
        this.j = str3;
        this.k = set;
        this.l = vldVar;
        this.m = list;
        this.n = str4;
        this.o = j5;
        this.p = j6;
        this.q = vnzVar;
        this.r = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r17v0 */
    /* JADX WARN: Type inference failed for: r17v1, types: [vsl] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.Object, vsz] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r24v0 */
    /* JADX WARN: Type inference failed for: r24v1, types: [java.lang.Object, vld] */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r25v0 */
    /* JADX WARN: Type inference failed for: r25v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r26v0 */
    /* JADX WARN: Type inference failed for: r26v1, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r26v2 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [vnz] */
    /* JADX WARN: Type inference failed for: r31v2 */
    public static /* synthetic */ qis g(qis qisVar, int i, vll vllVar, int i2, int i3, List list, int i4) throws Throwable {
        Throwable th;
        long j;
        String str = (i4 & 1) != 0 ? qisVar.a : null;
        int i5 = (i4 & 2) != 0 ? qisVar.v : i;
        vll vllVar2 = (i4 & 4) != 0 ? qisVar.b : vllVar;
        int i6 = (i4 & 8) != 0 ? qisVar.s : i2;
        int i7 = (i4 & 16) != 0 ? qisVar.t : i3;
        long j2 = (i4 & 32) != 0 ? qisVar.c : 0L;
        long j3 = (i4 & 64) != 0 ? qisVar.d : 0L;
        if ((i4 & 128) != 0) {
            th = null;
            j = qisVar.e;
        } else {
            th = null;
            j = 0;
        }
        Throwable th2 = th;
        ?? r16 = (i4 & 256) != 0 ? qisVar.f : th2;
        ?? r17 = (i4 & 512) != 0 ? qisVar.g : th2;
        long j4 = (i4 & 1024) != 0 ? qisVar.h : 0L;
        int i8 = (i4 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? qisVar.u : 0;
        ?? r21 = (i4 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? qisVar.i : th2;
        ?? r22 = (i4 & 8192) != 0 ? qisVar.j : th2;
        ?? r23 = (i4 & 16384) != 0 ? qisVar.k : th2;
        ?? r24 = (32768 & i4) != 0 ? qisVar.l : th2;
        ?? r25 = (65536 & i4) != 0 ? qisVar.m : th2;
        ?? r26 = (131072 & i4) != 0 ? qisVar.n : th2;
        long j5 = (262144 & i4) != 0 ? qisVar.o : 0L;
        long j6 = (524288 & i4) != 0 ? qisVar.p : 0L;
        ?? r31 = (1048576 & i4) != 0 ? qisVar.q : th2;
        List list2 = (i4 & 2097152) != 0 ? qisVar.r : list;
        str.getClass();
        if (i5 == 0) {
            throw th2;
        }
        vllVar2.getClass();
        if (i6 == 0 || i7 == 0 || i8 == 0) {
            throw th2;
        }
        r21.getClass();
        r23.getClass();
        r24.getClass();
        r25.getClass();
        r26.getClass();
        list2.getClass();
        return new qis(str, i5, vllVar2, i6, i7, j2, j3, j, r16, r17, j4, i8, r21, r22, r23, r24, r25, r26, j5, j6, r31, list2);
    }

    @Override // defpackage.qip
    public final long a() {
        return this.e;
    }

    @Override // defpackage.qip
    public final long b() {
        return this.c;
    }

    @Override // defpackage.qip
    public final /* synthetic */ vko c() {
        return osk.X(this);
    }

    @Override // defpackage.qip
    public final vsz d() {
        return this.i;
    }

    @Override // defpackage.qip
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qis)) {
            return false;
        }
        qis qisVar = (qis) obj;
        return yks.e(this.a, qisVar.a) && this.v == qisVar.v && this.b == qisVar.b && this.s == qisVar.s && this.t == qisVar.t && this.c == qisVar.c && this.d == qisVar.d && this.e == qisVar.e && yks.e(this.f, qisVar.f) && yks.e(this.g, qisVar.g) && this.h == qisVar.h && this.u == qisVar.u && yks.e(this.i, qisVar.i) && yks.e(this.j, qisVar.j) && yks.e(this.k, qisVar.k) && yks.e(this.l, qisVar.l) && yks.e(this.m, qisVar.m) && yks.e(this.n, qisVar.n) && this.o == qisVar.o && this.p == qisVar.p && yks.e(this.q, qisVar.q) && yks.e(this.r, qisVar.r);
    }

    @Override // defpackage.qip
    public final String f() {
        return this.j;
    }

    public final int hashCode() {
        int iJ;
        int iJ2;
        int iHashCode = (((this.a.hashCode() * 31) + vmb.a(this.v)) * 31) + this.b.hashCode();
        int i = this.s;
        a.bw(i);
        int i2 = this.t;
        a.bw(i2);
        String str = this.f;
        int iJ3 = 0;
        int iK = ((((((((((((iHashCode * 31) + i) * 31) + i2) * 31) + a.k(this.c)) * 31) + a.k(this.d)) * 31) + a.k(this.e)) * 31) + (str == null ? 0 : str.hashCode())) * 31;
        vsl vslVar = this.g;
        if (vslVar == null) {
            iJ = 0;
        } else if (vslVar.A()) {
            iJ = vslVar.j();
        } else {
            int iJ4 = vslVar.M;
            if (iJ4 == 0) {
                iJ4 = vslVar.j();
                vslVar.M = iJ4;
            }
            iJ = iJ4;
        }
        int iK2 = (((iK + iJ) * 31) + a.k(this.h)) * 31;
        int i3 = this.u;
        a.bw(i3);
        int iHashCode2 = (((iK2 + i3) * 31) + this.i.hashCode()) * 31;
        String str2 = this.j;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.k.hashCode()) * 31;
        vld vldVar = this.l;
        if (vldVar.A()) {
            iJ2 = vldVar.j();
        } else {
            int iJ5 = vldVar.M;
            if (iJ5 == 0) {
                iJ5 = vldVar.j();
                vldVar.M = iJ5;
            }
            iJ2 = iJ5;
        }
        int iHashCode4 = (((((((((iHashCode3 + iJ2) * 31) + this.m.hashCode()) * 31) + this.n.hashCode()) * 31) + a.k(this.o)) * 31) + a.k(this.p)) * 31;
        vnz vnzVar = this.q;
        if (vnzVar != null) {
            if (vnzVar.A()) {
                iJ3 = vnzVar.j();
            } else {
                iJ3 = vnzVar.M;
                if (iJ3 == 0) {
                    iJ3 = vnzVar.j();
                    vnzVar.M = iJ3;
                }
            }
        }
        return ((iHashCode4 + iJ3) * 31) + this.r.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChimeSystemTrayThread(id=");
        sb.append(this.a);
        sb.append(", readState=");
        int i = this.v;
        sb.append((Object) (i != 0 ? vmb.toString$ar$edu(i) : "null"));
        sb.append(", deletionStatus=");
        sb.append(this.b);
        sb.append(", countBehavior=");
        sb.append((Object) ves.s(this.s));
        sb.append(", systemTrayBehavior=");
        sb.append((Object) vfi.M(this.t));
        sb.append(", lastUpdatedVersion=");
        sb.append(this.c);
        sb.append(", lastNotificationVersion=");
        sb.append(this.d);
        sb.append(", creationId=");
        sb.append(this.e);
        sb.append(", payloadType=");
        sb.append(this.f);
        sb.append(", payload=");
        sb.append(this.g);
        sb.append(", insertionTimeMs=");
        sb.append(this.h);
        sb.append(", storageMode=");
        sb.append((Object) ves.r(this.u));
        sb.append(", opaqueBackendData=");
        sb.append(this.i);
        sb.append(", updateThreadStateToken=");
        sb.append(this.j);
        sb.append(", externalExperimentIds=");
        sb.append(this.k);
        sb.append(", androidSdkMessage=");
        sb.append(this.l);
        sb.append(", notificationMetadataList=");
        sb.append(this.m);
        sb.append(", groupId=");
        sb.append(this.n);
        sb.append(", expirationTimestampUsec=");
        sb.append(this.o);
        sb.append(", expirationDurationAfterDisplayMs=");
        sb.append(this.p);
        sb.append(", schedule=");
        sb.append(this.q);
        sb.append(", actionList=");
        sb.append(this.r);
        sb.append(")");
        return sb.toString();
    }
}
