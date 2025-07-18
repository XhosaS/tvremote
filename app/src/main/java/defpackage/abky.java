package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abky extends abwz implements abxa {
    public static final abky a;
    private static volatile abyy f;
    public int b;
    public adby c;
    public String d;
    public byte e = 2;

    static {
        abky abkyVar = new abky();
        a = abkyVar;
        abkyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abky.class, abkyVar);
    }

    public abky() {
        Object[] objArr = abzb.a;
        this.d = "";
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0004\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0004ဈ\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abky();
        }
        if (i2 == 4) {
            return new abkx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abky.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
