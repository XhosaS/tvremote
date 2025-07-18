package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzd extends vuc implements vvk {
    public static final uzd a;
    private static volatile vvq j;
    public int b;
    public uym c;
    public int d;
    public boolean e;
    public vun f;
    public boolean g;
    public vun h;
    public int i;

    static {
        uzd uzdVar = new uzd();
        a = uzdVar;
        vuc.y(uzd.class, uzdVar);
    }

    private uzd() {
        vvt vvtVar = vvt.a;
        this.f = vvtVar;
        this.h = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဉ\u0000\u0002င\u0001\u0003\u001b\u0005ဇ\u0005\u0006\u001b\u0007᠌\u0006\tဇ\u0002", new Object[]{"b", "c", "d", "f", uyg.class, "g", "h", uyz.class, "i", uxz.o, "e"});
        }
        if (i2 == 3) {
            return new uzd();
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
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uzd.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
