package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uwc extends vuc implements vvk {
    public static final uwc a;
    private static volatile vvq i;
    public int b;
    public Object d;
    public int g;
    public int c = 0;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        uwc uwcVar = new uwc();
        a = uwcVar;
        vuc.y(uwc.class, uwcVar);
    }

    private uwc() {
        vvt vvtVar = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0001\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဈ\u0002\u0003᠌\u0003\u0004ဈ\u0004\u0007<\u0000\b<\u0000", new Object[]{"d", "c", "b", "e", "f", "g", uvj.c, "h", uwa.class, uwb.class});
        }
        if (i3 == 3) {
            return new uwc();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uwc.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
