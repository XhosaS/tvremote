package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aciy extends abxd implements abyr {
    public static final aciy a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        aciy aciyVar = new aciy();
        a = aciyVar;
        aciyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aciy.class, aciyVar);
        b = new abxc(zot.a, aciyVar, aciyVar, new abxb(null, 481, acap.MESSAGE, false, false));
    }

    private aciy() {
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
            return new aciy();
        }
        if (i2 == 4) {
            return new acix();
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
        synchronized (aciy.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
