package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class izj extends sqi {
    private boolean a;

    @Override // defpackage.bl, defpackage.bv
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.a = true;
        ((sqg) requireDialog()).d = this.a;
    }

    @Override // defpackage.bv
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        return layoutInflater.inflate(R.layout.bottom_sheet_fragment, viewGroup, false);
    }
}
