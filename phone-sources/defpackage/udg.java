package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class udg extends vuc implements vvk {
    public static final udg a;
    private static volatile vvq g;
    public int b;
    public Object d;
    public udd e;
    public int c = 0;
    private byte h = 2;
    public vun f = vvt.a;

    static {
        udg udgVar = new udg();
        a = udgVar;
        vuc.y(udg.class, udgVar);
    }

    private udg() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0003\u0001\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔉ\u0000\u0002Л\u0004м\u0000", new Object[]{"d", "c", "b", "e", "f", udd.class, ude.class});
        }
        if (i2 == 3) {
            return new udg();
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
        synchronized (udg.class) {
            vtxVar = g;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                g = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.f;
        if (vunVar.c()) {
            return;
        }
        this.f = vuc.s(vunVar);
    }
}
