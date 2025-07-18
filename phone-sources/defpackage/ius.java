package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFragment;
import com.google.android.apps.googletv.app.device.presentation.companionbar.CompanionBarFullscreenFragment;
import com.google.android.videos.R;
import java.lang.reflect.InvocationTargetException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ius implements sch {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ius(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, yjz] */
    /* JADX WARN: Type inference failed for: r7v34, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v43, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v48, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v57, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v62, types: [idr, java.lang.Object] */
    @Override // defpackage.sch
    public final void a(Object obj, View view) throws IllegalAccessException, Resources.NotFoundException, IllegalArgumentException, InvocationTargetException {
        iwu iwuVar;
        switch (this.b) {
            case 0:
                ((ivd) this.a).d.c(view);
                break;
            case 1:
                ivd ivdVar = (ivd) this.a;
                ivdVar.d.c(view);
                ivdVar.c.h();
                break;
            case 2:
                if (czi.b(((ivd) this.a).b, "android.permission.RECORD_AUDIO") != 0) {
                    bv bvVarM = ihz.M(view);
                    if (!(bvVarM instanceof CompanionBarFragment)) {
                        if (!(bvVarM instanceof CompanionBarFullscreenFragment)) {
                            krd.f("Could not request audio recording permission. Fragment is unknown.");
                            break;
                        } else {
                            bv bvVarM2 = ihz.M(view);
                            bvVarM2.getClass();
                            ((CompanionBarFullscreenFragment) bvVarM2).e.b("android.permission.RECORD_AUDIO");
                            break;
                        }
                    } else {
                        bv bvVarM3 = ihz.M(view);
                        bvVarM3.getClass();
                        ((CompanionBarFragment) bvVarM3).f.b("android.permission.RECORD_AUDIO");
                        break;
                    }
                }
                break;
            case 3:
                ivd ivdVar2 = (ivd) this.a;
                ivdVar2.d.c(view);
                ith ithVarE = ivdVar2.c.e();
                if (ithVarE != null && (iwuVar = ((iua) ithVarE).j) != null) {
                    iwuVar.f();
                    break;
                }
                break;
            case 4:
                ((ivd) this.a).f.e.c(false);
                break;
            case 5:
                ((ivd) this.a).c.h();
                break;
            case 6:
                ivd ivdVar3 = (ivd) this.a;
                ivdVar3.d.c(view);
                ivdVar3.f.e.c(true);
                break;
            case 7:
                ivd ivdVar4 = (ivd) this.a;
                ivdVar4.d.c(view);
                ivdVar4.f.c.c(ieg.f(Boolean.valueOf(!((Boolean) ((ieg) r7.a()).g()).booleanValue())));
                break;
            case 8:
                ((ivd) this.a).d.c(view);
                break;
            case 9:
                ivd ivdVar5 = (ivd) this.a;
                ivdVar5.d.c(view);
                ivdVar5.f.e.c(true);
                break;
            case 10:
                ((ivd) this.a).f.e.c(true);
                break;
            case 11:
                ((ivd) this.a).d.c(view);
                break;
            case 12:
                ((jdd) this.a).s();
                break;
            case 13:
                this.a.a((jhs) obj, view);
                break;
            case 14:
                this.a.a((jhs) obj, view);
                break;
            case 15:
                this.a.a((jhs) obj, view);
                break;
            case 16:
                this.a.a((jhs) obj, view);
                break;
            case 17:
                Context context = view.getContext();
                context.getClass();
                wuh wuhVar = (wuh) ((ixi) this.a).b;
                wll wllVar = wuhVar.b;
                if (wllVar == null) {
                    wllVar = wll.a;
                }
                wllVar.getClass();
                String string = view.getContext().getResources().getString(R.string.gtv_provider_selection_menu_title);
                string.getClass();
                vtw vtwVarM = kds.a.m();
                vtwVarM.getClass();
                String str = wuhVar.e;
                str.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                ((kds) vtwVarM.b).c = str;
                wlx wlxVar = wuhVar.d;
                if (wlxVar == null) {
                    wlxVar = wlx.a;
                }
                wlxVar.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                kds kdsVar = (kds) vtwVarM.b;
                kdsVar.d = wlxVar;
                kdsVar.b = 1 | kdsVar.b;
                wls wlsVar = wuhVar.f;
                if (wlsVar == null) {
                    wlsVar = wls.a;
                }
                wlsVar.getClass();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                vuc vucVar = vtwVarM.b;
                kds kdsVar2 = (kds) vucVar;
                kdsVar2.e = wlsVar;
                kdsVar2.b |= 2;
                wls wlsVar2 = wuhVar.g;
                if (wlsVar2 == null) {
                    wlsVar2 = wls.a;
                }
                wlsVar2.getClass();
                if (!vucVar.A()) {
                    vtwVarM.u();
                }
                kds kdsVar3 = (kds) vtwVarM.b;
                kdsVar3.f = wlsVar2;
                kdsVar3.b |= 4;
                vuc vucVarR = vtwVarM.r();
                vucVarR.getClass();
                Bundle bundle = new Bundle();
                hju.I(bundle, "provider_selection_menu_header", (kds) vucVarR);
                jan.g(context, wllVar, string, bundle);
                break;
            case 18:
                ((ulp) this.a).ay(new jlh(true));
                break;
            case 19:
                ((ulp) this.a).ay(new jlh(false));
                break;
            default:
                Object obj2 = this.a;
                ((isi) ((jry) obj2).d).e(new ill(obj2, 13));
                break;
        }
    }
}
