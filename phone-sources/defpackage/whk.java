package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class whk extends vuc implements vvk {
    public static final whk a;
    private static volatile vvq i;
    public int b;
    public whe c;
    public long e;
    public wha g;
    public long h;
    private byte j = 2;
    public int d = -1;
    public vun f = vvt.a;

    static {
        whk whkVar = new whk();
        a = whkVar;
        vuc.y(whk.class, whkVar);
    }

    private whk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0001\u0006\u0000\u0001\u0001\r\u0006\u0000\u0001\u0000\u0001ဉ\u0000\u0002င\u0001\u0004ဂ\u0002\u0005\u001c\fဉ\u0004\rတ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new whk();
        }
        if (i3 == 4) {
            return new vtw(a);
        }
        if (i3 == 5) {
            return a;
        }
        if (i3 != 6) {
            this.j = obj == null ? (byte) 0 : (byte) 1;
            return null;
        }
        vvq vvqVar = i;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (whk.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
