package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahuo extends abxd implements abyr {
    public static final ahuo a;
    private static volatile abyy b;
    private int c;
    private zpr d;
    private byte e = 2;

    static {
        ahuo ahuoVar = new ahuo();
        a = ahuoVar;
        ahuoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahuo.class, ahuoVar);
    }

    private ahuo() {
        Object[] objArr = abzb.a;
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new ahuo();
        }
        if (i2 == 4) {
            return new ahun();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahuo.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
