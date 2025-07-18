package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class accs extends abxd implements abyr {
    public static final accs a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxs d = abzb.b;

    static {
        accs accsVar = new accs();
        a = accsVar;
        accsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(accs.class, accsVar);
    }

    private accs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"b", "c", acgc.a, "d", accr.class});
        }
        if (i2 == 3) {
            return new accs();
        }
        if (i2 == 4) {
            return new accp();
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
        synchronized (accs.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
