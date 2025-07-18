package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aebw extends abxd implements abyr {
    public static final aebw a;
    private static volatile abyy d;
    public abxs b;
    public abxs c;

    static {
        aebw aebwVar = new aebw();
        a = aebwVar;
        aebwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aebw.class, aebwVar);
    }

    private aebw() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0000\u0001\u001b\u0003\u001b", new Object[]{"b", aebm.class, "c", aebm.class});
        }
        if (i2 == 3) {
            return new aebw();
        }
        if (i2 == 4) {
            return new aebv();
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
        synchronized (aebw.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
