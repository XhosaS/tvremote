package defpackage;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cay extends ykt implements yjv {
    final /* synthetic */ cbc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cay(cbc cbcVar) {
        super(1);
        this.a = cbcVar;
    }

    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        blz blzVar;
        KeyEvent keyEvent = ((brw) obj).a;
        long jB = brx.b(keyEvent);
        if (a.s(jB, brv.b)) {
            blzVar = new blz(2);
        } else if (a.s(jB, brv.c)) {
            blzVar = new blz(1);
        } else if (a.s(jB, brv.i)) {
            blzVar = new blz(true != keyEvent.isShiftPressed() ? 1 : 2);
        } else {
            blzVar = a.s(jB, brv.g) ? new blz(4) : a.s(jB, brv.f) ? new blz(3) : (a.s(jB, brv.d) || a.s(jB, brv.o)) ? new blz(5) : (a.s(jB, brv.e) || a.s(jB, brv.p)) ? new blz(6) : (a.s(jB, brv.h) || a.s(jB, brv.k) || a.s(jB, brv.q)) ? new blz(7) : (a.s(jB, brv.a) || a.s(jB, brv.l)) ? new blz(8) : null;
        }
        if (blzVar == null || !a.r(brx.a(keyEvent), 2)) {
            return false;
        }
        cbc cbcVar = this.a;
        int i = blzVar.a;
        Integer numW = d.W(i);
        bmy bmyVarA = cbcVar.a();
        brj brjVar = new brj(blzVar, 15);
        bmh bmhVar = cbcVar.K;
        Boolean boolC = bmhVar.c(i, bmyVarA, brjVar);
        if (boolC == null || boolC.booleanValue()) {
            return true;
        }
        if (!d.R(i)) {
            return false;
        }
        if (numW != null) {
            int iIntValue = numW.intValue();
            ccw ccwVar = ccy.a;
            ccy ccyVarQ = cbp.q();
            View viewA = cbcVar;
            loop0: while (true) {
                if (viewA == null) {
                    viewA = null;
                    break;
                }
                View rootView = cbcVar.getRootView();
                rootView.getClass();
                viewA = ccyVarQ.a((ViewGroup) rootView, viewA, iIntValue);
                if (viewA != null) {
                    if (!yks.e(viewA, cbcVar)) {
                        for (ViewParent parent = viewA.getParent(); parent != null; parent = parent.getParent()) {
                            if (parent == cbcVar) {
                                break;
                            }
                        }
                        break loop0;
                    }
                    break;
                }
            }
            if (true == yks.e(viewA, cbcVar)) {
                viewA = null;
            }
            if (viewA != null) {
                Rect rectM = bmyVarA != null ? bnj.m(bmyVarA) : null;
                if (rectM == null) {
                    throw new IllegalStateException("Invalid rect");
                }
                View rootView2 = cbcVar.getRootView();
                rootView2.getClass();
                ViewGroup viewGroup = (ViewGroup) rootView2;
                viewGroup.offsetDescendantRectToMyCoords(cbcVar, rectM);
                viewGroup.offsetRectIntoDescendantCoords(viewA, rectM);
                if (d.X(viewA, numW, rectM)) {
                    return true;
                }
            }
        }
        if (!bmhVar.i(false, false, i)) {
            return true;
        }
        Boolean boolC2 = bmhVar.c(i, null, new brj(blzVar, 14));
        return Boolean.valueOf(boolC2 != null ? boolC2.booleanValue() : true);
    }
}
