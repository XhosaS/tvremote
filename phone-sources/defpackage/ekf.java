package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekf {
    public static final ekf a = new ekf(0, false);
    public final int b;
    public final boolean c;

    public ekf(int i, boolean z) {
        this.b = i;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ekf ekfVar = (ekf) obj;
            if (this.b == ekfVar.b && this.c == ekfVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.b;
        return i + i + (this.c ? 1 : 0);
    }
}
