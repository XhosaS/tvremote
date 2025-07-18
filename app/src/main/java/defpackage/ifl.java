package defpackage;

import android.accounts.Account;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifl implements gvj {
    final /* synthetic */ AssistantSetupActivity a;

    public ifl(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.gvj
    public final void a(gvw gvwVar) {
        this.a.aa(gvwVar);
    }

    @Override // defpackage.gvj
    public final void b(Intent intent) {
        AssistantSetupActivity assistantSetupActivity = this.a;
        if (assistantSetupActivity.aj()) {
            ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$2", "onRecoverableError", 946, "AssistantSetupActivity.java")).u("Launching recovery activity for fetching auth token.");
            intent.addFlags(268435456);
            wyo.l(assistantSetupActivity.getBaseContext(), intent);
        } else {
            ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$2", "onRecoverableError", 958, "AssistantSetupActivity.java")).u("Ignoring recovery intent.");
        }
        assistantSetupActivity.ad.e(ipd.f, null);
        assistantSetupActivity.S(false, adzk.ERROR);
    }

    @Override // defpackage.gvj
    public final void c() {
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ae.a();
        try {
            Account account = assistantSetupActivity.aO;
            int i = kcx.b;
            boolean zAl = assistantSetupActivity.al();
            if (((Boolean) assistantSetupActivity.V.a()).booleanValue() && zAl && assistantSetupActivity.u.c(account)) {
                ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "fetchSettingsForAssistantSetupWithAccountIfCacheInvalid", 994, "AssistantSetupActivity.java")).u("Assistant settings cache is valid, do not fetch settings again for account.");
                assistantSetupActivity.Y();
            } else {
                ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity", "fetchSettingsForAssistantSetupWithAccountIfCacheInvalid", 998, "AssistantSetupActivity.java")).u("Proceeding to fetch existing assistant settings for this account from server and attach a listener.");
                assistantSetupActivity.r.l(account, assistantSetupActivity, i);
            }
        } catch (PackageManager.NameNotFoundException e) {
            AssistantSetupActivity assistantSetupActivity2 = this.a;
            assistantSetupActivity2.ad.e(ipd.g, e);
            assistantSetupActivity2.S(true, adzk.ERROR);
        }
    }
}
