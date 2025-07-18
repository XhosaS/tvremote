package defpackage;

import android.util.SparseIntArray;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjv {
    public final SparseIntArray a;
    public kcy b;

    public kjv() {
        this(kcx.a);
    }

    public final void a() {
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
    }

    public final int b(int i) {
        int i2;
        SparseIntArray sparseIntArray = this.a;
        synchronized (sparseIntArray) {
            i2 = sparseIntArray.get(i, -1);
        }
        return i2;
    }

    public kjv(kcy kcyVar) {
        this.a = new SparseIntArray();
        kkk.k(kcyVar);
        this.b = kcyVar;
    }
}
