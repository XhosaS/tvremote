package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tpf extends vuc implements vvk {
    public static final tpf a;
    private static volatile vvq e;
    public int b;
    public vun c;
    public vun d;
    private int f;

    static {
        tpf tpfVar = new tpf();
        a = tpfVar;
        vuc.y(tpf.class, tpfVar);
    }

    private tpf() {
        vvt vvtVar = vvt.a;
        this.c = vvtVar;
        this.d = vvtVar;
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b", new Object[]{"f", "b", "c", tph.class, "d", tph.class});
        }
        if (i2 == 3) {
            return new tpf();
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
        vvq vvqVar = e;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tpf.class) {
            vtxVar = e;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                e = vtxVar;
            }
        }
        return vtxVar;
    }
}
