package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tjd extends vuc implements vvk {
    public static final tjd a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public int e;
    public int c = 0;
    private byte h = 2;
    public int f = 200;

    static {
        tjd tjdVar = new tjd();
        a = tjdVar;
        vuc.y(tjd.class, tjdVar);
    }

    private tjd() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\t\u0001\u0001\u0001)\t\u0000\u0000\u0007\u0001ᔄ\u0000\u0002ᴌ\u0001\nм\u0000\u000b<\u0000\u0014м\u0000\u001eм\u0000\u001f<\u0000(м\u0000)м\u0000", new Object[]{"d", "c", "b", "e", "f", kzn.m, tje.class, tjf.class, tjc.class, tiz.class, tja.class, tjg.class, tjh.class});
        }
        if (i2 == 3) {
            return new tjd();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = g;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tjd.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
