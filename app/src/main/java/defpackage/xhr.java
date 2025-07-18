package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xhr extends abxd implements abyr {
    public static final xhr a;
    private static volatile abyy d;
    public abxs b;
    public xhx c;
    private int e;
    private abyl f = abyl.a;
    private byte g = 2;

    static {
        xhr xhrVar = new xhr();
        a = xhrVar;
        xhrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xhr.class, xhrVar);
    }

    private xhr() {
        abvo abvoVar = abvo.b;
        this.b = abzb.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0003\u0000\u0001\u0003\u0007\u0003\u0001\u0001\u0001\u0003Л\u0004ဉ\u0004\u00072", new Object[]{"e", "b", xht.class, "c", "f", xhq.a});
        }
        if (i2 == 3) {
            return new xhr();
        }
        if (i2 == 4) {
            return new xhp();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xhr.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
