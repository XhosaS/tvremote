package defpackage;

import android.graphics.PorterDuff;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhc extends scf {
    public wls a;
    public CharSequence b;
    public View.OnClickListener c;
    public String d;
    public boolean e;
    public jha f;
    public jha g;
    private final yfo h;

    public jhc(yfo yfoVar) {
        this.h = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.ai_overview_button_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhc jhcVar = (jhc) scfVar;
        long j = true != yks.e(this.a, jhcVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jhcVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, jhcVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, jhcVar.d)) {
            j |= 8;
        }
        if (!yks.e(Boolean.valueOf(this.e), Boolean.valueOf(jhcVar.e))) {
            j |= 16;
        }
        if (!yks.e(this.f, jhcVar.f)) {
            j |= 32;
        }
        return !yks.e(this.g, jhcVar.g) ? j | 64 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jhb();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jha jhaVar;
        jha jhaVar2;
        jhb jhbVar = (jhb) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jhbVar, this.a, R.id.button_title, 8);
        }
        if (j == 0 || (2 & j) != 0) {
            try {
                jhbVar.s(R.id.button, this.b);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
            }
        }
        if (j == 0 || (4 & j) != 0) {
            try {
                jhbVar.r(R.id.button, this.c);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.AiOverviewButtonViewBindable"));
            }
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.h(jhbVar, this.d, R.id.button_layout);
        }
        if ((j == 0 || (16 & j) != 0) && this.e) {
            jhbVar.f().setBackgroundDrawable(jhbVar.o().getDrawable(jhbVar.o().getResources().getConfiguration().orientation == 1 ? R.drawable.non_ai_overview_cta_outline_background : R.drawable.non_ai_overview_cta_outline_background_land));
            jhbVar.a().setImageDrawable(jhbVar.o().getDrawable(R.drawable.gs_summarize_auto_vd_theme_24));
        }
        if ((j == 0 || (32 & j) != 0) && (jhaVar = this.f) != null) {
            boolean z = jhbVar.o().getResources().getConfiguration().orientation == 1;
            jhbVar.d().setVisibility(8);
            jhbVar.f().setBackgroundColor(0);
            jhbVar.a().setImageDrawable(jhbVar.o().getDrawable(R.drawable.gs_summarize_auto_vd_theme_24));
            ImageView imageViewA = jhbVar.a();
            wfo wfoVar = jhaVar.a;
            imageViewA.setColorFilter(wfoVar.g(), PorterDuff.Mode.SRC_IN);
            jhbVar.b().setTextColor(wfoVar.g());
            ComposeView composeViewE = jhbVar.e();
            composeViewE.i();
            composeViewE.b(new bhq(-1471633211, true, new khm(z, jhaVar, 1)));
        }
        if ((j == 0 || (64 & j) != 0) && (jhaVar2 = this.g) != null) {
            jhbVar.e().setVisibility(8);
            jhbVar.f().setBackgroundColor(0);
            jhbVar.b().setTextColor(jhaVar2.a.g());
            ComposeView composeViewD = jhbVar.d();
            composeViewD.i();
            composeViewD.b(new bhq(-2073625154, true, new azg(jhaVar2, 3)));
        }
        Drawable background = jhbVar.f().getBackground();
        AnimationDrawable animationDrawable = background instanceof AnimationDrawable ? (AnimationDrawable) background : null;
        if (animationDrawable != null) {
            animationDrawable.setEnterFadeDuration(800);
            animationDrawable.setExitFadeDuration(800);
            animationDrawable.start();
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, this.g);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("AiOverviewButtonViewModel{buttonTitle=%s, buttonContentDescription=%s, buttonClickListener=%s, buttonTag=%s, nonAiButtonLayoutOld=%s, nonAiButtonLayout=%s, aiButtonLayout=%s}", this.a, this.b, this.c, this.d, Boolean.valueOf(this.e), this.f, this.g);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
