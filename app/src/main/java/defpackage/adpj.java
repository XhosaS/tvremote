package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpj extends abxd implements abyr {
    public static final adpj a;
    private static volatile abyy d;
    public float b;
    public float c;
    private int e;

    static {
        adpj adpjVar = new adpj();
        a = adpjVar;
        adpjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpj.class, adpjVar);
    }

    private adpj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"e", "b", "c"});
        }
        if (i2 == 3) {
            return new adpj();
        }
        if (i2 == 4) {
            return new adpi();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adpj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
