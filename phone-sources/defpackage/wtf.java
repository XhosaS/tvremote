package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wtf extends vuc implements vvk {
    public static final wtf a;
    public static final vvd d;
    private static volatile vvq e;
    public wno b;
    public wkp c;
    private int f;
    private byte g = 2;

    static {
        wtf wtfVar = new wtf();
        a = wtfVar;
        vuc.y(wtf.class, wtfVar);
        d = vuc.C(wkx.a, wtfVar, wtfVar, 366550795, vwo.MESSAGE);
    }

    private wtf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"f", "b", "c"});
        }
        if (i2 == 3) {
            return new wtf();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wtf.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
