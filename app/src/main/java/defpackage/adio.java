package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adio extends abwz implements abxa {
    public static final adio a;
    private static volatile abyy d;
    public long b;
    private int e;
    private adin f;
    private byte g = 2;
    public abxs c = abzb.b;

    static {
        adio adioVar = new adio();
        a = adioVar;
        adioVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adio.class, adioVar);
    }

    private adio() {
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0001\u0002\u0001ဂ\u0002\u0003Л\u0005ᐉ\u0004", new Object[]{"e", "b", "c", adht.class, "f"});
        }
        if (i2 == 3) {
            return new adio();
        }
        if (i2 == 4) {
            return new adil();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adio.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
