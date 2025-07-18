package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnc extends vuc implements vvk {
    public static final tnc a;
    private static volatile vvq s;
    public int b;
    public int c;
    public int d;
    public int e;
    public int h;
    public int k;
    public int o;
    public vun q;
    public vun r;
    public String f = "";
    public String g = "";
    public int i = -1;
    public int j = -1;
    public String l = "";
    public String m = "";
    public String n = "";
    public String p = "";

    static {
        tnc tncVar = new tnc();
        a = tncVar;
        vuc.y(tnc.class, tncVar);
    }

    private tnc() {
        vvt vvtVar = vvt.a;
        this.q = vvtVar;
        this.r = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nဈ\t\u000bဈ\n\fဈ\u000b\rင\f\u000eဈ\r\u0010\u001b\u0011\u001a", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", tnb.class, "r"});
        }
        if (i2 == 3) {
            return new tnc();
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
        vvq vvqVar = s;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tnc.class) {
            vtxVar = s;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                s = vtxVar;
            }
        }
        return vtxVar;
    }
}
