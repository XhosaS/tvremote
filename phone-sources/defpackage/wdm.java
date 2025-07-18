package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wdm extends vtz implements vua {
    public static final wdm a;
    private static volatile vvq n;
    public int b;
    public int d;
    public int f;
    public wdo h;
    public int i;
    public int j;
    public vwe m;
    private byte o = 2;
    public String c = "";
    public String e = "";
    public String g = "";
    public String k = "";

    static {
        wdm wdmVar = new wdm();
        a = wdmVar;
        vuc.y(wdm.class, wdmVar);
    }

    private wdm() {
        vsz vszVar = vsz.b;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.o);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\n\u0000\u0001\u0001\r\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004᠌\u0003\u0007ဈ\u0006\bဉ\u0007\n᠌\t\u000b᠌\n\fဈ\u000b\rဉ\f", new Object[]{"b", "c", "d", vnk.t, "e", "f", wdp.b, "g", "h", "i", vnk.u, "j", vnk.r, "k", "m"});
        }
        if (i2 == 3) {
            return new wdm();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.o = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = n;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wdm.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }
}
