package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aclh extends abxd implements abyr {
    public static final aclh a;
    private static volatile abyy b;
    private int c;
    private acmp d;
    private acmd e;
    private aclf f;
    private acmf g;
    private acml h;
    private acmn i;
    private acmh j;
    private acmb k;
    private acln l;
    private acmj m;
    private aclv n;
    private acmz o;
    private byte p = 2;

    static {
        aclh aclhVar = new aclh();
        a = aclhVar;
        aclhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(aclh.class, aclhVar);
    }

    private aclh() {
        Object[] objArr = abzb.a;
        abxe abxeVar = abxe.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.p);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\f\u0000\u0001\u0001\u0013\f\u0000\u0000\f\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0006\u0007ᐉ\b\bᐉ\t\tᐉ\n\rᐉ\u000e\u000eᐉ\u000f\u0013ᐉ\u0005", new Object[]{"c", "d", "e", "f", "g", "h", "j", "k", "l", "m", "n", "o", "i"});
        }
        if (i2 == 3) {
            return new aclh();
        }
        if (i2 == 4) {
            return new aclg();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.p = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (aclh.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
