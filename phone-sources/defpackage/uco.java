package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uco extends vuc implements vvk {
    public static final uco a;
    private static volatile vvq p;
    public int b;
    public int c;
    public long d;
    public int h;
    public int j;
    public ucn k;
    public ucs l;
    public vun m;
    public ucl n;
    public ucx o;
    private ucw q;
    private byte r = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public String i = "";

    static {
        uco ucoVar = new uco();
        a = ucoVar;
        vuc.y(uco.class, ucoVar);
    }

    private uco() {
        vud vudVar = vud.a;
        this.m = vvt.a;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\r\u0000\u0002\u0002C\r\u0000\u0001\u0001\u0002ဂ\u0001\tဈ\u000e\rဈ\u000b\u0011ဈ\u0012\u001fဆ\u001f!ဉ!%ᐉ$(\u001b0ဉ-;ဈ\u000f?ဉ\"@င\u0010Cဉ9", new Object[]{"b", "c", "d", "f", "e", "i", "j", "k", "q", "m", ucm.class, "n", "g", "l", "h", "o"});
        }
        if (i2 == 3) {
            return new uco();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.r = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = p;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uco.class) {
            vtxVar = p;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                p = vtxVar;
            }
        }
        return vtxVar;
    }
}
