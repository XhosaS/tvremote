package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ymo extends abxd implements abyr {
    public static final ymo a;
    private static volatile abyy i;
    public String b = "";
    public abxs c;
    public String d;
    public abxs e;
    public String f;
    public String g;
    public abxs h;
    private int j;

    static {
        ymo ymoVar = new ymo();
        a = ymoVar;
        ymoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ymo.class, ymoVar);
    }

    private ymo() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = "";
        this.e = abzbVar;
        this.f = "";
        this.g = "";
        this.h = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဈ\u0001\u0004\u001a\u0005ဈ\u0002\u0006ဈ\u0003\u0007\u001b", new Object[]{"j", "b", "c", "d", "e", "f", "g", "h", ymn.class});
        }
        if (i3 == 3) {
            return new ymo();
        }
        if (i3 == 4) {
            return new yml();
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
        synchronized (ymo.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
