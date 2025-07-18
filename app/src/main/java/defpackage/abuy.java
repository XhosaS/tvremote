package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuy extends abxd implements abyr {
    public static final abuy a;
    private static volatile abyy d;
    public String b = "";
    public abvo c = abvo.b;

    static {
        abuy abuyVar = new abuy();
        a = abuyVar;
        abuyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abuy.class, abuyVar);
    }

    private abuy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abuy();
        }
        if (i2 == 4) {
            return new abux();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abuy.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
