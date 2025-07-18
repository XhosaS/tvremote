package defpackage;

import android.net.Uri;
import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class fxb {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final fys b;
    public fxd c;
    public final kp d;

    static {
        new LinkedHashMap();
    }

    public fxb(fxo fxoVar) {
        Map map = fxp.a;
        this.a = fus.K(fxoVar.getClass());
        this.b = new fys(this);
        this.d = new kp(null);
    }

    private final List h() {
        return this.b.b;
    }

    public boolean a() {
        return true;
    }

    public final int b() {
        return this.b.d;
    }

    public final Bundle c(Bundle bundle) {
        fys fysVar = this.b;
        if (bundle == null && fysVar.c.isEmpty()) {
            return null;
        }
        Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
        Map map = fysVar.c;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            str.getClass();
        }
        if (bundle != null) {
            bundleJ.putAll(bundle);
            for (Map.Entry entry2 : map.entrySet()) {
                String str2 = (String) entry2.getKey();
                fwq fwqVar = (fwq) entry2.getValue();
                str2.getClass();
                if (!ggz.f(bundleJ, str2) || !ggz.g(bundleJ, str2)) {
                    try {
                        fwqVar.a.f(bundleJ, str2);
                    } catch (IllegalStateException unused) {
                    }
                }
                throw new IllegalArgumentException("Wrong argument type for '" + str2 + "' in argument savedState. " + fwqVar.a.c() + " expected.");
            }
        }
        return bundleJ;
    }

    public fxa d(fwz fwzVar) {
        boolean zC;
        boolean z;
        ynj ynjVarE;
        aafi aafiVarF;
        fys fysVar = this.b;
        List<fwy> list = fysVar.b;
        if (list.isEmpty()) {
            return null;
        }
        fxa fxaVar = null;
        for (fwy fwyVar : list) {
            Uri uri = fwzVar.a;
            if (fwyVar.e() == null) {
                zC = true;
            } else if (uri == null) {
                zC = false;
            } else {
                ynj ynjVarE2 = fwyVar.e();
                ynjVarE2.getClass();
                zC = ynjVarE2.c(uri.toString());
            }
            if (zC) {
                Bundle bundleB = uri != null ? fwyVar.b(uri, fysVar.c) : null;
                int iA = fwyVar.a(uri);
                String str = fwzVar.b;
                boolean z2 = str != null && yks.e(str, null);
                if (bundleB != null) {
                    z = z2;
                } else if (z2) {
                    Map map = fysVar.c;
                    Bundle bundleJ = cmq.j((yfw[]) Arrays.copyOf(new yfw[0], 0));
                    if (uri != null && (ynjVarE = fwyVar.e()) != null && (aafiVarF = ynjVarE.f(uri.toString())) != null) {
                        fwyVar.j(aafiVarF, bundleJ, map);
                        if (fwyVar.g()) {
                            fwyVar.f(uri, bundleJ, map);
                        }
                    }
                    if (fus.c(map, new fyq(bundleJ, 5)).isEmpty()) {
                        z = true;
                    }
                }
                fxa fxaVar2 = new fxa(fysVar.a, bundleB, fwyVar.g, iA, z);
                if (fxaVar == null || fxaVar2.compareTo(fxaVar) > 0) {
                    fxaVar = fxaVar2;
                }
            }
        }
        return fxaVar;
    }

    public final fxa e(String str) {
        fwy fwyVar;
        Uri uriM;
        Bundle bundleB;
        fys fysVar = this.b;
        yft yftVar = fysVar.f;
        if (yftVar == null || (fwyVar = (fwy) yftVar.a()) == null || (bundleB = fwyVar.b((uriM = fus.M(fus.g(str))), fysVar.c)) == null) {
            return null;
        }
        return new fxa(fysVar.a, bundleB, fwyVar.g, fwyVar.a(uriM), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2 A[EDGE_INSN: B:31:0x00b2->B:32:0x00b3 BREAK  A[LOOP:1: B:23:0x007f->B:47:?]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            r1 = 0
            if (r9 == 0) goto Ld2
            boolean r2 = r9 instanceof defpackage.fxb
            if (r2 != 0) goto Ld
            goto Ld2
        Ld:
            java.util.List r2 = r8.h()
            fxb r9 = (defpackage.fxb) r9
            java.util.List r3 = r9.h()
            boolean r2 = defpackage.yks.e(r2, r3)
            kp r3 = r8.d
            kp r4 = r9.d
            int r5 = r3.c()
            int r4 = r4.c()
            if (r5 != r4) goto L5c
            r3.getClass()
            kr r4 = new kr
            r4.<init>(r3)
            ymw r4 = defpackage.ykr.f(r4)
            java.util.Iterator r4 = r4.a()
        L39:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r4.next()
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            java.lang.Object r6 = defpackage.kq.a(r3, r5)
            kp r7 = r9.d
            java.lang.Object r5 = defpackage.kq.a(r7, r5)
            boolean r5 = defpackage.yks.e(r6, r5)
            if (r5 != 0) goto L39
            goto L5c
        L5a:
            r3 = r0
            goto L5d
        L5c:
            r3 = r1
        L5d:
            java.util.Map r4 = r8.g()
            int r4 = r4.size()
            java.util.Map r5 = r9.g()
            int r5 = r5.size()
            if (r4 != r5) goto Lb2
            java.util.Map r4 = r8.g()
            java.util.Set r4 = r4.entrySet()
            ymw r4 = defpackage.yfm.ar(r4)
            java.util.Iterator r4 = r4.a()
        L7f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Lb0
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.util.Map r6 = r9.g()
            java.lang.Object r7 = r5.getKey()
            boolean r6 = r6.containsKey(r7)
            if (r6 == 0) goto Lb2
            java.util.Map r6 = r9.g()
            java.lang.Object r7 = r5.getKey()
            java.lang.Object r6 = r6.get(r7)
            java.lang.Object r5 = r5.getValue()
            boolean r5 = defpackage.yks.e(r6, r5)
            if (r5 != 0) goto L7f
            goto Lb2
        Lb0:
            r4 = r0
            goto Lb3
        Lb2:
            r4 = r1
        Lb3:
            int r5 = r8.b()
            int r6 = r9.b()
            if (r5 != r6) goto Ld2
            java.lang.String r5 = r8.f()
            java.lang.String r9 = r9.f()
            boolean r9 = defpackage.yks.e(r5, r9)
            if (r9 == 0) goto Ld2
            if (r2 == 0) goto Ld2
            if (r3 == 0) goto Ld2
            if (r4 == 0) goto Ld2
            return r0
        Ld2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fxb.equals(java.lang.Object):boolean");
    }

    public final String f() {
        return this.b.e;
    }

    public final Map g() {
        return yfm.l(this.b.c);
    }

    public int hashCode() {
        int iB = b() * 31;
        String strF = f();
        int iHashCode = iB + (strF != null ? strF.hashCode() : 0);
        Iterator it = h().iterator();
        while (it.hasNext()) {
            iHashCode = ((iHashCode * 31) + ((fwy) it.next()).c.hashCode()) * 961;
        }
        Iterator itD = hw.d(this.d);
        if (itD.hasNext()) {
            throw null;
        }
        for (String str : g().keySet()) {
            int iHashCode2 = ((iHashCode * 31) + str.hashCode()) * 31;
            Object obj = g().get(str);
            iHashCode = iHashCode2 + (obj != null ? obj.hashCode() : 0);
        }
        return iHashCode;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(0x");
        sb.append(Integer.toHexString(b()));
        sb.append(")");
        String strF = f();
        if (strF != null && !ylh.L(strF)) {
            sb.append(" route=");
            sb.append(f());
        }
        return sb.toString();
    }
}
