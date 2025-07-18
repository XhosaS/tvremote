package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvm extends abxd implements abyr {
    public static final ahvm a;
    private static volatile abyy e;
    public int b;
    public String c = "";
    public abxm d = abyf.a;

    static {
        ahvm ahvmVar = new ahvm();
        a = ahvmVar;
        ahvmVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvm.class, ahvmVar);
    }

    private ahvm() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0003(", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ahvm();
        }
        if (i2 == 4) {
            return new ahvl();
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
        synchronized (ahvm.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
