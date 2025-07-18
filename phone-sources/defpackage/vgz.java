package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vgz extends vuc implements vvk {
    public static final vgz a;
    private static volatile vvq o;
    public int b;
    public vun c = vvt.a;
    public String d = "";
    public String e = "";
    public String f = "";
    public long g;
    public vhx h;
    public vic i;
    public vhg j;
    public long k;
    public long l;
    public vhn m;
    public vgx n;

    static {
        vgz vgzVar = new vgz();
        a = vgzVar;
        vuc.y(vgz.class, vgzVar);
    }

    private vgz() {
    }

    @Override // defpackage.vuc
    public final Object a(int i, Object obj) {
        vvq vtxVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new vvu(a, "\u0001\f\u0000\u0001\u0001\u0010\f\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဈ\u0001\u0007ဉ\u0006\tဂ\b\nဂ\t\u000bဉ\u000b\fဈ\u0002\u000eဂ\u0003\u0010ဉ\r", new Object[]{"b", "c", vgy.class, "d", "h", "i", "e", "j", "k", "l", "m", "f", "g", "n"});
        }
        if (i2 == 3) {
            return new vgz();
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
        vvq vvqVar = o;
        if (vvqVar != null) {
            return vvqVar;
        }
        synchronized (vgz.class) {
            vtxVar = o;
            if (vtxVar == null) {
                vtxVar = new vtx(a);
                o = vtxVar;
            }
        }
        return vtxVar;
    }
}
