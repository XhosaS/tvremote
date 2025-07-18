package defpackage;

import com.google.android.libraries.elements.adl.UpbArena;
import com.google.android.libraries.elements.adl.UpbMessage;
import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.MaterializationResult;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;

/* compiled from: PG */
/* loaded from: classes.dex */
class mlz extends ComponentObserver {
    final /* synthetic */ oal b;
    final /* synthetic */ ofn c;
    final /* synthetic */ Component d;
    final /* synthetic */ agfp e;
    final /* synthetic */ dru g;
    final /* synthetic */ mma h;
    final /* synthetic */ nxl f = null;
    int a = 0;

    public mlz(mma mmaVar, oal oalVar, ofn ofnVar, Component component, agfp agfpVar, nxl nxlVar, dru druVar) {
        this.b = oalVar;
        this.c = ofnVar;
        this.d = component;
        this.e = agfpVar;
        this.g = druVar;
        this.h = mmaVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
    public final Status componentDidUpdate(Component component) {
        Status statusB;
        try {
            ofn ofnVar = this.c;
            ofnVar.g();
            StatusOr statusOrMaterializeWithResult = this.d.materializeWithResult(true);
            if (statusOrMaterializeWithResult.hasValue) {
                MaterializationResult materializationResult = (MaterializationResult) statusOrMaterializeWithResult.value;
                if (materializationResult == null) {
                    ocp ocpVar = new ocp("Error materializing ComponentType: No materialization result.");
                    this.e.d(ocpVar);
                    Status statusB2 = Status.b(ocpVar);
                    ofnVar.c();
                    return statusB2;
                }
                int iMaterializationNumber = materializationResult.materializationNumber();
                try {
                    long jRotateRight = Long.rotateRight((materializationResult.getArenaHandle() ^ (-1229782938247303442L)) ^ UpbArena.jniGetHostTid(), 16);
                    if (jRotateRight == 0) {
                        throw new IllegalArgumentException("Invalid null handle passed from C++");
                    }
                    UpbArena upbArena = !UpbArena.jniIncrementReferenceCount(jRotateRight) ? null : new UpbArena(jRotateRight);
                    if (upbArena == null) {
                        throw new ocp("Error getting container from materialization result: Failed to wrap UpbArena handle");
                    }
                    mlb mlbVar = new mlb(new nsu(new UpbMessage(materializationResult.getNativeUpb(), nsu.d, upbArena)), materializationResult, null);
                    synchronized (this) {
                        if (iMaterializationNumber > this.a) {
                            this.a = iMaterializationNumber;
                            this.g.k.incrementAndGet();
                            this.e.b(mlbVar);
                        }
                    }
                    return Status.OK;
                } catch (ocp e) {
                    this.e.d(e);
                    statusB = Status.b(e);
                }
            } else {
                ocp ocpVar2 = new ocp(a.r(statusOrMaterializeWithResult.status, this.b.R("unknown path"), "Error materializing ComponentType for template ", " with status "), statusOrMaterializeWithResult.status.asException());
                this.e.d(ocpVar2);
                statusB = Status.b(ocpVar2);
            }
            return statusB;
        } finally {
            this.c.c();
        }
    }
}
