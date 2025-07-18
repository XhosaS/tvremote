package defpackage;

import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
class ifq implements zxe {
    final /* synthetic */ AssistantSetupActivity a;

    public ifq(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.ad.e(ipd.c, th);
        assistantSetupActivity.o.removeCallbacks(assistantSetupActivity.aY);
        assistantSetupActivity.h(ire.g);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        ((zdv) ((zdv) AssistantSetupActivity.l.b()).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$7", "onSuccess", 2153, "AssistantSetupActivity.java")).x("VM Utterance is available? %s", (Boolean) obj);
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.o.removeCallbacks(assistantSetupActivity.aY);
        assistantSetupActivity.h(ire.g);
    }
}
