package defpackage;

import android.graphics.drawable.GradientDrawable;
import android.view.TextureView;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.contentrating.ContentRatingView;
import com.google.android.apps.googletv.app.presentation.views.expandabletextview.ExpandableTextView;
import com.google.android.apps.googletv.app.presentation.views.rottentomatoesrating.RottenTomatoesRatingView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlz extends sca {
    public ImageView a;
    public FrameLayout b;
    public FrameLayout c;
    public TextureView d;
    public View e;
    public LinearLayout f;
    public ExpandableTextView g;
    public TextView h;
    public ContentRatingView i;
    public RottenTomatoesRatingView j;
    public View k;
    public View l;
    public View m;
    public View n;
    public View o;
    public View p;
    public TextView q;
    public TextView r;
    public int s;
    public final kuw t;

    public jlz() {
        throw null;
    }

    public static final GradientDrawable n(int i, int i2) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{i, i2});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.TOP_BOTTOM);
        gradientDrawable.setGradientType(0);
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    public final View a() {
        View view = this.l;
        if (view != null) {
            return view;
        }
        yks.c("gradientBackground");
        return null;
    }

    public final View b() {
        View view = this.k;
        if (view != null) {
            return view;
        }
        yks.c("gradientBackgroundOld");
        return null;
    }

    public final View d() {
        View view = this.e;
        if (view != null) {
            return view;
        }
        yks.c("trailerButton");
        return null;
    }

    public final FrameLayout e() {
        FrameLayout frameLayout = this.c;
        if (frameLayout != null) {
            return frameLayout;
        }
        yks.c("titleView");
        return null;
    }

    public final ImageView f() {
        ImageView imageView = this.a;
        if (imageView != null) {
            return imageView;
        }
        yks.c("thumbnail");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (ImageView) p(R.id.trailer_thumbnail);
            try {
                this.b = (FrameLayout) p(R.id.trailer_item_view);
                try {
                    this.c = (FrameLayout) p(R.id.title_component);
                    try {
                        this.d = (TextureView) p(R.id.player_container);
                        try {
                            this.e = p(R.id.trailer_button);
                            try {
                                this.f = (LinearLayout) p(R.id.title_section);
                                try {
                                    this.g = (ExpandableTextView) p(R.id.subtitle);
                                    try {
                                        this.h = (TextView) p(R.id.stats);
                                        try {
                                            this.i = (ContentRatingView) p(R.id.content_rating);
                                            try {
                                                this.j = (RottenTomatoesRatingView) p(R.id.tomato_rating);
                                                try {
                                                    this.k = p(R.id.gradient_background_old);
                                                    try {
                                                        this.l = p(R.id.gradient_background);
                                                        try {
                                                            this.m = p(R.id.gradient_background_layer_1);
                                                            try {
                                                                this.n = p(R.id.gradient_background_layer_2);
                                                                try {
                                                                    this.o = p(R.id.gradient_background_layer_3);
                                                                    try {
                                                                        this.p = p(R.id.gradient_background_layer_4);
                                                                        try {
                                                                            this.q = (TextView) p(R.id.title_old);
                                                                            try {
                                                                                this.r = (TextView) p(R.id.title);
                                                                            } catch (scr unused) {
                                                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                                            }
                                                                        } catch (scr unused2) {
                                                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title_old", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                                        }
                                                                    } catch (scr unused3) {
                                                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient_background_layer_4", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                                    }
                                                                } catch (scr unused4) {
                                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient_background_layer_3", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                                }
                                                            } catch (scr unused5) {
                                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient_background_layer_2", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                            }
                                                        } catch (scr unused6) {
                                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient_background_layer_1", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                        }
                                                    } catch (scr unused7) {
                                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient_background", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                    }
                                                } catch (scr unused8) {
                                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient_background_old", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                                }
                                            } catch (scr unused9) {
                                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tomato_rating", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                            }
                                        } catch (scr unused10) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "content_rating", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                        }
                                    } catch (scr unused11) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "stats", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                    }
                                } catch (scr unused12) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                                }
                            } catch (scr unused13) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title_section", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                            }
                        } catch (scr unused14) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "trailer_button", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                        }
                    } catch (scr unused15) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "player_container", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                    }
                } catch (scr unused16) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title_component", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
                }
            } catch (scr unused17) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "trailer_item_view", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
            }
        } catch (scr unused18) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "trailer_thumbnail", "com.google.android.apps.googletv.app.presentation.components.entity.title.TitleViewBindable"));
        }
    }

    public final LinearLayout i() {
        LinearLayout linearLayout = this.f;
        if (linearLayout != null) {
            return linearLayout;
        }
        yks.c("titleSection");
        return null;
    }

    public final TextView j() {
        TextView textView = this.q;
        if (textView != null) {
            return textView;
        }
        yks.c("titleOld");
        return null;
    }

    public final TextView k() {
        TextView textView = this.r;
        if (textView != null) {
            return textView;
        }
        yks.c("titleTextView");
        return null;
    }

    public final ExpandableTextView m() {
        ExpandableTextView expandableTextView = this.g;
        if (expandableTextView != null) {
            return expandableTextView;
        }
        yks.c("subtitle");
        return null;
    }

    public jlz(kuw kuwVar) {
        this.t = kuwVar;
    }
}
