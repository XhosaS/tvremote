package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrl extends abxd implements abyr {
    public static final abrl a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        abrl abrlVar = new abrl();
        a = abrlVar;
        abrlVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abrl.class, abrlVar);
        abtq abtqVar = abtq.a;
        abrn abrnVar = abrn.a;
        b = new abxc(abtqVar, abrnVar, abrnVar, new abxb(null, 6, acap.MESSAGE, false, false));
    }

    private abrl() {
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
            return new abrl();
        }
        if (i2 == 4) {
            return new abrk();
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
        synchronized (abrl.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
