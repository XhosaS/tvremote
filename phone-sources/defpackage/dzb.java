package defpackage;

import android.util.SparseBooleanArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class dzb {
    private final SparseBooleanArray a;

    public dzb(SparseBooleanArray sparseBooleanArray) {
        this.a = sparseBooleanArray;
    }

    public final int a(int i) {
        eci.c(i, b());
        return this.a.keyAt(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final boolean c(int i) {
        return this.a.get(i);
    }

    public final boolean d(int... iArr) {
        for (int i : iArr) {
            if (c(i)) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof dzb) {
            return this.a.equals(((dzb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
