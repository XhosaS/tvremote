package defpackage;

import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bvb implements bvv, buz {
    private final /* synthetic */ buz a;
    private final cmi b;

    public bvb(buz buzVar, cmi cmiVar) {
        this.a = buzVar;
        this.b = cmiVar;
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
        return this.a.cA();
    }

    @Override // defpackage.bvv
    public final bvu cB(int i, int i2, Map map, yjv yjvVar) {
        if (i2 < 0) {
            i2 = 0;
        }
        if (i < 0) {
            i = 0;
        }
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            bty.c(a.cn(i2, i, "Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215."));
        }
        return new bva(i, i2, map);
    }

    @Override // defpackage.cmd
    public final float cn(long j) {
        return this.a.cn(j);
    }

    @Override // defpackage.clx
    public final float co(float f) {
        return this.a.co(f);
    }

    @Override // defpackage.clx
    public final float cp(int i) {
        return this.a.cp(i);
    }

    @Override // defpackage.clx
    public final float cq(long j) {
        return this.a.cq(j);
    }

    @Override // defpackage.clx
    public final float cr(float f) {
        return this.a.cr(f);
    }

    @Override // defpackage.clx
    public final int cu(float f) {
        return this.a.cu(f);
    }

    @Override // defpackage.clx
    public final long cv(long j) {
        return this.a.cv(j);
    }

    @Override // defpackage.clx
    public final long cw(long j) {
        return this.a.cw(j);
    }

    @Override // defpackage.cmd
    public final long cx(float f) {
        return this.a.cx(f);
    }

    @Override // defpackage.clx
    public final long cy(float f) {
        return this.a.cy(f);
    }

    @Override // defpackage.bvv
    public final /* synthetic */ bvu cz(int i, int i2, Map map, yjv yjvVar) {
        return fh.U(this, i, i2, map, yjvVar);
    }

    @Override // defpackage.buz
    public final cmi n() {
        return this.b;
    }
}
