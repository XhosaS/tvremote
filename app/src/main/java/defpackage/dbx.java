package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
final class dbx extends WeakReference {
    final daj a;
    final boolean b;
    ddp c;

    public dbx(daj dajVar, ddh ddhVar, ReferenceQueue referenceQueue) {
        super(ddhVar, referenceQueue);
        dqk.d(dajVar, "Argument must not be null");
        this.a = dajVar;
        this.c = null;
        this.b = ddhVar.a;
    }
}
