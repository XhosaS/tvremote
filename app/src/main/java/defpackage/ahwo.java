package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwo extends abxd implements abyr {
    public static final ahwo a;
    private static volatile abyy d;
    public int b;
    public long c;
    private int e;

    static {
        ahwo ahwoVar = new ahwo();
        a = ahwoVar;
        ahwoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahwo.class, ahwoVar);
    }

    private ahwo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"e", "b", ahwp.a, "c"});
        }
        if (i2 == 3) {
            return new ahwo();
        }
        if (i2 == 4) {
            return new ahwn();
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
        synchronized (ahwo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
