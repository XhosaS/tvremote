package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cp implements co {
    final int a;
    final int b;
    final /* synthetic */ cr c;

    public cp(cr crVar, int i, int i2) {
        this.c = crVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.co
    public final boolean j(ArrayList arrayList, ArrayList arrayList2) {
        cr crVar = this.c;
        bv bvVar = crVar.p;
        if (bvVar == null || this.a >= 0 || !bvVar.getChildFragmentManager().ac()) {
            return crVar.ae(arrayList, arrayList2, null, this.a, this.b);
        }
        return false;
    }
}
