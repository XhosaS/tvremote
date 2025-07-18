package defpackage;

import com.google.common.collect.ImmutableSet;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qen {
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final int f;
    public final String g;
    public final ImmutableSet h;
    public final String i;
    public final long j;
    public final long k;
    public final int l;
    public final long m;
    public final String n;
    public final long o;
    public final int p;

    public qen() {
        throw null;
    }

    public static qem a() {
        qem qemVar = new qem();
        qemVar.f(0L);
        qemVar.i(0);
        qemVar.e = ImmutableSet.of();
        qemVar.j(0L);
        qemVar.h(0L);
        qemVar.g(0);
        qemVar.d(0L);
        qemVar.e(0L);
        return qemVar;
    }

    public static qen d(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, ImmutableSet immutableSet, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        qem qemVarA = a();
        qemVarA.f(j);
        qemVarA.c(str);
        qemVarA.k(i);
        qemVarA.a = str2;
        qemVarA.b = str3;
        qemVarA.c = str4;
        qemVarA.i(i2);
        qemVarA.d = str5;
        qemVarA.e = immutableSet;
        qemVarA.f = str6;
        qemVarA.j(j2);
        qemVarA.h(j3);
        qemVarA.g(i3);
        qemVarA.d(j4);
        qemVarA.g = str7;
        qemVarA.e(j5);
        return qemVarA.a();
    }

    public final qpv b() {
        int i = this.p;
        if (i != 0) {
            return i != 1 ? i != 2 ? i != 3 ? i != 4 ? new qpx(this.b, this.o) : new qpw(this.b) : qql.a : qqn.a : new qpz(this.b);
        }
        throw null;
    }

    public final boolean c() {
        return b().b();
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        ImmutableSet immutableSet;
        String str5;
        String str6;
        if (obj == this) {
            return true;
        }
        if (obj instanceof qen) {
            qen qenVar = (qen) obj;
            if (this.a == qenVar.a && this.b.equals(qenVar.b)) {
                int i = this.p;
                int i2 = qenVar.p;
                if (i == 0) {
                    throw null;
                }
                if (i == i2 && ((str = this.c) != null ? str.equals(qenVar.c) : qenVar.c == null) && ((str2 = this.d) != null ? str2.equals(qenVar.d) : qenVar.d == null) && ((str3 = this.e) != null ? str3.equals(qenVar.e) : qenVar.e == null) && this.f == qenVar.f && ((str4 = this.g) != null ? str4.equals(qenVar.g) : qenVar.g == null) && ((immutableSet = this.h) != null ? immutableSet.equals(qenVar.h) : qenVar.h == null) && ((str5 = this.i) != null ? str5.equals(qenVar.i) : qenVar.i == null) && this.j == qenVar.j && this.k == qenVar.k && this.l == qenVar.l && this.m == qenVar.m && ((str6 = this.n) != null ? str6.equals(qenVar.n) : qenVar.n == null) && this.o == qenVar.o) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        int iHashCode = ((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ a.bn(this.p);
        String str = this.c;
        int iHashCode2 = ((iHashCode * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int iHashCode3 = (iHashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.e;
        int iHashCode4 = (((iHashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f) * 1000003;
        String str4 = this.g;
        int iHashCode5 = (iHashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        ImmutableSet immutableSet = this.h;
        int iHashCode6 = (iHashCode5 ^ (immutableSet == null ? 0 : immutableSet.hashCode())) * 1000003;
        String str5 = this.i;
        int iHashCode7 = str5 == null ? 0 : str5.hashCode();
        long j2 = this.j;
        int i = (((iHashCode6 ^ iHashCode7) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003;
        long j3 = this.k;
        int i2 = (((i ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ this.l) * 1000003;
        long j4 = this.m;
        int i3 = (i2 ^ ((int) (j4 ^ (j4 >>> 32)))) * 1000003;
        String str6 = this.n;
        int iHashCode8 = str6 != null ? str6.hashCode() : 0;
        long j5 = this.o;
        return ((i3 ^ iHashCode8) * 1000003) ^ ((int) ((j5 >>> 32) ^ j5));
    }

    public final String toString() {
        tss tssVarH = sij.H(this);
        tssVarH.b("SpecificId", qtl.M(this.b));
        return tssVarH.toString();
    }

    public qen(long j, String str, int i, String str2, String str3, String str4, int i2, String str5, ImmutableSet immutableSet, String str6, long j2, long j3, int i3, long j4, String str7, long j5) {
        this.a = j;
        this.b = str;
        this.p = i;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = i2;
        this.g = str5;
        this.h = immutableSet;
        this.i = str6;
        this.j = j2;
        this.k = j3;
        this.l = i3;
        this.m = j4;
        this.n = str7;
        this.o = j5;
    }
}
