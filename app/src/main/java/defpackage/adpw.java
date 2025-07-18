package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpw extends abxd implements abyr {
    public static final adpw a;
    private static volatile abyy c;
    public String b = "";
    private int d;

    static {
        adpw adpwVar = new adpw();
        a = adpwVar;
        adpwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpw.class, adpwVar);
    }

    private adpw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new adpw();
        }
        if (i2 == 4) {
            return new adpv();
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
        synchronized (adpw.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
