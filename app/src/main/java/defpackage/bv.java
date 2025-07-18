package defpackage;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* compiled from: PG */
/* loaded from: classes.dex */
class bv extends ce implements abu, abv, ec, ed, bem, uj, uy, bqs, dj, agc {
    final /* synthetic */ bw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bv(bw bwVar) {
        super(bwVar, bwVar, new Handler());
        this.a = bwVar;
    }

    @Override // defpackage.ce, defpackage.ca
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.ce, defpackage.ca
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.ce
    public final LayoutInflater c() {
        bw bwVar = this.a;
        return bwVar.getLayoutInflater().cloneInContext(bwVar);
    }

    @Override // defpackage.uj
    public final ui dc() {
        return this.a.dc();
    }

    @Override // defpackage.uy
    public final ux de() {
        return this.a.h;
    }

    @Override // defpackage.abu
    public final void dg(afe afeVar) {
        this.a.dg(afeVar);
    }

    @Override // defpackage.ec
    public final void dh(afe afeVar) {
        this.a.dh(afeVar);
    }

    @Override // defpackage.ed
    public final void di(afe afeVar) {
        this.a.di(afeVar);
    }

    @Override // defpackage.abv
    public final void dj(afe afeVar) {
        this.a.dj(afeVar);
    }

    @Override // defpackage.abu
    public final void dn(afe afeVar) {
        this.a.dn(afeVar);
    }

    @Override // defpackage.ec
    /* renamed from: do, reason: not valid java name */
    public final void mo83do(afe afeVar) {
        this.a.mo83do(afeVar);
    }

    @Override // defpackage.ed
    public final void dp(afe afeVar) {
        this.a.dp(afeVar);
    }

    @Override // defpackage.abv
    public final void dq(afe afeVar) {
        this.a.dq(afeVar);
    }

    @Override // defpackage.agc
    public final void dr(cr crVar) {
        this.a.dr(crVar);
    }

    @Override // defpackage.agc
    public final void ds(cr crVar) {
        this.a.ds(crVar);
    }

    @Override // defpackage.bcl
    public final bcg ek() {
        return this.a.b;
    }

    @Override // defpackage.bem
    public final bel el() {
        return this.a.el();
    }

    @Override // defpackage.bqs
    public final bqo en() {
        return this.a.g.c;
    }

    @Override // defpackage.ce
    public final /* synthetic */ Object f() {
        return this.a;
    }

    @Override // defpackage.ce
    public final void k() {
        this.a.invalidateOptionsMenu();
    }

    @Override // defpackage.dj
    public final void r(bq bqVar) {
        this.a.da();
    }

    @Override // defpackage.ce
    public final void s(PrintWriter printWriter, String[] strArr) {
        this.a.dump("  ", null, printWriter, strArr);
    }
}
