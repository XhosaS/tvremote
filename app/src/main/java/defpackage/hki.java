package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hki extends hke implements hmx {
    private static final zdy b = zdy.h("com/google/android/apps/tvsearch/results/imageattribution/ImageAttributionFragment");
    public wke a;
    private final boolean c = true;

    @Override // defpackage.bq
    public final View D(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        View viewInflate = layoutInflater.inflate(R.layout.image_attribution_overlay, viewGroup, false);
        viewInflate.getClass();
        return viewInflate;
    }

    public final wke aB() {
        wke wkeVar = this.a;
        if (wkeVar != null) {
            return wkeVar;
        }
        agvy.b("imageManager");
        return null;
    }

    @Override // defpackage.hmx
    public final boolean aF() {
        return this.c;
    }

    @Override // defpackage.bq
    public final void aa(View view, Bundle bundle) {
        boolean z;
        TextView textView;
        TextView textView2;
        view.getClass();
        view.setOnKeyListener(new View.OnKeyListener() { // from class: hkh
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i, KeyEvent keyEvent) {
                return (i == 4 || i == 97) ? false : true;
            }
        });
        boolean z2 = true;
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        Bundle bundle2 = this.n;
        if (bundle2 != null) {
            String string = bundle2.getString("author-name");
            if (string != null) {
                TextView textView3 = (TextView) view.findViewById(R.id.image_attribution_title_1);
                if (textView3 != null) {
                    textView3.setText(string);
                }
                z = true;
            } else {
                z = false;
            }
            TextView textView4 = (TextView) view.findViewById(R.id.image_attribution_copyright);
            if (textView4 != null) {
                textView4.setVisibility(true != z ? 8 : 0);
            }
            String string2 = bundle2.getString("license-information");
            if (string2 != null) {
                TextView textView5 = (TextView) view.findViewById(R.id.image_attribution_title_2);
                if (textView5 != null) {
                    textView5.setText(string2);
                }
            } else {
                z2 = false;
            }
            TextView textView6 = (TextView) view.findViewById(R.id.image_attribution_separator);
            if (textView6 != null) {
                textView6.setVisibility((z && z2) ? 0 : 8);
            }
            String string3 = bundle2.getString("license-url");
            if (string3 != null && (textView2 = (TextView) view.findViewById(R.id.image_attribution_description_1)) != null) {
                textView2.setText(string3);
            }
            String string4 = bundle2.getString("source-url");
            if (string4 != null && (textView = (TextView) view.findViewById(R.id.image_attribution_description_2)) != null) {
                textView.setText(string4);
            }
        }
        ImageDownloadView imageDownloadView = (ImageDownloadView) view.findViewById(R.id.attribution_image);
        if (imageDownloadView != null) {
            Bundle bundle3 = this.n;
            imageDownloadView.b(Uri.parse(bundle3 != null ? bundle3.getString("image-url") : null), R.drawable.ic_search_default, aB());
        }
    }

    @Override // defpackage.bq
    public final void er() {
        ImageDownloadView imageDownloadView;
        this.P = true;
        View view = this.R;
        if (view == null || (imageDownloadView = (ImageDownloadView) view.findViewById(R.id.attribution_image)) == null) {
            return;
        }
        try {
            aB().a().j(imageDownloadView);
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) b.d()).p(e).q("com/google/android/apps/tvsearch/results/imageattribution/ImageAttributionFragment", "onDetach", 95, "ImageAttributionFragment.kt")).u("Failed to clear image loader when detaching fragment");
        }
    }

    @Override // defpackage.hmx
    public final /* synthetic */ void aD(bq bqVar) {
    }
}
