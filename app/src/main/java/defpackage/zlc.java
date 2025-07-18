package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zlc extends abxd implements abyr {
    public static final zlc a;
    private static volatile abyy b;
    private int c;
    private int d;
    private zpe e;
    private zpp f;
    private byte g = 2;

    static {
        zlc zlcVar = new zlc();
        a = zlcVar;
        zlcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zlc.class, zlcVar);
    }

    private zlc() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u00029v\u0002\u0000\u0000\u00029ᐉ\u000bvᐉ7", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zlc();
        }
        if (i2 == 4) {
            return new zlb();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zlc.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
