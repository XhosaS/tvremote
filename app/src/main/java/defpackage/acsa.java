package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsa extends abwz implements abxa {
    public static final acsa a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;
    private byte f = 2;

    static {
        acsa acsaVar = new acsa();
        a = acsaVar;
        acsaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acsa.class, acsaVar);
    }

    private acsa() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acsa();
        }
        if (i2 == 4) {
            return new acrz();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acsa.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
