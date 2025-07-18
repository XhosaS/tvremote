package defpackage;

import android.graphics.Color;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joc extends sca {
    public static final int a;
    public ImageView b;
    public Button c;
    public TextView d;
    public TextView e;
    public float f = 1.0f;
    public View g;
    public View h;
    public View i;
    public View j;
    public View k;
    public final hfw l;
    public final kuw m;
    public final kuw n;

    static {
        Color.parseColor("#cc0d0f09");
        a = Color.parseColor("#ff131314");
    }

    public joc() {
    }

    public final View a() {
        View view = this.g;
        if (view != null) {
            return view;
        }
        yks.c("gradientView");
        return null;
    }

    public final View b() {
        View view = this.h;
        if (view != null) {
            return view;
        }
        yks.c("gradientViewBc25layer1");
        return null;
    }

    public final View d() {
        View view = this.i;
        if (view != null) {
            return view;
        }
        yks.c("gradientViewBc25layer2");
        return null;
    }

    public final View e() {
        View view = this.j;
        if (view != null) {
            return view;
        }
        yks.c("gradientViewBc25layer3");
        return null;
    }

    public final View f() {
        View view = this.k;
        if (view != null) {
            return view;
        }
        yks.c("gradientViewBc25layer4");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.b = (ImageView) p(R.id.provider_logo);
            try {
                this.c = (Button) p(R.id.action_button_bc25);
                try {
                    this.d = (TextView) p(R.id.title);
                    try {
                        this.e = (TextView) p(R.id.subtitle);
                        try {
                            this.g = p(R.id.gradient);
                            try {
                                this.h = p(R.id.bc25_gradient_layer_1);
                                try {
                                    this.i = p(R.id.bc25_gradient_layer_2);
                                    try {
                                        this.j = p(R.id.bc25_gradient_layer_3);
                                        try {
                                            this.k = p(R.id.bc25_gradient_layer_4);
                                        } catch (scr unused) {
                                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_gradient_layer_4", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                                        }
                                    } catch (scr unused2) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_gradient_layer_3", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                                    }
                                } catch (scr unused3) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_gradient_layer_2", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                                }
                            } catch (scr unused4) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "bc25_gradient_layer_1", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                            }
                        } catch (scr unused5) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "gradient", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                        }
                    } catch (scr unused6) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                    }
                } catch (scr unused7) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
                }
            } catch (scr unused8) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "action_button_bc25", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
            }
        } catch (scr unused9) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "provider_logo", "com.google.android.apps.googletv.app.presentation.components.featuredcarousel.FeaturedCarouselCardViewBindable"));
        }
    }

    public final Button i() {
        Button button = this.c;
        if (button != null) {
            return button;
        }
        yks.c("actionButtonBc25");
        return null;
    }

    public joc(kuw kuwVar, kuw kuwVar2, hfw hfwVar) {
        this.m = kuwVar;
        this.n = kuwVar2;
        this.l = hfwVar;
    }
}
