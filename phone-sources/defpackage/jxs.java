package defpackage;

import android.view.KeyEvent;
import com.google.android.apps.googletv.app.device.presentation.fab.MediaDeviceFloatingActionButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class jxs extends xcf implements ivt {
    public lfn n;
    public lie o;
    public jaf p;
    public pjx q;
    public itk r;
    public xhg s;
    public ihg t;
    public jan u;
    public gag v;

    public final pjx A() {
        pjx pjxVar = this.q;
        if (pjxVar != null) {
            return pjxVar;
        }
        yks.c("interactionLogger");
        return null;
    }

    public final xhg B() {
        xhg xhgVar = this.s;
        if (xhgVar != null) {
            return xhgVar;
        }
        yks.c("appRefreshFeatureFlags");
        return null;
    }

    public final void C(MediaDeviceFloatingActionButton mediaDeviceFloatingActionButton) {
        mediaDeviceFloatingActionButton.e(w(), E(), A(), v());
    }

    public final jan D() {
        jan janVar = this.u;
        if (janVar != null) {
            return janVar;
        }
        yks.c("navigationManager");
        return null;
    }

    public final gag E() {
        gag gagVar = this.v;
        if (gagVar != null) {
            return gagVar;
        }
        yks.c("mediaDeviceUiController");
        return null;
    }

    @Override // android.support.v7.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        ith ithVarE = w().e();
        if (ithVarE == null || ((iua) ithVarE).d) {
            return super.onKeyDown(i, keyEvent);
        }
        if (i == 24) {
            ithVarE.f();
            return true;
        }
        if (i != 25) {
            return super.onKeyDown(i, keyEvent);
        }
        ithVarE.e();
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [idr, java.lang.Object] */
    @Override // defpackage.by, android.app.Activity
    protected void onResume() {
        super.onResume();
        Object objA = E().e.a();
        objA.getClass();
        f(((Boolean) objA).booleanValue());
    }

    public final ihg v() {
        ihg ihgVar = this.t;
        if (ihgVar != null) {
            return ihgVar;
        }
        yks.c("bc25FlagsManager");
        return null;
    }

    public final itk w() {
        itk itkVar = this.r;
        if (itkVar != null) {
            return itkVar;
        }
        yks.c("mediaDeviceController");
        return null;
    }

    public final jaf x() {
        jaf jafVar = this.p;
        if (jafVar != null) {
            return jafVar;
        }
        yks.c("veLogger");
        return null;
    }

    public final lfn y() {
        lfn lfnVar = this.n;
        if (lfnVar != null) {
            return lfnVar;
        }
        yks.c("config");
        return null;
    }

    public final lie z() {
        lie lieVar = this.o;
        if (lieVar != null) {
            return lieVar;
        }
        yks.c("eventLogger");
        return null;
    }

    public void f(boolean z) {
    }
}
