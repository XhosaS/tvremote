package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dmw {
    public final Context a;
    public final int b;
    public final boolean c;
    public final dmc d;
    public final int e;
    public final boolean f;
    public final dma g;
    public final AtomicBoolean h;
    public final long i;
    public final int j;
    public final int k;
    public final boolean l;
    public final Integer m = null;
    public final ComponentName n;
    public final cvi o;
    private final AtomicInteger p;

    public dmw(Context context, int i, boolean z, dmc dmcVar, int i2, boolean z2, AtomicInteger atomicInteger, dma dmaVar, AtomicBoolean atomicBoolean, long j, int i3, int i4, boolean z3, ComponentName componentName, cvi cviVar) {
        this.a = context;
        this.b = i;
        this.c = z;
        this.d = dmcVar;
        this.e = i2;
        this.f = z2;
        this.p = atomicInteger;
        this.g = dmaVar;
        this.h = atomicBoolean;
        this.i = j;
        this.j = i3;
        this.k = i4;
        this.l = z3;
        this.n = componentName;
        this.o = cviVar;
    }

    public static /* synthetic */ dmw g(dmw dmwVar, int i, boolean z, AtomicInteger atomicInteger, dma dmaVar, AtomicBoolean atomicBoolean, long j, int i2, boolean z2, int i3) {
        return new dmw((i3 & 1) != 0 ? dmwVar.a : null, (i3 & 2) != 0 ? dmwVar.b : 0, (i3 & 4) != 0 ? dmwVar.c : false, (i3 & 8) != 0 ? dmwVar.d : null, (i3 & 16) != 0 ? dmwVar.e : i, (i3 & 32) != 0 ? dmwVar.f : z, (i3 & 64) != 0 ? dmwVar.p : atomicInteger, (i3 & 128) != 0 ? dmwVar.g : dmaVar, (i3 & 256) != 0 ? dmwVar.h : atomicBoolean, (i3 & 512) != 0 ? dmwVar.i : j, (i3 & 1024) != 0 ? dmwVar.j : i2, (i3 & RecyclerView.ItemAnimator.FLAG_MOVED) != 0 ? dmwVar.k : 0, (i3 & RecyclerView.ItemAnimator.FLAG_APPEARED_IN_PRE_LAYOUT) != 0 ? dmwVar.l : z2, dmwVar.n, dmwVar.o);
    }

    public final int a() {
        int iIncrementAndGet = this.p.incrementAndGet();
        if (iIncrementAndGet < dle.j) {
            return dle.i + iIncrementAndGet;
        }
        throw new IllegalStateException("There are too many views");
    }

    public final dmw b() {
        return g(this, 0, false, null, null, null, 0L, 0, true, 61439);
    }

    public final dmw c(dma dmaVar, int i) {
        return g(this, i, false, null, dmaVar, null, 0L, 0, false, 65391);
    }

    public final dmw d(int i) {
        return g(this, 0, true, null, null, null, 0L, i, false, 64479);
    }

    public final dmw e(dmk dmkVar) {
        return g(c(dmkVar.b, 0), 0, false, new AtomicInteger(-1), null, new AtomicBoolean(false), 0L, 0, false, 65215);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmw)) {
            return false;
        }
        dmw dmwVar = (dmw) obj;
        if (!yks.e(this.a, dmwVar.a) || this.b != dmwVar.b || this.c != dmwVar.c || !yks.e(this.d, dmwVar.d) || this.e != dmwVar.e || this.f != dmwVar.f || !yks.e(this.p, dmwVar.p) || !yks.e(this.g, dmwVar.g) || !yks.e(this.h, dmwVar.h) || !a.s(this.i, dmwVar.i) || this.j != dmwVar.j || this.k != dmwVar.k || this.l != dmwVar.l) {
            return false;
        }
        Integer num = dmwVar.m;
        return yks.e(null, null) && yks.e(this.n, dmwVar.n) && yks.e(this.o, dmwVar.o);
    }

    public final dmw f(int i) {
        return g(this, 0, false, new AtomicInteger(1048576), null, null, 0L, i, false, 64447);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dmc dmcVar = this.d;
        int iQ = (((((((((((((((((((((iHashCode + this.b) * 31) + a.q(this.c)) * 31) + (dmcVar == null ? 0 : dmcVar.hashCode())) * 31) + this.e) * 31) + a.q(this.f)) * 31) + this.p.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + a.k(this.i)) * 31) + this.j) * 31) + this.k) * 31;
        boolean z = this.l;
        ComponentName componentName = this.n;
        return ((((iQ + a.q(z)) * 961) + (componentName != null ? componentName.hashCode() : 0)) * 31) + this.o.hashCode();
    }

    public final String toString() {
        return "TranslationContext(context=" + this.a + ", appWidgetId=" + this.b + ", isRtl=" + this.c + ", layoutConfiguration=" + this.d + ", itemPosition=" + this.e + ", isLazyCollectionDescendant=" + this.f + ", lastViewId=" + this.p + ", parentContext=" + this.g + ", isBackgroundSpecified=" + this.h + ", layoutSize=" + ((Object) cmc.c(this.i)) + ", layoutCollectionViewId=" + this.j + ", layoutCollectionItemId=" + this.k + ", canUseSelectableGroup=" + this.l + ", actionTargetId=null, actionBroadcastReceiver=" + this.n + ", glanceComponents=" + this.o + ')';
    }
}
