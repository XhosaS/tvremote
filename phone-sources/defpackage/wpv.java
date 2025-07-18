package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wpv extends vuc implements vvk {
    public static final wpv a;
    public static final vvd h;
    private static volatile vvq i;
    public int b;
    public int c;
    public wls e;
    public wpu f;
    public wpu g;
    private byte j = 2;
    public String d = "";

    static {
        wpv wpvVar = new wpv();
        a = wpvVar;
        vuc.y(wpv.class, wpvVar);
        h = vuc.C(wkg.a, wpvVar, wpvVar, 427857035, vwo.MESSAGE);
    }

    private wpv() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001᠌\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", wjk.g, "d", "e", "f", "g"});
        }
        if (i3 == 3) {
            return new wpv();
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
        synchronized (wpv.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
