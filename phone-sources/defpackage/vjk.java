package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vjk extends vuc implements vvk {
    public static final vjk a;
    private static volatile vvq i;
    public int b;
    public vgn c;
    public vkk d;
    private byte j = 2;
    public String e = "";
    public String f = "";
    public String g = "";
    public boolean h = true;

    static {
        vjk vjkVar = new vjk();
        a = vjkVar;
        vuc.y(vjk.class, vjkVar);
    }

    private vjk() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i3 == 2) {
            return new vvu(a, "\u0004\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006ဈ\u0004\u0007ဇ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new vjk();
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
        synchronized (vjk.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
