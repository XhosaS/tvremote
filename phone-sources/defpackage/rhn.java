package defpackage;

import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rhn implements View.OnAttachStateChangeListener {
    final /* synthetic */ qwo a;
    final /* synthetic */ qvx b;
    final /* synthetic */ RecyclerView.AdapterDataObserver c;
    final /* synthetic */ RecyclerView.AdapterDataObserver d;
    final /* synthetic */ rdz e;
    final /* synthetic */ rdz f;
    final /* synthetic */ RecyclerView.AdapterDataObserver g;
    final /* synthetic */ rhp h;

    public rhn(rhp rhpVar, qwo qwoVar, qvx qvxVar, RecyclerView.AdapterDataObserver adapterDataObserver, RecyclerView.AdapterDataObserver adapterDataObserver2, rdz rdzVar, rdz rdzVar2, RecyclerView.AdapterDataObserver adapterDataObserver3) {
        this.a = qwoVar;
        this.b = qvxVar;
        this.c = adapterDataObserver;
        this.d = adapterDataObserver2;
        this.e = rdzVar;
        this.f = rdzVar2;
        this.g = adapterDataObserver3;
        this.h = rhpVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) throws Resources.NotFoundException {
        rhp rhpVar = this.h;
        bv bvVarD = cr.d(view);
        if (rhpVar.p.g()) {
            ((dvs) rhpVar.p.c()).d(bvVarD, rhpVar.g);
        }
        qwo qwoVar = this.a;
        rdd rddVar = rhpVar.r;
        qwoVar.c(rddVar);
        qvx qvxVar = this.b;
        RecyclerView.AdapterDataObserver adapterDataObserver = this.c;
        qvxVar.registerAdapterDataObserver(adapterDataObserver);
        adapterDataObserver.onItemRangeInserted(0, 0);
        rddVar.b(qwoVar.a());
        RecyclerView.AdapterDataObserver adapterDataObserver2 = this.d;
        qvxVar.registerAdapterDataObserver(adapterDataObserver2);
        this.e.registerAdapterDataObserver(adapterDataObserver2);
        adapterDataObserver2.onItemRangeInserted(0, 0);
        rdz rdzVar = this.f;
        RecyclerView.AdapterDataObserver adapterDataObserver3 = this.g;
        rdzVar.registerAdapterDataObserver(adapterDataObserver3);
        ((rhm) adapterDataObserver3).a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        qwo qwoVar = this.a;
        rhp rhpVar = this.h;
        qwoVar.d(rhpVar.r);
        qvx qvxVar = this.b;
        RecyclerView.AdapterDataObserver adapterDataObserver = this.d;
        qvxVar.unregisterAdapterDataObserver(adapterDataObserver);
        this.e.unregisterAdapterDataObserver(adapterDataObserver);
        qvxVar.unregisterAdapterDataObserver(this.c);
        this.f.unregisterAdapterDataObserver(this.g);
        if (rhpVar.p.g()) {
            ((dvs) rhpVar.p.c()).i(rhpVar.g);
        }
    }
}
