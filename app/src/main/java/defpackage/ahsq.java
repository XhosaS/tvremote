package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsq extends abxd implements abyr {
    public static final ahsq a;
    private static volatile abyy d;
    public abxs b;
    public abxs c;
    private byte e = 2;

    static {
        ahsq ahsqVar = new ahsq();
        a = ahsqVar;
        ahsqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahsq.class, ahsqVar);
    }

    private ahsq() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0002\u0001\u0001Л\u0003\u001b", new Object[]{"b", ahso.class, "c", ahsz.class});
        }
        if (i2 == 3) {
            return new ahsq();
        }
        if (i2 == 4) {
            return new ahsp();
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
        synchronized (ahsq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
