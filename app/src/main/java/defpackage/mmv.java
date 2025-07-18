package defpackage;

import com.google.android.libraries.elements.interfaces.DataSourceListener;
import io.grpc.Status;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes.dex */
class mmv extends DataSourceListener {
    final /* synthetic */ nzu a;
    final /* synthetic */ AtomicReference b;
    final /* synthetic */ oal c;
    final /* synthetic */ oco d;
    final /* synthetic */ aggh e;
    final /* synthetic */ AtomicBoolean f;
    final /* synthetic */ AtomicBoolean g;

    public mmv(nzu nzuVar, AtomicReference atomicReference, oal oalVar, oco ocoVar, aggh agghVar, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.a = nzuVar;
        this.b = atomicReference;
        this.c = oalVar;
        this.d = ocoVar;
        this.e = agghVar;
        this.f = atomicBoolean;
        this.g = atomicBoolean2;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onDataChanged() {
        nzu nzuVar = this.a;
        if (nzuVar.i()) {
            ecr ecrVar = (ecr) this.b.get();
            oal oalVar = this.c;
            oco ocoVar = this.d;
            aggh agghVar = this.e;
            int i = mmr.y;
            if (ecrVar.p() != null) {
                ecrVar.k(new dxw(0, oalVar, ocoVar, nzuVar, agghVar), "updateState:DataDrivenCollectionSection.onDataChangedStateUpdate");
            }
        } else {
            ecr ecrVar2 = (ecr) this.b.get();
            oal oalVar2 = this.c;
            oco ocoVar2 = this.d;
            aggh agghVar2 = this.e;
            int i2 = mmr.y;
            if (ecrVar2.p() != null) {
                ecrVar2.l(new dxw(0, oalVar2, ocoVar2, nzuVar, agghVar2), "updateState:DataDrivenCollectionSection.onDataChangedStateUpdate");
            }
        }
        return Status.OK;
    }

    @Override // com.google.android.libraries.elements.interfaces.DataSourceListener
    public final Status onError(Status status) {
        this.f.set(false);
        if (this.g.compareAndSet(true, false)) {
            ecr ecrVar = (ecr) this.b.get();
            status.asException();
            ect.o(ecrVar, 4);
        }
        this.d.d(acsw.LOG_TYPE_INTERNAL_ERROR, this.c, status.asException(), "Error loading data from CollectionDataSource.", new Object[0]);
        return Status.OK;
    }
}
