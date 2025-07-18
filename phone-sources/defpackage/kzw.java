package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kzw extends vuc implements vvk {
    public static final kzw a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        kzw kzwVar = new kzw();
        a = kzwVar;
        vuc.y(kzw.class, kzwVar);
    }

    private kzw() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\f\u0001\u0000\u0001\r\f\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\f<\u0000\r<\u0000", new Object[]{"c", "b", lbl.class, lcg.class, lcd.class, lau.class, lbr.class, laq.class, lai.class, lbp.class, lci.class, kzi.class, lbg.class, lbe.class});
        }
        if (i2 == 3) {
            return new kzw();
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
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (kzw.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
