package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ykc extends abxd implements abyr {
    public static final ykc a;
    private static volatile abyy d;
    public abxs b;
    public abxs c;

    static {
        ykc ykcVar = new ykc();
        a = ykcVar;
        ykcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ykc.class, ykcVar);
    }

    private ykc() {
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
            return new abzc(a, "\u0004\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0002\u0000\u0002\u001a\u0004\u001b", new Object[]{"b", "c", yju.class});
        }
        if (i2 == 3) {
            return new ykc();
        }
        if (i2 == 4) {
            return new ykb();
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
        synchronized (ykc.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
