package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aazi extends abxd implements abyr {
    public static final aazi a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private byte e = 2;

    static {
        aazi aaziVar = new aazi();
        a = aaziVar;
        aaziVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aazi.class, aaziVar);
    }

    private aazi() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new aazi();
        }
        if (i2 == 4) {
            return new aazh();
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
        synchronized (aazi.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
