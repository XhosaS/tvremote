package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class buh implements bvv, buz {
    public final byo a;
    public buf b;
    public boolean c;

    public buh(byo byoVar, buf bufVar) {
        this.a = byoVar;
        this.b = bufVar;
    }

    @Override // defpackage.clx
    public final float a() {
        return this.a.a();
    }

    @Override // defpackage.cmd
    public final float b() {
        return this.a.b();
    }

    @Override // defpackage.buz
    public final boolean cA() {
        return false;
    }

    @Override // defpackage.bvv
    public final bvu cB(int i, int i2, Map map, yjv yjvVar) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bty.c(a.cn(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new bug(i, i2, map, yjvVar, this);
    }

    @Override // defpackage.cmd
    public final float cn(long j) {
        return cme.e(this.a, j);
    }

    @Override // defpackage.clx
    public final float co(float f) {
        return cme.g(this.a, f);
    }

    @Override // defpackage.clx
    public final float cp(int i) {
        return cme.h(this.a, i);
    }

    @Override // defpackage.clx
    public final float cq(long j) {
        return cme.i(this.a, j);
    }

    @Override // defpackage.clx
    public final float cr(float f) {
        return cme.j(this.a, f);
    }

    @Override // defpackage.clx
    public final int cu(float f) {
        return cme.k(this.a, f);
    }

    @Override // defpackage.clx
    public final long cv(long j) {
        return cme.l(this.a, j);
    }

    @Override // defpackage.clx
    public final long cw(long j) {
        return cme.m(this.a, j);
    }

    @Override // defpackage.cmd
    public final long cx(float f) {
        return cme.f(this.a, f);
    }

    @Override // defpackage.clx
    public final long cy(float f) {
        return cme.n(this.a, f);
    }

    @Override // defpackage.bvv
    public final bvu cz(int i, int i2, Map map, yjv yjvVar) {
        return fh.U(this.a, i, i2, map, yjvVar);
    }

    @Override // defpackage.buz
    public final cmi n() {
        return this.a.n();
    }
}
