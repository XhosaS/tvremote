package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class dc implements db {
    final int a;
    final int b;
    final /* synthetic */ de c;

    public dc(de deVar, int i, int i2) {
        this.c = deVar;
        this.a = i;
        this.b = i2;
    }

    @Override // defpackage.db
    public final boolean h(ArrayList arrayList, ArrayList arrayList2) {
        de deVar = this.c;
        bq bqVar = deVar.q;
        if (bqVar == null || this.a >= 0 || !bqVar.eg().Y()) {
            return deVar.aa(arrayList, arrayList2, null, this.a, this.b);
        }
        return false;
    }
}
