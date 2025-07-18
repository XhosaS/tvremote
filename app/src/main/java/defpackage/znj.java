package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class znj extends abxd implements abyr {
    public static final znj a;
    private static volatile abyy h;
    public int b;
    public int c;
    public String d = "";
    public boolean e;
    public int f;
    public boolean g;

    static {
        znj znjVar = new znj();
        a = znjVar;
        znjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(znj.class, znjVar);
    }

    private znj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004᠌\u0003\u0005ဇ\u0004", new Object[]{"b", "c", "d", "e", "f", zni.a, "g"});
        }
        if (i2 == 3) {
            return new znj();
        }
        if (i2 == 4) {
            return new znh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (znj.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
