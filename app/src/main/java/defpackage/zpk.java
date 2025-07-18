package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zpk extends abxd implements abyr {
    public static final zpk a;
    private static volatile abyy g;
    public int b;
    public int d;
    public int e;
    public zpn f;
    private zov h;
    private byte i = 2;
    public int c = -1;

    static {
        zpk zpkVar = new zpk();
        a = zpkVar;
        zpkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zpk.class, zpkVar);
    }

    private zpk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u000f\u0005\u0000\u0000\u0001\u0001င\u0000\u0002င\u0003\u0007င\u0007\rᐉ\u000b\u000fဉ\u0002", new Object[]{"b", "c", "d", "e", "f", "h"});
        }
        if (i2 == 3) {
            return new zpk();
        }
        if (i2 == 4) {
            return new zpj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = g;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zpk.class) {
            abwxVar = g;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                g = abwxVar;
            }
        }
        return abwxVar;
    }
}
