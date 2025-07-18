package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fog extends abxd implements abyr {
    public static final fog a;
    private static volatile abyy h;
    public int b;
    public adwm c;
    public String d = "";
    public String e = "";
    public abzy f;
    public float g;

    static {
        fog fogVar = new fog();
        a = fogVar;
        fogVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(fog.class, fogVar);
    }

    private fog() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003Ȉ\u0004ဉ\u0001\u0005ခ\u0002", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new fog();
        }
        if (i2 == 4) {
            return new fof();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = h;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (fog.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
