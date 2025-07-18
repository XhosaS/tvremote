package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;
import com.google.android.apps.play.movies.mobile.usecase.details.DetailsActivity;
import com.google.android.spannedgridlayoutmanager.SpannedGridLayoutManager;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class mmn implements lhg {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ mmn(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v27, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v28, types: [java.lang.Object, mdy] */
    /* JADX WARN: Type inference failed for: r1v48, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v22, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r3v1, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10, types: [ieh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object, san] */
    /* JADX WARN: Type inference failed for: r3v9, types: [idr, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v11, types: [java.lang.Object, san] */
    @Override // defpackage.lhg
    public final void a(lhf lhfVar) {
        int i = 10;
        switch (this.c) {
            case 0:
                Toast.makeText(((bv) this.a).getContext(), "AssetId: ".concat(((kvj) this.b).a.b), 1).show();
                break;
            case 1:
                ?? r3 = this.a;
                mzq mzqVar = (mzq) lhfVar;
                mmk mmkVar = (mmk) r3;
                String str = mmkVar.g;
                krk krkVar = new krk(r3, i);
                Object obj = this.b;
                miu miuVar = new miu(r3, str, (Intent) obj, krkVar, mmkVar.L);
                muj mujVar = mzqVar.a;
                miuVar.a(mujVar, mzqVar.b, nqq.d(mujVar.a));
                break;
            case 2:
                new AlertDialog.Builder(((bv) this.a).getContext()).setCancelable(true).setTitle("Show AssetId: ".concat(((kwn) this.b).d.b)).setPositiveButton("Ok", new ixr(10)).create().show();
                break;
            case 3:
                mxe mxeVar = ((mxi) lhfVar).a;
                this.b.c(ieg.f(mxeVar.a));
                nqq.d(new lif(mnu.d(mxeVar), (lio) this.a.a()));
                break;
            case 4:
                if (((mwg) lhfVar).a.b) {
                    this.a.a(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/family/create")));
                }
                this.b.c(true);
                break;
            case 5:
                nbg nbgVar = (nbg) lhfVar;
                rzy rzyVar = nbgVar.b;
                this.a.f(rzyVar).e();
                lws lwsVar = nbgVar.a;
                HashMap map = new HashMap();
                ntp ntpVar = new ntp((byte[]) null);
                Object obj2 = this.b;
                mtd mtdVar = (mtd) obj2;
                Resources resources = mtdVar.getResources();
                iea ieaVar = mtdVar.e;
                san sanVar = mtdVar.h;
                paq.b(lwsVar, resources, ieaVar, sanVar, rzyVar).c(ntpVar);
                paq.a(map);
                ifb ifbVarB = ntpVar.b();
                RecyclerView recyclerView = mtdVar.g;
                recyclerView.setAdapter(ifbVarB);
                recyclerView.setLayoutManager(new SpannedGridLayoutManager(new mtc(ifbVarB, map, 0), 2));
                mjo.y(recyclerView, mtdVar.getContext(), new mpz(obj2, 8), mtdVar.d, mtdVar.c, sanVar, nsf.g(recyclerView));
                mtdVar.k = new ksa(ifbVarB, 0);
                mtdVar.k.a();
                mtdVar.j = true;
                if (recyclerView.getParent() == null) {
                    mtdVar.addView(recyclerView);
                }
                mtdVar.g(mtdVar.j);
                break;
            case 6:
                nav navVar = (nav) lhfVar;
                this.a.f(navVar.b).e();
                ksy ksyVar = navVar.a;
                int i2 = ksyVar.a;
                Object obj3 = this.b;
                if (i2 == 6) {
                    Context context = (Context) obj3;
                    context.startActivity(DetailsActivity.createMovieDetailsIntent(context, kvf.U(ksyVar), (ieg<kuf>) ieg.a, "", lid.a, jbr.T(context, new Intent())));
                    break;
                } else if (i2 == 18) {
                    Context context2 = (Context) obj3;
                    context2.startActivity(DetailsActivity.createShowDetailsActivityIntent(context2, kwn.d(ksyVar), "", lid.a, jbr.T(context2, new Intent())));
                    break;
                }
                break;
            default:
                this.b.f(((nbc) lhfVar).a).e();
                this.a.run();
                break;
        }
    }

    public /* synthetic */ mmn(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }
}
