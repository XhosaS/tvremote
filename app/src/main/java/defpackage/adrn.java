package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrn extends abxd implements abyr {
    public static final adrn a;
    private static volatile abyy c;
    public String b = "";
    private int d;

    static {
        adrn adrnVar = new adrn();
        a = adrnVar;
        adrnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adrn.class, adrnVar);
    }

    private adrn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new adrn();
        }
        if (i2 == 4) {
            return new adrm();
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
        synchronized (adrn.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
