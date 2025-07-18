package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zrn extends abxd implements abyr {
    public static final zrn a;
    private static volatile abyy i;
    public int b;
    public long c;
    public int d;
    public boolean e;
    public boolean f;
    public boolean g;
    public int h;

    static {
        zrn zrnVar = new zrn();
        a = zrnVar;
        zrnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zrn.class, zrnVar);
    }

    private zrn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006᠌\u0005", new Object[]{"b", "c", "d", zrl.a, "e", "f", "g", "h", zrm.a});
        }
        if (i3 == 3) {
            return new zrn();
        }
        if (i3 == 4) {
            return new zrk();
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        abyy abyyVar = i;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (zrn.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
