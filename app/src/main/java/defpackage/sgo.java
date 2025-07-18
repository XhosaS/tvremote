package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sgo extends abxd implements abyr {
    public static final sgo a;
    private static volatile abyy d;
    public int b = 0;
    public Object c;

    static {
        sgo sgoVar = new sgo();
        a = sgoVar;
        sgoVar.memoizedSerializedSize &= Integer.MAX_VALUE;
        abxd.defaultInstanceMap.put(sgo.class, sgoVar);
    }

    private sgo() {
    }

    @Override // defpackage.abxd
    public final Object cM(int i, Object obj) {
        abyy abwxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new abzc(a, "\u0004 \u0001\u0000\u0003/ \u0000\u0000\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\n<\u0000\f<\u0000\r<\u0000\u000e<\u0000\u000f<\u0000\u0010<\u0000\u0012<\u0000\u0013<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u001a<\u0000\u001c<\u0000\u001e<\u0000\u001f<\u0000\"<\u0000#<\u0000$<\u0000'<\u0000)<\u0000*<\u0000+<\u0000,<\u0000-<\u0000.<\u0000/<\u0000", new Object[]{"c", "b", sgv.class, sgx.class, sgz.class, shd.class, shb.class, shf.class, shh.class, shj.class, shl.class, shr.class, sht.class, shx.class, shz.class, sil.class, sin.class, sit.class, sif.class, shv.class, siv.class, six.class, siz.class, sjb.class, sij.class, sip.class, sir.class, sih.class, sid.class, shp.class, sgt.class, shn.class, sgr.class, sib.class});
        }
        if (i2 == 3) {
            return new sgo();
        }
        if (i2 == 4) {
            return new sgm();
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
        synchronized (sgo.class) {
            abwxVar = d;
            if (abwxVar == null) {
                abwxVar = new abwx(a);
                d = abwxVar;
            }
        }
        return abwxVar;
    }
}
