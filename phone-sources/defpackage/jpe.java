package defpackage;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jpe extends sca {
    public View a;
    public View b;
    public View c;
    public View d;
    public View e;
    public ImageView f;
    public Button g;
    public final kuw h;

    public jpe() {
        throw null;
    }

    public final View a() {
        View view = this.d;
        if (view != null) {
            return view;
        }
        yks.c("footerAnnotationView");
        return null;
    }

    public final View b() {
        View view = this.c;
        if (view != null) {
            return view;
        }
        yks.c("titleView");
        return null;
    }

    public final Button d() {
        Button button = this.g;
        if (button != null) {
            return button;
        }
        yks.c("expandMoreButton");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.news_article_card);
            try {
                this.b = p(R.id.heading_annotation_text);
                try {
                    this.c = p(R.id.title);
                    try {
                        this.d = p(R.id.footer_annotation);
                        try {
                            this.e = p(R.id.share_button);
                            try {
                                this.f = (ImageView) p(R.id.primary_image);
                                try {
                                    this.g = (Button) p(R.id.expand_more_button);
                                } catch (scr unused) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "expand_more_button", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
                                }
                            } catch (scr unused2) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "primary_image", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
                            }
                        } catch (scr unused3) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "share_button", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
                        }
                    } catch (scr unused4) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "footer_annotation", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
                    }
                } catch (scr unused5) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
                }
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "heading_annotation_text", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
            }
        } catch (scr unused7) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "news_article_card", "com.google.android.apps.googletv.app.presentation.components.highlights.articlecard.ArticleCardViewBindable"));
        }
    }

    @Override // defpackage.sca
    public final void z() {
        ImageView imageView = this.f;
        if (imageView == null) {
            yks.c("image");
            imageView = null;
        }
        imageView.setClipToOutline(true);
    }

    public jpe(kuw kuwVar) {
        this.h = kuwVar;
    }
}
