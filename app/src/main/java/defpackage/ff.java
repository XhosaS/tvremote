package defpackage;

import android.media.session.MediaController;
import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
class ff extends fe {
    protected final MediaController.TransportControls a;

    public ff(MediaController.TransportControls transportControls) {
        this.a = transportControls;
    }

    @Override // defpackage.fe
    public final void a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED", z);
        this.a.sendCustomAction("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED", bundle);
    }
}
