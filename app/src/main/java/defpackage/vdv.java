package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdv extends abxd implements abyr {
    public static final vdv a;
    private static volatile abyy h;
    public int b;
    public abxs c;
    public abxs d;
    public boolean e;
    public long f;
    public long g;

    static {
        vdv vdvVar = new vdv();
        a = vdvVar;
        vdvVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vdv.class, vdvVar);
    }

    private vdv() {
        abzb abzbVar = abzb.b;
        this.c = abzbVar;
        this.d = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003ဇ\u0000\u0004ဂ\u0001\u0005ဂ\u0002", new Object[]{"b", "c", veb.class, "d", vdx.class, "e", "f", "g"});
        }
        if (i2 == 3) {
            return new vdv();
        }
        if (i2 == 4) {
            return new vdu();
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
        synchronized (vdv.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
