package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abac extends abxd implements abyr {
    public static final abac a;
    private static volatile abyy b;
    private int c;
    private int d;
    private int e;
    private byte f = 2;

    static {
        abac abacVar = new abac();
        a = abacVar;
        abacVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abac.class, abacVar);
    }

    private abac() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔆ\u0000\u0002ᔆ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new abac();
        }
        if (i2 == 4) {
            return new abab();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abac.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
