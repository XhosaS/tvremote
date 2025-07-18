package defpackage;

import android.hardware.hdmi.HdmiControlManager;
import android.hardware.hdmi.HdmiPlaybackClient;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class irp {
    public final HdmiControlManager a;
    public final HdmiPlaybackClient b;

    public irp(HdmiControlManager hdmiControlManager) {
        this.a = hdmiControlManager;
        this.b = hdmiControlManager != null ? hdmiControlManager.getPlaybackClient() : null;
    }

    public final boolean a() {
        return this.a != null;
    }
}
