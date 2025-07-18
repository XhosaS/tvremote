package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class dwh extends Fragment {
    public static final /* synthetic */ int b = 0;
    public pku a;

    private final void a(dvc dvcVar) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            activity.getClass();
            dvb.e(activity, dvcVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(dvc.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(dvc.ON_DESTROY);
        this.a = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(dvc.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        pku pkuVar = this.a;
        if (pkuVar != null) {
            ((dwa) pkuVar.a).a();
        }
        a(dvc.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        pku pkuVar = this.a;
        if (pkuVar != null) {
            ((dwa) pkuVar.a).b();
        }
        a(dvc.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(dvc.ON_STOP);
    }
}
