package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yjn extends abxd implements abyr {
    public static final yjn a;
    private static volatile abyy c;
    public abxs b = abzb.b;

    static {
        yjn yjnVar = new yjn();
        a = yjnVar;
        yjnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yjn.class, yjnVar);
    }

    private yjn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0003\u0003\u0001\u0000\u0001\u0000\u0003\u001b", new Object[]{"b", yjm.class});
        }
        if (i2 == 3) {
            return new yjn();
        }
        if (i2 == 4) {
            return new yjk();
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
        synchronized (yjn.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
