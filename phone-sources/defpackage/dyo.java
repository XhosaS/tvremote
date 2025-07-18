package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dyo {
    public static final dyo a = new dyo(0, 0, 1, 1, 0);
    public static final String b = edt.Z(0);
    public static final String c = edt.Z(1);
    public static final String d = edt.Z(2);
    public static final String e = edt.Z(3);
    public static final String f = edt.Z(4);
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    private dxc l;

    public dyo(int i, int i2, int i3, int i4, int i5) {
        this.g = i;
        this.h = i2;
        this.i = i3;
        this.j = i4;
        this.k = i5;
    }

    public final dxc a() {
        if (this.l == null) {
            this.l = new dxc(this);
        }
        return this.l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dyo dyoVar = (dyo) obj;
            if (this.g == dyoVar.g && this.h == dyoVar.h && this.i == dyoVar.i && this.j == dyoVar.j && this.k == dyoVar.k) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.g + 527) * 31) + this.h) * 31) + this.i) * 31) + this.j) * 31) + this.k;
    }
}
