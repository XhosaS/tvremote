package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mgo implements View.OnClickListener {
    private final Object a;
    private final mru b;

    public mgo(Object obj, mru mruVar) {
        obj.getClass();
        this.a = obj;
        this.b = mruVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        lio lioVarB;
        boolean z = view instanceof lio;
        int id = view.getId();
        if (!z) {
            ViewParent parent = view.getParent();
            while (true) {
                if (parent == null) {
                    lioVarB = null;
                    break;
                } else {
                    if (parent instanceof lio) {
                        lioVarB = (lio) parent;
                        break;
                    }
                    parent = parent.getParent();
                }
            }
        } else {
            lioVarB = (lio) view;
        }
        mru mruVar = this.b;
        Object obj = this.a;
        if (id != R.id.synopsis_target) {
            ((nqq) mruVar.a).c(lioVarB);
            Context context = (Context) mruVar.c;
            context.startActivity(BootstrapWatchActivity.createMovieIntent(context, (kvf) obj, "details_extra", null));
            return;
        }
        nqq.j(android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay, lioVarB);
        Object obj2 = mruVar.a;
        if (lioVarB != null) {
            lin linVarF = nqq.f(lioVarB);
            if (linVarF == null) {
                if (((nqq) obj2).c) {
                    krd.f("Root node is null");
                }
            } else if (lioVarB.c() != null) {
                nqq nqqVar = (nqq) obj2;
                Object obj3 = nqqVar.g;
                wjf wjfVar = wjf.a;
                vtw vtwVarM = wjfVar.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                wjf wjfVar2 = (wjf) vtwVarM.b;
                wjfVar2.b |= 1;
                wjfVar2.c = android.support.v7.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay;
                wjf wjfVar3 = (wjf) vtwVarM.r();
                while (lioVarB != null) {
                    vtw vtwVarM2 = wjfVar.m();
                    lioVarB.c().s(vtwVarM2);
                    vtwVarM2.aH(wjfVar3);
                    wjfVar3 = (wjf) vtwVarM2.r();
                    lioVarB = lioVarB.b();
                }
                nqqVar.h(linVarF, 0L, wjfVar3, "Sending");
            } else if (((nqq) obj2).c) {
                krd.f("Node has not been initialized");
            }
        } else if (((nqq) obj2).c) {
            krd.f("Node is null");
        }
        kvf kvfVar = (kvf) obj;
        mzb mzbVar = new mzb(kvfVar.E(), kvfVar.A());
        Bundle bundle = new Bundle();
        bundle.putParcelable("movie_extra_info_dialog_view_model", mzbVar);
        mzc mzcVar = new mzc();
        mzcVar.setArguments(bundle);
        mzcVar.show((cr) mruVar.b, "extra movie synopsis dialog");
    }
}
