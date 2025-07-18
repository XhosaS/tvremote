package defpackage;

import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioa extends ayc {
    final /* synthetic */ ioc k;

    public ioa(ioc iocVar) {
        this.k = iocVar;
    }

    @Override // defpackage.ayc
    public final void e(ayb aybVar, axh axhVar) {
        TextView textView;
        aybVar.getClass();
        axhVar.getClass();
        super.e(aybVar, axhVar);
        inz inzVar = this.k.a;
        if (inzVar.ak.isTouchExplorationEnabled() && axhVar.a == 1 && (textView = aybVar.t) != null) {
            textView.setContentDescription(inzVar.dZ().getResources().getString(R.string.assistant_setup_done_button_description));
        }
    }
}
