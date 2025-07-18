package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yza extends vuc implements vvk {
    public static final yza a;
    private static volatile vvq f;
    public int b;
    public vun c;
    public vun d;
    public yyz e;

    static {
        yza yzaVar = new yza();
        a = yzaVar;
        vuc.y(yza.class, yzaVar);
    }

    private yza() {
        vvt vvtVar = vvt.a;
        this.c = vvtVar;
        this.d = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဉ\u0000", new Object[]{"b", "c", yzd.class, "d", yyy.class, "e"});
        }
        if (i2 == 3) {
            return new yza();
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
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yza.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }
}
