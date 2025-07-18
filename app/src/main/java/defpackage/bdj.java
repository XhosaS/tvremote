package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bdj extends Fragment {
    public static final bdg a = new bdg();
    public bda b;

    private final void a(bce bceVar) {
        if (Build.VERSION.SDK_INT < 29) {
            bdg bdgVar = a;
            Activity activity = getActivity();
            activity.getClass();
            bdgVar.a(activity, bceVar);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(bce.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        a(bce.ON_DESTROY);
        this.b = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        a(bce.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        bda bdaVar = this.b;
        if (bdaVar != null) {
            bdaVar.a.a();
        }
        a(bce.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        bda bdaVar = this.b;
        if (bdaVar != null) {
            bdaVar.a.b();
        }
        a(bce.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        a(bce.ON_STOP);
    }
}
