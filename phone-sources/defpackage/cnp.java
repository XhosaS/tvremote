package defpackage;

import android.view.View;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnp extends cxj {
    final /* synthetic */ cnr a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnp(cnr cnrVar) {
        super(1);
        this.a = cnrVar;
    }

    @Override // defpackage.cxj
    public final cyh a(cyh cyhVar, List list) {
        cnr cnrVar = this.a;
        if (cnrVar.c) {
            return cyhVar;
        }
        int i = 0;
        View childAt = cnrVar.getChildAt(0);
        int iMax = Math.max(0, childAt.getLeft());
        int iMax2 = Math.max(0, childAt.getTop());
        int iMax3 = Math.max(0, cnrVar.getWidth() - childAt.getRight());
        int iMax4 = Math.max(0, cnrVar.getHeight() - childAt.getBottom());
        if (iMax != 0) {
            i = iMax;
        } else if (iMax2 == 0) {
            if (iMax3 != 0) {
                iMax2 = 0;
            } else {
                if (iMax4 == 0) {
                    return cyhVar;
                }
                iMax2 = 0;
                iMax3 = 0;
            }
        }
        return cyhVar.n(i, iMax2, iMax3, iMax4);
    }

    @Override // defpackage.cxj
    public final cxi b(nxb nxbVar, cxi cxiVar) {
        cnr cnrVar = this.a;
        if (!cnrVar.c) {
            int i = 0;
            View childAt = cnrVar.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, cnrVar.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, cnrVar.getHeight() - childAt.getBottom());
            if (iMax != 0) {
                i = iMax;
            } else if (iMax2 == 0) {
                if (iMax3 != 0) {
                    iMax2 = 0;
                } else if (iMax4 != 0) {
                    iMax2 = 0;
                    iMax3 = 0;
                }
            }
            csr csrVar = cxiVar.a;
            csr csrVarE = csr.e(i, iMax2, iMax3, iMax4);
            int i2 = csrVarE.b;
            int i3 = csrVarE.c;
            int i4 = csrVarE.d;
            int i5 = csrVarE.e;
            return new cxi(cyh.i(csrVar, i2, i3, i4, i5), cyh.i(cxiVar.b, i2, i3, i4, i5));
        }
        return cxiVar;
    }
}
