package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class twj implements twf {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.twf
    public final /* synthetic */ void a(tuy tuyVar, Iterator it, Object obj) {
        a.ah(tuyVar.b, "non repeating key");
        if (!tuyVar.c || twu.a() <= 20) {
            tuyVar.a(it, obj);
        } else {
            while (it.hasNext()) {
                obj.a(tuyVar.a, it.next());
            }
        }
    }
}
