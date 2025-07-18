package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrj extends abxd implements abyr {
    public static final abrj a;
    private static volatile abyy f;
    public int b;
    public abtq c;
    public abud d;
    public abtx e;
    private byte g = 2;

    static {
        abrj abrjVar = new abrj();
        a = abrjVar;
        abrjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abrj.class, abrjVar);
    }

    private abrj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abrj();
        }
        if (i2 == 4) {
            return new abri();
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
        synchronized (abrj.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
