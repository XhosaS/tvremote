package defpackage;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class esn extends abxd implements abyr {
    public static final esn a;
    public static final abxn c = new abxn(adlm.UNKNOWN);
    private static volatile abyy d;
    public abyl b = abyl.a;

    static {
        esn esnVar = new esn();
        a = esnVar;
        esnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(esn.class, esnVar);
    }

    private esn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001࠲", new Object[]{"b", esm.a, adll.a});
        }
        if (i2 == 3) {
            return new esn();
        }
        if (i2 == 4) {
            return new esl();
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
        synchronized (esn.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
