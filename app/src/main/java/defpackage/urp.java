package defpackage;

import android.content.Context;
import android.provider.Settings;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class urp implements urm {
    private final Context a;

    public urp(Context context) {
        this.a = context;
    }

    @Override // defpackage.urm
    public final boolean a() {
        return Settings.Global.getInt(this.a.getContentResolver(), "hdmi_control_volume_control_enabled", 1) == 1;
    }
}
