package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zan extends vuc implements vvk {
    public static final zan a;
    private static volatile vvq l;
    public int b;
    public boolean c;
    public zag d;
    public int g;
    public udg i;
    public zap j;
    public zam k;
    private byte m = 2;
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        zan zanVar = new zan();
        a = zanVar;
        vuc.y(zan.class, zanVar);
    }

    private zan() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.m);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0000\u0001\u0001ဇ\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005᠌\u0004\u0007ဈ\u0007\tᐉ\b\u000bဉ\n\fဉ\u000b", new Object[]{"b", "c", "d", "e", "f", "g", yyv.r, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new zan();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.m = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = l;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (zan.class) {
            vtxVar = l;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                l = vtxVar;
            }
        }
        return vtxVar;
    }
}
