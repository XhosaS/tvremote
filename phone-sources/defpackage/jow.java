package defpackage;

import android.view.View;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jow extends sca {
    public View a;
    public final kuw b;
    public final kuw c;
    public final kuw d;

    public jow() {
        throw null;
    }

    @Override // defpackage.sca
    public final String g() {
        return "com.google.android.apps.googletv.app.presentation.components.genericstreamtitle.GenericStreamTitleViewBindable";
    }

    @Override // defpackage.sca
    public final void h() {
        try {
            this.a = p(R.id.thumbnail_view);
        } catch (scr unused) {
            throw new IllegalArgumentException(String.format("Cannot find a view with id R.id.%s inside this view in %s", "thumbnail_view", "com.google.android.apps.googletv.app.presentation.components.genericstreamtitle.GenericStreamTitleViewBindable"));
        }
    }

    public jow(kuw kuwVar, kuw kuwVar2, kuw kuwVar3) {
        this.c = kuwVar;
        this.d = kuwVar2;
        this.b = kuwVar3;
    }
}
