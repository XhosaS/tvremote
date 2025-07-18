package defpackage;

import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifo implements zxe {
    final /* synthetic */ AssistantSetupActivity a;

    public ifo(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ad.e(ipd.k, th);
        assistantSetupActivity.aQ = true;
        assistantSetupActivity.au = true;
        assistantSetupActivity.av = true;
        assistantSetupActivity.az = true;
        assistantSetupActivity.P();
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$5", "onSuccess", 1662, "AssistantSetupActivity.java")).u("No UpdateSettingsUiResponse in result future at this time.");
            return;
        }
        zdy zdyVar = AssistantSetupActivity.l;
        optional.get();
        AssistantSetupActivity assistantSetupActivity = this.a;
        irk.a.c(assistantSetupActivity.aO, assistantSetupActivity.r, assistantSetupActivity.z, (String) assistantSetupActivity.C.a(), assistantSetupActivity.aa, (ymi) optional.get());
        assistantSetupActivity.au = true;
        assistantSetupActivity.av = true;
        assistantSetupActivity.az = true;
        assistantSetupActivity.P();
    }
}
