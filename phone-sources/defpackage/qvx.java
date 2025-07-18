package defpackage;

import android.graphics.ColorFilter;
import android.support.v7.util.DiffUtil;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvx extends RecyclerView.Adapter {
    public final qth a;
    public final tst b;
    public Object c;
    public ImmutableList e;
    private final qtr f;
    private final qvh g;
    private final rjg h;
    private final qux i;
    private final rhu k;
    private final boolean l;
    private final int m;
    private final unc p;
    private final List j = new ArrayList();
    private final rdd o = new qvv(this);
    public boolean d = false;
    private final dvw n = new hs(this, 7);

    public qvx(qvt qvtVar, qvs qvsVar, rhu rhuVar, wds wdsVar, rjg rjgVar, int i, qux quxVar) {
        qtr qtrVar = qvtVar.a;
        qtrVar.getClass();
        this.f = qtrVar;
        qth qthVar = qvtVar.b;
        qthVar.getClass();
        this.a = qthVar;
        qvh qvhVar = qvtVar.c;
        qvhVar.getClass();
        this.g = qvhVar;
        this.b = qvtVar.e;
        this.h = rjgVar;
        this.i = quxVar;
        this.k = rhuVar;
        ril rilVar = qvtVar.d;
        rilVar.getClass();
        wdsVar.getClass();
        this.p = new unc(qvhVar, rilVar, wdsVar, rjgVar, new rhg(this, qvsVar, 1));
        this.m = i;
        this.l = true;
    }

    public final void a() {
        if (this.d && this.l) {
            return;
        }
        sjl.c();
        List list = this.j;
        ArrayList arrayList = new ArrayList(list);
        ImmutableList immutableListBuild = this.e;
        tst tstVar = this.i.a;
        if (tstVar.g() && ((quz) tstVar.c()).c.g()) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            ImmutableList.Builder builder2 = new ImmutableList.Builder();
            UnmodifiableIterator it = immutableListBuild.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((quy) ((quz) tstVar.c()).c.c()).n(next) != null) {
                    builder.add((ImmutableList.Builder) next);
                } else {
                    builder2.add((ImmutableList.Builder) next);
                }
            }
            ImmutableList.Builder builder3 = ImmutableList.builder();
            builder3.addAll((Iterable) builder.build());
            builder3.addAll((Iterable) builder2.build());
            immutableListBuild = builder3.build();
        }
        ArrayList arrayList2 = new ArrayList(immutableListBuild);
        Object obj = this.c;
        if (obj != null) {
            arrayList2.remove(obj);
        }
        DiffUtil.DiffResult diffResultCalculateDiff = DiffUtil.calculateDiff(new qvw(this, arrayList, arrayList2));
        list.clear();
        list.addAll(arrayList2);
        diffResultCalculateDiff.dispatchUpdatesTo(this);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.j.size();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        qvh qvhVar = this.g;
        qvhVar.c(this.o);
        this.c = qvhVar.a();
        this.e = ImmutableList.copyOf((Collection) ((qwo) qvhVar).e());
        tst tstVar = this.i.a;
        if (tstVar.g() && ((quz) tstVar.c()).c.g()) {
            ((dvs) ((quz) tstVar.c()).c.c()).d(((quz) tstVar.c()).a, this.n);
        }
        a();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        qvr qvrVar = (qvr) viewHolder;
        Object obj = this.j.get(i);
        nay nayVar = new nay(this.p, obj, 3);
        AccountParticle accountParticle = qvrVar.a;
        accountParticle.m = true;
        accountParticle.b(qvrVar.e);
        qvrVar.f = obj;
        accountParticle.n.f(obj, new rhj(qvrVar, 1));
        tst tstVar = qvrVar.b;
        accountParticle.setOnClickListener(nayVar);
        accountParticle.k.setAlpha(1.0f);
        accountParticle.l.setAlpha(1.0f);
        AccountParticleDisc accountParticleDisc = accountParticle.j;
        accountParticleDisc.setAlpha(1.0f);
        accountParticleDisc.a.setColorFilter((ColorFilter) null);
        accountParticle.findViewById(R.id.og_account_deactivated_help_tooltip).setVisibility(8);
        tst tstVar2 = qvrVar.d;
        if (tstVar2.g() && ((quz) tstVar2.c()).c.g()) {
            ((dvs) ((quz) tstVar2.c()).c.c()).d(((quz) tstVar2.c()).a, qvrVar.c);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new qvr(viewGroup, this.a, this.f, this.b, this.i, this.m, this.h, this.k);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.g.d(this.o);
        tst tstVar = this.i.a;
        if (tstVar.g() && ((quz) tstVar.c()).c.g()) {
            tst tstVar2 = ((quz) tstVar.c()).c;
            ((dvs) tstVar2.c()).i(this.n);
        }
        this.j.clear();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        qvr qvrVar = (qvr) viewHolder;
        AccountParticle accountParticle = qvrVar.a;
        accountParticle.e(qvrVar.e);
        accountParticle.m = false;
        tst tstVar = qvrVar.d;
        if (tstVar.g() && ((quz) tstVar.c()).c.g()) {
            ((dvs) ((quz) tstVar.c()).c.c()).i(qvrVar.c);
        }
    }
}
