package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jsn extends sca {
    public View a;
    public View b;
    public final kuw c;

    public jsn() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.peoplerowcard.PeopleRowCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.title);
            try {
                this.b = p(R.id.subtitle);
            } catch (scr unused) {
                throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "subtitle", "com.google.android.apps.googletv.app.presentation.components.peoplerowcard.PeopleRowCardViewBindable"));
            }
        } catch (scr unused2) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "title", "com.google.android.apps.googletv.app.presentation.components.peoplerowcard.PeopleRowCardViewBindable"));
        }
    }

    public jsn(kuw kuwVar) {
        this.c = kuwVar;
    }
}
