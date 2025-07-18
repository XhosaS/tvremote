package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzh extends vuc implements vvk {
    public static final yzh a;
    public static final vvd f;
    private static volatile vvq g;
    public int b;
    public vum c;
    public vum d;
    public long e;

    static {
        yzh yzhVar = new yzh();
        a = yzhVar;
        vuc.y(yzh.class, yzhVar);
        f = vuc.C(zat.a, yzhVar, yzhVar, 100, vwo.MESSAGE);
    }

    private yzh() {
        vuz vuzVar = vuz.a;
        this.c = vuzVar;
        this.d = vuzVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001%\u0002%\u0003ဂ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new yzh();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzh.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void c() {
        vum vumVar = this.c;
        if (vumVar.c()) {
            return;
        }
        this.c = vuc.r(vumVar);
    }

    public final void i() {
        vum vumVar = this.d;
        if (vumVar.c()) {
            return;
        }
        this.d = vuc.r(vumVar);
    }
}
