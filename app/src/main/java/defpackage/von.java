package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class von extends abxd implements abyr {
    public static final von a;
    private static volatile abyy f;
    public int b;
    public int c;
    public vhg d;
    public int e;
    private byte g = 2;

    static {
        von vonVar = new von();
        a = vonVar;
        vonVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(von.class, vonVar);
    }

    private von() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003᠌\u0002", new Object[]{"b", "c", "d", "e", vif.a});
        }
        if (i2 == 3) {
            return new von();
        }
        if (i2 == 4) {
            return new vom();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (von.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
