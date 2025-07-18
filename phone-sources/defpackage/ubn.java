package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ubn extends vuc implements vvk {
    public static final ubn a;
    private static volatile vvq e;
    public int b;
    public String c = "";
    public int d;

    static {
        ubn ubnVar = new ubn();
        a = ubnVar;
        vuc.y(ubn.class, ubnVar);
    }

    private ubn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ubu.b});
        }
        if (i2 == 3) {
            return new ubn();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (ubn.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
