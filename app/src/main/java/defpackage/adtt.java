package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adtt extends abwz implements abxa {
    public static final adtt a;
    private static volatile abyy h;
    public int b;
    public abxs c;
    public adtn d;
    public abxs e;
    public adgs f;
    public boolean g;
    private byte i = 2;

    static {
        adtt adttVar = new adtt();
        a = adttVar;
        adttVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adtt.class, adttVar);
    }

    private adtt() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.e = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001\u001b\u0002ဉ\u0000\u0004\u001a\u0005ဉ\u0002\u0007ဇ\u0004", new Object[]{"b", "c", adti.class, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new adtt();
        }
        if (i2 == 4) {
            return new adts();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adtt.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
