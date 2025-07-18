package defpackage;

import android.support.v7.widget.RecyclerView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uxf extends aze {
    final /* synthetic */ String a;
    final /* synthetic */ uwm b;

    public uxf(String str, uwm uwmVar) {
        this.a = str;
        this.b = uwmVar;
    }

    @Override // defpackage.aze
    public final void a(RecyclerView recyclerView, qv qvVar, int i, int i2) throws abxv {
        String str;
        if (recyclerView.hasFocus()) {
            str = this.a + i;
        } else {
            str = this.a + i + "_FOCUS_NOT_IN_GRID";
        }
        this.b.b("xuikit_tv___current_group_selection_key", str, true);
    }
}
