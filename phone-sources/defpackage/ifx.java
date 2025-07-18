package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ifx implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ ifx(bl blVar, Intent intent, String[] strArr, int i) {
        this.d = i;
        this.a = blVar;
        this.c = intent;
        this.b = strArr;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kmo] */
    /* JADX WARN: Type inference failed for: r0v14, types: [java.lang.Object, kmo] */
    /* JADX WARN: Type inference failed for: r0v8, types: [ith, java.lang.Object] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) throws Resources.NotFoundException {
        switch (this.d) {
            case 0:
                dialogInterface.getClass();
                wpu wpuVar = ((wpv) this.b).g;
                if (wpuVar == null) {
                    wpuVar = wpu.a;
                }
                wkg wkgVar = wpuVar.c;
                if (wkgVar == null) {
                    wkgVar = wkg.a;
                }
                Object obj = this.a;
                Object obj2 = this.c;
                wkgVar.getClass();
                ((irc) ((igl) obj).a).e(wkgVar, (Context) obj2, "");
                break;
            case 1:
                dialogInterface.getClass();
                wpu wpuVar2 = ((wpv) this.b).f;
                if (wpuVar2 == null) {
                    wpuVar2 = wpu.a;
                }
                wkg wkgVar2 = wpuVar2.c;
                if (wkgVar2 == null) {
                    wkgVar2 = wkg.a;
                }
                Object obj3 = this.a;
                Object obj4 = this.c;
                wkgVar2.getClass();
                ((irc) ((igl) obj3).a).e(wkgVar2, (Context) obj4, "");
                break;
            case 2:
                Object obj5 = this.c;
                View view = (View) obj5;
                String string = view.getContext().getString(R.string.fmr_connecting_to_remote);
                string.getClass();
                jbr.aj(view, string, 1000, null, null).h();
                yld yldVar = new yld();
                yldVar.a = 30;
                String string2 = view.getContext().getString(R.string.fmr_stop_sound);
                string2.getClass();
                ?? r0 = this.a;
                tbb tbbVarAj = jbr.aj(view, "", -2, string2, new isg(obj5, r0, 4));
                Handler handler = new Handler(Looper.getMainLooper());
                handler.postDelayed(new gvj(tbbVarAj, (ith) r0, 11), 2000L);
                handler.postDelayed(new ejr(yldVar, tbbVarAj, view, handler, 12), 2000L);
                break;
            case 3:
                by byVarN = ihz.N((View) this.c);
                byVarN.getClass();
                Throwable th = ((ixp) this.a).a;
                Object obj6 = this.b;
                ((ixt) obj6).a.d(byVarN, lhp.a(th));
                break;
            case 4:
                yow yowVarO = ihz.O((View) this.b);
                if (yowVarO != null) {
                    ykr.q(yowVarO, null, 0, new kbl((kmo) this.a, (View) this.c, (yih) null, 9), 3);
                    break;
                }
                break;
            case 5:
                int i2 = SherlogMenuButton.d;
                Object obj7 = this.a;
                obj7.getClass();
                yow yowVarO2 = ihz.O((View) obj7);
                if (yowVarO2 != null) {
                    ykr.q(yowVarO2, null, 0, new kbl((kmo) this.b, (Context) this.c, (yih) null, 10), 3);
                    break;
                }
                break;
            case 6:
                String str = ((String[]) this.b)[i];
                Intent intent = (Intent) this.c;
                intent.putExtra("result_extra", str);
                bv bvVar = (bv) this.a;
                bvVar.getTargetFragment().onActivityResult(bvVar.getTargetRequestCode(), -1, intent);
                break;
            default:
                String str2 = ((String[]) this.b)[i];
                Intent intent2 = (Intent) this.c;
                intent2.putExtra("result_extra", str2);
                bv bvVar2 = (bv) this.a;
                bvVar2.getTargetFragment().onActivityResult(bvVar2.getTargetRequestCode(), -1, intent2);
                break;
        }
    }

    public /* synthetic */ ifx(SherlogMenuButton sherlogMenuButton, kmo kmoVar, View view, int i) {
        this.d = i;
        this.b = sherlogMenuButton;
        this.a = kmoVar;
        this.c = view;
    }

    public /* synthetic */ ifx(Object obj, View view, Object obj2, int i) {
        this.d = i;
        this.b = obj;
        this.c = view;
        this.a = obj2;
    }

    public /* synthetic */ ifx(Object obj, Object obj2, Context context, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = context;
    }
}
