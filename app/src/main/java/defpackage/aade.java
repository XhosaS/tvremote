package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aade extends abxd implements abyr {
    public static final aade a;
    private static volatile abyy d;
    public int b;
    public abxs c = abzb.b;

    static {
        aade aadeVar = new aade();
        a = aadeVar;
        aadeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aade.class, aadeVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"b", "c", aadd.class});
        }
        if (i2 == 3) {
            return new aade();
        }
        if (i2 == 4) {
            return new aadb();
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
        synchronized (aade.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
