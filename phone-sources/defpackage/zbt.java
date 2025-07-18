package defpackage;

import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zbt {
    public static final zbt a;
    public static final zbt b;
    private static final zbr[] g;
    private static final zbr[] h;
    public final boolean c;
    public final boolean d;
    public final String[] e;
    public final String[] f;

    static {
        zbr zbrVar = zbr.p;
        zbr zbrVar2 = zbr.q;
        zbr zbrVar3 = zbr.r;
        zbr zbrVar4 = zbr.j;
        zbr zbrVar5 = zbr.l;
        zbr zbrVar6 = zbr.k;
        zbr zbrVar7 = zbr.m;
        zbr zbrVar8 = zbr.o;
        zbr zbrVar9 = zbr.n;
        zbr[] zbrVarArr = {zbrVar, zbrVar2, zbrVar3, zbrVar4, zbrVar5, zbrVar6, zbrVar7, zbrVar8, zbrVar9};
        g = zbrVarArr;
        zbr[] zbrVarArr2 = {zbrVar, zbrVar2, zbrVar3, zbrVar4, zbrVar5, zbrVar6, zbrVar7, zbrVar8, zbrVar9, zbr.h, zbr.i, zbr.f, zbr.g, zbr.d, zbr.e, zbr.c};
        h = zbrVarArr2;
        zbs zbsVar = new zbs(true);
        zbsVar.e((zbr[]) Arrays.copyOf(zbrVarArr, 9));
        zbsVar.f(zcp.a, zcp.b);
        zbsVar.c();
        zbsVar.a();
        zbs zbsVar2 = new zbs(true);
        zbsVar2.e((zbr[]) Arrays.copyOf(zbrVarArr2, 16));
        zbsVar2.f(zcp.a, zcp.b);
        zbsVar2.c();
        a = zbsVar2.a();
        zbs zbsVar3 = new zbs(true);
        zbsVar3.e((zbr[]) Arrays.copyOf(zbrVarArr2, 16));
        zbsVar3.f(zcp.a, zcp.b, zcp.c, zcp.d);
        zbsVar3.c();
        zbsVar3.a();
        b = new zbs(false).a();
    }

    public zbt(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.c = z;
        this.d = z2;
        this.e = strArr;
        this.f = strArr2;
    }

    public final List a() {
        String[] strArr = this.e;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(zbr.t.W(str));
        }
        return yfm.al(arrayList);
    }

    public final List b() {
        String[] strArr = this.f;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            zcp zcpVar = zcp.a;
            arrayList.add(wbb.L(str));
        }
        return yfm.al(arrayList);
    }

    public final boolean c(SSLSocket sSLSocket) {
        if (!this.c) {
            return false;
        }
        String[] strArr = this.f;
        if (strArr != null && !zcr.s(strArr, sSLSocket.getEnabledProtocols(), yic.b)) {
            return false;
        }
        String[] strArr2 = this.e;
        return strArr2 == null || zcr.s(strArr2, sSLSocket.getEnabledCipherSuites(), zbr.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zbt)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        boolean z = this.c;
        zbt zbtVar = (zbt) obj;
        if (z != zbtVar.c) {
            return false;
        }
        return !z || (Arrays.equals(this.e, zbtVar.e) && Arrays.equals(this.f, zbtVar.f) && this.d == zbtVar.d);
    }

    public final int hashCode() {
        if (!this.c) {
            return 17;
        }
        String[] strArr = this.e;
        int iHashCode = strArr != null ? Arrays.hashCode(strArr) : 0;
        String[] strArr2 = this.f;
        return ((((iHashCode + 527) * 31) + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.d ? 1 : 0);
    }

    public final String toString() {
        if (!this.c) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(a(), "[all enabled]") + ", tlsVersions=" + Objects.toString(b(), "[all enabled]") + ", supportsTlsExtensions=" + this.d + ")";
    }
}
