package com.google.android.apps.tvsearch.widget.imagedownload;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import defpackage.cyx;
import defpackage.dqc;
import defpackage.jpn;
import defpackage.jpp;
import defpackage.lu;
import defpackage.wke;
import defpackage.zdv;
import defpackage.zdy;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageFitDownloadView extends lu {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/widget/imagedownload/ImageFitDownloadView");
    public int b;
    public int c;
    public wke d;
    public Uri e;
    public jpn f;

    public ImageFitDownloadView(Context context) {
        this(context, null);
    }

    private final void d() {
        Uri uri;
        if (isAttachedToWindow() && (uri = this.e) != null) {
            wke wkeVar = this.d;
            if (wkeVar == null) {
                ((zdv) ((zdv) a.d()).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageFitDownloadView", "startDownloading", 126, "ImageFitDownloadView.java")).u("Image manager is null, cannot execute loading.");
                return;
            }
            try {
                cyx cyxVarF = wkeVar.a().f(uri);
                cyxVarF.p(new jpp(this, this), cyxVarF, dqc.a);
            } catch (IllegalStateException e) {
                ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageFitDownloadView", "startDownloading", 152, "ImageFitDownloadView.java")).x("Failed to load %s", this.e);
            }
        }
    }

    public final void a() {
        try {
            wke wkeVar = this.d;
            if (wkeVar != null) {
                wkeVar.a().j(this);
            }
        } catch (IllegalStateException e) {
            ((zdv) ((zdv) ((zdv) a.d()).p(e)).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageFitDownloadView", "cancelExistingRequest", (char) 230, "ImageFitDownloadView.java")).u("cancelExistingRequest() caught an IllegalStateException.");
        }
    }

    public final void b(Uri uri, wke wkeVar) {
        this.d = wkeVar;
        Uri uri2 = this.e;
        if (uri2 == null || !uri2.equals(uri)) {
            a();
            this.e = uri;
            if (isAttachedToWindow()) {
                d();
            }
        }
    }

    public final void c(int i) {
        if (i == -1) {
            throw new IllegalArgumentException("MATCH_PARENT Unsupported");
        }
        if (i != -2 && i <= 0) {
            throw new IllegalArgumentException("Invalid Non-positive height");
        }
        this.b = -2;
        this.c = i;
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        d();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        setImageDrawable(null);
    }

    public ImageFitDownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageFitDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = -2;
        this.c = -2;
    }
}
