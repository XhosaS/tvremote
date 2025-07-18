package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvp extends abxd implements abyr {
    public static final ahvp a;
    private static volatile abyy d;
    public abxj b;
    public abxj c;

    static {
        ahvp ahvpVar = new ahvp();
        a = ahvpVar;
        ahvpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvp.class, ahvpVar);
    }

    private ahvp() {
        abxe abxeVar = abxe.a;
        this.b = abxeVar;
        this.c = abxeVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001'\u0002'", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ahvp();
        }
        if (i2 == 4) {
            return new ahvo();
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
        synchronized (ahvp.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
