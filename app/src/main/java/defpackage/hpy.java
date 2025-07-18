package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.tvsearch.widget.imagedownload.ImageFitDownloadView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class hpy extends azt {
    final ImageFitDownloadView e;
    final TextView f;
    final TextView h;

    public hpy(View view) {
        super(view);
        this.e = (ImageFitDownloadView) view.findViewById(R.id.row_header_provider_icon);
        this.f = (TextView) view.findViewById(R.id.row_header_provider_name);
        this.h = (TextView) view.findViewById(R.id.row_header_title);
    }
}
