package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wam extends vuc implements vvk {
    public static final wam a;
    private static volatile vvq j;
    public int b;
    public Object d;
    public vai g;
    public vdb i;
    public int c = 0;
    public String e = "";
    public String f = "";
    public vun h = vvt.a;

    static {
        wam wamVar = new wam();
        a = wamVar;
        vuc.y(wam.class, wamVar);
    }

    private wam() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\b\u0001\u0001\u0001\b\b\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003\u001b\u0004ဉ\u0001\u0005<\u0000\u0006<\u0000\u0007Ȉ\b<\u0000", new Object[]{"d", "c", "b", "e", "g", "h", vcb.class, "i", waj.class, wal.class, "f", wak.class});
        }
        if (i2 == 3) {
            return new wam();
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
        synchronized (wam.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
