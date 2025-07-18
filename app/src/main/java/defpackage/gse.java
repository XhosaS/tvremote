package defpackage;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import com.google.android.apps.tvsearch.performers.parentalauth.ParentalAuthorizationRedirectActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gse {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/performers/parentalauth/ParentalAuthorizationRedirectActivityPeer");
    public final ParentalAuthorizationRedirectActivity b;
    public final ffp c;
    public final idl d;
    public boolean e;
    public final irl f;

    public gse(irl irlVar, ParentalAuthorizationRedirectActivity parentalAuthorizationRedirectActivity, ffp ffpVar, idl idlVar) {
        ffpVar.getClass();
        idlVar.getClass();
        this.f = irlVar;
        this.b = parentalAuthorizationRedirectActivity;
        this.c = ffpVar;
        this.d = idlVar;
        irlVar.b(new uq() { // from class: gsd
            @Override // defpackage.uq
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                int i = activityResult.a;
                gse gseVar = this.a;
                if (i == -1) {
                    gseVar.d.B("succeeded");
                    if (gseVar.e) {
                        ffp ffpVar2 = gseVar.c;
                        xhe xheVarA = irv.a(xju.OK);
                        xheVarA.getClass();
                        ffpVar2.m("parentalAuthorizationResults", xheVarA);
                    }
                } else {
                    gseVar.d.B("failed");
                    if (gseVar.e) {
                        ffp ffpVar3 = gseVar.c;
                        xhe xheVarA2 = irv.a(xju.CANCELLED);
                        xheVarA2.getClass();
                        ffpVar3.m("parentalAuthorizationResults", xheVarA2);
                    }
                }
                Intent intent = activityResult.b;
                ParentalAuthorizationRedirectActivity parentalAuthorizationRedirectActivity2 = gseVar.b;
                parentalAuthorizationRedirectActivity2.setResult(i, intent);
                parentalAuthorizationRedirectActivity2.finish();
            }
        });
    }
}
