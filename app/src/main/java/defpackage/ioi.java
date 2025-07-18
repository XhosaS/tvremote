package defpackage;

import android.accounts.Account;
import android.app.Activity;
import android.app.AppOpsManager;
import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.google.android.katniss.R;
import java.util.Set;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ioi {
    public static final zdy a = zdy.h("com/google/android/apps/tvsearch/setup/fragment/hotwordamati/HotwordIntroAmatiFragmentPeer");
    public final Supplier b;
    public final Context c;
    public final fjr d;
    public final iod e;
    public final gtu f;
    public final icx g;
    public final idu h;
    private final Activity i;
    private final AppOpsManager j;
    private final ggk k;
    private final ahbt l;
    private final jcy m;
    private final ffp n;
    private final boolean o;
    private final ghr p;
    private final ur q;
    private final Set r;

    public ioi(Activity activity, Supplier supplier, AppOpsManager appOpsManager, ggk ggkVar, Context context, ahbt ahbtVar, fjr fjrVar, iod iodVar, jcy jcyVar, ffp ffpVar, boolean z, gtu gtuVar, icx icxVar, idu iduVar, ghr ghrVar) {
        context.getClass();
        ahbtVar.getClass();
        fjrVar.getClass();
        jcyVar.getClass();
        ffpVar.getClass();
        gtuVar.getClass();
        iduVar.getClass();
        ghrVar.getClass();
        this.i = activity;
        this.b = supplier;
        this.j = appOpsManager;
        this.k = ggkVar;
        this.c = context;
        this.l = ahbtVar;
        this.d = fjrVar;
        this.e = iodVar;
        this.m = jcyVar;
        this.n = ffpVar;
        this.o = z;
        this.f = gtuVar;
        this.g = icxVar;
        this.h = iduVar;
        this.p = ghrVar;
        this.q = iodVar.ej(new vd(), new uq() { // from class: iog
            @Override // defpackage.uq
            public final void a(Object obj) {
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                if (activityResult.a != -1) {
                    ((zdv) ioi.a.d().q("com/google/android/apps/tvsearch/setup/fragment/hotwordamati/HotwordIntroAmatiFragmentPeer", "activityResultLauncher$lambda$0", 84, "HotwordIntroAmatiFragmentPeer.kt")).u("OEM Hotword Setup did not finish successfully.");
                }
                de deVarEh = this.a.e.eh();
                ab abVar = new ab(deVarEh);
                abVar.q(R.id.fragment_container_view, inz.aX(), null);
                abVar.n(null);
                abVar.i();
                deVarEh.ac();
            }
        });
        this.r = agqj.p(new Integer[]{Integer.valueOf(R.string.assistant_setup_hotword_intro_title_amati_v2), Integer.valueOf(R.string.assistant_setup_hotword_intro_description_v2), Integer.valueOf(R.string.assistant_setup_hotword_intro_accept_amati), Integer.valueOf(R.string.assistant_setup_hotword_intro_decline_amati)});
    }

    private final ycm b() {
        boolean z = true;
        if (!this.h.E() && (this.f.c() != null || !((Boolean) this.b.get()).booleanValue())) {
            z = false;
        }
        ycm ycmVar = ycm.a;
        ycl yclVar = new ycl();
        ygs.b(13, yclVar);
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar2 = (ycm) yclVar.b;
        ycmVar2.b |= 8;
        ycmVar2.e = z;
        if ((yclVar.b.memoizedSerializedSize & Integer.MIN_VALUE) == 0) {
            yclVar.y();
        }
        ycm ycmVar3 = (ycm) yclVar.b;
        ycmVar3.b |= 16;
        ycmVar3.f = z;
        return ygs.a(yclVar);
    }

    private final void c(boolean z) {
        Account accountC = this.f.c();
        String str = accountC != null ? accountC.name : null;
        ahbt ahbtVar = this.l;
        if (str == null) {
            str = "";
        }
        ahal.e(ahbtVar, null, 0, new ioh(this, z, str, null), 3);
        this.n.c("led_to_idle_state");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00d5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(boolean r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ioi.a(boolean):void");
    }
}
