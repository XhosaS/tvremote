package defpackage;

import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class nlx extends nri {
    private nsm a;
    protected final WeakReference e;
    final /* synthetic */ nma f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlx(nma nmaVar, nwu nwuVar) {
        super(nwuVar);
        this.f = nmaVar;
        this.e = new WeakReference(nwuVar);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* synthetic */ nxc a(Status status) {
        return new nlw(status);
    }

    @Override // defpackage.nxr
    protected final /* bridge */ /* synthetic */ void b(nwf nwfVar) {
        nma nmaVar = this.f;
        synchronized (nmaVar.a) {
            nwu nwuVar = (nwu) this.e.get();
            if (nwuVar == null) {
                q(new nlw(new Status(2100)));
                return;
            }
            nmaVar.c.a = nwuVar;
            try {
                try {
                    d();
                } catch (Throwable unused) {
                    q(new nlw(new Status(2100)));
                }
                this.f.c.a = null;
            } catch (IllegalArgumentException e) {
                throw e;
            }
        }
    }

    public abstract void d();

    protected final nsm e() {
        if (this.a == null) {
            this.a = new nqa(this, 1);
        }
        return this.a;
    }
}
