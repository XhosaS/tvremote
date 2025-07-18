package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class itt extends its {
    final /* synthetic */ itv g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public itt(itv itvVar, List list) {
        super(list);
        this.g = itvVar;
    }

    @Override // defpackage.icu
    protected final void ec() {
        itv itvVar = this.g;
        itvVar.h.set(true);
        itvVar.x();
    }

    @Override // defpackage.icu
    protected final void ed() {
        itv itvVar = this.g;
        AtomicBoolean atomicBoolean = itvVar.h;
        atomicBoolean.set(false);
        if (itvVar.n == null && itvVar.e.isEmpty() && !atomicBoolean.get()) {
            itvVar.z();
        }
    }
}
