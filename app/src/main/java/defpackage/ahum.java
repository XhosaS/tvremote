package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahum extends abxd implements abyr {
    public static final ahum a;
    private static volatile abyy j;
    public int b;
    public int e;
    public long f;
    public boolean h;
    public String c = "";
    public String d = "";
    public String g = "";
    public String i = "";

    static {
        ahum ahumVar = new ahum();
        a = ahumVar;
        ahumVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahum.class, ahumVar);
    }

    private ahum() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0007\u0000\u0001\u0001\b\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0007ဈ\u0007\bဇ\u0006", new Object[]{"b", "c", "d", "e", ahul.a, "f", "g", "i", "h"});
        }
        if (i2 == 3) {
            return new ahum();
        }
        if (i2 == 4) {
            return new ahuk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahum.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
