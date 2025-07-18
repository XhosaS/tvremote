package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vdx extends abxd implements abyr {
    public static final vdx a;
    private static volatile abyy h;
    public int b;
    public int c;
    public long d;
    public int e;
    public float f;
    public float g;

    static {
        vdx vdxVar = new vdx();
        a = vdxVar;
        vdxVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(vdx.class, vdxVar);
    }

    private vdx() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003င\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"b", "c", vdy.a, "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new vdx();
        }
        if (i2 == 4) {
            return new vdw();
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
        synchronized (vdx.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
