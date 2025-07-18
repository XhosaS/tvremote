package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abol extends abwz implements abxa {
    public static final abol a;
    private static volatile abyy c;
    private int d;
    private byte e = 2;
    public String b = "";

    static {
        abol abolVar = new abol();
        a = abolVar;
        abolVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abol.class, abolVar);
    }

    private abol() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0000\u0003ဈ\u0002", new Object[]{"d", "b"});
        }
        if (i2 == 3) {
            return new abol();
        }
        if (i2 == 4) {
            return new abok();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = c;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abol.class) {
            abwxVar = c;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                c = abwxVar;
            }
        }
        return abwxVar;
    }
}
