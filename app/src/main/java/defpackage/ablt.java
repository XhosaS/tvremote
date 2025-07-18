package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablt extends abwz implements abxa {
    public static final ablt a;
    private static volatile abyy f;
    public int b;
    public byte e = 2;
    public String c = "";
    public abxs d = abzb.b;

    static {
        ablt abltVar = new ablt();
        a = abltVar;
        abltVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ablt.class, abltVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဈ\u0002\u0002Л", new Object[]{"b", "c", "d", abln.class});
        }
        if (i2 == 3) {
            return new ablt();
        }
        if (i2 == 4) {
            return new abls();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ablt.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
