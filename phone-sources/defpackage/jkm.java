package defpackage;

import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jkm extends sca {
    public LinearLayout a;
    public TextView b;

    public final TextView a() {
        TextView textView = this.b;
        if (textView != null) {
            return textView;
        }
        yks.c("rentalMessage");
        return null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.rentalexpiry.RentalExpiryViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (LinearLayout) p(R.id.rental_expiry_component);
            try {
                this.b = (TextView) p(R.id.rental_message);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rental_message", "com.google.android.apps.googletv.app.presentation.components.entity.rentalexpiry.RentalExpiryViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "rental_expiry_component", "com.google.android.apps.googletv.app.presentation.components.entity.rentalexpiry.RentalExpiryViewBindable"));
        }
    }
}
