package defpackage;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class wvg extends PhantomReference {
    final wvf a;

    public wvg(Object obj, ReferenceQueue referenceQueue) {
        super(obj, referenceQueue);
        this.a = new wvf(this);
    }
}
