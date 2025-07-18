package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uzb extends vuc implements vvk {
    public static final uzb a;
    private static volatile vvq n;
    public int b;
    public Object d;
    public wes e;
    public wes f;
    public boolean i;
    public uxw k;
    public int l;
    public int m;
    public int c = 0;
    public String g = "";
    public String h = "";
    public vun j = vvt.a;

    static {
        uzb uzbVar = new uzb();
        a = uzbVar;
        vuc.y(uzb.class, uzbVar);
    }

    private uzb() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\f\u0001\u0001\u0001\f\f\u0000\u0001\u0000\u0001;\u0000\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဉ\u0005\u0007᠌\u0006\b;\u0000\t7\u0000\n\u001b\u000b᠌\u0007\fဇ\u0004", new Object[]{"d", "c", "b", "e", "f", "g", "h", "k", "l", uxz.n, "j", uyw.class, "m", uxz.m, "i"});
        }
        if (i2 == 3) {
            return new uzb();
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
        vvq vvqVar = n;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (uzb.class) {
            vtxVar = n;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                n = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.j;
        if (vunVar.c()) {
            return;
        }
        this.j = vuc.s(vunVar);
    }
}
