package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abkw extends abxd implements abyr {
    public static final abkw a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        abkw abkwVar = new abkw();
        a = abkwVar;
        abkwVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abkw.class, abkwVar);
        abky abkyVar = abky.a;
        addb addbVar = addb.a;
        b = new abxc(abkyVar, addbVar, addbVar, new abxb(null, 5, acap.MESSAGE, false, false));
    }

    private abkw() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new abkw();
        }
        if (i2 == 4) {
            return new abkv();
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
        synchronized (abkw.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
