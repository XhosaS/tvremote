package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abmr extends abwz implements abxa {
    public static final abmr a;
    private static volatile abyy o;
    public int b;
    public Object d;
    public abmf e;
    public abxs f;
    public abnm g;
    public boolean h;
    public boolean i;
    public abxs j;
    public abxs k;
    public abxs l;
    public abmv m;
    private zpp p;
    public int c = 0;
    private byte q = 2;

    static {
        abmr abmrVar = new abmr();
        a = abmrVar;
        abmrVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(abmr.class, abmrVar);
    }

    private abmr() {
        abzb abzbVar = abzb.b;
        this.f = abzbVar;
        this.j = abzbVar;
        this.k = abzbVar;
        this.l = abzbVar;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.q);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001\f\u0001\u0001\u0003!\f\u0000\u0004\u0006\u0003ᐉ\u0000\u0006ဉ\u0004\u000fЛ\u0011ᐉ\u000b\u0015ဇ\u0010\u0016ဇ\u0011\u0018\u001b\u001a\u083f\u0000\u001bЛ\u001dЛ\u001fᐉ\u0015!\u083f\u0000", new Object[]{"d", "c", "b", "p", "e", "f", abmt.class, "g", "h", "i", "j", abmn.class, abna.a, "k", xlm.class, "l", abmq.class, "m", aciq.a});
        }
        if (i2 == 3) {
            return new abmr();
        }
        if (i2 == 4) {
            return new abmo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.q = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = o;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (abmr.class) {
            abwxVar = o;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                o = abwxVar;
            }
        }
        return abwxVar;
    }
}
