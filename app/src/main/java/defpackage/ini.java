package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ini extends abxd implements abyr {
    public static final ini a;
    private static volatile abyy d;
    public abxs b = abzb.b;
    public boolean c;

    static {
        ini iniVar = new ini();
        a = iniVar;
        iniVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ini.class, iniVar);
    }

    private ini() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"b", inq.class, "c"});
        }
        if (i2 == 3) {
            return new ini();
        }
        if (i2 == 4) {
            return new inh();
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
        synchronized (ini.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
