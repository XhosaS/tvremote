package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahte extends abxd implements abyr {
    public static final ahte a;
    private static volatile abyy g;
    public int b;
    public long c;
    public int d;
    public ahto f;
    private byte h = 2;
    public abxs e = abzb.b;

    static {
        ahte ahteVar = new ahte();
        a = ahteVar;
        ahteVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahte.class, ahteVar);
    }

    private ahte() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0001\u0001စ\u0000\u0002Л\u0003᠌\u0001\u0006ဉ\u0004", new Object[]{"b", "c", "e", ahth.class, "d", ahtd.a, "f"});
        }
        if (i2 == 3) {
            return new ahte();
        }
        if (i2 == 4) {
            return new ahtc();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahte.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
