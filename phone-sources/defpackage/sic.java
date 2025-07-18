package defpackage;

import android.content.ComponentName;
import android.content.Intent;
import android.content.LocusId;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.view.View;
import android.view.contentcapture.ContentCaptureManager;
import android.view.contentcapture.DataShareRequest;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class sic implements View.OnClickListener {
    final /* synthetic */ sid a;
    final /* synthetic */ shu b;
    final /* synthetic */ ust c;

    public sic(sid sidVar, shu shuVar, ust ustVar) {
        this.b = shuVar;
        this.c = ustVar;
        this.a = sidVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Class<?> cls;
        Intent intent;
        ContentCaptureManager contentCaptureManagerM514m;
        int absoluteAdapterPosition = this.c.getAbsoluteAdapterPosition();
        sid sidVar = this.a;
        sif sifVar = sidVar.b;
        sifVar.c(5, absoluteAdapterPosition);
        shu shuVar = this.b;
        boolean z = shuVar instanceof shu;
        if (z && Build.VERSION.SDK_INT >= 29 && (contentCaptureManagerM514m = sf$$ExternalSyntheticApiModelOutline0.m514m(sifVar.a.getSystemService(sf$$ExternalSyntheticApiModelOutline0.m()))) != null) {
            ResolveInfo resolveInfo = shuVar.a;
            if (resolveInfo.resolvePackageName != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null) {
                vtw vtwVarM = sit.a.m();
                String str = resolveInfo.resolvePackageName;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                sit sitVar = (sit) vtwVarM.b;
                str.getClass();
                sitVar.b |= 1;
                sitVar.c = str;
                String str2 = resolveInfo.activityInfo.name;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                sit sitVar2 = (sit) vucVar;
                str2.getClass();
                sitVar2.b |= 2;
                sitVar2.d = str2;
                String str3 = sifVar.i;
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                sit sitVar3 = (sit) vtwVarM.b;
                str3.getClass();
                sitVar3.b |= 4;
                sitVar3.e = str3;
                int iMyUid = Process.myUid();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                sit sitVar4 = (sit) vtwVarM.b;
                sitVar4.b |= 8;
                sitVar4.f = iMyUid;
                int iMyUid2 = Process.myUid();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                sit sitVar5 = (sit) vtwVarM.b;
                sitVar5.b |= 16;
                sitVar5.g = iMyUid2;
                contentCaptureManagerM514m.shareData(new DataShareRequest(new LocusId("PeopleKit_LOCUS"), "application/protobuf"), sifVar.h, new sie((sit) vtwVarM.r()));
            }
        }
        sia siaVar = sifVar.d;
        siaVar.c.aw(shuVar.a());
        siaVar.b.au(shuVar.a());
        kfz kfzVar = sifVar.m;
        kfx kfxVar = kfzVar.j;
        String simpleName = null;
        if (kfxVar == null) {
            yks.c("shareIntentsManager");
            kfxVar = null;
        }
        woi woiVar = kfzVar.h;
        Uri uri = kfzVar.i;
        woiVar.getClass();
        if (!z) {
            if (shuVar != null && (cls = shuVar.getClass()) != null) {
                simpleName = cls.getSimpleName();
            }
            throw new IllegalArgumentException("Expected entry to be of type AppIntentEntry, but was of type ".concat(String.valueOf(simpleName)));
        }
        ActivityInfo activityInfo = shuVar.a.activityInfo;
        if (uri != null && kfxVar.c.contains(activityInfo.packageName)) {
            intent = new Intent(kfx.a);
            intent.putExtra("android.intent.extra.STREAM", uri);
        } else {
            intent = new Intent(kfx.b);
        }
        intent.putExtra("android.intent.extra.TEXT", woiVar.c);
        intent.setComponent(new ComponentName(activityInfo.packageName, activityInfo.name));
        kfzVar.startActivity(intent);
        kfzVar.dismiss();
        long jA = xns.a.get().a();
        if (jA > 0) {
            for (int i = 0; i < sidVar.getItemCount(); i++) {
                ust ustVar = (ust) sifVar.e.findViewHolderForAdapterPosition(i);
                if (ustVar != null) {
                    ((View) ustVar.a).setClickable(false);
                }
            }
            new Handler().postDelayed(new slt(sidVar, 1), jA);
        }
    }
}
