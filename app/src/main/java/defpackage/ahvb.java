package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvb extends abxd implements abyr {
    public static final ahvb a;
    private static volatile abyy h;
    public abxm b;
    public abxm c;
    public abxj d;
    public abxj e;
    public abxj f;
    public abxs g;

    static {
        ahvb ahvbVar = new ahvb();
        a = ahvbVar;
        ahvbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvb.class, ahvbVar);
    }

    private ahvb() {
        abyf abyfVar = abyf.a;
        this.b = abyfVar;
        this.c = abyfVar;
        abxe abxeVar = abxe.a;
        this.d = abxeVar;
        this.e = abxeVar;
        this.f = abxeVar;
        this.g = abzb.b;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0006\u0000\u0001%\u0002%\u0003'\u0004'\u0005'\u0006\u001a", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new ahvb();
        }
        if (i2 == 4) {
            return new ahva();
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
        synchronized (ahvb.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
