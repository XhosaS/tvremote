package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import java.util.HashMap;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cbq extends ykt implements yjv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cbq(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v22, types: [bxv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v26, types: [bxv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.lang.Object, yrz] */
    /* JADX WARN: Type inference failed for: r9v2, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v20, types: [java.lang.Object, yjk] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        int i = 0;
        switch (this.b) {
            case 0:
                this.a.b(new Configuration((Configuration) obj));
                return ygi.a;
            case 1:
                return Boolean.valueOf(cbp.E((cff) obj, (Resources) this.a));
            case 2:
                return new gd(this.a, 12);
            case 3:
                if (cdb.b.compareAndSet(false, true)) {
                    this.a.b(ygi.a);
                }
                return ygi.a;
            case 4:
                bpq bpqVar = (bpq) obj;
                bnp bnpVarB = bpqVar.p().b();
                yjz yjzVar = ((cdc) this.a).a;
                if (yjzVar != null) {
                    yjzVar.a(bnpVarB, bpqVar.p().a);
                }
                return ygi.a;
            case 5:
                cke ckeVar = (cke) obj;
                ckeVar.b();
                bmd bmdVar = (bmd) this.a;
                bfz bfzVar = (bfz) bmdVar.b;
                Object[] objArr = bfzVar.a;
                int i2 = bfzVar.b;
                while (true) {
                    if (i >= i2) {
                        i = -1;
                    } else if (!yks.e((cam) objArr[i], ckeVar)) {
                        i++;
                    }
                }
                if (i >= 0) {
                    bfzVar.d(i);
                }
                if (bfzVar.b == 0) {
                    bmdVar.e.a();
                }
                return ygi.a;
            case 6:
                if (((Throwable) obj) != null) {
                    ((CancellationSignal) this.a).cancel();
                }
                return ygi.a;
            case 7:
                cfk.k((cfc) obj, ((cez) this.a).a);
                return ygi.a;
            case 8:
                cfk.g((cfc) obj, (String) this.a);
                return ygi.a;
            case 9:
                ((List) obj).add(this.a.a());
                return true;
            case 10:
                ((bys) this.a).V((clx) obj);
                return ygi.a;
            case 11:
                bzz bzzVar = (bzz) obj;
                cbc cbcVar = bzzVar instanceof cbc ? (cbc) bzzVar : null;
                if (cbcVar != null) {
                    Object obj2 = this.a;
                    cbcVar.E().removeViewInLayout((View) obj2);
                    HashMap map = cbcVar.E().b;
                    Object objRemove = cbcVar.E().a.remove(obj2);
                    ylh.g(map);
                    map.remove(objRemove);
                    ((cmv) obj2).setImportantForAccessibility(0);
                }
                ((cmv) this.a).removeAllViewsInLayout();
                return ygi.a;
            case 12:
                blx blxVar = (blx) obj;
                ?? r0 = this.a;
                View viewA = cqv.A((bko) r0);
                if (!viewA.isFocused() && !viewA.hasFocus()) {
                    if (!d.X(viewA, d.W(blxVar.a), cqv.C(((cbc) fh.K(r0)).K, fh.E(r0), viewA))) {
                        blxVar.a();
                    }
                }
                return ygi.a;
            case 13:
                blx blxVar2 = (blx) obj;
                ?? r02 = this.a;
                View viewA2 = cqv.A((bko) r02);
                if (viewA2.hasFocus()) {
                    bmh bmhVar = ((cbc) fh.K(r02)).K;
                    View viewE = fh.E(r02);
                    if (viewA2 instanceof ViewGroup) {
                        Rect rectC = cqv.C(bmhVar, viewE, viewA2);
                        Integer numW = d.W(blxVar2.a);
                        int iIntValue = numW != null ? numW.intValue() : 130;
                        FocusFinder focusFinder = FocusFinder.getInstance();
                        View view = ((cnb) r02).a;
                        View viewFindNextFocus = view != null ? focusFinder.findNextFocus((ViewGroup) viewE, view, iIntValue) : focusFinder.findNextFocusFromRect((ViewGroup) viewE, rectC, iIntValue);
                        if (viewFindNextFocus != null && cqv.B(viewA2, viewFindNextFocus)) {
                            viewFindNextFocus.requestFocus(iIntValue, rectC);
                            blxVar2.a();
                        } else if (!viewE.requestFocus()) {
                            throw new IllegalStateException("host view did not take focus");
                        }
                    } else if (!viewE.requestFocus()) {
                        throw new IllegalStateException("host view did not take focus");
                    }
                }
                return ygi.a;
            case 14:
                return new gd(this.a, 13);
            case 15:
                bwi bwiVar = (bwi) obj;
                ?? r03 = this.a;
                int size = r03.size();
                for (int i3 = 0; i3 < size; i3++) {
                    bwi.y(bwiVar, (bwj) r03.get(i3), 0, 0);
                }
                return ygi.a;
            case 16:
                bvc bvcVarCt = ((bvc) obj).ct();
                bvcVarCt.getClass();
                cny cnyVar = (cny) this.a;
                cnyVar.g.b(bvcVarCt);
                cnyVar.l();
                return ygi.a;
            case 17:
                cmh cmhVar = new cmh(((cmh) obj).a);
                cny cnyVar2 = (cny) this.a;
                cnyVar2.f.b(cmhVar);
                cnyVar2.m();
                return ygi.a;
            case 18:
                bwi.y((bwi) obj, (bwj) this.a, 0, 0);
                return ygi.a;
            case 19:
                bwi bwiVar2 = (bwi) obj;
                ?? r04 = this.a;
                int iQ = yfm.q(r04);
                if (iQ >= 0) {
                    int i4 = 0;
                    while (true) {
                        bwi.y(bwiVar2, (bwj) r04.get(i4), 0, 0);
                        if (i4 != iQ) {
                            i4++;
                        }
                    }
                }
                return ygi.a;
            default:
                cnu cnuVar = (cnu) this.a;
                if (cnuVar.b.a) {
                    cnuVar.a.a();
                }
                return ygi.a;
        }
    }
}
