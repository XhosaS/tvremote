package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wil extends vuc implements vvk {
    public static final wil a;
    private static volatile vvq e;
    public int b;
    public int d;
    private byte f = 2;
    public vun c = vvt.a;

    static {
        wil wilVar = new wil();
        a = wilVar;
        vuc.y(wil.class, wilVar);
    }

    private wil() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0001\u0001Л\u0003᠌\u0001", new Object[]{"b", "c", wjf.class, "d", wia.h});
        }
        if (i2 == 3) {
            return new wil();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wil.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
