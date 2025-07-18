package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class win extends vuc implements vvk {
    public static final win a;
    private static volatile vvq l;
    public int b;
    public int c;
    public int d;
    public int i;
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String j = "";
    public String k = "";

    static {
        win winVar = new win();
        a = winVar;
        vuc.y(win.class, winVar);
    }

    private win() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006\bဈ\u0007\tဈ\b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new win();
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
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (win.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
