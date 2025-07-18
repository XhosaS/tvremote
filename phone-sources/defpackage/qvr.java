package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.particle.AccountParticle;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class qvr extends RecyclerView.ViewHolder {
    public final AccountParticle a;
    public final tst b;
    public final dvw c;
    public final tst d;
    public final rjg e;
    public Object f;

    public qvr(ViewGroup viewGroup, qth qthVar, qtr qtrVar, tst tstVar, final qux quxVar, int i, final rjg rjgVar, final rhu rhuVar) {
        super(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.account_list_item, viewGroup, false));
        a(this.itemView, i, i);
        AccountParticle accountParticle = (AccountParticle) this.itemView.findViewById(R.id.account_list_item_particle);
        this.a = accountParticle;
        this.b = tstVar;
        this.d = quxVar.a;
        this.e = rjgVar;
        a(accountParticle, accountParticle.getResources().getDimensionPixelSize(R.dimen.account_particle_avatar_margin_start), 0);
        accountParticle.j.q();
        accountParticle.j.e();
        accountParticle.j.f(qtrVar, qthVar);
        accountParticle.n = new unc(accountParticle, qthVar, quxVar);
        tst tstVar2 = quxVar.a;
        qun qunVar = null;
        if (tstVar2.g()) {
            tst tstVar3 = ((quz) tstVar2.c()).c;
            if (tstVar3.g()) {
                dvk dvkVar = ((quz) tstVar2.c()).a;
                qunVar = new qun(ImmutableList.of(new rgb(accountParticle.getContext(), dvkVar, (quy) tstVar3.c())), dvkVar);
            }
        }
        if (qunVar != null) {
            accountParticle.j.k(qunVar);
        }
        final ViewGroup viewGroup2 = (ViewGroup) this.itemView.findViewById(R.id.account_list_item_critical_alert_container);
        this.c = new dvw() { // from class: qvq
            @Override // defpackage.dvw
            public final void dV(Object obj) {
                qvr qvrVar = this.a;
                if (qvrVar.f != null) {
                    tst tstVar4 = qvrVar.d;
                    if (tstVar4.g() && ((quz) tstVar4.c()).c.g()) {
                        qux quxVar2 = quxVar;
                        rjg rjgVar2 = rjgVar;
                        rhu rhuVar2 = rhuVar;
                        ViewGroup viewGroup3 = viewGroup2;
                        tst tstVar5 = ((quz) tstVar4.c()).c;
                        View view = qvrVar.itemView;
                        ((quy) tstVar5.c()).r(view.getContext(), qvrVar.f, viewGroup3, rhuVar2, qvrVar.itemView, rjgVar2, false, quxVar2.b);
                    }
                }
            }
        };
    }

    private static void a(View view, int i, int i2) {
        int[] iArr = cww.a;
        view.setPaddingRelative(view.getPaddingStart() + i, view.getPaddingTop(), view.getPaddingEnd() + i2, view.getPaddingBottom());
    }
}
