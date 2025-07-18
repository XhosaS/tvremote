package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kaq extends gmd {
    private final woq f;

    public kaq(bv bvVar, woq woqVar) {
        super(bvVar.getChildFragmentManager(), bvVar.getLifecycle());
        this.f = woqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gmd
    public final /* bridge */ /* synthetic */ bv b(int i) {
        E e = this.f.b.get(i);
        e.getClass();
        kan kanVar = new kan();
        Bundle bundle = new Bundle();
        hju.I(bundle, "tab", (wop) e);
        kanVar.setArguments(bundle);
        return kanVar;
    }

    @Override // android.support.v7.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.f.b.size();
    }
}
