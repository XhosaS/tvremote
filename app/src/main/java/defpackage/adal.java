package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adal extends abxd implements abyr {
    public static final adal a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        adal adalVar = new adal();
        a = adalVar;
        adalVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adal.class, adalVar);
        b = new abxc(acyd.a, adalVar, adalVar, new abxb(null, 284051629, acap.MESSAGE, false, false));
    }

    private adal() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new adal();
        }
        if (i2 == 4) {
            return new adak();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adal.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
