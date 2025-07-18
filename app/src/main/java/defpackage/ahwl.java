package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwl extends abxd implements abyr {
    public static final ahwl a;
    private static volatile abyy d;
    public abzy c;
    private int e;
    private byte f = 2;
    public abxs b = abzb.b;

    static {
        ahwl ahwlVar = new ahwl();
        a = ahwlVar;
        ahwlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahwl.class, ahwlVar);
    }

    private ahwl() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0003\u0004\u0002\u0000\u0001\u0001\u0003Л\u0004ဉ\u0001", new Object[]{"e", "b", ahwj.class, "c"});
        }
        if (i2 == 3) {
            return new ahwl();
        }
        if (i2 == 4) {
            return new ahwk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahwl.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
