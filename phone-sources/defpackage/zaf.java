package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class zaf extends vuc implements vvk {
    public static final zaf a;
    private static volatile vvq i;
    public int b;
    public long c;
    public boolean d;
    public int e;
    public int g;
    public String f = "";
    public String h = "";

    static {
        zaf zafVar = new zaf();
        a = zafVar;
        vuc.y(zaf.class, zafVar);
    }

    private zaf() {
    }

    @Override // defpackage.vuc
    public final Object a(int i2, Object obj) {
        vvq vtxVar;
        int i3 = i2 - 1;
        if (i3 == 0) {
            return (byte) 1;
        }
        if (i3 == 2) {
            return new vvu(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003င\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i3 == 3) {
            return new zaf();
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
        synchronized (zaf.class) {
            vtxVar = i;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                i = vtxVar;
            }
        }
        return vtxVar;
    }
}
