package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageFitDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hmf {
    public aeax a;
    public View b;
    public hme c;
    private final hqb d;

    public hmf(hqb hqbVar) {
        this.d = hqbVar;
    }

    private final int b() {
        aeax aeaxVar = this.a;
        if ((aeaxVar.b & 128) != 0) {
            return aeaxVar.i;
        }
        return 0;
    }

    private final void c(View view, int i) {
        int i2 = this.d.l;
        view.setPadding(i2, 0, i2, 0);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(r0.k);
        gradientDrawable.setColor(i);
        view.setBackground(gradientDrawable);
    }

    private final void d(TextView textView) {
        aeax aeaxVar = this.a;
        int i = (aeaxVar.b & 256) != 0 ? aeaxVar.j : 0;
        if (i != 0) {
            textView.setTextColor(i);
        }
    }

    private final boolean e() {
        return b() != 0;
    }

    private final ImageFitDownloadView f(Uri uri, Context context, int i) {
        ImageFitDownloadView imageFitDownloadView = new ImageFitDownloadView(context);
        imageFitDownloadView.c(i);
        imageFitDownloadView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageFitDownloadView.setLayoutParams(new ViewGroup.LayoutParams(-2, i));
        imageFitDownloadView.f = new hmd(this);
        imageFitDownloadView.b(uri, this.d.b);
        return imageFitDownloadView;
    }

    public final int a(aeax aeaxVar, ViewGroup viewGroup) {
        Uri uri;
        this.a = aeaxVar;
        int iA = aeat.a(aeaxVar.g);
        if (iA == 0 || iA == 1) {
            return 3;
        }
        if ((aeaxVar.b & 2) != 0) {
            uri = Uri.parse(aeaxVar.d);
            if (uri == null) {
                return 3;
            }
        } else {
            uri = null;
        }
        int i = this.a.b;
        int i2 = i & 1;
        int i3 = ((i & 2) != 0 ? i2 != 0 ? 4 : 3 : i2 != 0 ? 2 : 1) - 1;
        if (i3 == 1) {
            TextView textView = (TextView) this.d.a.inflate(R.layout.badge_b4v3G50, viewGroup, false);
            textView.setText(aeaxVar.c);
            if (e()) {
                c(textView, b());
                d(textView);
            }
            this.b = textView;
            return 1;
        }
        if (i3 == 2) {
            Context context = viewGroup.getContext();
            int iA2 = aeat.a(this.a.g);
            this.b = f(uri, context, (iA2 != 0 && iA2 == 5) ? this.d.i : this.d.h);
            return 2;
        }
        if (i3 != 3) {
            return 3;
        }
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setLayoutParams(new ViewGroup.MarginLayoutParams(-2, -2));
        hqb hqbVar = this.d;
        TextView textView2 = (TextView) hqbVar.a.inflate(R.layout.badge_b4v3G50, (ViewGroup) linearLayout, false);
        textView2.setText(aeaxVar.c);
        linearLayout.addView(textView2, new LinearLayout.LayoutParams(-2, -2, 17.0f));
        ImageFitDownloadView imageFitDownloadViewF = f(uri, viewGroup.getContext(), hqbVar.g);
        imageFitDownloadViewF.setPadding(0, hqbVar.j, 0, 0);
        int iA3 = aeav.a(aeaxVar.h);
        if (iA3 == 0) {
            iA3 = 2;
        }
        int i4 = iA3 - 1;
        if (i4 == 2) {
            linearLayout.addView(imageFitDownloadViewF, -1);
        } else {
            if (i4 == 3) {
                linearLayout.setLayoutDirection(0);
            } else if (i4 == 4) {
                linearLayout.setLayoutDirection(0);
                linearLayout.addView(imageFitDownloadViewF, -1);
            }
            linearLayout.addView(imageFitDownloadViewF, 0);
        }
        linearLayout.addView(new Space(viewGroup.getContext()), 1, new LinearLayout.LayoutParams(hqbVar.d, -1));
        if (e()) {
            c(linearLayout, b());
            d(textView2);
        }
        this.b = linearLayout;
        return 2;
    }
}
