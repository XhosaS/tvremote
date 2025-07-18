package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahug extends abxd implements abyr {
    public static final ahug a;
    private static volatile abyy e;
    public int b;
    public long c;
    public int d;

    static {
        ahug ahugVar = new ahug();
        a = ahugVar;
        ahugVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahug.class, ahugVar);
    }

    private ahug() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", ahue.a});
        }
        if (i2 == 3) {
            return new ahug();
        }
        if (i2 == 4) {
            return new ahud();
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
        synchronized (ahug.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
