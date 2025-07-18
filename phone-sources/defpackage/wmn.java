package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wmn extends vuc implements vvk {
    public static final wmn a;
    private static volatile vvq i;
    public int b;
    public Object d;
    public wni e;
    public wmp f;
    public wme g;
    public wmf h;
    public int c = 0;
    private byte j = 2;

    static {
        wmn wmnVar = new wmn();
        a = wmnVar;
        vuc.y(wmn.class, wmnVar);
    }

    private wmn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\b\u0001\u0001\u0001\t\b\u0000\u0000\u0003\u0001ဉ\u0000\u0002м\u0000\u0003м\u0000\u0004<\u0000\u0005м\u0000\u0006ဉ\u0002\u0007ဉ\u0003\tဉ\u0001", new Object[]{"d", "c", "b", "e", wmg.class, wmm.class, wml.class, wmk.class, "g", "h", "f"});
        }
        if (i3 == 3) {
            return new wmn();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wmn.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
