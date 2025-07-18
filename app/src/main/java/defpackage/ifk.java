package defpackage;

import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifk implements zxe {
    final /* synthetic */ AssistantSetupActivity a;

    public ifk(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) AssistantSetupActivity.l.b()).p(th)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$1", "onFailure", (char) 821, "AssistantSetupActivity.java")).u("OOBE Heterodyne sync failed. Setting experiments account to null.");
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.U.a = null;
        assistantSetupActivity.ab(false);
    }

    @Override // defpackage.zxe
    public final void b(Object obj) {
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.U.a = assistantSetupActivity.aO;
        assistantSetupActivity.ab(true);
    }
}
