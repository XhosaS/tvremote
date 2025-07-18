package defpackage;

import android.content.Context;
import android.media.session.MediaSession;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fsa extends frz {
    public fsa(Context context, String str, Bundle bundle) {
        super(context, str, bundle);
    }

    @Override // defpackage.frx
    public final MediaSession a(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }
}
