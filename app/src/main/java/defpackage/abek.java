package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abek extends abxd implements abyr {
    public static final abek a;
    private static volatile abyy c;
    private byte d = 2;
    public abxs b = abzb.b;

    static {
        abek abekVar = new abek();
        a = abekVar;
        abekVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abek.class, abekVar);
    }

    private abek() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", abei.class});
        }
        if (i2 == 3) {
            return new abek();
        }
        if (i2 == 4) {
            return new abej();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.d = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abek.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
