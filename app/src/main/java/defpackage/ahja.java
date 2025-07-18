package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahja extends ahjg {
    public final AtomicReference a = new AtomicReference(null);

    @Override // defpackage.ahjg
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return false;
        }
        atomicReference.set(ahiy.a);
        return true;
    }

    @Override // defpackage.ahjg
    public final /* bridge */ /* synthetic */ agsw[] b(Object obj) {
        this.a.set(null);
        return ahjf.a;
    }
}
