package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adhx extends abxd implements abyr {
    public static final adhx a;
    private static volatile abyy e;
    public int b;
    public double d;
    private byte f = 2;
    public String c = "";

    static {
        adhx adhxVar = new adhx();
        a = adhxVar;
        adhxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adhx.class, adhxVar);
    }

    private adhx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new adhx();
        }
        if (i2 == 4) {
            return new adhw();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adhx.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
