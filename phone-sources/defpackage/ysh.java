package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class ysh extends yrv {
    private final int f;
    private final int g;

    public ysh(int i, int i2) {
        super(i);
        this.f = i;
        this.g = i2;
        if (i2 != 1) {
            if (i <= 0) {
                throw new IllegalArgumentException(a.cd(i, "Buffered channel capacity must be at least 1, but ", " was specified"));
            }
            return;
        }
        int i3 = ylg.a;
        throw new IllegalArgumentException("This implementation does not support suspension for senders, use " + new ykl(yrv.class).c() + " instead");
    }

    private final Object F(Object obj) {
        yse yseVarS;
        int i;
        ysh yshVar;
        yxo yxoVar = yrx.d;
        yse yseVar = (yse) this.c.a;
        while (true) {
            long jB = this.a.b();
            long j = 1152921504606846975L & jB;
            boolean z = super.z(jB);
            long j2 = yrx.b;
            long j3 = j / j2;
            int i2 = (int) (j % j2);
            if (yseVar.b != j3) {
                yseVarS = super.s(j3, yseVar);
                if (yseVarS != null) {
                    yshVar = this;
                    i = i2;
                } else if (z) {
                    return new ysb(q());
                }
            } else {
                yseVarS = yseVar;
                i = i2;
                yshVar = this;
            }
            Object obj2 = obj;
            int iC = super.c(yseVarS, i, obj2, j, yxoVar, z);
            yseVar = yseVarS;
            if (iC == 0) {
                yseVar.p();
                return ygi.a;
            }
            if (iC == 1) {
                return ygi.a;
            }
            if (iC == 2) {
                if (z) {
                    yseVar.s();
                    return new ysb(q());
                }
                u((yseVar.b * j2) + i);
                return ygi.a;
            }
            if (iC == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iC == 4) {
                if (j < g()) {
                    yseVar.p();
                }
                return new ysb(q());
            }
            yseVar.p();
            obj = obj2;
        }
    }

    @Override // defpackage.yrv
    protected final boolean A() {
        return this.g == 2;
    }

    @Override // defpackage.yrv, defpackage.ysn
    public final Object a(Object obj, yih yihVar) throws Throwable {
        Object objF = F(obj);
        if (!(objF instanceof ysb)) {
            return ygi.a;
        }
        ysd.b(objF);
        throw q();
    }

    @Override // defpackage.yrv, defpackage.ysn
    public final Object b(Object obj) {
        return F(obj);
    }
}
