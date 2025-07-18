package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlp extends abxd implements abyr {
    public static final zlp a;
    public static final abxc b;
    private static volatile abyy d;
    private Object e;
    public int c = 0;
    private byte f = 2;

    static {
        zlp zlpVar = new zlp();
        a = zlpVar;
        zlpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zlp.class, zlpVar);
        b = new abxc(zot.a, zlpVar, zlpVar, new abxb(null, 772, acap.MESSAGE, false, false));
    }

    private zlp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001м\u0000\u0002м\u0000", new Object[]{"e", "c", zpn.class, zpk.class});
        }
        if (i2 == 3) {
            return new zlp();
        }
        if (i2 == 4) {
            return new zlo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.f = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zlp.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
