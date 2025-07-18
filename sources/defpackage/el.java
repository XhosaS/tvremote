package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class el implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public el(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.b;
        if (i == 0) {
            em emVar = (em) this.a;
            if (emVar.u()) {
                ic icVar = emVar.a;
                if (icVar.p) {
                    return;
                }
                View view = emVar.c;
                if (view == null || !view.isShown()) {
                    emVar.k();
                    return;
                } else {
                    icVar.s();
                    return;
                }
            }
            return;
        }
        if (i == 1) {
            ViewOnKeyListenerC0000do viewOnKeyListenerC0000do = (ViewOnKeyListenerC0000do) this.a;
            if (viewOnKeyListenerC0000do.u()) {
                List list = viewOnKeyListenerC0000do.b;
                if (list.size() <= 0 || ((hz) ((bda) list.get(0)).b).p) {
                    return;
                }
                View view2 = viewOnKeyListenerC0000do.d;
                if (view2 == null || !view2.isShown()) {
                    viewOnKeyListenerC0000do.k();
                    return;
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((hz) ((bda) it.next()).b).s();
                }
                return;
            }
            return;
        }
        if (i == 2) {
            ge geVar = (ge) this.a;
            if (!geVar.b.u()) {
                geVar.b();
            }
            ViewTreeObserver viewTreeObserver = geVar.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(this);
                return;
            }
            return;
        }
        Object obj = this.a;
        gb gbVar = (gb) obj;
        ge geVar2 = gbVar.d;
        if (!geVar2.isAttachedToWindow() || !geVar2.getGlobalVisibleRect(gbVar.c)) {
            ((hz) obj).k();
        } else {
            gbVar.n();
            super/*hz*/.s();
        }
    }
}
