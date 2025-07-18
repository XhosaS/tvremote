package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrd extends abxd implements abyr {
    public static final zrd a;
    private static volatile abyy f;
    public int b;
    public abxs c = abzb.b;
    public long d;
    public long e;

    static {
        zrd zrdVar = new zrd();
        a = zrdVar;
        zrdVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zrd.class, zrdVar);
    }

    private zrd() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဃ\u0000\u0003ဃ\u0001", new Object[]{"b", "c", zrc.class, "d", "e"});
        }
        if (i2 == 3) {
            return new zrd();
        }
        if (i2 == 4) {
            return new zra();
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
        synchronized (zrd.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
