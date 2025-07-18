package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhm extends scf {
    public wls a;
    public kuj b;
    public String c;
    public String d;
    public CharSequence e;
    public View.OnClickListener f;
    public wfo g;
    public jhk h;
    private final yfo i;

    public jhm(yfo yfoVar) {
        this.i = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.download_button_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhm jhmVar = (jhm) scfVar;
        long j = true != yks.e(this.a, jhmVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jhmVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, jhmVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, jhmVar.d)) {
            j |= 8;
        }
        if (!yks.e(this.e, jhmVar.e)) {
            j |= 16;
        }
        if (!yks.e(this.f, jhmVar.f)) {
            j |= 32;
        }
        if (!yks.e(this.g, jhmVar.g)) {
            j |= 64;
        }
        return !yks.e(this.h, jhmVar.h) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jhl();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        kuj kujVar;
        wfo wfoVar;
        jhl jhlVar = (jhl) scaVar;
        if (j == 0 || (1 & j) != 0) {
            jwq.j(jhlVar, this.a, R.id.download_button_text, 8);
        }
        if ((j == 0 || (2 & j) != 0) && (kujVar = this.b) != null) {
            jhlVar.e().setVisibility(0);
            jhlVar.d().setVisibility(8);
            jhlVar.e().c(kujVar);
        }
        if (j == 0 || (4 & j) != 0) {
            jwq.h(jhlVar, this.c, R.id.download_button_layout);
        }
        if (j == 0 || (8 & j) != 0) {
            jwq.h(jhlVar, this.d, R.id.download_icon);
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                jhlVar.s(R.id.button, this.e);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
            }
        }
        if (j == 0 || (32 & j) != 0) {
            try {
                jhlVar.r(R.id.button, this.f);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.DownloadButtonViewBindable"));
            }
        }
        if ((j == 0 || (64 & j) != 0) && (wfoVar = this.g) != null) {
            jhlVar.f().setBackgroundColor(wfoVar.p());
            jhlVar.b().setTextColor(wfoVar.h());
            jhlVar.a().setColorFilter(wfoVar.h(), PorterDuff.Mode.SRC_IN);
        }
        if (j == 0 || (128 & j) != 0) {
            jhk jhkVar = this.h;
            kuj kujVar2 = jhkVar != null ? jhkVar.a : null;
            wfo wfoVar2 = jhkVar != null ? jhkVar.b : null;
            if (kujVar2 != null) {
                jhlVar.e().setVisibility(8);
                jhlVar.a().setVisibility(0);
                jhlVar.d().setVisibility(8);
                jhlVar.e().c(kujVar2);
                Context contextO = jhlVar.o();
                boolean zK = kujVar2.k();
                int i = R.drawable.gs_downloading_rond100_vd_theme_24;
                if (!zK && !kujVar2.h()) {
                    i = kujVar2.f() ? R.drawable.gs_download_done_rond100_vd_theme_24 : kujVar2.i() ? R.drawable.gs_file_download_off_rond100_vd_theme_24 : R.drawable.gs_download_rond100_vd_theme_24;
                }
                Drawable drawable = contextO.getDrawable(i);
                drawable.getClass();
                int iH = wfoVar2.h();
                int iO = (kujVar2.k() || kujVar2.h()) ? wfoVar2.o() : wfoVar2.p();
                drawable.setColorFilter(iH, PorterDuff.Mode.SRC_IN);
                jhlVar.a().setImageDrawable(drawable);
                jhlVar.f().setBackgroundColor(iO);
                jhlVar.b().setTextColor(iH);
                if (kujVar2.h()) {
                    ComposeView composeViewD = jhlVar.d();
                    composeViewD.setVisibility(0);
                    composeViewD.i();
                    composeViewD.b(new bhq(600757406, true, new ano((Object) jhlVar, (Object) wfoVar2, (Object) kujVar2, 9, (byte[]) null)));
                }
            }
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
        return String.format("DownloadButtonViewModel{buttonText=%s, downloadStatusOld=%s, buttonTag=%s, iconTag=%s, buttonContentDescription=%s, buttonClickListener=%s, applyDynamicScheme=%s, downloadStatus=%s}", this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
