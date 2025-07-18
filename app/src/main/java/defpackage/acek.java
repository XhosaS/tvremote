package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acek extends abxd implements abyr {
    public static final acek a;
    private static volatile abyy d;
    public abxs b;
    public abxs c;

    static {
        acek acekVar = new acek();
        a = acekVar;
        acekVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acek.class, acekVar);
    }

    private acek() {
        abzb abzbVar = abzb.b;
        this.b = abzbVar;
        this.c = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"b", acby.class, "c", acby.class});
        }
        if (i2 == 3) {
            return new acek();
        }
        if (i2 == 4) {
            return new acej();
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
        synchronized (acek.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
