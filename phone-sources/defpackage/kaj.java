package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class kaj implements View.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ kaj(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.a = obj;
        this.b = obj2;
        this.c = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lis] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object, lio] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.view.View$OnClickListener, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.d) {
            case 0:
                ?? r6 = this.c;
                ((lhr) this.a).b((Activity) this.b, (String) r6.a());
                break;
            case 1:
                Object obj = this.c;
                if (obj != null) {
                    wkg wkgVar = ((wmb) obj).d;
                    if (wkgVar == null) {
                        wkgVar = wkg.a;
                    }
                    if (wkgVar != null) {
                        ((irc) ((kuw) this.b).a).f(wkgVar, (View) this.a, pjw.b());
                        break;
                    }
                }
                break;
            case 2:
                this.a.a(this.c, view, nqq.d(this.b));
                break;
            case 3:
                mxs mxsVar = (mxs) this.c;
                tst tstVar = mxsVar.o;
                if (tstVar.g()) {
                    ((pjx) tstVar.c()).a(pjw.b(), view);
                }
                new jyr(new mxu((kuo) this.b, (kxg) mxsVar.c.c(), this.a), 20).onClick(view);
                break;
            case 4:
                ((pjx) this.c).a(pjw.b(), view);
                new jyr(new myp((ksy) ((myr) this.a).b.c(), this.b), 20).onClick(view);
                break;
            case 5:
                ?? r62 = this.b;
                if (r62 != 0) {
                    r62.onClick((View) this.a);
                }
                ((phh) this.c).a();
                break;
            case 6:
                vvd vvdVar = (vvd) this.a;
                if (((vrs) vvdVar.a).b((vrp) this.c, (View) this.b) == vrr.a) {
                    ((xzg) vvdVar.d).f(vow.a);
                    break;
                }
                break;
            case 7:
                View view2 = ((sep) this.b).itemView;
                sfa sfaVar = (sfa) this.c;
                view2.setSelected(!sfaVar.f());
                ((seq) this.a).b.b(sfaVar, (RecyclerView) view.getParent());
                break;
            default:
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("rpc_config_key", (ArrayList) ((aafi) this.a).a);
                ?? r0 = this.c;
                bundle.putStringArray("hosts", (String[]) r0.toArray(new String[r0.size()]));
                usl uslVar = new usl();
                uslVar.setArguments(bundle);
                bv bvVar = ((usk) this.b).a;
                uslVar.setTargetFragment(bvVar, 172954014);
                uslVar.show(bvVar.getFragmentManager(), "hostoverride_dialog_tag");
                break;
        }
    }

    public /* synthetic */ kaj(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ kaj(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ kaj(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ kaj(pjx pjxVar, myr myrVar, lio lioVar, int i) {
        this.d = i;
        this.c = pjxVar;
        this.a = myrVar;
        this.b = lioVar;
    }
}
