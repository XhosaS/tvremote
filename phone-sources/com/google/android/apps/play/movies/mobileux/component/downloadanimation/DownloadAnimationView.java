package com.google.android.apps.play.movies.mobileux.component.downloadanimation;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.libraries.play.widget.downloadstatus.DownloadStatusView;
import com.google.android.videos.R;
import defpackage.kuj;
import defpackage.mvb;
import defpackage.sds;
import defpackage.sdt;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DownloadAnimationView extends LinearLayout implements mvb {
    public String a;
    private DownloadStatusView b;
    private ImageView c;

    public DownloadAnimationView(Context context) {
        super(context);
    }

    public final CharSequence a(int i) {
        return this.a != null ? getContext().getString(i, this.a) : "";
    }

    @Override // defpackage.mvb
    public final void b() {
        this.b.b(0);
        this.b.c(2);
        this.a = null;
    }

    @Override // defpackage.mvb
    public final void c(kuj kujVar) {
        int i = ((int) (kujVar.b * 100.0f)) % 100;
        if (kujVar.h()) {
            setContentDescription(a(R.string.accessibility_pin_video_downloading));
            this.b.c(1);
            this.b.b(i);
            d(false);
            return;
        }
        if (kujVar.f()) {
            setContentDescription(a(R.string.accessibility_pin_video_downloaded));
            DownloadStatusView downloadStatusView = this.b;
            sds sdsVarA = sdt.a();
            sdsVarA.c(3);
            sdsVarA.b(100);
            downloadStatusView.a(sdsVarA.a());
            d(false);
            return;
        }
        if (kujVar.i() || kujVar.j()) {
            setContentDescription(a(R.string.accessibility_pin_couldnt_download_video));
            this.b.c(2);
            d(true);
        } else if (!kujVar.k()) {
            setContentDescription(a(R.string.accessibility_pin_download_video));
            this.b.a(sdt.a().a());
        } else {
            setContentDescription(a(R.string.accessibility_pin_video_download_pending));
            this.b.b(i);
            this.b.c(2);
            d(false);
        }
    }

    public final void d(boolean z) {
        if (z) {
            this.c.setVisibility(0);
            this.b.setVisibility(8);
        } else {
            this.c.setVisibility(8);
            this.b.setVisibility(0);
        }
    }

    @Override // defpackage.mvb
    public final void e(String str) {
        this.a = str;
    }

    @Override // android.view.View
    protected final void onFinishInflate() {
        super.onFinishInflate();
        this.b = (DownloadStatusView) findViewById(R.id.download_status);
        this.c = (ImageView) findViewById(R.id.download_failure_status);
    }

    public DownloadAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public DownloadAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
