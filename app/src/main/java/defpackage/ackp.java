package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ackp extends abwz implements abxa {
    public static final ackp a;
    private static volatile abyy b;
    private int c;
    private ackl d;
    private ackr e;
    private ackn f;
    private aagq g;
    private abno h;
    private byte i = 2;

    static {
        ackp ackpVar = new ackp();
        a = ackpVar;
        ackpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ackp.class, ackpVar);
    }

    private ackp() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0002\f\u0005\u0000\u0000\u0005\u0002ᐉ\u0001\u0003ᐉ\u0002\u0007ᐉ\u0003\u000bᐉ\u0007\fᐉ\t", new Object[]{"c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new ackp();
        }
        if (i2 == 4) {
            return new acko();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = b;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ackp.class) {
            abwxVar = b;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                b = abwxVar;
            }
        }
        return abwxVar;
    }
}
