package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abiy extends abxd implements abyr {
    public static final abiy a;
    private static volatile abyy f;
    public Object c;
    public Object e;
    public int b = 0;
    public int d = 0;
    private byte g = 2;

    static {
        abiy abiyVar = new abiy();
        a = abiyVar;
        abiyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abiy.class, abiyVar);
    }

    private abiy() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0004\u0002\u0000\u0001\u000e\u0004\u0000\u0000\u0002\u0001Ȼ\u0000\u0007Ȼ\u0001\rм\u0000\u000eм\u0001", new Object[]{"c", "b", "e", "d", yhq.class, yhq.class});
        }
        if (i2 == 3) {
            return new abiy();
        }
        if (i2 == 4) {
            return new abix();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abiy.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
