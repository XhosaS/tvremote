package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mub implements oby, obo, obq {
    private final String a;
    private final oco b;
    private final oal c;
    private final AtomicReference d;
    private final List e;
    private final List f = new ArrayList();

    public mub(AtomicReference atomicReference, List list, String str, oco ocoVar, oal oalVar) {
        this.d = atomicReference;
        this.e = list;
        this.a = str;
        this.b = ocoVar;
        this.c = oalVar;
    }

    @Override // defpackage.obo
    public final void a(View view) {
        for (String str : mry.a(view, 333384171)) {
            oes oesVar = (oes) this.d.get();
            if (oesVar != null && str != null) {
                oesVar.b(str);
            }
            c();
        }
        view.setTag(333384171, null);
    }

    @Override // defpackage.oby
    public final /* synthetic */ void b(View view, View view2) {
        e(view);
    }

    public final void c() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((mrm) it.next()).e.set(null);
        }
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            try {
                ((oer) it2.next()).a();
            } catch (RuntimeException e) {
                this.b.d(acsw.LOG_TYPE_INTERNAL_ERROR, this.c, e, "Error in cancelling intersection subscription.", new Object[0]);
            }
        }
        this.f.clear();
    }

    @Override // defpackage.obq
    public final void d() {
        c();
    }

    @Override // defpackage.oby
    public final void e(View view) {
        oes oesVar = (oes) this.d.get();
        if (oesVar == null) {
            this.b.b(acsw.LOG_TYPE_INTERNAL_ERROR, this.c, "[IntersectionListener.onVisible] scrollStrategyListenerHolder is unavailable.", new Object[0]);
            return;
        }
        String str = this.a;
        mry.a(view, 333384171).add(str);
        aghb aghbVar = ((nyx) this.c).f;
        if (aghbVar != null) {
            aghbVar.a(new mua(this));
        }
        for (mrm mrmVar : this.e) {
            this.f.add(oesVar.a(str, mrmVar));
            mrmVar.e.set(view);
        }
    }
}
