package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iju {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/fragment/NetworkChangeReauthFragmentPeer");
    public final Activity b;
    public final Context c;
    public final ghr d;
    private final ijq e;
    private final gtu f;
    private final ur g;

    public iju(Activity activity, Context context, ijq ijqVar, gtu gtuVar, ghr ghrVar) {
        context.getClass();
        gtuVar.getClass();
        ghrVar.getClass();
        this.b = activity;
        this.c = context;
        this.e = ijqVar;
        this.f = gtuVar;
        this.d = ghrVar;
        this.g = ijqVar.ej(new vd(), new uq() { // from class: ijr
            @Override // defpackage.uq
            public final void a(Object obj) {
                int i;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i2 = activityResult.a;
                if (i2 == -1) {
                    ((zdv) iju.a.b().q("com/google/android/apps/tvsearch/setup/fragment/NetworkChangeReauthFragmentPeer", "activityResultLauncher$lambda$7", 139, "NetworkChangeReauthFragmentPeer.kt")).u("Network change reauth user verification successful");
                    i = 2;
                } else if (i2 == 0) {
                    ((zdv) iju.a.b().q("com/google/android/apps/tvsearch/setup/fragment/NetworkChangeReauthFragmentPeer", "activityResultLauncher$lambda$7", 142, "NetworkChangeReauthFragmentPeer.kt")).u("Network change reauth user verification failed");
                    i = 3;
                } else {
                    ((zdv) iju.a.d().q("com/google/android/apps/tvsearch/setup/fragment/NetworkChangeReauthFragmentPeer", "activityResultLauncher$lambda$7", 147, "NetworkChangeReauthFragmentPeer.kt")).v("Network change reauth user verification result = %s", i2);
                    i = 4;
                }
                iju ijuVar = this.a;
                ycm ycmVar = ycm.a;
                ycl yclVar = new ycl();
                ygs.b(15, yclVar);
                if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
                    yclVar.y();
                }
                ghr ghrVar2 = ijuVar.d;
                ycm ycmVar2 = (ycm) yclVar.b;
                ycmVar2.g = i - 1;
                ycmVar2.b |= 32;
                ghrVar2.ah(ygs.a(yclVar));
                ijuVar.b.finish();
            }
        });
    }

    public final void a(boolean z) {
        ycm ycmVar = ycm.a;
        ycl yclVar = new ycl();
        ygs.b(15, yclVar);
        adzd adzdVar = z ? adzd.NETWORK_REAUTH_VERIFY : adzd.NETWORK_REAUTH_DECLINE;
        adzdVar.getClass();
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ghr ghrVar = this.d;
        ycm ycmVar2 = (ycm) yclVar.b;
        ycmVar2.d = adzdVar.z;
        ycmVar2.b |= 2;
        ghrVar.ah(ygs.a(yclVar));
        if (!z) {
            ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/NetworkChangeReauthFragmentPeer", "onButtonClicked", 130, "NetworkChangeReauthFragmentPeer.kt")).u("User declined reauth");
            this.b.finish();
            return;
        }
        ((zdv) a.b().q("com/google/android/apps/tvsearch/setup/fragment/NetworkChangeReauthFragmentPeer", "onButtonClicked", 110, "NetworkChangeReauthFragmentPeer.kt")).u("Send reauth request to LauncherX");
        ur urVar = this.g;
        Intent intent = new Intent();
        intent.setPackage("com.google.android.apps.tv.launcherx");
        intent.setComponent(new ComponentName("com.google.android.apps.tv.launcherx", "com.google.android.apps.tv.launcherx.networkreauth.NetworkReauthActivity"));
        intent.setAction("android.apps.tv.launcherx.NETWORK_REAUTH");
        gtu gtuVar = this.f;
        intent.putExtra("userId", gtuVar.m());
        Account accountC = gtuVar.c();
        String str = accountC != null ? accountC.name : null;
        if (str == null) {
            str = "";
        }
        intent.putExtra("reauthAccountName", str);
        Context context = this.c;
        intent.putExtra("reauthTitleText", context.getString(R.string.assistant_setup_network_change_reauth_title));
        intent.putExtra("reauthDescText", context.getString(R.string.assistant_setup_network_change_reauth_description));
        urVar.b(intent);
        View view = this.e.R;
        if (view != null) {
            view.setVisibility(8);
        }
    }
}
