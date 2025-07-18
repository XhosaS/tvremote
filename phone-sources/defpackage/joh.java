package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class joh extends sca {
    public View a;
    public TextView b;
    public TextView c;
    public final kuw d;

    public joh() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.image_bounding_card);
            try {
                this.b = (TextView) p(R.id.title);
                try {
                    this.c = (TextView) p(R.id.subtitle);
                } catch (scr unused) {
                    throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable"));
                }
            } catch (scr unused2) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable"));
            }
        } catch (scr unused3) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "image_bounding_card", "com.google.android.apps.googletv.app.presentation.components.genericsharingcontent.GenericSharingContentViewBindable"));
        }
    }

    public joh(kuw kuwVar) {
        this.d = kuwVar;
    }
}
