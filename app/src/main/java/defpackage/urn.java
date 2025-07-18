package defpackage;

import android.content.Context;
import android.hardware.hdmi.HdmiControlManager;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class urn {
    final HdmiControlManager a;
    final /* synthetic */ Context b;

    public urn(Context context) {
        this.b = context;
        this.a = (HdmiControlManager) context.getSystemService(HdmiControlManager.class);
    }
}
