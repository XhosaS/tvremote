package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wum extends vuc implements vvk {
    public static final wum a;
    public static final vvd i;
    private static volatile vvq j;
    public int b;
    public wll c;
    public wkg f;
    public wul h;
    private byte k = 2;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        wum wumVar = new wum();
        a = wumVar;
        vuc.y(wum.class, wumVar);
        i = vuc.C(wkx.a, wumVar, wumVar, 349607178, vwo.MESSAGE);
    }

    private wum() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0002\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ᐉ\u0003\u0005ဈ\u0004\u0006ᐉ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new wum();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = j;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wum.class) {
            vtxVar = j;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                j = vtxVar;
            }
        }
        return vtxVar;
    }
}
