package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmv extends abxd implements abyr {
    public static final zmv a;
    private static volatile abyy b;
    private int c;
    private zlv d;
    private zlv e;
    private byte f = 2;

    static {
        zmv zmvVar = new zmv();
        a = zmvVar;
        zmvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zmv.class, zmvVar);
    }

    private zmv() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\b\t\u0002\u0000\u0000\u0002\bᐉ\u0006\tᐉ\u0007", new Object[]{"c", "d", "e"});
        }
        if (i2 == 3) {
            return new zmv();
        }
        if (i2 == 4) {
            return new zmu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zmv.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
