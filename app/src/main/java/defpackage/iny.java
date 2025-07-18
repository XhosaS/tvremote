package defpackage;

import android.app.AppOpsManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.view.View;
import androidx.activity.result.ActivityResult;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class iny {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/fragment/hotwordamati/HotwordAssistantBrandingFragmentPeer");
    public final inv b;
    public final boolean c;
    public final ur d;
    private final AppOpsManager e;
    private final Context f;

    public iny(AppOpsManager appOpsManager, Context context, inv invVar, boolean z, jcy jcyVar) {
        context.getClass();
        jcyVar.getClass();
        this.e = appOpsManager;
        this.f = context;
        this.b = invVar;
        this.c = z;
        this.d = invVar.ej(new vd(), new uq() { // from class: inw
            @Override // defpackage.uq
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a != -1) {
                    ((zdv) iny.a.d().q("com/google/android/apps/tvsearch/setup/fragment/hotwordamati/HotwordAssistantBrandingFragmentPeer", "activityResultLauncher$lambda$0", 58, "HotwordAssistantBrandingFragmentPeer.kt")).u("OEM Hotword Setup did not finish successfully.");
                }
                this.a.a();
            }
        });
    }

    public final void a() {
        de deVarEh = this.b.eh();
        inz inzVarAX = inz.aX();
        boolean z = false;
        inzVarAX.ae(ado.a(new agpi("mic_available_key", Boolean.valueOf(b(false)))));
        bq bqVarD = deVarEh.b.d("leanBackGuidedStepSupportFragment");
        ats atsVar = bqVarD instanceof ats ? (ats) bqVarD : null;
        int i = atsVar != null ? 0 : 1;
        ab abVar = new ab(deVarEh);
        int iM = inzVarAX.m();
        Bundle bundle = inzVarAX.n;
        if (bundle == null) {
            bundle = new Bundle();
            z = true;
        }
        bundle.putInt("uiStyle", i);
        if (z) {
            inzVarAX.ae(bundle);
        }
        if (i != iM) {
            inzVarAX.af(null);
            inzVarAX.ag(null);
        }
        int iM2 = inzVarAX.m();
        Class<?> cls = inzVarAX.getClass();
        abVar.n(iM2 != 0 ? iM2 != 1 ? "" : "GuidedStepEntrance".concat(String.valueOf(cls.getName())) : "GuidedStepDefault".concat(String.valueOf(cls.getName())));
        if (atsVar != null) {
            View view = atsVar.R;
            ats.aI(abVar, view.findViewById(R.id.action_fragment_root), "action_fragment_root");
            ats.aI(abVar, view.findViewById(R.id.action_fragment_background), "action_fragment_background");
            ats.aI(abVar, view.findViewById(R.id.action_fragment), "action_fragment");
            ats.aI(abVar, view.findViewById(R.id.guidedactions_root), "guidedactions_root");
            ats.aI(abVar, view.findViewById(R.id.guidedactions_content), "guidedactions_content");
            ats.aI(abVar, view.findViewById(R.id.guidedactions_list_background), "guidedactions_list_background");
            ats.aI(abVar, view.findViewById(R.id.guidedactions_root2), "guidedactions_root2");
            ats.aI(abVar, view.findViewById(R.id.guidedactions_content2), "guidedactions_content2");
            ats.aI(abVar, view.findViewById(R.id.guidedactions_list_background2), "guidedactions_list_background2");
        }
        abVar.q(android.R.id.content, inzVarAX, "leanBackGuidedStepSupportFragment");
        abVar.i();
        deVarEh.ac();
    }

    public final boolean b(boolean z) {
        if (Build.VERSION.SDK_INT <= 30) {
            return true;
        }
        if (z) {
            return this.e.noteOpNoThrow("android:record_audio", Process.myUid(), this.f.getPackageName(), "", null) == 0;
        }
        return this.e.unsafeCheckOpNoThrow("android:record_audio", Process.myUid(), this.f.getPackageName()) == 0;
    }
}
