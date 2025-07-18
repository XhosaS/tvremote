package defpackage;

import java.util.List;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public class cuk {
    public final List a;
    public final cph b;
    public final String c;
    public final long d;
    public final long e;
    public final String f;
    public final List g;
    public final cti h;
    public final int i;
    public final int j;
    public final int k;
    public final float l;
    public final float m;
    public final float n;
    public final float o;
    public final ctg p;
    public final cth q;
    public final csy r;
    public final List s;
    public final boolean t;
    public final ctl u;
    public final cvf v;
    public final int w;
    public final int x;

    public cuk(List list, cph cphVar, String str, long j, int i, long j2, String str2, List list2, cti ctiVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, ctg ctgVar, cth cthVar, List list3, int i5, csy csyVar, boolean z, ctl ctlVar, cvf cvfVar) {
        this.a = list;
        this.b = cphVar;
        this.c = str;
        this.d = j;
        this.w = i;
        this.e = j2;
        this.f = str2;
        this.g = list2;
        this.h = ctiVar;
        this.i = i2;
        this.j = i3;
        this.k = i4;
        this.l = f;
        this.m = f2;
        this.n = f3;
        this.o = f4;
        this.p = ctgVar;
        this.q = cthVar;
        this.s = list3;
        this.x = i5;
        this.r = csyVar;
        this.t = z;
        this.u = ctlVar;
        this.v = cvfVar;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(this.c);
        sb.append("\n");
        cph cphVar = this.b;
        cuk cukVarB = cphVar.b(this.e);
        if (cukVarB != null) {
            sb.append("\t\tParents: ");
            sb.append(cukVarB.c);
            for (cuk cukVarB2 = cphVar.b(cukVarB.e); cukVarB2 != null; cukVarB2 = cphVar.b(cukVarB2.e)) {
                sb.append("->");
                sb.append(cukVarB2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.g;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.i;
        if (i2 != 0 && (i = this.j) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.k)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
