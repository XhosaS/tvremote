package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Iterator;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class quy extends dvv {
    public ImmutableMap g;
    public final tst h;
    public final tst i;
    public String j;
    private final qth k;
    private final ofj l;
    private final ofk m;

    public quy() {
        throw null;
    }

    public static uzl s(qva qvaVar, boolean z) {
        vtw vtwVarM = uzl.a.m();
        if (!vtwVarM.b.A()) {
            vtwVarM.u();
        }
        uzl uzlVar = (uzl) vtwVarM.b;
        uzlVar.b |= 1;
        uzlVar.c = 409;
        vtwVarM.at(ImmutableMap.of("rfn", qvaVar.c, "rfnc", qvaVar.d, "security-event-id", qvaVar.e, "sa", String.valueOf(z), "ve", String.valueOf(rgf.a(z)), "origin", "8"));
        return (uzl) vtwVarM.r();
    }

    @Override // defpackage.dvs
    protected final void f() {
        Object obj = this.l;
        ogd ogdVar = (ogd) obj;
        ofr.c(this.m, ogdVar);
        oaf oafVar = new oaf();
        oafVar.b = new nvg[]{oez.a};
        oafVar.a = new nku(3);
        oafVar.c = 28003;
        ((nwq) obj).r(oafVar.a());
        String str = this.j;
        if (str != null) {
            ofr.a(str, ogdVar);
            this.j = null;
        }
    }

    @Override // defpackage.dvs
    protected final void g() {
        ofr.d(this.m, (ogd) this.l);
    }

    public final ofi n(Object obj) {
        return (ofi) tst.h(o(obj)).b(new prn(16)).f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final qva o(Object obj) {
        ImmutableList immutableListP = p(obj);
        if (immutableListP.isEmpty()) {
            return null;
        }
        return (qva) immutableListP.get(0);
    }

    public final ImmutableList p(Object obj) {
        ImmutableList immutableList = (ImmutableList) rrx.aC(this.k, obj, this.g, null);
        return immutableList == null ? ImmutableList.of() : immutableList;
    }

    public final boolean q(ImmutableList immutableList) {
        return Iterables.any(immutableList, new lqh(this, 8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void r(Context context, final Object obj, ViewGroup viewGroup, final rhu rhuVar, View view, final rjg rjgVar, boolean z, qtl qtlVar) {
        final boolean z2;
        rgf rgfVar;
        sij.x(viewGroup.getChildCount() <= 1, "Critical alert container can contain one child at most.");
        View childAt = viewGroup.getChildAt(0);
        sij.x(childAt == null || (childAt instanceof rgf), "Critical alert container can only contain children of type CriticalAlertView.");
        ofi ofiVarN = n(obj);
        if (ofiVarN == null) {
            if (childAt != null) {
                ((rgf) childAt).e(rjgVar);
                viewGroup.removeAllViews();
            }
            viewGroup.setVisibility(8);
            viewGroup.removeAllViews();
            view.setContentDescription(null);
            view.setFocusable(false);
            view.setOnClickListener(null);
            view.setClickable(false);
            return;
        }
        if (childAt == null) {
            z2 = z;
            rgfVar = new rgf(context, z2);
            viewGroup.addView(rgfVar);
            rgfVar.b(rjgVar);
        } else {
            z2 = z;
            rgfVar = (rgf) childAt;
        }
        rgf rgfVar2 = rgfVar;
        qth qthVar = this.k;
        rgfVar2.a.setText(ofiVarN.c);
        rgfVar2.b.setText(ofiVarN.d);
        rgfVar2.d.j(ImmutableList.of(ofiVarN.e, ofiVarN.f));
        rgfVar2.setContentDescription(rgfVar2.getContext().getString(R.string.og_account_critical_alert_view_label_a11y, ofiVarN.c, rdd.m(obj, qthVar)) + "\n" + ofiVarN.d + "\n" + ofiVarN.e);
        String strAD = rrx.aD(qthVar, obj);
        UnmodifiableIterator it = p(obj).iterator();
        while (it.hasNext()) {
            ofi ofiVar = ((qva) it.next()).b;
            if (!ofiVar.h) {
                ofr.b(strAD, ofiVar.b, (ogd) this.l);
            }
        }
        rgfVar2.setOnClickListener(new View.OnClickListener() { // from class: rgc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                rjgVar.f(new ntp(5), view2);
                fob fobVar = new fob(this.e, obj, view2, z2, 5);
                rhu rhuVar2 = rhuVar;
                rhuVar2.b().run();
                fobVar.run();
                rhuVar2.a().run();
            }
        });
        viewGroup.setVisibility(0);
        view.setContentDescription(rgfVar2.getContentDescription());
        view.setFocusable(true);
        view.setOnClickListener(new phn(rgfVar2, 5));
    }

    public quy(Context context, qth qthVar, tst tstVar, tst tstVar2) {
        ogd ogdVar = new ogd(context);
        this.g = ImmutableMap.of();
        this.k = qthVar;
        this.l = ogdVar;
        this.h = tstVar;
        this.i = tstVar2;
        this.m = new ofk() { // from class: rgd
            @Override // defpackage.ofk
            public final void a(Map map) {
                ImmutableList immutableListOf;
                ImmutableMap.Builder builder = ImmutableMap.builder();
                for (Map.Entry entry : map.entrySet()) {
                    ofa ofaVar = (ofa) entry.getValue();
                    if (ofaVar == null || ofaVar.c.isEmpty()) {
                        immutableListOf = ImmutableList.of();
                    } else {
                        ImmutableList.Builder builder2 = new ImmutableList.Builder();
                        Iterator<E> it = ofaVar.c.iterator();
                        while (it.hasNext()) {
                            qva qvaVarA = qva.a(ofaVar.b, (ofi) it.next());
                            if (qvaVarA != null) {
                                builder2.add((ImmutableList.Builder) qvaVarA);
                            }
                        }
                        immutableListOf = builder2.build();
                    }
                    if (!immutableListOf.isEmpty()) {
                        builder.put((String) entry.getKey(), immutableListOf);
                    }
                }
                quy quyVar = this.a;
                quyVar.g = builder.buildOrThrow();
                rrx.ap(quyVar, trk.a);
            }
        };
    }
}
