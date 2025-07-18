package defpackage;

import android.support.v7.widget.AppCompatButton;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kjh extends scf {
    public scg a;
    public sck b;
    public boolean c;
    public CharSequence d;
    public Integer e;
    public View.OnClickListener f;
    private Integer g;
    private View.OnClickListener h;

    public kjh() {
    }

    @Override // defpackage.scf
    public final int a() {
        return R.layout.error_view_layout;
    }

    public final void b(sch schVar) {
        this.h = new scc("R.id.error_action_button", this, schVar);
        G(4);
    }

    public final void c(Integer num) {
        if (yks.e(this.g, num)) {
            return;
        }
        this.g = num;
        G(1);
    }

    @Override // defpackage.scf
    protected final long e(scf scfVar) {
        kjh kjhVar = (kjh) scfVar;
        long j = true != yks.e(Boolean.valueOf(this.c), Boolean.valueOf(kjhVar.c)) ? 1L : 0L;
        if (!yks.e(this.g, kjhVar.g)) {
            j |= 2;
        }
        if (!yks.e(this.d, kjhVar.d)) {
            j |= 4;
        }
        if (!yks.e(this.e, kjhVar.e)) {
            j |= 8;
        }
        if (!yks.e(this.h, kjhVar.h)) {
            j |= 16;
        }
        return !yks.e(this.f, kjhVar.f) ? j | 32 : j;
    }

    @Override // defpackage.scf
    protected final /* synthetic */ sca f() {
        return new kjg();
    }

    @Override // defpackage.scf
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable";
    }

    @Override // defpackage.scf
    public final void h(sca scaVar, long j) {
        Integer num;
        Integer num2;
        kjg kjgVar = (kjg) scaVar;
        AppCompatButton appCompatButton = null;
        if (j == 0 || (1 & j) != 0) {
            boolean z = this.c;
            AppCompatButton appCompatButton2 = kjgVar.e;
            if (appCompatButton2 == null) {
                yks.c("sendFeedBackButton");
                appCompatButton2 = null;
            }
            appCompatButton2.setVisibility(true != z ? 8 : 0);
        }
        if ((j == 0 || (2 & j) != 0) && (num = this.g) != null) {
            num.intValue();
            TextView textView = kjgVar.a;
            if (textView == null) {
                yks.c("errorMessageTextView");
                textView = null;
            }
            textView.setText(kjgVar.o().getText(num.intValue()));
        }
        if (j == 0 || (4 & j) != 0) {
            CharSequence charSequence = this.d;
            TextView textView2 = kjgVar.b;
            if (textView2 == null) {
                yks.c("errorDetailedMessageTextView");
                textView2 = null;
            }
            textView2.setText(charSequence);
            View view = kjgVar.c;
            if (view == null) {
                yks.c("internalSection");
                view = null;
            }
            view.setVisibility(true != TextUtils.isEmpty(charSequence) ? 0 : 8);
        }
        if ((j == 0 || (8 & j) != 0) && (num2 = this.e) != null) {
            num2.intValue();
            AppCompatButton appCompatButton3 = kjgVar.d;
            if (appCompatButton3 == null) {
                yks.c("errorActionButton");
            } else {
                appCompatButton = appCompatButton3;
            }
            appCompatButton.setText(kjgVar.o().getText(num2.intValue()));
        }
        if (j == 0 || (16 & j) != 0) {
            try {
                kjgVar.r(R.id.error_action_button, this.h);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "error_action_button", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
            }
        }
        if (j == 0 || (j & 32) != 0) {
            try {
                kjgVar.r(R.id.send_feedback_button, this.f);
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "send_feedback_button", "com.google.android.apps.googletv.app.presentation.views.error.ErrorViewBindable"));
            }
        }
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.c), this.g, this.d, this.e, this.h, this.f);
    }

    @Override // defpackage.scf
    public final void i(View view) {
        scg scgVar = this.a;
        if (scgVar != null) {
            scgVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final void j(View view) {
        sck sckVar = this.b;
        if (sckVar != null) {
            sckVar.a(this, view);
        }
    }

    @Override // defpackage.scf
    public final Object[] o() {
        return a.z();
    }

    public final String toString() {
        return String.format("ErrorViewModel{feedbackButtonVisibility=%s, errorMessage=%s, detailedErrorMessage=%s, actionButtonText=%s, errorClickListener=%s, sendFeedbackClickListener=%s}", Boolean.valueOf(this.c), this.g, this.d, this.e, this.h, this.f);
    }

    public kjh(byte[] bArr) {
    }
}
