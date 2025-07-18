package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acsk extends abxd implements abyr {
    public static final acsk a;
    private static volatile abyy e;
    public int b;
    public int c;
    public int d;

    static {
        acsk acskVar = new acsk();
        a = acskVar;
        acskVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acsk.class, acskVar);
    }

    private acsk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acsk();
        }
        if (i2 == 4) {
            return new acsj();
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
        synchronized (acsk.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
