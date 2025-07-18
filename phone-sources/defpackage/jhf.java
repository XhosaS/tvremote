package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.googletv.app.presentation.views.playbutton.MediaDeviceAwarePlayButton;
import com.google.android.material.button.MaterialButton;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhf extends scf {
    public View.OnClickListener a;
    public wls b;
    public wls c;
    public wls d;
    public CharSequence e;
    public kkb f;
    public String g;
    public wfo h;
    private final yfo i;

    public jhf(yfo yfoVar) {
        this.i = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.companion_button_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhf jhfVar = (jhf) scfVar;
        long j = true != yks.e(this.a, jhfVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jhfVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, jhfVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, jhfVar.d)) {
            j |= 8;
        }
        if (!yks.e(this.e, jhfVar.e)) {
            j |= 16;
        }
        if (!yks.e(this.f, jhfVar.f)) {
            j |= 32;
        }
        if (!yks.e(this.g, jhfVar.g)) {
            j |= 64;
        }
        return !yks.e(this.h, jhfVar.h) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jhe();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        wfo wfoVar;
        jhe jheVar = (jhe) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jheVar.r(R.id.remote_button, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jheVar, this.b, R.id.companion_discount_annotation, 8);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.j(jheVar, this.c, R.id.companion_watch_cta_text, -1);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.j(jheVar, this.d, R.id.companion_watch_cta_subtitle_text, -1);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jheVar.s(R.id.remote_button, this.e);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "remote_button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionButtonViewBindable"));
            }
        }
        TextView textView = null;
        if (j == 0 || (32 & j) != 0) {
            kkb kkbVar = this.f;
            kkbVar.getClass();
            MediaDeviceAwarePlayButton mediaDeviceAwarePlayButton = jheVar.d;
            if (mediaDeviceAwarePlayButton == null) {
                yks.c("ctaPlayIcon");
                mediaDeviceAwarePlayButton = null;
            }
            mediaDeviceAwarePlayButton.a(kkbVar);
        }
        if (j == 0 || (64 & j) != 0) {
            jwq.h(jheVar, this.g, R.id.remote_button);
        }
        if ((j == 0 || (128 & j) != 0) && (wfoVar = this.h) != null) {
            View view = jheVar.a;
            if (view == null) {
                yks.c("remoteButton");
                view = null;
            }
            MaterialButton materialButton = view instanceof MaterialButton ? (MaterialButton) view : null;
            if (materialButton != null) {
                materialButton.setBackgroundColor(wfoVar.j());
            }
            TextView textView2 = jheVar.b;
            if (textView2 == null) {
                yks.c("companionWatchCtaText");
                textView2 = null;
            }
            textView2.setTextColor(wfoVar.d());
            TextView textView3 = jheVar.c;
            if (textView3 == null) {
                yks.c("companionWatchCtaSubtitleText");
            } else {
                textView = textView3;
            }
            textView.setTextColor(csq.g(wfoVar.d(), 153));
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("CompanionButtonViewModel{companionWatchCtaClickListener=%s, companionDiscountAnnotationText=%s, companionWatchCtaText=%s, companionWatchCtaSubtitleText=%s, remoteButtonContentDescription=%s, initializePlayIcon=%s, buttonTag=%s, applyDynamicScheme=%s}", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
