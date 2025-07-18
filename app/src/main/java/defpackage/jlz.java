package defpackage;

import com.google.assistant.sdk.libassistant.DeviceStateListener;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jlz extends DeviceStateListener {
    final /* synthetic */ jma a;

    public jlz(jma jmaVar) {
        this.a = jmaVar;
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
    public final void OnLocalTtsFinished() {
        this.a.b.j();
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
    public final void OnLocalTtsStarted() {
        this.a.b.c();
    }

    @Override // com.google.assistant.sdk.libassistant.DeviceStateListener
    public final void OnMicMutedChange(boolean z) {
        if (z) {
            this.a.b.d();
        }
    }
}
