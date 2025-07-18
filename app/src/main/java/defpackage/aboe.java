package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aboe extends abwz implements abxa {
    public static final aboe a;
    private static volatile abyy d;
    public int b;
    public abog c;
    private byte e = 2;

    static {
        aboe aboeVar = new aboe();
        a = aboeVar;
        aboeVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aboe.class, aboeVar);
    }

    private aboe() {
        abxe abxeVar = abxe.a;
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aboe();
        }
        if (i2 == 4) {
            return new abod();
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
        synchronized (aboe.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
