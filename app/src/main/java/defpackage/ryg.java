package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ryg extends abxd implements abyr {
    public static final ryg a;
    private static volatile abyy h;
    public int b;
    public Object d;
    public sgo e;
    public long f;
    public int g;
    public int c = 0;
    private byte i = 2;

    static {
        ryg rygVar = new ryg();
        a = rygVar;
        rygVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ryg.class, rygVar);
    }

    private ryg() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\b\u0001\u0001\u0001f\b\u0000\u0000\u0001\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004м\u0000\u0005<\u0000dဉ\u0000eဂ\u0001fင\u0002", new Object[]{"d", "c", "b", rxw.class, ryn.class, rxq.class, rxz.class, ryb.class, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ryg();
        }
        if (i2 == 4) {
            return new ryf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ryg.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
