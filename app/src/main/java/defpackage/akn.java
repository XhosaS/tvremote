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
class akn extends View {
    final /* synthetic */ ViewGroup a;
    final /* synthetic */ akp b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akn(akp akpVar, Context context, ViewGroup viewGroup) {
        super(context);
        this.b = akpVar;
        this.a = viewGroup;
    }

    @Override // android.view.View
    protected final void onConfigurationChanged(Configuration configuration) {
        Drawable background = this.a.getBackground();
        int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : 0;
        akp akpVar = this.b;
        if (akpVar.e == color) {
            return;
        }
        akpVar.e = color;
        ArrayList arrayList = akpVar.b;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            } else {
                ((akk) arrayList.get(size)).b();
            }
        }
    }
}
