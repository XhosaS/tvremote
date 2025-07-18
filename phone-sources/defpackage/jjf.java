package defpackage;

import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jjf extends sca {
    public TextView a;
    public TextView b;
    public final kuw c;

    public jjf() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoItemViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = (TextView) p(R.id.moreinfo_item_title);
            try {
                this.b = (TextView) p(R.id.moreinfo_item_description);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "moreinfo_item_description", "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoItemViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "moreinfo_item_title", "com.google.android.apps.googletv.app.presentation.components.entity.moreinfo.MoreInfoItemViewBindable"));
        }
    }

    public jjf(kuw kuwVar) {
        this.c = kuwVar;
    }
}
