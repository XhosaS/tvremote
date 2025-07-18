package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class txh extends txu {
    public static final txh a = new txh(txw.a);
    public final AtomicReference b;

    public txh(txu txuVar) {
        this.b = new AtomicReference(txuVar);
    }

    @Override // defpackage.txu
    public final tyb b() {
        return ((txu) this.b.get()).b();
    }

    @Override // defpackage.txu
    public final void c(String str, Level level, boolean z) {
        ((txu) this.b.get()).c(str, level, z);
    }

    @Override // defpackage.txu
    public final twa ez() {
        return ((txu) this.b.get()).ez();
    }
}
