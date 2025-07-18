package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class hhu extends ue {
    final /* synthetic */ hhw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hhu(hhw hhwVar) {
        super(true);
        this.a = hhwVar;
    }

    @Override // defpackage.ue
    public final void b() {
        hhw hhwVar = this.a;
        if (!hhwVar.e.isEmpty()) {
            ArrayDeque arrayDeque = hhwVar.f;
            if (!arrayDeque.isEmpty()) {
                arrayDeque.removeFirst();
                if (!arrayDeque.isEmpty()) {
                    hhwVar.ax.c().b((String) hhwVar.e.get(), ((abvo) arrayDeque.peekFirst()).B());
                    return;
                }
                Object obj = hhwVar.ah;
                if (obj != null) {
                    aghd.e((AtomicReference) obj);
                }
                e(false);
                hhwVar.ef().dc().a.c();
                return;
            }
        }
        e(false);
        hhwVar.ef().dc().a.c();
    }
}
