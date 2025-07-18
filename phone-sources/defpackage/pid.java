package defpackage;

import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class pid implements go {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ pid(itk itkVar, MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton, int i) {
        this.c = i;
        this.b = itkVar;
        this.a = mediaDeviceFloatingActionButton;
    }

    /* JADX WARN: Type inference failed for: r9v13, types: [itk, java.lang.Object] */
    @Override // defpackage.go
    public final void a(Object obj) {
        if (this.c != 0) {
            Map map = (Map) obj;
            map.getClass();
            krd.b(a.cj(map, "Permissions were granted: ", ". Updating controller."));
            this.b.i();
            ((MediaDeviceFloatingActionButton) this.a).b();
            return;
        }
        Boolean bool = (Boolean) obj;
        bool.getClass();
        Object obj2 = this.a;
        boolean zBooleanValue = bool.booleanValue();
        pie pieVar = (pie) obj2;
        String str = pieVar.d;
        if (str == null) {
            throw new IllegalStateException("Required value was null.");
        }
        pie.a.l().C("%s permission request user response is %s", str, zBooleanValue);
        kwy kwyVar = pieVar.f;
        oxp oxpVar = null;
        if (kwyVar == null) {
            yks.c("permissionRequestsStateDataService");
            kwyVar = null;
        }
        osk.Z(((smc) kwyVar.a).b(new nbe(new kij(str, 18), 19), ugk.a), null, new mig(7));
        yfo yfoVar = pieVar.b;
        if (yfoVar == null) {
            yks.c("callbacksManagerProvider");
            yfoVar = null;
        }
        ((pir) yfoVar).b();
        oxp oxpVar2 = pieVar.c;
        if (oxpVar2 == null) {
            yks.c("clearcutLogger");
        } else {
            oxpVar = oxpVar2;
        }
        oxpVar.a((oyd) this.b, zBooleanValue, pieVar.e);
        bv bvVar = (bv) obj2;
        if (bvVar.getActivity() != null) {
            by activity = bvVar.getActivity();
            if (activity == null) {
                throw new IllegalStateException("Required value was null.");
            }
            if (activity.isFinishing() || !bvVar.isAdded() || bvVar.isRemoving()) {
                return;
            }
            at atVar = new at(bvVar.getParentFragmentManager());
            atVar.m(bvVar);
            atVar.l();
        }
    }

    public /* synthetic */ pid(pie pieVar, oyd oydVar, int i) {
        this.c = i;
        this.a = pieVar;
        this.b = oydVar;
    }
}
