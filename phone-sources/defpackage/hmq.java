package defpackage;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hmq extends WeakReference {
    final hlg a;
    final boolean b;
    hnv c;

    public hmq(hlg hlgVar, hnp hnpVar, ReferenceQueue referenceQueue) {
        super(hnpVar, referenceQueue);
        hju.p(hlgVar);
        this.a = hlgVar;
        this.c = null;
        this.b = hnpVar.a;
    }

    final void a() {
        this.c = null;
        clear();
    }
}
