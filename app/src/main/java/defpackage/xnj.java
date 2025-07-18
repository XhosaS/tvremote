package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xnj extends abwz implements abxa {
    public static final xnj a;
    private static volatile abyy d;
    public String b;
    public abvo c;
    private int e;
    private xan f;
    private byte g = 2;

    static {
        xnj xnjVar = new xnj();
        a = xnjVar;
        xnjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xnj.class, xnjVar);
    }

    private xnj() {
        abvo abvoVar = abvo.b;
        Object[] objArr = abzb.a;
        this.b = "";
        this.c = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0003\u0000\u0001\u0006\u000e\u0003\u0000\u0000\u0001\u0006ဈ\u0004\nည\u0007\u000eᐉ\u0006", new Object[]{"e", "b", "c", "f"});
        }
        if (i2 == 3) {
            return new xnj();
        }
        if (i2 == 4) {
            return new xni();
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
        synchronized (xnj.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
