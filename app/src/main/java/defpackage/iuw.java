package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iuw extends abxd implements abyr {
    public static final iuw a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        iuw iuwVar = new iuw();
        a = iuwVar;
        iuwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(iuw.class, iuwVar);
    }

    private iuw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\n\u0001\u0000\u0001\n\n\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003м\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000", new Object[]{"c", "b", iuz.class, ivb.class, ivi.class, ivn.class, ivk.class, iut.class, ivp.class, ivg.class, ivr.class, ivd.class});
        }
        if (i2 == 3) {
            return new iuw();
        }
        if (i2 == 4) {
            return new iuu();
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
        synchronized (iuw.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
