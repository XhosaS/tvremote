package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adsy extends abwz implements abxa {
    public static final adsy a;
    private static volatile abyy i;
    public int b;
    public boolean d;
    public adsq e;
    public adtt f;
    public int g;
    public adlo h;
    private adpz j;
    private byte k = 2;
    public boolean c = true;

    static {
        adsy adsyVar = new adsy();
        a = adsyVar;
        adsyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adsy.class, adsyVar);
    }

    private adsy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0007\u0000\u0001\u0002\u0014\u0007\u0000\u0000\u0001\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဉ\u0003\u0005ᐉ\u0005\tင\u0007\nဉ\b\u0014ဉ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "j"});
        }
        if (i3 == 3) {
            return new adsy();
        }
        if (i3 == 4) {
            return new adsx();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adsy.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
