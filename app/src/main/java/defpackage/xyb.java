package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xyb extends abxd implements abyr {
    public static final xyb a;
    private static volatile abyy d;
    public Object c;
    public int b = 0;
    private byte e = 2;

    static {
        xyb xybVar = new xyb();
        a = xybVar;
        xybVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(xyb.class, xybVar);
    }

    private xyb() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004\u0018\u0001\u0000\u0001\u001a\u0018\u0000\u0000\u0002\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000\t<\u0000\n<\u0000\u000b<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u0010<\u0000\u0011м\u0000\u0012м\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u0019<\u0000\u001a<\u0000", new Object[]{"c", "b", xxp.class, xxl.class, xyt.class, xyz.class, xzb.class, xxj.class, xyv.class, xyd.class, xyx.class, xxv.class, xzd.class, xyf.class, xxz.class, xxx.class, xyn.class, xyp.class, xzh.class, xyr.class, xyj.class, xyh.class, xyl.class, xxh.class, xxt.class, xzf.class});
        }
        if (i2 == 3) {
            return new xyb();
        }
        if (i2 == 4) {
            return new xya();
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
        synchronized (xyb.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
