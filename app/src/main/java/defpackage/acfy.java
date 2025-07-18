package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfy extends abxd implements abyr {
    public static final acfy a;
    private static volatile abyy f;
    public Object c;
    public int d;
    public achu e;
    private int g;
    public int b = 0;
    private byte h = 2;

    static {
        acfy acfyVar = new acfy();
        a = acfyVar;
        acfyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfy.class, acfyVar);
    }

    private acfy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0001\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001<\u0000\u0002м\u0000\u0003᠌\u0000\u0004ဉ\u0001", new Object[]{"c", "b", "g", adci.class, achs.class, "d", acgc.a, "e"});
        }
        if (i2 == 3) {
            return new acfy();
        }
        if (i2 == 4) {
            return new acfx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acfy.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
