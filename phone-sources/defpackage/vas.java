package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vas extends vuc implements vvk {
    public static final vas a;
    private static volatile vvq i;
    public long d;
    public int e;
    public int f;
    public int h;
    public String b = "";
    public String c = "";
    public String g = "";

    static {
        vas vasVar = new vas();
        a = vasVar;
        vuc.y(vas.class, vasVar);
    }

    private vas() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\f\u0004Ȉ\u0005\f\u0006\u0002\u0007Ȉ", new Object[]{"c", "e", "f", "g", "h", "d", "b"});
        }
        if (i3 == 3) {
            return new vas();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vas.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
