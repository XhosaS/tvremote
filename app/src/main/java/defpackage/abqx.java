package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abqx extends abxd implements abyr {
    public static final abqx a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        abqx abqxVar = new abqx();
        a = abqxVar;
        abqxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abqx.class, abqxVar);
    }

    private abqx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0001\u0000\u0002\u0004\u0003\u0000\u0000\u0001\u0002<\u0000\u0003м\u0000\u0004<\u0000", new Object[]{"c", "b", abqw.class, abqu.class, abqs.class});
        }
        if (i2 == 3) {
            return new abqx();
        }
        if (i2 == 4) {
            return new abqq();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abqx.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
