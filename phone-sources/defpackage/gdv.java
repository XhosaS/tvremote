package defpackage;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerViewAccessibilityDelegate;

/* compiled from: PG */
@Deprecated
/* loaded from: classes.dex */
public final class gdv extends RecyclerViewAccessibilityDelegate {
    final RecyclerView a;
    final cuo b;
    final cuo c;

    public gdv(RecyclerView recyclerView) {
        super(recyclerView);
        this.b = super.getItemDelegate();
        this.c = new gdu(this);
        this.a = recyclerView;
    }

    @Override // android.support.v7.widget.RecyclerViewAccessibilityDelegate
    public final cuo getItemDelegate() {
        return this.c;
    }
}
