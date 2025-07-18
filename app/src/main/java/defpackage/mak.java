package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class mak extends abwz implements abxa {
    public static final mak a;
    private static volatile abyy b;
    private int c;
    private ablt d;
    private adhh e;
    private xww f;
    private adhh g;
    private byte h = 2;

    static {
        mak makVar = new mak();
        a = makVar;
        makVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(mak.class, makVar);
    }

    private mak() {
        Object[] objArr = abzb.a;
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0004\u0000\u0001\u000e\u001d\u0004\u0000\u0000\u0003\u000eᐉ\u0004\u0016ᐉ\r\u001aဉ\u000f\u001dᐉ\u0012", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new mak();
        }
        if (i2 == 4) {
            return new maj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (mak.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
