package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yol extends abxd implements abyr {
    public static final yol a;
    private static volatile abyy b;
    private int c;
    private yoj d;

    static {
        yol yolVar = new yol();
        a = yolVar;
        yolVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yol.class, yolVar);
    }

    private yol() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new yol();
        }
        if (i2 == 4) {
            return new yok();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (yol.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
