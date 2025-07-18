package defpackage;

import android.os.Bundle;
import android.view.View;
import androidx.leanback.widget.VerticalGridView;
import com.google.android.katniss.R;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hqq extends hqx implements hmt {
    private final boolean aW() {
        hkx hkxVar = this.bq;
        return hkxVar != null && hky.p(((hky) hkxVar).o);
    }

    @Override // defpackage.hmc
    public final boolean A() {
        return false;
    }

    @Override // defpackage.hmc
    public final boolean B() {
        return false;
    }

    @Override // defpackage.hmc
    public final boolean C() {
        return false;
    }

    @Override // defpackage.hmt
    public final boolean a() {
        return z() && !aW();
    }

    @Override // defpackage.hrw
    protected final void aO(int i) {
        if (this.bq == null || i != 0) {
            return;
        }
        View viewBh = bh();
        if (viewBh != null) {
            viewBh.setFocusable(true);
        }
        List listD = this.bq.d();
        if (listD != null && !listD.isEmpty()) {
            adyn adynVar = (adyn) listD.get(0);
            bm(0, adynVar, (adynVar.b & 512) != 0 ? adynVar.j : "");
            return;
        }
        List list = ((hky) this.bq).f;
        if (list == null || list.isEmpty()) {
            return;
        }
        xqe xqeVar = (xqe) list.get(0);
        bl(0, xqeVar, (1 & xqeVar.b) != 0 ? xqeVar.c : "");
    }

    @Override // defpackage.hrw, defpackage.atx, defpackage.bq
    public final void aa(View view, Bundle bundle) {
        super.aa(view, bundle);
        VerticalGridView verticalGridView = this.b;
        Bundle bundle2 = this.n;
        verticalGridView.setFocusable(this.bG || bundle2 == null || bundle2.getBoolean("need_focus_on_search_result", true));
        verticalGridView.getLayoutManager().A = true;
        view.getViewTreeObserver().addOnPreDrawListener(new hqp(view));
    }

    @Override // defpackage.hmt
    public final boolean b() {
        return aW();
    }

    @Override // defpackage.hrw
    protected final void dK() {
        List list = this.bB;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            bG((htg) it.next());
        }
        this.bF.addAll(list);
        list.clear();
    }

    @Override // defpackage.hrw
    protected final boolean es() {
        return this.aK.e() > 0;
    }

    @Override // defpackage.hrw
    protected final void eu() {
        if (this.bq == null) {
            return;
        }
        ListIterator listIterator = this.bB.listIterator();
        while (listIterator.hasNext()) {
            htg htgVar = (htg) listIterator.next();
            if (htgVar.e) {
                if (!es()) {
                    bq(htgVar, dZ().getResources().getString(R.string.in_app_results_title, htgVar.d(), this.bq.b()));
                    bD();
                }
                bG(htgVar);
                listIterator.remove();
                this.bF.add(htgVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x005e  */
    @Override // defpackage.hmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean z() {
        /*
            r4 = this;
            hkx r0 = r4.bq
            if (r0 == 0) goto L71
            hky r0 = (defpackage.hky) r0
            java.util.List r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L12
            int r1 = r1.size()
            if (r1 > r2) goto L70
            goto L5e
        L12:
            aeal r1 = r0.e
            if (r1 == 0) goto L5e
            adyj r3 = r0.o
            if (r3 != 0) goto L23
            abxs r1 = r1.d
            int r1 = r1.size()
            if (r1 <= r2) goto L5e
            goto L70
        L23:
            int r1 = r3.b
            r1 = r1 & 16
            if (r1 == 0) goto L5e
            adyd r1 = r3.d
            if (r1 != 0) goto L2f
            adyd r1 = defpackage.adyd.a
        L2f:
            int r1 = r1.k
            int r1 = defpackage.adyh.a(r1)
            if (r1 != 0) goto L38
            goto L4d
        L38:
            if (r1 == r2) goto L4d
            adyj r1 = r0.o
            adyd r1 = r1.d
            if (r1 != 0) goto L42
            adyd r1 = defpackage.adyd.a
        L42:
            int r1 = r1.k
            int r1 = defpackage.adyh.a(r1)
            if (r1 == 0) goto L5e
            r3 = 2
            if (r1 != r3) goto L5e
        L4d:
            adyj r1 = r0.o
            adyd r1 = r1.d
            if (r1 != 0) goto L55
            adyd r1 = defpackage.adyd.a
        L55:
            abxs r1 = r1.h
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L5e
            goto L70
        L5e:
            boolean r1 = r0.n()
            if (r1 != 0) goto L70
            boolean r1 = r0.m()
            if (r1 != 0) goto L70
            boolean r0 = r0.h()
            if (r0 == 0) goto L71
        L70:
            return r2
        L71:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hqq.z():boolean");
    }
}
