package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazy extends abxd implements abyr {
    public static final aazy a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private aazw e;
    private byte f = 2;

    static {
        aazy aazyVar = new aazy();
        a = aazyVar;
        aazyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aazy.class, aazyVar);
    }

    private aazy() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0003\u0005\u0002\u0000\u0000\u0002\u0003ᐉ\u0000\u0005ᐉ\u0001", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new aazy();
        }
        if (i2 == 4) {
            return new aazx();
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
        synchronized (aazy.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
