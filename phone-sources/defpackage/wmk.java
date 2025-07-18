package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmk extends vuc implements vvk {
    public static final wmk a;
    private static volatile vvq g;
    public int c;
    public wni d;
    public wni e;
    public wkx f;
    private int h;
    private byte i = 2;
    public String b = "";

    static {
        wmk wmkVar = new wmk();
        a = wmkVar;
        vuc.y(wmk.class, wmkVar);
    }

    private wmk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001Ȉ\u0002\u0004\u0003ဉ\u0000\u0004ဉ\u0001\u0005ᐉ\u0002", new Object[]{"h", "b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new wmk();
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
        synchronized (wmk.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }
}
