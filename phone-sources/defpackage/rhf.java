package defpackage;

import android.content.Context;
import android.support.v7.content.res.AppCompatResources;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rhf {
    public final qwn a;
    public final Context b;
    public final dvk c;
    public boolean d;
    public ImmutableList e = ImmutableList.of();
    public ImmutableList f = ImmutableList.of();
    public boolean g;
    private boolean h;
    private boolean i;

    public rhf(qwn qwnVar, Context context, dvk dvkVar) {
        this.a = qwnVar;
        this.b = context;
        this.c = dvkVar;
    }

    private final void d() {
        rfg rfgVar = this.a.e;
        tst tstVar = rfgVar.b;
        tst tstVar2 = rfgVar.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    final rhe a() {
        dvu dvuVar;
        rfg rfgVar = this.a.e;
        rfp rfpVar = rfgVar.f;
        if (this.d) {
            rfpVar.d();
        }
        ImmutableList immutableListB = this.h ? rfpVar.b() : ImmutableList.of();
        if (this.d) {
            rfpVar.c();
        }
        ImmutableList immutableListOf = ImmutableList.of();
        immutableListOf.getClass();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList.Builder builder2 = new ImmutableList.Builder();
        builder.addAll((Iterable) this.f);
        if (this.i) {
            if (immutableListB.isEmpty()) {
                d();
            } else {
                d();
            }
        }
        if (this.g) {
            tst tstVar = rfgVar.h;
            if (tstVar.g()) {
                Object objC = tstVar.c();
                Context context = this.b;
                final dvk dvkVar = this.c;
                tst tstVar2 = rfgVar.m;
                final trk trkVar = trk.a;
                qoi qoiVar = new qoi(this, 14);
                String string = context.getString(R.string.og_recommended_actions_entry_point);
                if (string == null) {
                    throw new NullPointerException("Null recommendedActions");
                }
                res resVarB = ret.b(AppCompatResources.getDrawable(context, true != ric.b(context).a ? R.drawable.yellow_alert_dark_vd : R.drawable.yellow_alert_vd));
                resVarB.e = tst.i(context.getString(R.string.og_important_account_alert_badge_a11y_label));
                ret retVarA = resVarB.a();
                ret retVarC = ret.c(AppCompatResources.getDrawable(context, R.drawable.safer_gshield_ic_outline_hero));
                String packageName = context.getPackageName();
                if (packageName == null) {
                    throw new NullPointerException("Null appPackageName");
                }
                final rfy rfyVar = new rfy(string, retVarA, retVarC, packageName);
                ((dvs) qoiVar.get()).d(dvkVar, new req(objC, 7));
                final rfh rfhVar = (rfh) objC;
                dvkVar.getLifecycle().c(rfhVar.g);
                builder.add((ImmutableList.Builder) new rdn(new rdm() { // from class: rfw
                    @Override // defpackage.rdm
                    public final rdu a(Object obj) {
                        rfh rfhVar2 = rfhVar;
                        rfhVar2.i = obj;
                        Object obj2 = rfhVar2.i;
                        if (obj2 != null) {
                            tst tstVar3 = trkVar;
                            dvk dvkVar2 = dvkVar;
                            rfy rfyVar2 = rfyVar;
                            ofj ofjVar = rfhVar2.c;
                            tst tstVar4 = rfhVar2.d;
                            qth qthVar = rfhVar2.a;
                            rfhVar2.h = new rft(rfyVar2, dvkVar2, ofjVar, tstVar4, rrx.aD(qthVar, obj2), tstVar3, rfhVar2.n);
                            rfhVar2.a(rfhVar2.i, rfhVar2.l, rfhVar2.h, rfhVar2.m);
                        } else {
                            rfhVar2.h = null;
                        }
                        return rfhVar2.h;
                    }
                }));
            }
        }
        ImmutableList immutableListBuild = builder.build();
        builder2.addAll((Iterable) this.e);
        ImmutableList immutableListBuild2 = builder2.build();
        if (immutableListB.isEmpty() && immutableListOf.isEmpty() && immutableListBuild.isEmpty()) {
            dvuVar = null;
        } else {
            reb rebVar = new reb();
            rebVar.a = immutableListBuild;
            ImmutableList immutableListOf2 = ImmutableList.of();
            ImmutableList.Builder builder3 = new ImmutableList.Builder();
            builder3.addAll((Iterable) immutableListOf2);
            builder3.addAll((Iterable) immutableListOf);
            UnmodifiableIterator it = immutableListB.iterator();
            while (it.hasNext()) {
                builder3.add((ImmutableList.Builder) new rdn(new rgt((rfm) it.next(), 2)));
            }
            rebVar.b = builder3.build();
            dvuVar = new dvu();
            dvuVar.n(new dvv(ImmutableList.of()), new rdg(rebVar, dvuVar, 3));
        }
        return new rhe(dvuVar, immutableListBuild2.isEmpty() ? null : new dvv(immutableListBuild2));
    }

    final void b() {
        this.h = true;
    }

    final void c() {
        this.i = true;
    }
}
