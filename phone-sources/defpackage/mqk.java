package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import androidx.preference.PreferenceScreen;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqk extends gdk {
    public mnu e;

    @Override // defpackage.gdk
    public final void g() {
        mqj mqjVar = (mqj) getActivity();
        if (mqjVar == null || mqjVar.isFinishing()) {
            return;
        }
        mqjVar.b(this);
    }

    @Override // defpackage.gdk, defpackage.bv
    public final void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreenB;
        if (bundle != null && (bundle2 = bundle.getBundle("android:preferences")) != null && (preferenceScreenB = b()) != null) {
            preferenceScreenB.v(bundle2);
        }
        if (this.c) {
            d();
        }
        this.d = true;
        if (this.e != null) {
            RecyclerView recyclerView = this.b;
            mqg mqgVar = new mqg(0);
            int[] iArr = cww.a;
            cwm.l(recyclerView, mqgVar);
        }
    }
}
