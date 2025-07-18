package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acia extends abxd implements abyr {
    public static final acia a;
    private static volatile abyy b;
    private int c;
    private aazw d;
    private byte e = 2;

    static {
        acia aciaVar = new acia();
        a = aciaVar;
        aciaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acia.class, aciaVar);
    }

    private acia() {
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
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acia();
        }
        if (i2 == 4) {
            return new achz();
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
        synchronized (acia.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
