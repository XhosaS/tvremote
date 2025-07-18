package defpackage;

import android.text.Layout;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cgh {
    public final cgi a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final int f;
    public final List g;
    public final List h;

    public cgh(cgi cgiVar, long j, int i, int i2) {
        boolean z;
        this.a = cgiVar;
        this.b = i;
        if (clv.d(j) != 0 || clv.c(j) != 0) {
            cko.a("Setting Constraints.minWidth and Constraints.minHeight is not supported, these should be the default zero values instead.");
        }
        ArrayList arrayList = new ArrayList();
        List list = cgiVar.d;
        int size = list.size();
        int i3 = 0;
        float f = 0.0f;
        int i4 = 0;
        while (i4 < size) {
            cgk cgkVar = (cgk) list.get(i4);
            cft cftVar = new cft((cku) cgkVar.a, this.b - i3, i2, clw.k(clv.b(j), clv.g(j) ? ykn.j(clv.a(j) - ccf.Q(f), 0) : clv.a(j), 5));
            float fB = cftVar.b() + f;
            int iG = i3 + cftVar.g();
            arrayList.add(new cgj(cftVar, cgkVar.b, cgkVar.c, i3, iG, f, fB));
            z = true;
            if (cftVar.j() || (iG == this.b && i4 != yfm.q(this.a.d))) {
                i3 = iG;
                f = fB;
                break;
            } else {
                i4++;
                i3 = iG;
                f = fB;
            }
        }
        z = false;
        this.e = f;
        this.f = i3;
        this.c = z;
        this.h = arrayList;
        this.d = clv.b(j);
        List arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i5 = 0; i5 < size2; i5++) {
            cgj cgjVar = (cgj) arrayList.get(i5);
            List list2 = cgjVar.g.d;
            ArrayList arrayList3 = new ArrayList(list2.size());
            int size3 = list2.size();
            for (int i6 = 0; i6 < size3; i6++) {
                bmy bmyVar = (bmy) list2.get(i6);
                arrayList3.add(bmyVar != null ? cgjVar.h(bmyVar) : null);
            }
            yfm.I(arrayList2, arrayList3);
        }
        if (arrayList2.size() < this.a.b.size()) {
            int size4 = this.a.b.size() - arrayList2.size();
            ArrayList arrayList4 = new ArrayList(size4);
            for (int i7 = 0; i7 < size4; i7++) {
                arrayList4.add(null);
            }
            arrayList2 = yfm.af(arrayList2, arrayList4);
        }
        this.g = arrayList2;
    }

    public static /* synthetic */ void l(cgh cghVar, bnp bnpVar, long j, bok bokVar, cll cllVar, brx brxVar) {
        bnpVar.g();
        List list = cghVar.h;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            cft cftVar = ((cgj) list.get(i)).g;
            cftVar.m(bnpVar, j, bokVar, cllVar, brxVar);
            bnpVar.i(0.0f, cftVar.b());
        }
        bnpVar.e();
    }

    public final float a(int i) {
        k(i);
        List list = this.h;
        cgj cgjVar = (cgj) list.get(ccf.S(list, i));
        cft cftVar = cgjVar.g;
        return cgjVar.a(cftVar.b.b(cgjVar.f(i)));
    }

    public final float b(int i) {
        k(i);
        List list = this.h;
        cgj cgjVar = (cgj) list.get(ccf.S(list, i));
        cft cftVar = cgjVar.g;
        return cgjVar.a(cftVar.b.d(cgjVar.f(i)));
    }

    public final int c(int i, boolean z) {
        int iJ;
        k(i);
        List list = this.h;
        cgj cgjVar = (cgj) list.get(ccf.S(list, i));
        cft cftVar = cgjVar.g;
        int iF = cgjVar.f(i);
        if (z) {
            cho choVar = cftVar.b;
            Layout layout = choVar.d;
            if (chp.c(layout, iF) && choVar.b == TextUtils.TruncateAt.END) {
                iJ = layout.getLineStart(iF) + layout.getEllipsisStart(iF);
            } else {
                chk chkVarO = choVar.o();
                Layout layout2 = chkVarO.a;
                iJ = chkVarO.d(layout2.getLineEnd(iF), layout2.getLineStart(iF));
            }
        } else {
            iJ = cftVar.b.j(iF);
        }
        return cgjVar.c(iJ);
    }

    public final int d(int i) {
        cgj cgjVar = (cgj) this.h.get(i >= h().a() ? yfm.q(this.h) : i < 0 ? 0 : ccf.R(this.h, i));
        return cgjVar.d(cgjVar.g.b.k(cgjVar.e(i)));
    }

    public final int e(float f) {
        List list = this.h;
        cgj cgjVar = (cgj) list.get(ccf.T(list, f));
        if (cgjVar.b() == 0) {
            return cgjVar.c;
        }
        return cgjVar.d(cgjVar.g.b.l((int) (f - cgjVar.e)));
    }

    public final int f(long j) {
        List list = this.h;
        cgj cgjVar = (cgj) list.get(ccf.T(list, Float.intBitsToFloat((int) (j & 4294967295L))));
        if (cgjVar.b() == 0) {
            return cgjVar.a;
        }
        cft cftVar = cgjVar.g;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        long jFloatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat(r3) - cgjVar.e) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (4294967295L & jFloatToRawIntBits));
        cho choVar = cftVar.b;
        int iL = choVar.l(iIntBitsToFloat);
        return cgjVar.c(choVar.d.getOffsetForHorizontal(iL, Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) + (-choVar.a(iL))));
    }

    public final long g(bmy bmyVar, int i, cgx cgxVar) {
        List list = this.h;
        int iT = ccf.T(list, bmyVar.c);
        float f = ((cgj) list.get(iT)).f;
        float f2 = bmyVar.e;
        if (f >= f2 || iT == yfm.q(list)) {
            cgj cgjVar = (cgj) list.get(iT);
            return cgjVar.g(cgjVar.g.h(cgjVar.i(bmyVar), i, cgxVar), true);
        }
        int iT2 = ccf.T(list, f2);
        long j = chb.a;
        long jG = j;
        while (a.s(jG, j) && iT <= iT2) {
            cgj cgjVar2 = (cgj) list.get(iT);
            jG = cgjVar2.g(cgjVar2.g.h(cgjVar2.i(bmyVar), i, cgxVar), true);
            iT++;
        }
        if (a.s(jG, j)) {
            return j;
        }
        long jG2 = j;
        while (a.s(jG2, j) && iT <= iT2) {
            cgj cgjVar3 = (cgj) list.get(iT2);
            jG2 = cgjVar3.g(cgjVar3.g.h(cgjVar3.i(bmyVar), i, cgxVar), true);
            iT2--;
        }
        return a.s(jG2, j) ? jG : ccf.N(chb.e(jG), chb.a(jG2));
    }

    public final cfy h() {
        return this.a.a;
    }

    public final void i(int i) {
        if (i < 0 || i >= h().b.length()) {
            cko.a("offset(" + i + ") is out of bounds [0, " + h().a() + ')');
        }
    }

    public final void j(int i) {
        if (i < 0 || i > h().b.length()) {
            cko.a("offset(" + i + ") is out of bounds [0, " + h().a() + ']');
        }
    }

    public final void k(int i) {
        if (i < 0 || i >= this.f) {
            cko.a("lineIndex(" + i + ") is out of bounds [0, " + this.f + ')');
        }
    }
}
