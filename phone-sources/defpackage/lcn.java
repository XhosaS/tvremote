package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lcn extends vuc implements vvk {
    public static final lcn a;
    private static volatile vvq i;
    public int b;
    public int d;
    public boolean f;
    public boolean g;
    public int h;
    public String c = "";
    public String e = "";

    static {
        lcn lcnVar = new lcn();
        a = lcnVar;
        vuc.y(lcn.class, lcnVar);
    }

    private lcn() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new lcn();
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
        synchronized (lcn.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
