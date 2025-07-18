package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes.dex */
class arm {
    public aqz a;
    private final SparseArray b;

    private arm() {
        throw null;
    }

    final arm a(int i) {
        return (arm) this.b.get(i);
    }

    final void b(aqz aqzVar, int i, int i2) {
        arm armVarA = a(aqzVar.a().a(i));
        if (armVarA == null) {
            armVarA = new arm(1);
            this.b.put(aqzVar.a().a(i), armVarA);
        }
        if (i2 > i) {
            armVarA.b(aqzVar, i + 1, i2);
        } else {
            armVarA.a = aqzVar;
        }
    }

    public arm(int i) {
        this.b = new SparseArray(i);
    }
}
