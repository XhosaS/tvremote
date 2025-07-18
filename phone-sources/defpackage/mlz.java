package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import com.google.common.collect.UnmodifiableIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mlz {
    public final bv a;
    final idt b = new idt(null);
    private ids c;
    private final iea d;
    private final mtw e;
    private final lhr f;
    private final lys g;
    private final lfz h;

    public mlz(lfz lfzVar, lys lysVar, iea ieaVar, mtw mtwVar, lhr lhrVar, bv bvVar) {
        this.a = bvVar;
        this.h = lfzVar;
        this.g = lysVar;
        this.d = ieaVar;
        this.e = mtwVar;
        this.f = lhrVar;
    }

    public static void h(View view, AppCompatActivity appCompatActivity) {
        view.addOnAttachStateChangeListener(new bne(appCompatActivity, 7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final List j(mxo mxoVar) {
        ArrayList arrayList = new ArrayList();
        String str = mxoVar.c.a.b;
        if (!str.isEmpty()) {
            arrayList.add(str);
        }
        UnmodifiableIterator it = mxoVar.b.iterator();
        while (it.hasNext()) {
            String str2 = ((mxe) it.next()).a.b;
            if (!str2.isEmpty()) {
                arrayList.add(str2);
            }
        }
        return arrayList;
    }

    final RecyclerView a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        RecyclerView recyclerView = (RecyclerView) layoutInflater.inflate(R.layout.rv_content_hs_aware, viewGroup, false);
        recyclerView.addItemDecoration(this.e);
        recyclerView.setItemAnimator(null);
        return recyclerView;
    }

    final ids b() {
        Context applicationContext = this.a.getContext().getApplicationContext();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        return new mlm(applicationContext, intentFilter);
    }

    final ids c() {
        if (this.c == null) {
            this.c = hjt.d(this.h.c(), this.g, this.d);
        }
        return this.c;
    }

    final lio d(ksy ksyVar) {
        return new lif(liq.f(401, ksyVar), e());
    }

    final lio e() {
        return ((mjd) this.a.getActivity()).a();
    }

    final mmd f(Bundle bundle, ieg iegVar, ieg iegVar2) {
        if (bundle != null) {
            return (mmd) bundle.getParcelable("details_view_state");
        }
        bv bvVar = this.a;
        int i = bvVar.getArguments().getInt("distributor_selection_type");
        mmc mmcVarB = mmd.b();
        mmcVarB.h(iegVar);
        mmcVarB.e(iegVar2);
        mmcVarB.g(ieg.a((kuf) bvVar.getArguments().getParcelable("distributor")));
        mmcVarB.d(i == 0 ? ieg.a : ieg.f(Integer.valueOf(i)));
        return mmcVarB.a();
    }

    final void g(int i, int i2, Intent intent, final String str) {
        String string;
        if (i2 == 0) {
            if (i != 1009) {
                if (i != 1008) {
                    return;
                } else {
                    i = 1008;
                }
            }
            final lhr lhrVar = this.f;
            final by activity = this.a.getActivity();
            String string2 = "";
            final String stringExtra = intent != null ? intent.getStringExtra("client-token") : "";
            Resources resources = activity.getResources();
            if (i != 1008) {
                string = resources.getString(R.string.error_playback_dialog_message);
                string2 = resources.getString(R.string.error_playback_feedback_description);
            } else {
                string = resources.getString(R.string.error_open_app_dialog_message);
            }
            final String str2 = string2;
            nwr nwrVar = new nwr(activity);
            nwrVar.b(odx.b);
            final nwu nwuVarA = nwrVar.a();
            AlertDialog.Builder builder = new AlertDialog.Builder(activity, 2132084442);
            builder.setMessage(string);
            builder.setNegativeButton(R.string.cancel, new ixr(8));
            builder.setPositiveButton(R.string.menu_feedback, new DialogInterface.OnClickListener() { // from class: lhq
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i3) {
                    lhp lhpVar = new lhp(str2, str, stringExtra);
                    ody odyVarA = lhrVar.a(activity);
                    lhpVar.b(odyVarA);
                    nwu nwuVar = nwuVarA;
                    nwuVar.d();
                    odz odzVarA = odyVarA.a();
                    npj npjVar = odx.a;
                    nxr odwVar = new odw(nwuVar, odzVarA, System.nanoTime());
                    jzs jzsVar = odwVar.h;
                    nyw nywVar = (nyw) nwuVar;
                    ocv.au(nywVar.i.containsKey(odwVar.g), a.cg((String) (jzsVar != null ? jzsVar.a : "the API"), "GoogleApiClient is not configured to use ", " required for this call."));
                    Lock lock = nywVar.b;
                    lock.lock();
                    try {
                        nzn nznVar = ((nyw) nwuVar).d;
                        if (nznVar == null) {
                            ((nyw) nwuVar).g.add(odwVar);
                        } else {
                            odwVar = nznVar.a(odwVar);
                        }
                        lock.unlock();
                        odwVar.i(new mkk(nwuVar, 1));
                    } catch (Throwable th) {
                        nywVar.b.unlock();
                        throw th;
                    }
                }
            });
            builder.show();
        }
    }

    final RecyclerView.LayoutManager i() {
        return new mly(this.a.getContext());
    }
}
