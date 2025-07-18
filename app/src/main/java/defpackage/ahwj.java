package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwj extends abxd implements abyr {
    public static final ahwj a;
    private static volatile abyy e;
    public int b;
    public abwf c;
    public abwf d;
    private byte f = 2;

    static {
        ahwj ahwjVar = new ahwj();
        a = ahwjVar;
        ahwjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahwj.class, ahwjVar);
    }

    private ahwj() {
        abyf abyfVar = abyf.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0000\u0000\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new ahwj();
        }
        if (i2 == 4) {
            return new ahwi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahwj.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
