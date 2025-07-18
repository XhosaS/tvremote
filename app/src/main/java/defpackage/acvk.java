package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acvk extends abxd implements abyr {
    public static final acvk a;
    private static volatile abyy d;
    public int b;
    public float c;

    static {
        acvk acvkVar = new acvk();
        a = acvkVar;
        acvkVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(acvk.class, acvkVar);
    }

    private acvk() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ခ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new acvk();
        }
        if (i2 == 4) {
            return new acvj();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (acvk.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
