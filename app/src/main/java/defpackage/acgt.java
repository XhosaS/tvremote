package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgt extends abxd implements abyr {
    public static final acgt a;
    private static volatile abyy h;
    public int b;
    public acgi c;
    public int d;
    public int e;
    public int f;
    public long g;
    private byte i = 2;

    static {
        acgt acgtVar = new acgt();
        a = acgtVar;
        acgtVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgt.class, acgtVar);
    }

    private acgt() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            abxh abxhVar = acgx.a;
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᐉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005ဂ\u0004", new Object[]{"b", "c", "d", abxhVar, "e", acgq.a, "f", abxhVar, "g"});
        }
        if (i2 == 3) {
            return new acgt();
        }
        if (i2 == 4) {
            return new acgs();
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
        synchronized (acgt.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
