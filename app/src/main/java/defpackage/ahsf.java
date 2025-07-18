package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahsf extends abxd implements abyr {
    public static final ahsf a;
    private static volatile abyy h;
    public int b;
    public ahsc c;
    public ahuc d;
    public int e;
    public ahsa f;
    public String g = "";

    static {
        ahsf ahsfVar = new ahsf();
        a = ahsfVar;
        ahsfVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahsf.class, ahsfVar);
    }

    private ahsf() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003᠌\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", ahse.a, "f", "g"});
        }
        if (i2 == 3) {
            return new ahsf();
        }
        if (i2 == 4) {
            return new ahsd();
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
        synchronized (ahsf.class) {
            abwxVar = h;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                h = abwxVar;
            }
        }
        return abwxVar;
    }
}
