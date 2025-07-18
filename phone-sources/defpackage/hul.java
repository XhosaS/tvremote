package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: PG */
/* loaded from: classes.dex */
final class hul implements htv {
    final /* synthetic */ huo a;

    public hul(huo huoVar) {
        this.a = huoVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.Collection] */
    @Override // defpackage.htv
    public final void a(boolean z) {
        ArrayList arrayList;
        hwp.g();
        huo huoVar = this.a;
        synchronized (huoVar) {
            arrayList = new ArrayList((Collection) huoVar.b);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((htv) arrayList.get(i)).a(z);
        }
    }
}
