package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ycb extends abxd implements abyr {
    public static final ycb a;
    private static volatile abyy f;
    public int b;
    public Object d;
    public ybz e;
    public int c = 0;
    private byte g = 2;

    static {
        ycb ycbVar = new ycb();
        a = ycbVar;
        ycbVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(ycb.class, ycbVar);
    }

    private ycb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004/\u0001\u0001\u00010/\u0000\u0000\u0002\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0011<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000\u001b<\u0000\u001c<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000 <\u0000!<\u0000\"м\u0000#<\u0000$м\u0000%<\u0000&<\u0000'<\u0000(<\u0000)<\u0000*<\u0000+<\u0000,<\u0000-<\u0000.<\u0000/<\u00000<\u0000", new Object[]{"d", "c", "b", "e", yeo.class, ybc.class, yek.class, ycq.class, ydg.class, ycy.class, yfe.class, ydc.class, ygb.class, ygf.class, ycw.class, yaw.class, ygd.class, ybc.class, yfs.class, ydy.class, ydk.class, yee.class, yfc.class, yds.class, yas.class, yde.class, xzs.class, xzq.class, xzu.class, xzm.class, yha.class, yhn.class, yhg.class, yah.class, ybp.class, ahpb.class, ydo.class, yay.class, yae.class, xzo.class, ydw.class, yaj.class, yfj.class, yao.class, ygi.class, yec.class, ydi.class, ybf.class, yfg.class, yau.class});
        }
        if (i2 == 3) {
            return new ycb();
        }
        if (i2 == 4) {
            return new yca();
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            this.g = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        abyy abyyVar = f;
        if (abyyVar != null) {
            return abyyVar;
        }
        synchronized (ycb.class) {
            abwxVar = f;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                f = abwxVar;
            }
        }
        return abwxVar;
    }
}
