package defpackage;

import android.media.session.MediaController;

/* compiled from: PG */
/* loaded from: classes.dex */
final class ej extends ei {
    protected final MediaController.TransportControls a;

    public ej(MediaController.TransportControls transportControls) {
        this.a = transportControls;
    }

    @Override // defpackage.ei
    public final void a() {
        this.a.pause();
    }

    @Override // defpackage.ei
    public final void b() {
        this.a.play();
    }

    @Override // defpackage.ei
    public final void c() {
        this.a.stop();
    }
}
