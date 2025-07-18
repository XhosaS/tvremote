package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class gmd extends RecyclerView.Adapter implements gme {
    final dve a;
    final cr b;
    private gmc h;
    final jn c = new jn();
    private final jn f = new jn();
    private final jn g = new jn();
    final cb e = new cb((byte[]) null, (char[]) null);
    public boolean d = false;
    private boolean i = false;

    public gmd(cr crVar, dve dveVar) {
        this.b = crVar;
        this.a = dveVar;
        super.setHasStableIds(true);
    }

    static final void g(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (view.getParent() == frameLayout) {
            return;
        }
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        if (view.getParent() != null) {
            ((ViewGroup) view.getParent()).removeView(view);
        }
        frameLayout.addView(view);
    }

    private static long i(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    private final Long j(int i) {
        int i2 = 0;
        Long lValueOf = null;
        while (true) {
            jn jnVar = this.g;
            if (i2 >= jnVar.b()) {
                return lValueOf;
            }
            if (((Integer) jnVar.g(i2)).intValue() == i) {
                if (lValueOf != null) {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
                lValueOf = Long.valueOf(jnVar.c(i2));
            }
            i2++;
        }
    }

    private static String k(String str, long j) {
        return str + j;
    }

    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, java.util.List] */
    private final void l(long j) {
        ViewParent parent;
        jn jnVar = this.c;
        bv bvVar = (bv) jnVar.e(j);
        if (bvVar == null) {
            return;
        }
        if (bvVar.getView() != null && (parent = bvVar.getView().getParent()) != null) {
            ((FrameLayout) parent).removeAllViews();
        }
        if (!e(j)) {
            this.f.k(j);
        }
        if (!bvVar.isAdded()) {
            jnVar.k(j);
            return;
        }
        if (f()) {
            this.i = true;
            return;
        }
        if (bvVar.isAdded() && e(j)) {
            cb cbVar = this.e;
            ArrayList arrayList = new ArrayList();
            Iterator it = cbVar.a.iterator();
            if (it.hasNext()) {
                throw null;
            }
            cr crVar = this.b;
            nxo nxoVarR = crVar.z.r(bvVar.mWho);
            if (nxoVarR == null || !((bv) nxoVarR.d).equals(bvVar)) {
                crVar.S(new IllegalStateException(a.cj(bvVar, "Fragment ", " is not currently in the FragmentManager")));
            }
            bu buVar = ((bv) nxoVarR.d).mState >= 0 ? new bu(nxoVarR.e()) : null;
            cb.q(arrayList);
            this.f.j(j, buVar);
        }
        cb cbVar2 = this.e;
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = cbVar2.a.iterator();
        if (it2.hasNext()) {
            throw null;
        }
        try {
            at atVar = new at(this.b);
            atVar.m(bvVar);
            atVar.e();
            jnVar.k(j);
        } finally {
            cb.q(arrayList2);
        }
    }

    private final void m(bv bvVar, FrameLayout frameLayout) {
        this.b.aq(new glx(bvVar, frameLayout));
    }

    private static boolean n(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    @Override // defpackage.gme
    public final Parcelable a() {
        jn jnVar = this.f;
        jn jnVar2 = this.c;
        Bundle bundle = new Bundle(jnVar2.b() + jnVar.b());
        for (int i = 0; i < jnVar2.b(); i++) {
            long jC = jnVar2.c(i);
            bv bvVar = (bv) jnVar2.e(jC);
            if (bvVar != null && bvVar.isAdded()) {
                String strK = k("f#", jC);
                cr crVar = this.b;
                if (bvVar.mFragmentManager != crVar) {
                    crVar.S(new IllegalStateException(a.cj(bvVar, "Fragment ", " is not currently in the FragmentManager")));
                }
                bundle.putString(strK, bvVar.mWho);
            }
        }
        for (int i2 = 0; i2 < jnVar.b(); i2++) {
            long jC2 = jnVar.c(i2);
            if (e(jC2)) {
                bundle.putParcelable(k("s#", jC2), (Parcelable) jnVar.e(jC2));
            }
        }
        return bundle;
    }

    public abstract bv b(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        jn jnVar;
        bv bvVar;
        View view;
        if (!this.i || f()) {
            return;
        }
        it itVar = new it();
        int i = 0;
        while (true) {
            jnVar = this.c;
            if (i >= jnVar.b()) {
                break;
            }
            long jC = jnVar.c(i);
            if (!e(jC)) {
                itVar.add(Long.valueOf(jC));
                this.g.k(jC);
            }
            i++;
        }
        if (!this.d) {
            this.i = false;
            for (int i2 = 0; i2 < jnVar.b(); i2++) {
                long jC2 = jnVar.c(i2);
                if (!this.g.l(jC2) && ((bvVar = (bv) jnVar.e(jC2)) == null || (view = bvVar.getView()) == null || view.getParent() == null)) {
                    itVar.add(Long.valueOf(jC2));
                }
            }
        }
        is isVar = new is(itVar);
        while (isVar.hasNext()) {
            l(((Long) isVar.next()).longValue());
        }
    }

    @Override // defpackage.gme
    public final void d(Parcelable parcelable) {
        jn jnVar = this.f;
        if (jnVar.m()) {
            jn jnVar2 = this.c;
            if (jnVar2.m()) {
                Bundle bundle = (Bundle) parcelable;
                if (bundle.getClassLoader() == null) {
                    bundle.setClassLoader(getClass().getClassLoader());
                }
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    bv bvVarC = null;
                    if (!it.hasNext()) {
                        if (jnVar2.m()) {
                            return;
                        }
                        this.i = true;
                        this.d = true;
                        c();
                        Handler handler = new Handler(Looper.getMainLooper());
                        gfe gfeVar = new gfe(this, 4, null);
                        this.a.c(new gly(handler, gfeVar, 0));
                        handler.postDelayed(gfeVar, 10000L);
                        return;
                    }
                    String next = it.next();
                    if (n(next, "f#")) {
                        long jI = i(next, "f#");
                        cr crVar = this.b;
                        String string = bundle.getString(next);
                        if (string != null && (bvVarC = crVar.c(string)) == null) {
                            crVar.S(new IllegalStateException(a.cz(string, next, "Fragment no longer exists for key ", ": unique id ")));
                        }
                        jnVar2.j(jI, bvVarC);
                    } else {
                        if (!n(next, "s#")) {
                            throw new IllegalArgumentException("Unexpected key in savedState: ".concat(String.valueOf(next)));
                        }
                        long jI2 = i(next, "s#");
                        bu buVar = (bu) bundle.getParcelable(next);
                        if (e(jI2)) {
                            jnVar.j(jI2, buVar);
                        }
                    }
                }
            }
        }
        throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
    }

    public final boolean e(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    final boolean f() {
        return this.b.ab();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final long getItemId(int i) {
        return i;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    final void h(rbx rbxVar) {
        bv bvVar = (bv) this.c.e(rbxVar.getItemId());
        if (bvVar == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        FrameLayout frameLayoutA = rbxVar.a();
        View view = bvVar.getView();
        if (!bvVar.isAdded() && view != null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        if (bvVar.isAdded() && view == null) {
            m(bvVar, frameLayoutA);
            return;
        }
        if (bvVar.isAdded() && view.getParent() != null) {
            if (view.getParent() != frameLayoutA) {
                g(view, frameLayoutA);
                return;
            }
            return;
        }
        if (bvVar.isAdded()) {
            g(view, frameLayoutA);
            return;
        }
        if (f()) {
            if (this.b.x) {
                return;
            }
            this.a.c(new gly(this, rbxVar, 1));
            return;
        }
        m(bvVar, frameLayoutA);
        cb cbVar = this.e;
        ArrayList arrayList = new ArrayList();
        Iterator it = cbVar.a.iterator();
        if (it.hasNext()) {
            throw null;
        }
        try {
            bvVar.setMenuVisibility(false);
            at atVar = new at(this.b);
            atVar.r(bvVar, "f" + rbxVar.getItemId());
            atVar.n(bvVar, dvd.d);
            atVar.e();
            this.h.a(false);
        } finally {
            cb.q(arrayList);
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        a.H(this.h == null);
        gmc gmcVar = new gmc(this);
        this.h = gmcVar;
        gmcVar.c = gmc.b(recyclerView);
        gmcVar.e = new gma(gmcVar);
        gmcVar.c.m(gmcVar.e);
        gmcVar.a = new glz(gmcVar);
        gmd gmdVar = gmcVar.d;
        gmdVar.registerAdapterDataObserver(gmcVar.a);
        gmcVar.b = new gmb(gmcVar);
        gmdVar.a.c(gmcVar.b);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        rbx rbxVar = (rbx) viewHolder;
        long itemId = rbxVar.getItemId();
        int id = rbxVar.a().getId();
        Long lJ = j(id);
        if (lJ != null && lJ.longValue() != itemId) {
            l(lJ.longValue());
            this.g.k(lJ.longValue());
        }
        this.g.j(itemId, Integer.valueOf(id));
        long j = i;
        jn jnVar = this.c;
        if (!jnVar.l(j)) {
            bv bvVarB = b(i);
            bvVarB.setInitialSavedState((bu) this.f.e(j));
            jnVar.j(j, bvVarB);
        }
        if (rbxVar.a().isAttachedToWindow()) {
            h(rbxVar);
        }
        c();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* synthetic */ RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        int i2 = rbx.a;
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(View.generateViewId());
        frameLayout.setSaveEnabled(false);
        return new rbx(frameLayout);
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        gmc gmcVar = this.h;
        gmc.b(recyclerView).n(gmcVar.e);
        gmd gmdVar = gmcVar.d;
        gmdVar.unregisterAdapterDataObserver(gmcVar.a);
        gmdVar.a.d(gmcVar.b);
        gmcVar.c = null;
        this.h = null;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        return true;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        h((rbx) viewHolder);
        c();
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final /* bridge */ /* synthetic */ void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        Long lJ = j(((rbx) viewHolder).a().getId());
        if (lJ != null) {
            l(lJ.longValue());
            this.g.k(lJ.longValue());
        }
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }
}
