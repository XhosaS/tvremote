package defpackage;

import android.view.View;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jhi extends scf {
    public View.OnClickListener a;
    public wls b;
    private final yfo c;

    public jhi(yfo yfoVar) {
        this.c = yfoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.companion_watch_local_button_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jhi jhiVar = (jhi) scfVar;
        long j = true != yks.e(this.a, jhiVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jhiVar.b)) {
            j |= 2;
        }
        return !yks.e(null, null) ? j | 4 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jhh();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionWatchLocalButtonViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        jhh jhhVar = (jhh) scaVar;
        if (j == 0 || (1 & j) != 0) {
            try {
                jhhVar.r(R.id.local_button, this.a);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "local_button", "com.google.android.apps.googletv.app.presentation.components.entity.actionpanel.CompanionWatchLocalButtonViewBindable"));
            }
        }
        if (j == 0 || (2 & j) != 0) {
            jwq.j(jhhVar, this.b, R.id.companion_watch_local_cta_subtitle_text, -1);
        }
        if (j == 0 || (j & 4) != 0) {
            jwq.h(jhhVar, null, R.id.local_button);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, null);
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("CompanionWatchLocalButtonViewModel{companionWatchLocalCtaClickListener=%s, companionWatchLocalCtaSubtitleText=%s, buttonTag=%s}", this.a, this.b, null);
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
