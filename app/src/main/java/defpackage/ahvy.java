package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvy extends abxd implements abyr {
    public static final ahvy a;
    private static volatile abyy e;
    public int b;
    public long c;
    public int d;

    static {
        ahvy ahvyVar = new ahvy();
        a = ahvyVar;
        ahvyVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvy.class, ahvyVar);
    }

    private ahvy() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001", new Object[]{"b", "c", "d", ahtb.a});
        }
        if (i2 == 3) {
            return new ahvy();
        }
        if (i2 == 4) {
            return new ahvx();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = e;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahvy.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
