package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ablp extends abxd implements abyr {
    public static final ablp a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        ablp ablpVar = new ablp();
        a = ablpVar;
        ablpVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ablp.class, ablpVar);
    }

    private ablp() {
        Object[] objArr = abzb.a;
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0001&\u0001\u0000\u0002)&\u0000\u0000\u0012\u0002м\u0000\u0003<\u0000\u0004м\u0000\u0005м\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\tм\u0000\u000bм\u0000\fм\u0000\r<\u0000\u000eм\u0000\u000f<\u0000\u0010м\u0000\u0011<\u0000\u0012<\u0000\u0013м\u0000\u0014м\u0000\u0015<\u0000\u0016м\u0000\u0017м\u0000\u0018м\u0000\u0019м\u0000\u001aм\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000\"м\u0000#<\u0000$<\u0000%<\u0000&<\u0000'м\u0000(м\u0000)<\u0000", new Object[]{"c", "b", ablt.class, ablz.class, ackd.class, ackp.class, acnt.class, acnd.class, ackf.class, acnh.class, adbl.class, adbj.class, ackh.class, acfa.class, acjx.class, acnl.class, acnn.class, acnj.class, acnr.class, ackv.class, aclb.class, acld.class, xke.class, acnp.class, aclh.class, adbw.class, acew.class, ackt.class, xky.class, acqq.class, xld.class, acnf.class, ablx.class, xnp.class, acqs.class, acjv.class, ablr.class, acjz.class, xkg.class, ablv.class});
        }
        if (i2 == 3) {
            return new ablp();
        }
        if (i2 == 4) {
            return new ablo();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.e = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = d;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ablp.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
