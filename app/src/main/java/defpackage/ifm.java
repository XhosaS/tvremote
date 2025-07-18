package defpackage;

import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifm implements zxe {
    final /* synthetic */ AssistantSetupActivity a;

    public ifm(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ad.e(ipd.h, th);
        assistantSetupActivity.ax = true;
        assistantSetupActivity.aQ = true;
        assistantSetupActivity.P();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$3", "onSuccess", 1143, "AssistantSetupActivity.java")).u("No updateSettingsUiResponse in result future at this time.");
            return;
        }
        zdy zdyVar = AssistantSetupActivity.l;
        optional.get();
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ax = true;
        assistantSetupActivity.P();
    }
}
