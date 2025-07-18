package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class epb extends abxd implements abyr {
    public static final epb a;
    private static volatile abyy i;
    public int b;
    public epi c;
    public adga d;
    public epd e;
    public long f;
    public long g;
    public int h;
    private byte j = 2;

    static {
        epb epbVar = new epb();
        a = epbVar;
        epbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(epb.class, epbVar);
    }

    private epb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0004ᐉ\u0002\u0005စ\u0003\u0006စ\u0004\u0007င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new epb();
        }
        if (i3 == 4) {
            return new epa();
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
        synchronized (epb.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
