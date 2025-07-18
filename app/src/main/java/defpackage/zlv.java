package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlv extends abxd implements abyr {
    public static final zlv a;
    private static volatile abyy j;
    public int b;
    public zpn c;
    public zpn e;
    public zon f;
    public int g;
    public zmr h;
    public zlx i;
    private zpn k;
    private byte l = 2;
    public abxs d = abzb.b;

    static {
        zlv zlvVar = new zlv();
        a = zlvVar;
        zlvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zlv.class, zlvVar);
    }

    private zlv() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0001\t\b\u0000\u0001\u0007\u0001ᐉ\u0000\u0002Л\u0003ᐉ\u0001\u0004ᐉ\u0004\u0005᠌\u0005\u0007ᐉ\u0006\bᐉ\u0003\tᐉ\u0007", new Object[]{"b", "c", "d", zot.class, "e", "f", "g", zmn.a, "h", "k", "i"});
        }
        if (i2 == 3) {
            return new zlv();
        }
        if (i2 == 4) {
            return new zlu();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zlv.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
