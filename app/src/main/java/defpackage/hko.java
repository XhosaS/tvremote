package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hko extends hkm {
    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.on_keyboard_loading, viewGroup, false);
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        view.requestFocus();
    }
}
