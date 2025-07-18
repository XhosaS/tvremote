package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class afov {
    private ArrayList a = new ArrayList();
    private volatile affe b = affe.IDLE;

    final void a(affe affeVar) {
        affeVar.getClass();
        if (this.b == affeVar || this.b == affe.SHUTDOWN) {
            return;
        }
        this.b = affeVar;
        if (this.a.isEmpty()) {
            return;
        }
        ArrayList arrayList = this.a;
        this.a = new ArrayList();
        if (arrayList.size() <= 0) {
            return;
        }
        throw null;
    }
}
