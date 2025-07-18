package defpackage;

import io.grpc.Status;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaun implements zxe {
    final /* synthetic */ afep a;
    final /* synthetic */ aauo b;

    public aaun(aauo aauoVar, afep afepVar) {
        this.a = afepVar;
        this.b = aauoVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        this.b.d = true;
        this.a.a(Status.b(th), new afih());
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        afeq afeqVar = (afeq) obj;
        try {
            aauo aauoVar = this.b;
            aauoVar.b = afeqVar;
            Iterator it = aauoVar.a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        } catch (Throwable th) {
            a(th);
        }
    }
}
