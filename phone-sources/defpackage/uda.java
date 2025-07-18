package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uda extends vuc implements vvk {
    public static final uda a;
    private static volatile vvq d;
    public int b;
    public long c;
    private int e;
    private int f;
    private byte g = 2;

    static {
        uda udaVar = new uda();
        a = udaVar;
        vuc.y(uda.class, udaVar);
    }

    private uda() {
    }

    public static /* synthetic */ void b(uda udaVar) {
        udaVar.b |= 4;
        udaVar.f = 0;
    }

    public static /* synthetic */ void c(uda udaVar) {
        udaVar.b |= 2;
        udaVar.e = 0;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "e", "f"});
        }
        if (i2 == 3) {
            return new uda();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uda.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
