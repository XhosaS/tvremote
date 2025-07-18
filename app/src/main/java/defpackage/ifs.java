package defpackage;

import android.accounts.Account;
import com.google.android.apps.tvsearch.setup.AssistantSetupActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ifs implements zxe {
    final /* synthetic */ Account a;
    final /* synthetic */ boolean b;
    final /* synthetic */ AssistantSetupActivity c;

    public ifs(AssistantSetupActivity assistantSetupActivity, Account account, boolean z) {
        this.a = account;
        this.b = z;
        this.c = assistantSetupActivity;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        ((zdv) ((zdv) ((zdv) AssistantSetupActivity.l.d()).p(th)).q("com/google/android/apps/tvsearch/setup/AssistantSetupActivity$9", "onFailure", (char) 2441, "AssistantSetupActivity.java")).u("Failed to write DSC permission");
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        this.c.aa.L(this.a, this.b);
    }
}
