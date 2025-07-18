package defpackage;

import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;
import j$.time.Duration;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifr implements zxe {
    final /* synthetic */ AssistantSetupActivity a;

    public ifr(AssistantSetupActivity assistantSetupActivity) {
        this.a = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) AssistantSetupActivity.l.d()).p(th)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$8", "onFailure", (char) 2416, "AssistantSetupActivity.java")).u("Cast id failed to be loaded.");
        AssistantSetupActivity assistantSetupActivity = this.a;
        assistantSetupActivity.Z("", "");
        assistantSetupActivity.ak.c(iht.a.a(Duration.ZERO));
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        fcy fcyVar = (fcy) obj;
        zdy zdyVar = AssistantSetupActivity.l;
        this.a.Z(fcyVar.a, fcyVar.b);
    }
}
