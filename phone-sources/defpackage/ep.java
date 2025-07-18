package defpackage;

import android.content.Context;
import android.media.session.MediaSession;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ep extends eo {
    public ep(Context context, String str) {
        super(context, str);
    }

    @Override // defpackage.en
    public final MediaSession e(Context context, String str) {
        return new MediaSession(context, str, null);
    }
}
