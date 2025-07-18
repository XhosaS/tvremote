package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclj extends abxd implements abyr {
    public static final aclj a;
    private static volatile abyy b;
    private int c;
    private acln d;
    private aclp e;
    private aclt f;
    private aclr g;
    private byte h = 2;

    static {
        aclj acljVar = new aclj();
        a = acljVar;
        acljVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aclj.class, acljVar);
    }

    private aclj() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\u0005ᐉ\u0002\u0006ᐉ\u0003\bᐉ\u0005", new Object[]{"c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new aclj();
        }
        if (i2 == 4) {
            return new acli();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aclj.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
