package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqe extends abwz implements abxa {
    public static final abqe a;
    private static volatile abyy b;
    private abyl c = abyl.a;
    private byte d = 2;

    static {
        abqe abqeVar = new abqe();
        a = abqeVar;
        abqeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abqe.class, abqeVar);
    }

    private abqe() {
        Object[] objArr = abzb.a;
        abvo abvoVar = abvo.b;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0000##\u0001\u0001\u0000\u0001#в", new Object[]{"c", abqd.a});
        }
        if (i2 == 3) {
            return new abqe();
        }
        if (i2 == 4) {
            return new abqc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abqe.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
