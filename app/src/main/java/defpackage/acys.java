package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acys extends abxd implements abyr {
    public static final acys a;
    private static volatile abyy e;
    public int b;
    public float c;
    public float d;

    static {
        acys acysVar = new acys();
        a = acysVar;
        acysVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acys.class, acysVar);
    }

    private acys() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acys();
        }
        if (i2 == 4) {
            return new acyr();
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
        synchronized (acys.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
