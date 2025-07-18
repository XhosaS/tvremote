package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsj extends vuc implements vvk {
    public static final wsj a;
    private static volatile vvq c;
    public int b = 0;
    private Object d;

    static {
        wsj wsjVar = new wsj();
        a = wsjVar;
        vuc.y(wsj.class, wsjVar);
    }

    private wsj() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"d", "b", wsi.class, wsg.class, wsh.class});
        }
        if (i2 == 3) {
            return new wsj();
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
        synchronized (wsj.class) {
            vtxVar = c;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                c = vtxVar;
            }
        }
        return vtxVar;
    }
}
