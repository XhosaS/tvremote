package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acil extends abxd implements abyr {
    public static final acil a;
    private static volatile abyy j;
    public int b;
    public long c;
    public abzy d;
    public abzy e;
    public boolean f;
    public abzy h;
    public byte i = 2;
    public abxs g = abzb.b;

    static {
        acil acilVar = new acil();
        a = acilVar;
        acilVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acil.class, acilVar);
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005Л\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g", acps.class, "h"});
        }
        if (i2 == 3) {
            return new acil();
        }
        if (i2 == 4) {
            return new acik();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.i = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = j;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acil.class) {
            abwxVar = j;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                j = abwxVar;
            }
        }
        return abwxVar;
    }
}
