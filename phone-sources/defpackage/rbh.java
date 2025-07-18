package defpackage;

import android.content.Context;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rbh extends rbn {
    private final yyh a;

    public rbh(yyh yyhVar) {
        this.a = yyhVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vqg) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        rbi rbiVar = (rbi) obj;
        vqg vqgVar = (vqg) obj2;
        vqgVar.getClass();
        TextView textView = (TextView) rbiVar.a;
        Context context = textView.getContext();
        context.getClass();
        textView.setText(this.a.k(vqgVar.a, context));
        ((ListAdapter) rbiVar.b).submitList(vqgVar.b);
    }
}
