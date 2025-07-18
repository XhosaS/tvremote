package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvh extends abwz implements abxa {
    public static final ahvh a;
    private static volatile abyy q;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public ahvp j;
    public int l;
    public int m;
    public int o;
    public ahvp p;
    private byte r = 2;
    public abxs k = abzb.b;

    static {
        ahvh ahvhVar = new ahvh();
        a = ahvhVar;
        ahvhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvh.class, ahvhVar);
    }

    private ahvh() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.r);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0003\u0004င\u0006\u0005\u001b\u0006င\b\u0007င\u0002\bင\u0004\tင\u0005\nဉ\u0007\u000bင\t\fင\n\rဉ\u000b", new Object[]{"b", "c", "d", "f", "i", "k", ahvf.class, "l", "e", "g", "h", "j", "m", "o", "p"});
        }
        if (i2 == 3) {
            return new ahvh();
        }
        if (i2 == 4) {
            return new ahvg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.r = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = q;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahvh.class) {
            abwxVar = q;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                q = abwxVar;
            }
        }
        return abwxVar;
    }
}
