package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class xvw {
    private ArrayList a = new ArrayList();
    private volatile xqk b = xqk.IDLE;

    final void a(xqk xqkVar) {
        xqkVar.getClass();
        if (this.b == xqkVar || this.b == xqk.SHUTDOWN) {
            return;
        }
        this.b = xqkVar;
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
