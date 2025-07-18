package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wru extends vuc implements vvk {
    public static final wru a;
    public static final vvd f;
    private static volatile vvq g;
    public Object c;
    public wrv d;
    public wly e;
    private int h;
    public int b = 0;
    private byte i = 2;

    static {
        wru wruVar = new wru();
        a = wruVar;
        vuc.y(wru.class, wruVar);
        f = vuc.C(wkx.a, wruVar, wruVar, 348562147, vwo.MESSAGE);
    }

    private wru() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000", new Object[]{"c", "b", "h", "d", "e", wrj.class, wrh.class, wre.class, wrs.class, wrd.class, wrk.class, wrq.class, wrf.class, wro.class, wri.class, wrp.class, wrr.class, wrn.class, wrl.class, wrm.class, wrt.class});
        }
        if (i2 == 3) {
            return new wru();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wru.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
