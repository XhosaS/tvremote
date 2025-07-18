package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class te extends View {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ tg b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(tg tgVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = tgVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        tg tgVar = this.b;
        if (tgVar.e == color) {
            return;
        }
        tgVar.e = color;
        ArrayList arrayList = tgVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                tc.b((tc) arrayList.get(size));
            }
        }
    }
}
