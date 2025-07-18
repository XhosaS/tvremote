package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class yi implements zr {
    private final int b;
    private final int a = 0;
    private final int c = 0;
    private final int d = 0;

    public yi(int i) {
        this.b = i;
    }

    @Override // defpackage.zr
    public final int a(clx clxVar) {
        return 0;
    }

    @Override // defpackage.zr
    public final int b(clx clxVar, cmi cmiVar) {
        return 0;
    }

    @Override // defpackage.zr
    public final int c(clx clxVar, cmi cmiVar) {
        return 0;
    }

    @Override // defpackage.zr
    public final int d(clx clxVar) {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yi)) {
            return false;
        }
        yi yiVar = (yi) obj;
        int i = yiVar.a;
        if (this.b != yiVar.b) {
            return false;
        }
        int i2 = yiVar.c;
        int i3 = yiVar.d;
        return true;
    }

    public final int hashCode() {
        return this.b * 961;
    }

    public final String toString() {
        return "Insets(left=0, top=" + this.b + ", right=0, bottom=0)";
    }
}
