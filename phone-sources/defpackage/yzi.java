package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzi extends vtz implements vua {
    public static final yzi a;
    private static volatile vvq b;
    private byte c = 2;

    static {
        yzi yziVar = new yzi();
        a = yziVar;
        vuc.y(yzi.class, yziVar);
    }

    private yzi() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new yzi();
        }
        if (i2 == 4) {
            return new vty(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.c = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = b;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (yzi.class) {
            vtxVar = b;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                b = vtxVar;
            }
        }
        return vtxVar;
    }
}
