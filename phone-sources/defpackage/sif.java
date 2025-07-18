package defpackage;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.videos.R;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sif {
    public final Context a;
    public final View b;
    public final shh c;
    public sia d;
    public final RecyclerView e;
    public RecyclerView.Adapter f;
    public shq g;
    public final ExecutorService h;
    public final String i;
    public boolean j;
    public sho k;
    public final she l;
    public kfz m;

    public sif(Context context, sia siaVar, she sheVar, shh shhVar, kfz kfzVar, shq shqVar, ExecutorService executorService, String str, sho shoVar) {
        this.a = context;
        this.g = shqVar;
        this.d = siaVar;
        this.l = sheVar;
        this.m = kfzVar;
        this.h = executorService;
        this.i = str;
        this.k = shoVar;
        shh shhVar2 = new shh();
        shhVar2.a(new siu(vgl.c));
        shhVar2.c(shhVar);
        this.c = shhVar2;
        sheVar.b(-1, shhVar2);
        View viewInflate = LayoutInflater.from(context).inflate(true != this.g.d ? R.layout.peoplekit_third_party_apps_tray : R.layout.peoplekit_third_party_apps_tray_gm3, (ViewGroup) null);
        this.b = viewInflate;
        this.e = (RecyclerView) viewInflate.findViewById(R.id.peoplekit_third_party_scroll_view);
        a();
        b();
    }

    public final void a() {
        sho shoVar = this.k;
        Context context = this.a;
        shoVar.a(context);
        this.e.setLayoutManager(new LinearLayoutManager(context, 0, false));
    }

    public final void b() {
        shq shqVar = this.g;
        int i = shqVar.a;
        if (i != 0) {
            this.e.setBackgroundResource(i);
        } else {
            int i2 = shqVar.b;
            if (i2 != 0) {
                this.e.setBackgroundColor(i2);
            }
        }
        RecyclerView.Adapter adapter = this.f;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    public final void c(int i, int i2) {
        she sheVar = this.l;
        if (sheVar != null) {
            siu siuVar = new siu(vgl.e);
            siuVar.b = Integer.valueOf(i2);
            shh shhVar = new shh();
            shhVar.a(siuVar);
            shhVar.c(this.c);
            sheVar.b(4, shhVar);
            shi shiVarC = sheVar.c("TimeToSend");
            if (shiVarC.a) {
                shiVarC.b();
                vtw vtwVarM = aagj.a.m();
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                aagj aagjVar = (aagj) vtwVarM.b;
                aagjVar.c = 4;
                aagjVar.b |= 1;
                vtw vtwVarM2 = aagl.a.m();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                aagl aaglVar = (aagl) vtwVarM2.b;
                aaglVar.c = 13;
                aaglVar.b |= 1;
                long jA = shiVarC.a();
                if (!vtwVarM2.b.A()) {
                    vtwVarM2.u();
                }
                vuc vucVar = vtwVarM2.b;
                aagl aaglVar2 = (aagl) vucVar;
                aaglVar2.b |= 2;
                aaglVar2.d = jA;
                int i3 = sheVar.h;
                if (!vucVar.A()) {
                    vtwVarM2.u();
                }
                aagl aaglVar3 = (aagl) vtwVarM2.b;
                int i4 = i3 - 1;
                if (i3 == 0) {
                    throw null;
                }
                aaglVar3.e = i4;
                aaglVar3.b = 4 | aaglVar3.b;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                aagj aagjVar2 = (aagj) vtwVarM.b;
                aagl aaglVar4 = (aagl) vtwVarM2.r();
                aaglVar4.getClass();
                aagjVar2.e = aaglVar4;
                aagjVar2.b |= 8;
                vtw vtwVarM3 = aagm.a.m();
                int i5 = sheVar.g;
                if (!vtwVarM3.b.A()) {
                    vtwVarM3.u();
                }
                vuc vucVar2 = vtwVarM3.b;
                aagm aagmVar = (aagm) vucVar2;
                int i6 = i5 - 1;
                if (i5 == 0) {
                    throw null;
                }
                aagmVar.c = i6;
                aagmVar.b |= 1;
                if (!vucVar2.A()) {
                    vtwVarM3.u();
                }
                aagm aagmVar2 = (aagm) vtwVarM3.b;
                aagmVar2.d = i - 1;
                aagmVar2.b |= 2;
                if (!vtwVarM.b.A()) {
                    vtwVarM.u();
                }
                aagj aagjVar3 = (aagj) vtwVarM.b;
                aagm aagmVar3 = (aagm) vtwVarM3.r();
                aagmVar3.getClass();
                aagjVar3.d = aagmVar3;
                aagjVar3.b |= 2;
                sheVar.a((aagj) vtwVarM.r());
            }
        }
    }
}
