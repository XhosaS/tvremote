package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqn extends abxd implements abyr {
    public static final zqn a;
    private static volatile abyy i;
    public int b;
    public long d;
    public zrn g;
    public int h;
    public String c = "";
    public String e = "";
    public String f = "";

    static {
        zqn zqnVar = new zqn();
        a = zqnVar;
        zqnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(zqn.class, zqnVar);
    }

    private zqn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i2, Object obj) {
        abyy abwxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0006ဉ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", zsa.a});
        }
        if (i3 == 3) {
            return new zqn();
        }
        if (i3 == 4) {
            return new zqm();
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
        synchronized (zqn.class) {
            abwxVar = i;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                i = abwxVar;
            }
        }
        return abwxVar;
    }
}
