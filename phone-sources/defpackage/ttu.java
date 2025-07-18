package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ttu {
    private static final tsa d = tsa.j(" \t\n\r\f\u000b\u0085\u2028\u2029\u200d\uffef�\ufffe\uffff").c();
    private static final tsa e = new trv(new Ctry(new Ctry(new trr(0, 31), new trs(127)), tsa.j(" @,:<>"))).k();
    private static final tsa f = new trv(new Ctry(new Ctry(new trr(0, 31), new trs(127)), tsa.j(" @,:<>+%"))).k();
    public final String a;
    public final String b;
    public final boolean c;

    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f1 A[EDGE_INSN: B:77:0x00f1->B:78:0x00f2 BREAK  A[LOOP:0: B:49:0x00ad->B:65:0x00d2]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ttu(java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 245
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ttu.<init>(java.lang.String):void");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ttu) {
            ttu ttuVar = (ttu) obj;
            if (a.Q(this.a, ttuVar.a) && a.Q(this.b, ttuVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        return this.a + "@" + this.b;
    }
}
