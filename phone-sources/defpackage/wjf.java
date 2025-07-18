package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wjf extends vuc implements vvk {
    public static final wjf a;
    private static volatile vvq g;
    public int b;
    public int c;
    public wji e;
    private wjc h;
    private byte i = 2;
    public vun d = vvt.a;
    public vsz f = vsz.b;

    static {
        wjf wjfVar = new wjf();
        a = wjfVar;
        vuc.y(wjf.class, wjfVar);
    }

    private wjf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0002\u0001င\u0000\u0002Л\u0003ဉ\u0001\u0004ည\u0002\u0006ᐉ\u0004", new Object[]{"b", "c", "d", wjf.class, "e", "f", "h"});
        }
        if (i2 == 3) {
            return new wjf();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wjf.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
