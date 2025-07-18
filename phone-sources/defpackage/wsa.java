package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wsa extends vuc implements vvk {
    public static final wsa a;
    public static final vvd h;
    private static volatile vvq i;
    public int b;
    public wls c;
    public wls d;
    public wkg f;
    public int g;
    private byte j = 2;
    public String e = "";

    static {
        wsa wsaVar = new wsa();
        a = wsaVar;
        vuc.y(wsa.class, wsaVar);
        h = vuc.C(wkx.a, wsaVar, wsaVar, 358060224, vwo.MESSAGE);
    }

    private wsa() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005᠌\u0004", new Object[]{"b", "c", "d", "e", "f", "g", wjk.i});
        }
        if (i3 == 3) {
            return new wsa();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wsa.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
