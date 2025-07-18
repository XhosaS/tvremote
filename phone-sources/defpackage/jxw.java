package defpackage;

import android.widget.Button;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jxw extends sca {
    public Button a;
    public Button b;

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (Button) p(R.id.positive_button);
            try {
                this.b = (Button) p(R.id.negative_button);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "negative_button", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "positive_button", "com.google.android.apps.googletv.app.presentation.pages.confirmationdialog.ConfirmationDialogViewBindable"));
        }
    }
}
