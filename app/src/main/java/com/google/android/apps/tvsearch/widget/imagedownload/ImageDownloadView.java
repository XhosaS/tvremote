package com.google.android.apps.tvsearch.widget.imagedownload;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import defpackage.cyx;
import defpackage.dpa;
import defpackage.dqc;
import defpackage.jpn;
import defpackage.jpo;
import defpackage.lu;
import defpackage.wke;
import defpackage.zdv;
import defpackage.zdy;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ImageDownloadView extends lu {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/widget/imagedownload/ImageDownloadView");
    Uri b;
    public int c;
    public jpn d;
    final dpa e;
    private wke f;

    public ImageDownloadView(Context context) {
        this(context, null);
    }

    private final void c() {
        Uri uri;
        if (isAttachedToWindow() && (uri = this.b) != null) {
            wke wkeVar = this.f;
            if (wkeVar == null) {
                ((zdv) ((zdv) a.d()).q("com/google/android/apps/tvsearch/widget/imagedownload/ImageDownloadView", "startDownloading", 119, "ImageDownloadView.java")).u("Image manager set to null, cannot execute loading.");
                return;
            }
            try {
                cyx cyxVarF = wkeVar.a().f(uri);
                cyxVarF.p(this.e, cyxVarF, dqc.a);
            } catch (IllegalStateException unused) {
                int i = this.c;
                if (i != 0) {
                    setImageResource(i);
                }
            }
        }
    }

    public final void a() {
        try {
            wke wkeVar = this.f;
            if (wkeVar != null) {
                wkeVar.a().j(this);
            }
        } catch (IllegalArgumentException | CancellationException | IllegalStateException unused) {
        }
    }

    public final void b(Uri uri, int i, wke wkeVar) {
        this.f = wkeVar;
        this.c = i;
        Uri uri2 = this.b;
        if (uri2 == null || !uri2.equals(uri)) {
            a();
            this.b = uri;
            if (isAttachedToWindow()) {
                c();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a();
        setImageDrawable(null);
    }

    public ImageDownloadView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ImageDownloadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.e = new jpo(this, this);
    }
}
