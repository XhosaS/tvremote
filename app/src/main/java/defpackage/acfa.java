package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfa extends abxd implements abyr {
    public static final acfa a;
    private static volatile abyy b;
    private int c;
    private acfk d;
    private byte e = 2;

    static {
        acfa acfaVar = new acfa();
        a = acfaVar;
        acfaVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfa.class, acfaVar);
    }

    private acfa() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0002", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new acfa();
        }
        if (i2 == 4) {
            return new acez();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acfa.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
