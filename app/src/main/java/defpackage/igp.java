package defpackage;

import androidx.activity.result.ActivityResult;
import com.google.android.apps.tvsearch.setup.JitHotwordSetupActivity;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class igp {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/JitHotwordSetupActivityPeer");
    public final JitHotwordSetupActivity b;
    public final boolean c;
    public final ur d;

    public igp(JitHotwordSetupActivity jitHotwordSetupActivity, boolean z) {
        this.b = jitHotwordSetupActivity;
        this.c = z;
        this.d = jitHotwordSetupActivity.dd(new vd(), jitHotwordSetupActivity.h, new uq() { // from class: igo
            @Override // defpackage.uq
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a != -1) {
                    ((zdv) igp.a.d().q("com/google/android/apps/tvsearch/setup/JitHotwordSetupActivityPeer", "activityResultLauncher$lambda$0", 69, "JitHotwordSetupActivityPeer.kt")).u("OEM Hotword Setup did not finish successfully.");
                }
                ab abVar = new ab(((bw) this.a.b).a.a.e);
                abVar.s = true;
                abVar.f(R.id.fragment_container_view, abVar.o(inz.class), null, 1);
                abVar.e();
                ((zdv) igp.a.b().q("com/google/android/apps/tvsearch/setup/JitHotwordSetupActivityPeer", "activityResultLauncher$lambda$0", 76, "JitHotwordSetupActivityPeer.kt")).u("Launched OEM Hotword Setup");
            }
        });
    }
}
