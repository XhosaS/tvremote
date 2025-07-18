package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcd extends vuc implements vvk {
    public static final lcd a;
    private static volatile vvq p;
    public int b;
    public lce c;
    public lcr f;
    public lcr g;
    public vun i;
    public vun j;
    public vun k;
    public String l;
    public boolean m;
    public vun n;
    public int o;
    public String d = "";
    public String e = "";
    public String h = "";

    static {
        lcd lcdVar = new lcd();
        a = lcdVar;
        vuc.y(lcd.class, lcdVar);
    }

    private lcd() {
        vvt vvtVar = vvt.a;
        this.i = vvtVar;
        this.j = vvtVar;
        this.k = vvtVar;
        this.l = "";
        this.n = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\r\u0000\u0001\u0001\u0010\r\u0000\u0004\u0000\u0001ဉ\u0000\u0003Ȉ\u0004Ȉ\u0005ဉ\u0001\u0006ဉ\u0002\u0007Ȉ\b\u001b\n\u001b\u000bȈ\f\u0007\r\u001b\u000f\u001b\u0010\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", law.class, "k", lbt.class, "l", "m", "n", lav.class, "j", law.class, "o"});
        }
        if (i2 == 3) {
            return new lcd();
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
        vvq vvqVar = p;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (lcd.class) {
            vtxVar = p;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                p = vtxVar;
            }
        }
        return vtxVar;
    }
}
