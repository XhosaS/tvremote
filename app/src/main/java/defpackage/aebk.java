package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aebk extends abxd implements abyr {
    public static final aebk a;
    private static volatile abyy i;
    public int b;
    public boolean f;
    public String c = "";
    public String d = "";
    public abxs e = abzb.b;
    public abvo g = abvo.b;
    public int h = 1;

    static {
        aebk aebkVar = new aebk();
        a = aebkVar;
        aebkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aebk.class, aebkVar);
    }

    private aebk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\t\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001b\u0007ဇ\u0005\bည\u0006\t᠌\u0007", new Object[]{"b", "c", "d", "e", aebe.class, "f", "g", "h", aebi.a});
        }
        if (i3 == 3) {
            return new aebk();
        }
        if (i3 == 4) {
            return new aebh();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aebk.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
