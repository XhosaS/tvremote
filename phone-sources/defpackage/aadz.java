package defpackage;

import android.support.v7.widget.ActivityChooserView;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class aadz extends aadt {
    private final int a;
    private final int c;
    private final int d;

    public aadz(aabm aabmVar, aabo aaboVar) {
        this(aabmVar, aaboVar, 1);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int a(long j) {
        return this.b.a(j) + this.a;
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final int c() {
        return this.d;
    }

    @Override // defpackage.aadt, defpackage.aabm
    public final int d() {
        return this.c;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long e(long j, int i) {
        long jE = super.e(j, i);
        vxr.ay(this, a(jE), this.c, this.d);
        return jE;
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final long f(long j) {
        return this.b.f(j);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long g(long j) {
        return this.b.g(j);
    }

    @Override // defpackage.aadt, defpackage.aadr, defpackage.aabm
    public final long h(long j, int i) {
        vxr.ay(this, i, this.c, this.d);
        return super.h(j, i - this.a);
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final aabu t() {
        return this.b.t();
    }

    @Override // defpackage.aadr, defpackage.aabm
    public final boolean v(long j) {
        return this.b.v(j);
    }

    public aadz(aabm aabmVar, aabo aaboVar, int i) {
        super(aabmVar, aaboVar);
        this.a = i;
        if (aabmVar.d() + i > Integer.MIN_VALUE) {
            this.c = aabmVar.d() + i;
        } else {
            this.c = Integer.MIN_VALUE;
        }
        if (aabmVar.c() + i < Integer.MAX_VALUE) {
            this.d = aabmVar.c() + i;
        } else {
            this.d = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        }
    }
}
