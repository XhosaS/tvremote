package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkk extends abxd implements abyr {
    public static final abkk a;
    private static volatile abyy e;
    public int b;
    public abja c;
    public abjc d;

    static {
        abkk abkkVar = new abkk();
        a = abkkVar;
        abkkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abkk.class, abkkVar);
    }

    private abkk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0002#\u0002\u0000\u0000\u0000\u0002ဉ\t#ဉ\n", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abkk();
        }
        if (i2 == 4) {
            return new abkj();
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
        synchronized (abkk.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
