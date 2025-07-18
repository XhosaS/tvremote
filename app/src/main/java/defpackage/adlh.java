package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adlh extends abxd implements abyr {
    public static final adlh a;
    private static volatile abyy e;
    public int b;
    public int c;
    public abxs d = abzb.b;
    private int f;

    static {
        adlh adlhVar = new adlh();
        a = adlhVar;
        adlhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adlh.class, adlhVar);
    }

    private adlh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003\u001a", new Object[]{"f", "b", "c", "d"});
        }
        if (i2 == 3) {
            return new adlh();
        }
        if (i2 == 4) {
            return new adlg();
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
        synchronized (adlh.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
