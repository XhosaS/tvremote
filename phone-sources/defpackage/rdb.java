package defpackage;

import android.content.Context;
import android.support.v7.widget.ActivityChooserView;
import android.view.View;
import android.widget.TextView;
import com.google.android.videos.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rdb extends rbn {
    public final yyh a;
    private final xzg b;

    public rdb(xzg xzgVar, yyh yyhVar) {
        this.b = xzgVar;
        this.a = yyhVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vql) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) {
        cb cbVar = (cb) obj;
        vql vqlVar = (vql) obj2;
        vqlVar.getClass();
        Object obj3 = cbVar.a;
        TextView textView = (TextView) obj3;
        Context context = textView.getContext();
        context.getClass();
        textView.setText(this.a.k(vqlVar.a, context));
        List list = vqlVar.d;
        CharSequence charSequenceAx = list.isEmpty() ? null : yfm.ax(list, "\n", null, null, new qaz(this, cbVar, 14, 0 == true ? 1 : 0), 30);
        textView.setContentDescription(charSequenceAx);
        cww.s((View) obj3, charSequenceAx);
        int i = vqlVar.e - 1;
        textView.setTextAppearance(context, i != 0 ? i != 1 ? i != 2 ? R.style.TextAppearance_GoogleMaterial3_BodySmall : R.style.TextAppearance_GoogleMaterial3_BodyMedium : R.style.TextAppearance_GoogleMaterial3_LabelLarge : R.style.TextAppearance_GoogleMaterial3_TitleMedium);
        textView.setTextColor(this.b.c(vqlVar.b));
        Integer num = vqlVar.c;
        textView.setMaxLines(num != null ? num.intValue() : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED);
    }
}
