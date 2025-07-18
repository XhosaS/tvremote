package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahqo extends abxd implements abyr {
    public static final ahqo a;
    public static final abxc b;
    private static volatile abyy e;
    public abxm c;
    public abxm d;

    static {
        ahqo ahqoVar = new ahqo();
        a = ahqoVar;
        ahqoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ahqo.class, ahqoVar);
        b = new abxc(ahvh.a, ahqoVar, ahqoVar, new abxb(null, 100, acap.MESSAGE, false, false));
    }

    private ahqo() {
        abyf abyfVar = abyf.a;
        this.c = abyfVar;
        this.d = abyfVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001%\u0002%", new Object[]{"c", "d"});
        }
        if (i2 == 3) {
            return new ahqo();
        }
        if (i2 == 4) {
            return new ahqn();
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
        synchronized (ahqo.class) {
            abwxVar = e;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                e = abwxVar;
            }
        }
        return abwxVar;
    }
}
