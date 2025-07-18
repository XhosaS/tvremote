package defpackage;

import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
class ifp implements zxe {
    final /* synthetic */ AssistantSetupActivity a;

    public ifp(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ad.e(ipd.l, th);
        assistantSetupActivity.ay = true;
        assistantSetupActivity.aQ = true;
        assistantSetupActivity.P();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$6", "onSuccess", 1826, "AssistantSetupActivity.java")).u("No updateSettingsUiResponse in result future at this time.");
            return;
        }
        zdy zdyVar = AssistantSetupActivity.l;
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ay = true;
        assistantSetupActivity.P();
    }
}
