package defpackage;

import com.google.android.libraries.elements.interfaces.Component;
import com.google.android.libraries.elements.interfaces.ComponentObserver;
import com.google.android.libraries.elements.interfaces.LegacyMaterializationResult;
import com.youtube.android.libraries.elements.StatusOr;
import io.grpc.Status;
import java.nio.ByteBuffer;

/* compiled from: PG */
/* loaded from: classes.dex */
class mqa extends ComponentObserver {
    public final ofn a;
    public final Component b;
    public final oal c;
    public final agfp d;
    public final agow f;
    public final oap g;
    public final dru h;
    int i = 0;
    public final nxl e = null;

    public mqa(ofn ofnVar, Component component, oal oalVar, agfp agfpVar, nxl nxlVar, agow agowVar, oap oapVar, dru druVar) {
        this.a = ofnVar;
        this.b = component;
        this.c = oalVar;
        this.d = agfpVar;
        this.f = agowVar;
        this.g = oapVar;
        this.h = druVar;
    }

    @Override // com.google.android.libraries.elements.interfaces.ComponentObserver
    public final Status componentDidUpdate(Component component) {
        try {
            ofn ofnVar = this.a;
            ofnVar.g();
            StatusOr statusOrMaterialize = this.b.materialize(true);
            LegacyMaterializationResult legacyMaterializationResult = (LegacyMaterializationResult) statusOrMaterialize.value;
            if (legacyMaterializationResult == null) {
                ocp ocpVar = new ocp(a.p(statusOrMaterialize.status, "Error materializing SharedComponentType: "), statusOrMaterialize.status.asException());
                this.d.d(ocpVar);
                Status statusB = Status.b(ocpVar);
                ofnVar.c();
                return statusB;
            }
            int materializationNumber = legacyMaterializationResult.getMaterializationNumber();
            mlb mlbVar = new mlb(new nbd(aefm.j(ByteBuffer.wrap(legacyMaterializationResult.getElement()))), null, null);
            synchronized (this) {
                if (materializationNumber > this.i) {
                    this.i = materializationNumber;
                    this.h.k.incrementAndGet();
                    this.d.b(mlbVar);
                }
            }
            return Status.OK;
        } finally {
            this.a.c();
        }
    }
}
