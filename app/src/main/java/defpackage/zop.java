package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zop extends abxd implements abyr {
    public static final zop a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        zop zopVar = new zop();
        a = zopVar;
        zopVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zop.class, zopVar);
        b = new abxc(zot.a, abzb.b, null, new abxb(null, 260, acap.STRING, true, false));
    }

    private zop() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new zop();
        }
        if (i2 == 4) {
            return new zoo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zop.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
