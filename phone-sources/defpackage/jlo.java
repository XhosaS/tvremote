package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jlo extends sca {
    public View a;
    public View b;
    public TextView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public TextView g;

    public final TextView a() {
        TextView textView = this.d;
        if (textView != null) {
            return textView;
        }
        yks.c("actorsText");
        return null;
    }

    public final TextView b() {
        TextView textView = this.e;
        if (textView != null) {
            return textView;
        }
        yks.c("directorsText");
        return null;
    }

    public final TextView d() {
        TextView textView = this.g;
        if (textView != null) {
            return textView;
        }
        yks.c("producersText");
        return null;
    }

    public final TextView e() {
        TextView textView = this.f;
        if (textView != null) {
            return textView;
        }
        yks.c("writersText");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            p(R.id.tvm_entity_synopsis_component);
            try {
                this.a = p(R.id.read_more);
                try {
                    this.b = p(R.id.read_less);
                    try {
                        this.c = (TextView) p(R.id.synopsis_text);
                        try {
                            this.d = (TextView) p(R.id.actors_text);
                            try {
                                this.e = (TextView) p(R.id.directors_text);
                                try {
                                    this.f = (TextView) p(R.id.writers_text);
                                    try {
                                        this.g = (TextView) p(R.id.producers_text);
                                    } catch (scr unused) {
                                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "producers_text", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
                                    }
                                } catch (scr unused2) {
                                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "writers_text", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
                                }
                            } catch (scr unused3) {
                                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "directors_text", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
                            }
                        } catch (scr unused4) {
                            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "actors_text", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
                        }
                    } catch (scr unused5) {
                        throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "synopsis_text", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
                    }
                } catch (scr unused6) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "read_less", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
                }
            } catch (scr unused7) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "read_more", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
            }
        } catch (scr unused8) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "tvm_entity_synopsis_component", "com.google.android.apps.googletv.app.presentation.components.entity.synopsis.SynopsisViewBindable"));
        }
    }
}
