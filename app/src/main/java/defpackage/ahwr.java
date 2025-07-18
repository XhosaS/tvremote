package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahwr extends abxd implements abyr {
    public static final ahwr a;
    private static volatile abyy d;
    public abxs b = abzb.b;
    public abxj c = abxe.a;

    static {
        ahwr ahwrVar = new ahwr();
        a = ahwrVar;
        ahwrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahwr.class, ahwrVar);
    }

    private ahwr() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002'", new Object[]{"b", ahwo.class, "c"});
        }
        if (i2 == 3) {
            return new ahwr();
        }
        if (i2 == 4) {
            return new ahwm();
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
        synchronized (ahwr.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
