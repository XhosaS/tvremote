package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclz extends abxd implements abyr {
    public static final aclz a;
    private static volatile abyy b;
    private int c;
    private aclx d;
    private acnb e;
    private acmr f;
    private acll g;
    private acmx h;
    private aclj i;
    private byte j = 2;

    static {
        aclz aclzVar = new aclz();
        a = aclzVar;
        aclzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aclz.class, aclzVar);
    }

    private aclz() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0011;\u0006\u0000\u0000\u0006\u0011ᐉ\u000e3ᐉ\n5ᐉ\u000b7ᐉ\f:ᐉ\r;ᐉ\u001b", new Object[]{"c", "h", "d", "e", "f", "g", "i"});
        }
        if (i2 == 3) {
            return new aclz();
        }
        if (i2 == 4) {
            return new acly();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aclz.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
