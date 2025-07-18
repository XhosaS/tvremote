package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vji extends vuc implements vvk {
    public static final vji a;
    private static volatile vvq i;
    public int b;
    public vkn d;
    public vki f;
    public String c = "";
    public vun e = vvt.a;
    public String g = "";
    public String h = "";

    static {
        vji vjiVar = new vji();
        a = vjiVar;
        vuc.y(vji.class, vjiVar);
    }

    private vji() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0003ဉ\u0002\u0005ဈ\u0004\u0006ဉ\u0001\u0007ဈ\u0005", new Object[]{"b", "c", "e", "f", "g", "d", "h"});
        }
        if (i3 == 3) {
            return new vji();
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
        synchronized (vji.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
