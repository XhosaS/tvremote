package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class adpc extends abxd implements abyr {
    public static final adpc a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        adpc adpcVar = new adpc();
        a = adpcVar;
        adpcVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(adpc.class, adpcVar);
    }

    private adpc() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001;\u0000\u0002<\u0000", new Object[]{"c", "b", adne.class});
        }
        if (i2 == 3) {
            return new adpc();
        }
        if (i2 == 4) {
            return new adpb();
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
        synchronized (adpc.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
