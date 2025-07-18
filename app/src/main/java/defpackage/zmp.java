package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zmp extends abwz implements abxa {
    public static final zmp a;
    private static volatile abyy h;
    public int b;
    public zmt c;
    public int d;
    public zmt e;
    public long f;
    public boolean g;
    private byte i = 2;

    static {
        zmp zmpVar = new zmp();
        a = zmpVar;
        zmpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zmp.class, zmpVar);
    }

    private zmp() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0002\u0001ᐉ\u0000\u0002᠌\u0001\u0003ᐉ\u0002\u0004ဂ\u0004\u0006ဇ\u0005", new Object[]{"b", "c", "d", zmn.a, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new zmp();
        }
        if (i2 == 4) {
            return new zmm();
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
        synchronized (zmp.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
