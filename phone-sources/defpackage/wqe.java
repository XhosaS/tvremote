package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqe extends vuc implements vvk {
    public static final wqe a;
    public static final vvd c;
    private static volatile vvq d;
    public woi b;
    private int e;
    private byte f = 2;

    static {
        wqe wqeVar = new wqe();
        a = wqeVar;
        vuc.y(wqe.class, wqeVar);
        c = vuc.C(wkg.a, wqeVar, wqeVar, 408689803, vwo.MESSAGE);
    }

    private wqe() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"e", "b"});
        }
        if (i2 == 3) {
            return new wqe();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqe.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
