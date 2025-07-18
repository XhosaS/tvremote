package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvj extends abxd implements abyr {
    public static final ahvj a;
    private static volatile abyy i;
    public int b;
    public int c;
    public abzy d;
    public String e = "";
    public String f = "";
    public int g;
    public long h;

    static {
        ahvj ahvjVar = new ahvj();
        a = ahvjVar;
        ahvjVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvj.class, ahvjVar);
    }

    private ahvj() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new ahvj();
        }
        if (i3 == 4) {
            return new ahvi();
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
        synchronized (ahvj.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
