package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abrh extends abxd implements abyr {
    public static final abrh a;
    public static final abxc b;
    private static volatile abyy c;

    static {
        abrh abrhVar = new abrh();
        a = abrhVar;
        abrhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abrh.class, abrhVar);
        abtq abtqVar = abtq.a;
        abrr abrrVar = abrr.a;
        b = new abxc(abtqVar, abrrVar, abrrVar, new abxb(null, 7, acap.MESSAGE, false, false));
    }

    private abrh() {
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
            return new abrh();
        }
        if (i2 == 4) {
            return new abrg();
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
        synchronized (abrh.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
