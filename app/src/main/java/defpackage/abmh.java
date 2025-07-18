package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmh extends abxd implements abyr {
    public static final abmh a;
    private static volatile abyy b;
    private int c;
    private abmr d;
    private abmj e;
    private aboe f;
    private byte g = 2;

    static {
        abmh abmhVar = new abmh();
        a = abmhVar;
        abmhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmh.class, abmhVar);
    }

    private abmh() {
        Object[] objArr = abzb.a;
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\t\u0015\u0003\u0000\u0000\u0003\tᐉ\u0007\u0011ᐉ\r\u0015ᐉ\f", new Object[]{"c", "d", "f", "e"});
        }
        if (i2 == 3) {
            return new abmh();
        }
        if (i2 == 4) {
            return new abmg();
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
        synchronized (abmh.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
