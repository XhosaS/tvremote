package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jun extends sca {
    public View a;
    public final kuw b;
    public final kuw c;
    public final kuw d;
    public final kuw e;
    public final kuw f;

    public jun() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.setup_dismiss);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "setup_dismiss", "com.google.android.apps.googletv.app.presentation.components.setuppromptcard.SetupPromptCardViewBindable"));
        }
    }

    public jun(kuw kuwVar, kuw kuwVar2, kuw kuwVar3, kuw kuwVar4, kuw kuwVar5) {
        this.b = kuwVar;
        this.c = kuwVar2;
        this.d = kuwVar3;
        this.e = kuwVar4;
        this.f = kuwVar5;
    }
}
