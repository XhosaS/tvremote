package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class tnq extends vuc implements vvk {
    public static final tnq a;
    private static volatile vvq d;
    public int b = 0;
    public Object c;

    static {
        tnq tnqVar = new tnq();
        a = tnqVar;
        vuc.y(tnq.class, tnqVar);
    }

    private tnq() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0004\u0011\u0001\u0000\u0001F\u0011\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\b<\u0000\t<\u0000\u0014<\u0000\u0015<\u0000\u0016<\u0000\u0017<\u0000\u0018<\u0000\u001d<\u0000\u001e<\u0000\u001f<\u0000(<\u00002<\u0000<<\u0000F<\u0000", new Object[]{"c", "b", tno.class, tnp.class, tnn.class, tnk.class, tnl.class, tni.class, tnh.class, tne.class, tng.class, vtm.class, tna.class, tnw.class, tns.class, tnm.class, tny.class, tmm.class, tmt.class});
        }
        if (i2 == 3) {
            return new tnq();
        }
        if (i2 == 4) {
            return new vtw(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            throw null;
        }
        vvq vvqVar = d;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (tnq.class) {
            vtxVar = d;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                d = vtxVar;
            }
        }
        return vtxVar;
    }
}
