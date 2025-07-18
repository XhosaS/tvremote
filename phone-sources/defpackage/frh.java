package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class frh {
    public static final /* synthetic */ int b = 0;
    private static final SparseIntArray c;
    public final frf a;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(5, 1);
        sparseIntArray.put(6, 2);
        sparseIntArray.put(7, 2);
        sparseIntArray.put(8, 1);
        sparseIntArray.put(9, 1);
        sparseIntArray.put(10, 1);
    }

    public frh(frf frfVar) {
        this.a = frfVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof frh) {
            return this.a.equals(((frh) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
