package defpackage;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
class ayw extends ayq {
    final ayx i;
    final /* synthetic */ ayy j;

    public ayw(ayy ayyVar, ayx ayxVar) {
        this.j = ayyVar;
        this.i = ayxVar;
    }

    @Override // defpackage.ayq
    public final void m(azm azmVar, int i) {
        qk recycledViewPool = this.i.a.getRecycledViewPool();
        HashMap map = this.j.c;
        int iIntValue = map.containsKey(azmVar) ? ((Integer) map.get(azmVar)).intValue() : 24;
        qj qjVarB = recycledViewPool.b(i);
        qjVarB.b = iIntValue;
        ArrayList arrayList = qjVarB.a;
        while (arrayList.size() > iIntValue) {
            arrayList.remove(arrayList.size() - 1);
        }
    }

    @Override // defpackage.ayq
    public final void n(ayo ayoVar) {
        ayy ayyVar = this.j;
        ayx ayxVar = this.i;
        View view = ayoVar.a;
        ayyVar.c(ayxVar, view);
        ayxVar.c(view);
    }

    @Override // defpackage.ayq
    public final void o(ayo ayoVar) {
        if (this.i.s != null) {
            ayoVar.t.g.setOnClickListener(new ayv(this, ayoVar));
        }
    }

    @Override // defpackage.ayq
    protected final void p(ayo ayoVar) {
        View view = ayoVar.a;
        if (view instanceof ViewGroup) {
            ((ViewGroup) view).setTransitionGroup(true);
        }
        baq baqVar = this.j.d;
        if (baqVar == null || baqVar.e) {
            return;
        }
        if (!baqVar.d) {
            if (baqVar.c) {
                azq.a(view, baqVar.f);
            }
        } else if (baqVar.a == 3) {
            view.setTag(R.id.lb_shadow_impl, bao.a(view, baqVar.g, baqVar.h, baqVar.f));
        } else if (baqVar.c) {
            azq.a(view, baqVar.f);
        }
    }

    @Override // defpackage.ayq
    public final void r(ayo ayoVar) {
        if (this.i.s != null) {
            ayoVar.t.g.setOnClickListener(null);
        }
    }
}
