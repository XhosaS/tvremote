package defpackage;

import android.graphics.Typeface;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageFitDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpx extends azu {
    private final hmc c;
    private final hmb d;

    public hpx(hmc hmcVar, hmb hmbVar) {
        super(null);
        this.c = hmcVar;
        this.d = hmbVar;
    }

    @Override // defpackage.azu, defpackage.azm
    public azk q(ViewGroup viewGroup) {
        htv htvVarU;
        hpy hpyVar = new hpy(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.search_row_header, viewGroup, false));
        if (this.c.B() && (htvVarU = this.d.u()) != null) {
            View view = hpyVar.g;
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            int i = htvVarU.b;
            marginLayoutParams.height = i;
            view.setLayoutParams(marginLayoutParams);
            view.setMinimumHeight(i);
            ImageFitDownloadView imageFitDownloadView = hpyVar.e;
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) imageFitDownloadView.getLayoutParams();
            int i2 = htvVarU.e;
            marginLayoutParams2.width = i2;
            marginLayoutParams2.height = i2;
            imageFitDownloadView.setLayoutParams(marginLayoutParams2);
            TextView textView = hpyVar.h;
            Typeface typeface = htvVarU.d;
            textView.setTypeface(typeface);
            float f = htvVarU.c;
            textView.setTextSize(0, f);
            int i3 = htvVarU.a;
            textView.setTextColor(i3);
            TextView textView2 = hpyVar.f;
            textView2.setTypeface(typeface);
            textView2.setTextSize(0, f);
            textView2.setTextColor(i3);
        }
        return hpyVar;
    }

    @Override // defpackage.azu, defpackage.azm
    public void s(azk azkVar, Object obj) {
        if (obj instanceof hhl) {
            hhl hhlVar = (hhl) obj;
            if ((obj instanceof azr) && (azkVar instanceof hpy)) {
                hpy hpyVar = (hpy) azkVar;
                aye ayeVar = ((azr) obj).b;
                if (ayeVar != null) {
                    hpyVar.h.setText(ayeVar.a);
                }
                if (!hhlVar.j()) {
                    if (ayeVar instanceof hpb) {
                        ImageFitDownloadView imageFitDownloadView = hpyVar.e;
                        imageFitDownloadView.setVisibility(0);
                        imageFitDownloadView.setImageResource(R.drawable.quantum_ic_google_assistant_white_24);
                        return;
                    }
                    return;
                }
                if (!TextUtils.isEmpty(hhlVar.i())) {
                    TextView textView = hpyVar.f;
                    textView.setVisibility(0);
                    textView.setText(hhlVar.i());
                }
                String strH = hhlVar.h();
                if (TextUtils.isEmpty(strH)) {
                    return;
                }
                ImageFitDownloadView imageFitDownloadView2 = hpyVar.e;
                imageFitDownloadView2.setVisibility(0);
                imageFitDownloadView2.c(imageFitDownloadView2.getLayoutParams().height);
                imageFitDownloadView2.f = new hpw(hpyVar, imageFitDownloadView2);
                imageFitDownloadView2.b(Uri.parse(strH), this.d.k());
            }
        }
    }

    @Override // defpackage.azu, defpackage.azm
    public void u(azk azkVar) {
        if (azkVar instanceof hpy) {
            hpy hpyVar = (hpy) azkVar;
            hpyVar.h.setText((CharSequence) null);
            TextView textView = hpyVar.f;
            textView.setVisibility(8);
            textView.setText((CharSequence) null);
            ImageFitDownloadView imageFitDownloadView = hpyVar.e;
            imageFitDownloadView.setVisibility(8);
            imageFitDownloadView.a();
            imageFitDownloadView.setImageDrawable(null);
            imageFitDownloadView.e = null;
            imageFitDownloadView.d = null;
            imageFitDownloadView.f = null;
            ViewGroup.LayoutParams layoutParams = imageFitDownloadView.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = -2;
            }
        }
    }
}
