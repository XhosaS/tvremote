package defpackage;

import android.view.View;
import android.widget.Button;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxx extends scf {
    public sco a;
    public sco b;
    public sco c;
    public sco d;
    public View.OnClickListener e;
    public View.OnClickListener f;
    public boolean g;
    public boolean h;

    public jxx() {
        sco scoVar = sco.a;
        this.a = scoVar;
        this.b = scoVar;
        this.c = scoVar;
        this.d = scoVar;
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.confirmation_dialog_layout;
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        jxx jxxVar = (jxx) scfVar;
        long j = true != yks.e(this.a, jxxVar.a) ? 1L : 0L;
        if (!yks.e(this.b, jxxVar.b)) {
            j |= 2;
        }
        if (!yks.e(this.c, jxxVar.c)) {
            j |= 4;
        }
        if (!yks.e(this.d, jxxVar.d)) {
            j |= 8;
        }
        if (!yks.e(this.e, jxxVar.e)) {
            j |= 16;
        }
        if (!yks.e(this.f, jxxVar.f)) {
            j |= 32;
        }
        if (!yks.e(Boolean.valueOf(this.g), Boolean.valueOf(jxxVar.g))) {
            j |= 64;
        }
        return !yks.e(Boolean.valueOf(this.h), Boolean.valueOf(jxxVar.h)) ? j | 128 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new jxw();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        long j2;
        jxw jxwVar = (jxw) scaVar;
        if (j == 0 || (j & 1) != 0) {
            try {
                jxwVar.w(R.id.title, this.a.a(jxwVar.o()), -1);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        }
        if (j == 0 || (j & 2) != 0) {
            try {
                jxwVar.w(R.id.description, this.b.a(jxwVar.o()), -1);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "description", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        }
        if (j == 0 || (j & 4) != 0) {
            try {
                jxwVar.w(R.id.positive_button, this.c.a(jxwVar.o()), -1);
            } catch (scr unused3) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "positive_button", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        }
        if (j == 0 || (j & 8) != 0) {
            j2 = 0;
            try {
                jxwVar.w(R.id.negative_button, this.d.a(jxwVar.o()), -1);
            } catch (scr unused4) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "negative_button", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        } else {
            j2 = 0;
        }
        if (j == 0 || (j & 16) != j2) {
            try {
                jxwVar.r(R.id.negative_button, this.e);
            } catch (scr unused5) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "negative_button", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != j2) {
            try {
                jxwVar.r(R.id.positive_button, this.f);
            } catch (scr unused6) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "positive_button", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        }
        Button button = null;
        if (j == 0 || (j & 64) != j2) {
            boolean z = this.g;
            Button button2 = jxwVar.a;
            if (button2 == null) {
                yks.c("positiveButton");
                button2 = null;
            }
            button2.setVisibility(true != z ? 4 : 0);
        }
        if (j == 0 || (j & 128) != j2) {
            boolean z2 = this.h;
            Button button3 = jxwVar.b;
            if (button3 == null) {
                yks.c("negativeButton");
            } else {
                button = button3;
            }
            button.setVisibility(true != z2 ? 4 : 0);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ConfirmationDialogViewModel{title=%s, description=%s, positiveButtonText=%s, negativeButtonText=%s, negativeButtonClickListener=%s, positiveButtonClickListener=%s, positiveButtonVisibility=%s, negativeButtonVisibility=%s}", this.a, this.b, this.c, this.d, this.e, this.f, Boolean.valueOf(this.g), Boolean.valueOf(this.h));
    }

    @Override // defpackage.scf
    public final void i(View view) {
    }

    @Override // defpackage.scf
    public final void j(View view) {
    }
}
