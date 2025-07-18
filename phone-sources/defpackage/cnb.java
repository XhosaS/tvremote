package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cnb extends bko implements ViewTreeObserver.OnGlobalFocusChangeListener, bmk {
    public View a;
    private ViewTreeObserver b;
    private final yjv c = new cbq(this, 12);
    private final yjv d = new cbq(this, 13);

    private final bmr b() {
        if (!this.q.A) {
            bty.c("visitLocalDescendants called on an unattached node");
        }
        bko bkoVar = this.q;
        if ((bkoVar.s & 1024) != 0) {
            boolean z = false;
            for (bko bkoVar2 = bkoVar.u; bkoVar2 != null; bkoVar2 = bkoVar2.u) {
                if ((bkoVar2.r & 1024) != 0) {
                    bko bkoVarF = bkoVar2;
                    bfz bfzVar = null;
                    while (bkoVarF != null) {
                        if (bkoVarF instanceof bmr) {
                            bmr bmrVar = (bmr) bkoVarF;
                            if (z) {
                                return bmrVar;
                            }
                            z = true;
                        } else if ((bkoVarF.r & 1024) != 0 && (bkoVarF instanceof bxw)) {
                            int i = 0;
                            for (bko bkoVar3 = ((bxw) bkoVarF).C; bkoVar3 != null; bkoVar3 = bkoVar3.u) {
                                if ((bkoVar3.r & 1024) != 0) {
                                    i++;
                                    if (i == 1) {
                                        bkoVarF = bkoVar3;
                                    } else {
                                        if (bfzVar == null) {
                                            bfzVar = new bfz(new bko[16], 0);
                                        }
                                        if (bkoVarF != null) {
                                            bfzVar.o(bkoVarF);
                                        }
                                        bfzVar.o(bkoVar3);
                                        bkoVarF = null;
                                    }
                                }
                            }
                            if (i != 1) {
                            }
                        }
                        bkoVarF = fh.F(bfzVar);
                    }
                }
            }
        }
        throw new IllegalStateException("Could not find focus target of embedded view wrapper");
    }

    @Override // defpackage.bko
    public final void cd() {
        ViewTreeObserver viewTreeObserver = fh.E(this).getViewTreeObserver();
        this.b = viewTreeObserver;
        viewTreeObserver.addOnGlobalFocusChangeListener(this);
    }

    @Override // defpackage.bko
    public final void ch() {
        ViewTreeObserver viewTreeObserver = this.b;
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnGlobalFocusChangeListener(this);
        }
        this.b = null;
        fh.E(this).getViewTreeObserver().removeOnGlobalFocusChangeListener(this);
        this.a = null;
    }

    @Override // defpackage.bmk
    public final void l(bmi bmiVar) {
        bmiVar.a(false);
        bmiVar.b(this.c);
        bmiVar.c(this.d);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalFocusChangeListener
    public final void onGlobalFocusChanged(View view, View view2) {
        if (fh.I(this).i == null) {
            return;
        }
        View viewA = cqv.A(this);
        bmh bmhVar = ((cbc) fh.K(this)).K;
        bzz bzzVarK = fh.K(this);
        boolean z = (view == null || yks.e(view, bzzVarK) || !cqv.B(viewA, view)) ? false : true;
        boolean z2 = (view2 == null || yks.e(view2, bzzVarK) || !cqv.B(viewA, view2)) ? false : true;
        if (z && z2) {
            this.a = view2;
            return;
        }
        if (z2) {
            this.a = view2;
            bmr bmrVarB = b();
            if (bmrVarB.e().a()) {
                return;
            }
            d.K(bmrVarB);
            return;
        }
        if (!z) {
            this.a = null;
            return;
        }
        this.a = null;
        if (b().e().b()) {
            bmhVar.i(false, false, 8);
        }
    }
}
