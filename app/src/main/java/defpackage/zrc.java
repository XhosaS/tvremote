package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrc extends abxd implements abyr {
    public static final zrc a;
    private static volatile abyy f;
    public int b;
    public zqf c;
    public long d;
    public long e;

    static {
        zrc zrcVar = new zrc();
        a = zrcVar;
        zrcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zrc.class, zrcVar);
    }

    private zrc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zrc();
        }
        if (i2 == 4) {
            return new zrb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zrc.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
