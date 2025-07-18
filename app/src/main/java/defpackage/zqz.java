package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqz extends abxd implements abyr {
    public static final zqz a;
    private static volatile abyy i;
    public int b;
    public zqf c;
    public int d;
    public long e;
    public long f;
    public String g = "";
    public int h;

    static {
        zqz zqzVar = new zqz();
        a = zqzVar;
        zqzVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqz.class, zqzVar);
    }

    private zqz() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", zsc.a, "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new zqz();
        }
        if (i3 == 4) {
            return new zqy();
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
        synchronized (zqz.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
