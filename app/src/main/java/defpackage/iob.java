package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iob extends axe {
    final /* synthetic */ ioc f;

    public iob(ioc iocVar) {
        this.f = iocVar;
    }

    @Override // defpackage.axe
    public final int a() {
        return R.layout.setup_hotword_education;
    }

    @Override // defpackage.axe
    public final View b(LayoutInflater layoutInflater, ViewGroup viewGroup, axd axdVar) {
        layoutInflater.getClass();
        View viewB = super.b(layoutInflater, viewGroup, axdVar);
        viewB.getClass();
        ioc iocVar = this.f;
        if (iocVar.b.d() && iocVar.c) {
            return viewB;
        }
        ((TextView) viewB.findViewById(R.id.guidance_subtitle_1)).setText(iocVar.a.dZ().getResources().getString(R.string.assistant_setup_hotword_education_mic_off_amati_l1));
        return viewB;
    }
}
