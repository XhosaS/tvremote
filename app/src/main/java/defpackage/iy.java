package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
class iy implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ jd a;

    public iy(jd jdVar) {
        this.a = jdVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        jd jdVar = this.a;
        if (jdVar.u()) {
            List list = jdVar.b;
            if (list.size() <= 0 || ((jc) list.get(0)).a.p) {
                return;
            }
            View view = jdVar.d;
            if (view == null || !view.isShown()) {
                jdVar.f();
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((jc) it.next()).a.s();
            }
        }
    }
}
