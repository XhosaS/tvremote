package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adkh extends abxd implements abyr {
    public static final adkh a;
    public static final abxc b;
    private static volatile abyy i;
    public int c;
    public abxs d;
    public abxs e;
    public adjr f;
    public abxs g;
    public adjr h;
    private byte j = 2;

    static {
        adkh adkhVar = new adkh();
        a = adkhVar;
        adkhVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adkh.class, adkhVar);
        b = new abxc(adkb.a, adkhVar, adkhVar, new abxb(null, 293000, acap.MESSAGE, false, false));
    }

    private adkh() {
        abzb abzbVar = abzb.b;
        this.d = abzbVar;
        this.e = abzbVar;
        this.g = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0002\u0010\u0005\u0000\u0003\u0001\u0002ဉ\u0000\u0003ဉ\u0001\u0004\u001b\tЛ\u0010\u001b", new Object[]{"c", "f", "h", "g", adjr.class, "d", adjm.class, "e", adjp.class});
        }
        if (i3 == 3) {
            return new adkh();
        }
        if (i3 == 4) {
            return new adkg();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (adkh.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
