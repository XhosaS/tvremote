package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class sdd extends RecyclerView.ViewHolder {
    public final sdg a;
    public scq b;

    public sdd(View view, sdg sdgVar) {
        super(view);
        this.a = sdgVar;
        this.b = null;
    }

    public final void a() {
        RecyclerView.Adapter<? extends RecyclerView.ViewHolder> bindingAdapter;
        if (getBindingAdapterPosition() == -1 || (bindingAdapter = getBindingAdapter()) == null) {
            return;
        }
        bindingAdapter.notifyItemChanged(getBindingAdapterPosition());
    }

    public final boolean b() {
        scq scqVar = this.b;
        scf scfVarE = scqVar != null ? scqVar.e() : null;
        scl sclVar = scfVarE instanceof scl ? (scl) scfVarE : null;
        return sclVar != null && sclVar.n();
    }
}
