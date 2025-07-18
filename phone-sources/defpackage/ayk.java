package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayk extends bxw {
    public long a;
    public long b;
    public bpt c;
    public bpt d;
    public float e;
    public float f;
    public float g;
    public mr h;
    public yqe i;
    public yjk l;
    public yjv m;
    public float n;
    public final blq o;
    private yqe p;
    public final bdl k = new bce(0.0f);
    public final ayu j = new ayu();
    private final float[] D = {0.0f, 0.0f};

    public ayk(yjk yjkVar, yjv yjvVar, float f, long j, long j2, bpt bptVar, bpt bptVar2, float f2, float f3, float f4) {
        this.a = j;
        this.b = j2;
        this.c = bptVar;
        this.d = bptVar2;
        this.e = f2;
        this.f = f3;
        this.g = f4;
        this.l = yjkVar;
        this.m = yjvVar;
        this.n = f;
        blq blqVarV = bga.v(new ars(this, 20));
        O(blqVarV);
        this.o = blqVarV;
    }

    public final void b() {
        yqe yqeVar = this.p;
        if (yqeVar != null) {
            yqeVar.t(null);
        }
        this.p = null;
        if (this.A) {
            if (Float.compare(this.g, 0.0f) <= 0 || Float.compare(this.f, 0.0f) <= 0) {
                this.k.h(0.0f);
            } else {
                this.p = ykr.q(F(), null, 0, new ayj(this, ykn.j(Math.round((this.f / this.g) * 1000.0f), 50), (yih) null, 0), 3);
            }
        }
    }

    @Override // defpackage.bko
    public final void cd() {
        b();
    }

    @Override // defpackage.bko
    public final void ch() {
        this.h = null;
    }

    public final void e() {
        fh.D(this.o);
    }

    public final void f() {
        this.o.e();
    }

    protected final float[] g() {
        float[] fArr = this.D;
        fArr[0] = 0.0f;
        float fFloatValue = ((Number) this.l.a()).floatValue();
        float f = fFloatValue >= 0.0f ? fFloatValue : 0.0f;
        if (f > 1.0f) {
            f = 1.0f;
        }
        fArr[1] = f;
        return fArr;
    }
}
