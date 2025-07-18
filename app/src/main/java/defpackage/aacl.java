package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aacl extends abxd implements abyr {
    public static final aacl a;
    public static volatile abyy b;
    public int c;
    public int d;
    public aacn e;
    public abvo f = abvo.b;

    static {
        aacl aaclVar = new aacl();
        a = aaclVar;
        aaclVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aacl.class, aaclVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000\u0003\n", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new aacl();
        }
        if (i2 == 4) {
            return new aack();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aacl.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
