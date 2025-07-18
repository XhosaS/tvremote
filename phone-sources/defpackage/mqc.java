package defpackage;

import android.app.Activity;
import com.google.android.apps.play.movies.mobile.usecase.settings.InternalSettingsActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mqc extends fv {
    final /* synthetic */ Activity a;
    final /* synthetic */ InternalSettingsActivity d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mqc(InternalSettingsActivity internalSettingsActivity, Activity activity) {
        super(true);
        this.a = activity;
        this.d = internalSettingsActivity;
    }

    @Override // defpackage.fv
    public final void b() {
        this.d.a(this.a);
    }
}
