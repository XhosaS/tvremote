package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acgi extends abwz implements abxa {
    public static final acgi a;
    private static volatile abyy g;
    public int b;
    public aceu c;
    public abuy e;
    public abtq f;
    private byte h = 2;
    public String d = "";

    static {
        acgi acgiVar = new acgi();
        a = acgiVar;
        acgiVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acgi.class, acgiVar);
    }

    private acgi() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0002⎋\u0004\u0000\u0000\u0001\u0002ဈ\u0002\u0003ဉ\u0003\u0006ဉ\u0000⎋ᐉ\u0004", new Object[]{"b", "d", "e", "c", "f"});
        }
        if (i2 == 3) {
            return new acgi();
        }
        if (i2 == 4) {
            return new acgh();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acgi.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
