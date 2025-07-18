package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adrb extends abwz implements abxa {
    public static final adrb a;
    private static volatile abyy j;
    public int b;
    public adpz c;
    public adqz d;
    public adpp e;
    public adph f;
    public admf h;
    public adqj i;
    private adsc k;
    private adqp l;
    private adpu m;
    private adrh o;
    private adrf p;
    private byte q = 2;
    public String g = "";

    static {
        adrb adrbVar = new adrb();
        a = adrbVar;
        adrbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adrb.class, adrbVar);
    }

    private adrb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\f\u0000\u0001\u0001\u001c\f\u0000\u0000\u0005\u0001ဉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0004\u0005ဉ\u0006\u0006ဈ\b\u0007ᐉ\t\tဉ\u0010\nဉ\u0011\rဉ\u0015\u0012ᐉ\u0019\u001aᐉ\u001b\u001cဉ\u001c", new Object[]{"b", "c", "d", "e", "f", "g", "k", "l", "m", "h", "i", "o", "p"});
        }
        if (i2 == 3) {
            return new adrb();
        }
        if (i2 == 4) {
            return new adra();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adrb.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
