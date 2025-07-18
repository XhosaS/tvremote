package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class yfs extends abxd implements abyr {
    public static final yfs a;
    private static volatile abyy e;
    public int b;
    public yfn c;
    public yfr d;

    static {
        yfs yfsVar = new yfs();
        a = yfsVar;
        yfsVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(yfs.class, yfsVar);
    }

    private yfs() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new yfs();
        }
        if (i2 == 4) {
            return new yfk();
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
        synchronized (yfs.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
