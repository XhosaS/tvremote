package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wvk extends vuc implements vvk {
    public static final wvk a;
    private static volatile vvq c;
    public vun b = vvt.a;

    static {
        wvk wvkVar = new wvk();
        a = wvkVar;
        vuc.y(wvk.class, wvkVar);
    }

    private wvk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0001\u0000\u0002\u001b", new Object[]{"b", wmp.class});
        }
        if (i2 == 3) {
            return new wvk();
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
        vvq vvqVar = c;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wvk.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
