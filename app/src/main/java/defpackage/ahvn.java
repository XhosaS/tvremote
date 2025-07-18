package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahvn extends abxd implements abyr {
    public static final ahvn a;
    private static volatile abyy l;
    public int b;
    public long c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;
    public long j;
    public abxs k = abzb.b;

    static {
        ahvn ahvnVar = new ahvn();
        a = ahvnVar;
        ahvnVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahvn.class, ahvnVar);
    }

    private ahvn() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\n\u001b", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", ahvm.class});
        }
        if (i2 == 3) {
            return new ahvn();
        }
        if (i2 == 4) {
            return new ahvk();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        abyy abyyVar = l;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ahvn.class) {
            abwxVar = l;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                l = abwxVar;
            }
        }
        return abwxVar;
    }
}
