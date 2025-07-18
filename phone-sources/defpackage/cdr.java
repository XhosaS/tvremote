package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.onegoogle.account.disc.AccountParticleDisc;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cdr implements View.OnAttachStateChangeListener {
    final /* synthetic */ Object a;
    final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public cdr(RecyclerView recyclerView, RecyclerView.Adapter adapter, int i) {
        this.c = i;
        this.b = recyclerView;
        this.a = adapter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, qtq] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        int i = this.c;
        if (i == 0) {
            Object obj = this.a;
            dvk dvkVarE = dwf.e((View) obj);
            if (dvkVarE == null) {
                bty.a(a.cj(obj, "View tree for ", " has no ViewTreeLifecycleOwner"));
                throw new yfs();
            }
            can canVar = (can) obj;
            ((ylf) this.b).a = cbp.u(canVar, dvkVarE.getLifecycle());
            canVar.removeOnAttachStateChangeListener(this);
            return;
        }
        if (i == 1) {
            nxo nxoVar = (nxo) this.b;
            nxoVar.i();
            dp.c((ViewGroup) ((bv) nxoVar.d).mView.getParent(), ((ce) this.a).a).g();
            return;
        }
        if (i != 2) {
            if (i == 3) {
                Object obj2 = this.a;
                qwo qwoVar = ((qww) this.b).b;
                rdd rddVar = (rdd) obj2;
                qwoVar.c(rddVar);
                if (qwoVar.b()) {
                    rddVar.a();
                    return;
                }
                return;
            }
            if (i != 4) {
                ((RecyclerView) this.b).setAdapter((RecyclerView.Adapter) this.a);
            } else {
                ?? r3 = this.a;
                ((AccountParticleDisc) ((tae) this.b).g).c(r3);
                r3.a();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, qtq] */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.c;
        if (i == 0 || i == 1) {
            return;
        }
        if (i == 2) {
            ((View) this.a).removeOnAttachStateChangeListener(this);
            ((bcy) this.b).w();
        } else if (i == 3) {
            ((qww) this.b).b.d((rdd) this.a);
        } else if (i != 4) {
            ((RecyclerView) this.b).setAdapter(null);
        } else {
            ((AccountParticleDisc) ((tae) this.b).g).h(this.a);
        }
    }

    public cdr(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public cdr(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj2;
        this.b = obj;
    }
}
