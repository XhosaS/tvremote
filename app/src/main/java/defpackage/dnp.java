package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
class dnp implements dmt {
    final /* synthetic */ dnt a;

    public dnp(dnt dntVar) {
        this.a = dntVar;
    }

    @Override // defpackage.dmt
    public final void a(boolean z) {
        ArrayList arrayList;
        dqm.f();
        dnt dntVar = this.a;
        synchronized (dntVar) {
            arrayList = new ArrayList(dntVar.a);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((dmt) arrayList.get(i)).a(z);
        }
    }
}
