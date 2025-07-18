package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vob extends vuc implements vvk {
    public static final vob a;
    private static volatile vvq j;
    public int b;
    public int g;
    public int i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public vun h = vvt.a;

    static {
        vob vobVar = new vob();
        a = vobVar;
        vuc.y(vob.class, vobVar);
    }

    private vob() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0006\u001b\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", vnk.g, "h", vok.class, "i"});
        }
        if (i2 == 3) {
            return new vob();
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
        synchronized (vob.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
