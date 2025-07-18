package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaza extends abxd implements abyr {
    public static final aaza a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private aazw e;
    private aazw f;
    private byte g = 2;

    static {
        aaza aazaVar = new aaza();
        a = aazaVar;
        aazaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aaza.class, aazaVar);
    }

    private aaza() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aaza();
        }
        if (i2 == 4) {
            return new aayz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aaza.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
