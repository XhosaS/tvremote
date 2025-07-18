package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vbo extends vuc implements vvk {
    public static final vbo a;
    private static volatile vvq m;
    public String b = "";
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String g = "";
    public String h = "";
    public String i = "";
    public String j = "";
    public String k = "";
    public String l = "";

    static {
        vbo vboVar = new vbo();
        a = vboVar;
        vuc.y(vbo.class, vboVar);
    }

    private vbo() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0000\u000b\u0000\u0000\u0001\u000b\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\u000bȈ", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i2 == 3) {
            return new vbo();
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
        vvq vvqVar = m;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vbo.class) {
            vtxVar = m;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                m = vtxVar;
            }
        }
        return vtxVar;
    }
}
