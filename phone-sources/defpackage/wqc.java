package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wqc extends vuc implements vvk {
    public static final wqc a;
    public static final vvd h;
    private static volatile vvq i;
    public int b;
    public wni c;
    public long f;
    public String d = "";
    public String e = "";
    public String g = "";

    static {
        wqc wqcVar = new wqc();
        a = wqcVar;
        vuc.y(wqc.class, wqcVar);
        h = vuc.C(wkg.a, wqcVar, wqcVar, 525000001, vwo.MESSAGE);
    }

    private wqc() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i3 == 3) {
            return new wqc();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            throw null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (wqc.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
