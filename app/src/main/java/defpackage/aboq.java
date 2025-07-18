package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboq extends abwz implements abxa {
    public static final aboq a;
    private static volatile abyy d;
    public int b;
    private byte e = 2;
    public String c = "";

    static {
        aboq aboqVar = new aboq();
        a = aboqVar;
        aboqVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aboq.class, aboqVar);
    }

    private aboq() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
        abvo abvoVar = abvo.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aboq();
        }
        if (i2 == 4) {
            return new abop();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aboq.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
