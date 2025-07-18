package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vad extends vuc implements vvk {
    public static final vuk a = new qiu(12);
    public static final vad b;
    private static volatile vvq e;
    public int c;
    public vuj d = vud.a;

    static {
        vad vadVar = new vad();
        b = vadVar;
        vuc.y(vad.class, vadVar);
    }

    private vad() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(b, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0002,", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new vad();
        }
        if (i2 == 4) {
            return new vtw(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vad.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(b);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
