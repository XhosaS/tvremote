package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class yve extends yvk<yvc<?>> {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.yvk
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(yvd.a);
        return true;
    }

    @Override // defpackage.yvk
    public final /* bridge */ /* synthetic */ yih[] b(Object obj) {
        this.a.set(null);
        return yvj.a;
    }
}
