package defpackage;

import com.google.android.gms.measurement.internal.UploadBatchesParcel;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class lfo extends kzo {
    final /* synthetic */ AtomicReference a;
    final /* synthetic */ lgp b;

    public lfo(lgp lgpVar, AtomicReference atomicReference) {
        this.a = atomicReference;
        this.b = lgpVar;
    }

    @Override // defpackage.kzp
    public final void e(UploadBatchesParcel uploadBatchesParcel) {
        AtomicReference atomicReference = this.a;
        synchronized (atomicReference) {
            lbk lbkVar = this.b.y;
            lab labVar = lbkVar.f;
            lbkVar.o(labVar);
            labVar.k.b("[sgtm] Got upload batches from service. count", Integer.valueOf(uploadBatchesParcel.a.size()));
            atomicReference.set(uploadBatchesParcel);
            atomicReference.notifyAll();
        }
    }
}
