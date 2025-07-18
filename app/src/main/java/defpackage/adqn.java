package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adqn extends abxd implements abyr {
    public static final adqn a;
    private static volatile abyy c;
    public adlw b;
    private int d;

    static {
        adqn adqnVar = new adqn();
        a = adqnVar;
        adqnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adqn.class, adqnVar);
    }

    private adqn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new adqn();
        }
        if (i2 == 4) {
            return new adqm();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adqn.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
