package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cxu extends abxd implements abyr {
    public static final cxu a;
    private static volatile abyy d;
    public int b;
    public xdl c;
    private xfp e;
    private byte f = 2;

    static {
        cxu cxuVar = new cxu();
        a = cxuVar;
        cxuVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(cxu.class, cxuVar);
    }

    private cxu() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"b", "e", "c"});
        }
        if (i2 == 3) {
            return new cxu();
        }
        if (i2 == 4) {
            return new cxt();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (cxu.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
