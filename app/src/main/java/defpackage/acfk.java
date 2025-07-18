package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acfk extends abxd implements abyr {
    public static final acfk a;
    private static volatile abyy b;
    private int c;
    private abqe d;
    private abqe e;
    private abzu f;
    private abyl g;
    private abyl h;
    private abyl i;
    private abyl j;
    private acfd k;
    private byte l;

    static {
        acfk acfkVar = new acfk();
        a = acfkVar;
        acfkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acfk.class, acfkVar);
    }

    private acfk() {
        abyl abylVar = abyl.a;
        this.g = abylVar;
        this.h = abylVar;
        this.i = abylVar;
        this.j = abylVar;
        this.l = (byte) 2;
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\b\u0000\u0001\u0007-\b\u0004\u0000\u0003\u0007ဉ\u0006\u0010ᐉ\u0001\u00112\u0014ᐉ\u0002\u00182\u001b2%2-ᐉ\u001f", new Object[]{"c", "f", "d", "g", acfh.a, "e", "h", acfg.a, "i", acfj.a, "j", acfi.a, "k"});
        }
        if (i2 == 3) {
            return new acfk();
        }
        if (i2 == 4) {
            return new acfb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.l = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acfk.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
