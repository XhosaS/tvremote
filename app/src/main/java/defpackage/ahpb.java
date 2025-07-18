package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahpb extends abxd implements abyr {
    public static final ahpb a;
    private static volatile abyy j;
    public int b;
    public int c;
    public int e;
    public int f;
    public epb g;
    public epb h;
    public abwf i;
    private byte k = 2;
    public abxs d = abzb.b;

    static {
        ahpb ahpbVar = new ahpb();
        a = ahpbVar;
        ahpbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahpb.class, ahpbVar);
    }

    private ahpb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0003\u0001᠌\u0000\u0002Л\u0003င\u0001\u0004င\u0002\u0005ᐉ\u0003\u0006ᐉ\u0004\u0007ဉ\u0005", new Object[]{"b", "c", ahoz.a, "d", epb.class, "e", "f", "g", "h", "i"});
        }
        if (i2 == 3) {
            return new ahpb();
        }
        if (i2 == 4) {
            return new ahpa();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.k = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahpb.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
