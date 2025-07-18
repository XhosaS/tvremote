package defpackage;

import android.app.ApplicationErrorReport;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.feedback.FeedbackOptions;
import com.google.protobuf.ExtensionRegistryLite;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqq implements gqp {
    private static final zdy a = zdy.h("com/google/android/apps/tvsearch/performers/FeedbackActionPerformerImpl");
    private final Context b;
    private final gph c;
    private final exl d;
    private final gfr e;
    private final gmd f;
    private final hab g;
    private final agow h;
    private final agow i;

    public gqq(Context context, gph gphVar, exl exlVar, gfr gfrVar, gmd gmdVar, hab habVar, agow agowVar, agow agowVar2) {
        context.getClass();
        gfrVar.getClass();
        gmdVar.getClass();
        habVar.getClass();
        this.b = context;
        this.c = gphVar;
        this.d = exlVar;
        this.e = gfrVar;
        this.f = gmdVar;
        this.g = habVar;
        this.h = agowVar;
        this.i = agowVar2;
    }

    private final void b(kmz kmzVar, String str) {
        gzs gzsVarA = this.g.a(str);
        if (gzsVarA != null) {
            kmzVar.a(str, gzsVarA.e);
        } else {
            ((zdv) a.d().q("com/google/android/apps/tvsearch/performers/FeedbackActionPerformerImpl", "addPackageVersion", 128, "FeedbackActionPerformerImpl.kt")).x("package not found in installed apps: %s", str);
        }
    }

    @Override // defpackage.gqp
    public final zyd a(String str, byte[] bArr) throws abxv {
        zdy zdyVar;
        byte bByteValue;
        str.getClass();
        gfr gfrVar = this.e;
        gfrVar.b(rpm.bL(), null, null);
        gmd gmdVar = this.f;
        gmc gmcVar = gmc.w;
        gmdVar.l(gmcVar);
        zdy zdyVar2 = a;
        ((zdv) zdyVar2.b().q("com/google/android/apps/tvsearch/performers/FeedbackActionPerformerImpl", "perform", 69, "FeedbackActionPerformerImpl.kt")).u("FeedbackActionPerformer: Sending feedback");
        try {
            abxd abxdVarH = abxd.h(xiv.a, bArr, 0, bArr.length, ExtensionRegistryLite.getGeneratedRegistry());
            if (abxdVarH != null && (bByteValue = ((Byte) abxdVarH.cM(1, null)).byteValue()) != 1) {
                if (bByteValue != 0) {
                    boolean zL = abza.a.a(abxdVarH.getClass()).l(abxdVarH);
                    abxdVarH.cM(2, true != zL ? null : abxdVarH);
                    if (zL) {
                    }
                }
                throw new abzz().a();
            }
            xiv xivVar = (xiv) abxdVarH;
            xivVar.getClass();
            String str2 = xivVar.b;
            str2.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            Context context = this.b;
            kmz kmzVar = new kmz(context);
            kmzVar.a("UUID", xivVar.c);
            kmzVar.a("ProductModel-ATV", Build.BRAND + "/" + Build.DEVICE + "/" + Build.MODEL);
            kmzVar.a("Platform-ATV", String.valueOf(Build.VERSION.SDK_INT));
            kmzVar.a("submitter-locale-code", locale.getLanguage() + "_" + locale.getCountry());
            kmzVar.c = xivVar.b;
            kmzVar.d = "com.google.android.katniss.USER_INITIATED_FEEDBACK_REPORT";
            if (((Boolean) this.h.a()).booleanValue()) {
                kmzVar.f = !xivVar.g;
                kmzVar.a = xivVar.f;
                abxs abxsVar = xivVar.d;
                abxsVar.getClass();
                Iterator it = abxsVar.iterator();
                int i = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i2 = i + 1;
                    if (i < 0) {
                        agqq.h();
                    }
                    xiu xiuVar = (xiu) next;
                    kmzVar.a("(" + i + ") " + xiuVar.b, xiuVar.c);
                    it = it;
                    i = i2;
                    zdyVar2 = zdyVar2;
                }
                zdyVar = zdyVar2;
                abxs abxsVar2 = xivVar.e;
                abxsVar2.getClass();
                int i3 = 0;
                for (Object obj : abxsVar2) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        agqq.h();
                    }
                    kmzVar.a(a.a(i3, "Conversation[", "]"), (String) obj);
                    i3 = i4;
                }
                b(kmzVar, "com.google.android.tv.remote.service");
                String packageName = context.getPackageName();
                packageName.getClass();
                b(kmzVar, packageName);
            } else {
                zdyVar = zdyVar2;
            }
            FeedbackOptions feedbackOptions = new FeedbackOptions(null, null, null, new ApplicationErrorReport(), null, null, null, null, true, null, null, false, null, null, false, 0L, false, null, null);
            feedbackOptions.m = null;
            feedbackOptions.f = null;
            feedbackOptions.a = kmzVar.a;
            feedbackOptions.c = kmzVar.c;
            feedbackOptions.b = kmzVar.b;
            feedbackOptions.e = kmzVar.d;
            feedbackOptions.h = kmzVar.e;
            feedbackOptions.i = kmzVar.f;
            feedbackOptions.j = null;
            feedbackOptions.k = null;
            feedbackOptions.l = kmzVar.g;
            feedbackOptions.n = kmzVar.h;
            feedbackOptions.o = false;
            feedbackOptions.p = 0L;
            feedbackOptions.q = false;
            feedbackOptions.r = null;
            feedbackOptions.s = null;
            Intent intent = new Intent(this.c == gph.a ? "com.google.android.apps.tv.launcherx.feedback.LAUNCH_FEEDBACK_UI" : "com.google.android.tvlauncher.action.LAUNCH_FEEDBACK_UI");
            intent.putExtra("FEEDBACK_REPORT_BUNDLE", feedbackOptions);
            intent.putExtra("FEEDBACK_DESCRIPTION", str2);
            if (((Boolean) this.i.a()).booleanValue()) {
                intent.putExtra("FEEDBACK_OPENED_FROM", 10);
            }
            ((zdv) zdyVar.b().q("com/google/android/apps/tvsearch/performers/FeedbackActionPerformerImpl", "handOverToLauncher", 144, "FeedbackActionPerformerImpl.kt")).u("handing over feedback bundle to Launcher");
            this.d.a(intent, null);
            gfq.a(gfrVar, rpm.el(), null, 14);
            gmdVar.r(gmcVar, rbl.SUCCESS);
            return irv.b(xju.OK);
        } catch (abxv e) {
            gfq.a(this.e, rpm.el(), abqb.CANCELLED, 12);
            this.f.r(gmc.w, rbl.CANCEL);
            ((zdv) ((zdv) a.c()).p(e).q("com/google/android/apps/tvsearch/performers/FeedbackActionPerformerImpl", "perform", 79, "FeedbackActionPerformerImpl.kt")).x("Could not parse FeedbackArgs. Not proceeding with action: %s", str);
            return irv.b(xju.INVALID_ARGUMENT);
        }
    }
}
