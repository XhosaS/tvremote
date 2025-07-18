package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cdq implements cdm {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.cdm
    public final /* synthetic */ void a(cck cckVar, Iterator it, Object obj) {
        ces.k(cckVar.b, "non repeating key");
        if (!cckVar.c || ceb.a() <= 20) {
            cckVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(cckVar.a, it.next());
            }
        }
    }
}
