package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vew extends abxd implements abyr {
    public static final vew a;
    private static volatile abyy f;
    public abxs b;
    public abxs c;
    public abxs d;
    public abxs e;
    private byte g = 2;

    static {
        vew vewVar = new vew();
        a = vewVar;
        vewVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vew.class, vewVar);
    }

    private vew() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
        this.d = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0000\u00032\u0004\u0000\u0004\u0000\u0003\u001b\u0004\u001b0\u001b2\u001b", new Object[]{"c", veu.class, "d", vfc.class, "b", vff.class, "e", ves.class});
        }
        if (i2 == 3) {
            return new vew();
        }
        if (i2 == 4) {
            return new vev();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (vew.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
