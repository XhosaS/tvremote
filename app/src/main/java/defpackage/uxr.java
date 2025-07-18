package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class uxr {
    public static void a(aghb aghbVar, AtomicReference atomicReference, AtomicReference atomicReference2) {
        if (aghbVar != null) {
            if (atomicReference.get() != null) {
                aghbVar.c((aggi) atomicReference.get());
                atomicReference.set(null);
            }
            if (atomicReference2.get() != null) {
                aghbVar.c((aggi) atomicReference2.get());
                atomicReference2.set(null);
            }
        }
    }
}
