package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiw extends abxd implements abyr {
    public static final abiw a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public abiu d;

    static {
        abiw abiwVar = new abiw();
        a = abiwVar;
        abiwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abiw.class, abiwVar);
    }

    private abiw() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abiw();
        }
        if (i2 == 4) {
            return new abiv();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abiw.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
