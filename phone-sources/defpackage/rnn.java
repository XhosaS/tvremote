package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rnn extends vuc implements vvk {
    public static final rnn a;
    private static volatile vvq f;
    public int b;
    public long c;
    public vwe d;
    private byte g = 2;
    public vun e = vvt.a;

    static {
        rnn rnnVar = new rnn();
        a = rnnVar;
        vuc.y(rnn.class, rnnVar);
    }

    private rnn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0004Л", new Object[]{"b", "c", "d", "e", rnj.class});
        }
        if (i2 == 3) {
            return new rnn();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = f;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (rnn.class) {
            vtxVar = f;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                f = vtxVar;
            }
        }
        return vtxVar;
    }

    public final void b() {
        vun vunVar = this.e;
        if (vunVar.c()) {
            return;
        }
        this.e = vuc.s(vunVar);
    }
}
