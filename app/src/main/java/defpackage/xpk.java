package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xpk extends abxd implements abyr {
    public static final xpk a;
    private static volatile abyy d;
    public xal b;
    public acjc c;
    private int e;
    private xpj f;
    private xph g;
    private byte h = 2;

    static {
        xpk xpkVar = new xpk();
        a = xpkVar;
        xpkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xpk.class, xpkVar);
    }

    private xpk() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0004\u0000\u0001\u0001\f\u0004\u0000\u0000\u0004\u0001ᐉ\u0000\nᐉ\b\u000bᐉ\n\fᐉ\t", new Object[]{"e", "b", "f", "c", "g"});
        }
        if (i2 == 3) {
            return new xpk();
        }
        if (i2 == 4) {
            return new xpf();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.h = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (xpk.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
