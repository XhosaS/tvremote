package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.support.v7.recyclerview.extensions.ListAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rag extends rbn {
    private final yyh a;

    public rag(yyh yyhVar) {
        this.a = yyhVar;
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        ((vov) obj2).getClass();
    }

    @Override // defpackage.rbn
    public final /* bridge */ /* synthetic */ void b(Object obj, Object obj2) throws NumberFormatException {
        rah rahVar = (rah) obj;
        vov vovVar = (vov) obj2;
        vovVar.getClass();
        if (rahVar.c == 1) {
            rahVar.a.setRotation(180.0f);
        }
        ((ListAdapter) rahVar.d).submitList(vovVar.a);
        int i = rahVar.c;
        int i2 = vovVar.e;
        if (i != i2) {
            rahVar.c = i2;
            if (i2 == 4) {
                ((RecyclerView) rahVar.e).setVisibility(8);
                if (rahVar.a.getRotation() == 360.0f) {
                    ((ObjectAnimator) rahVar.f).start();
                }
            } else {
                ((RecyclerView) rahVar.e).setVisibility(0);
                if (rahVar.a.getRotation() == 180.0f) {
                    ((ObjectAnimator) rahVar.f).reverse();
                }
            }
        }
        TextView textView = rahVar.b;
        yyh yyhVar = this.a;
        vqe vqeVar = vovVar.b;
        CharSequence text = textView.getText();
        Context context = textView.getContext();
        context.getClass();
        textView.setContentDescription(((Object) text) + "\n" + yyhVar.k(vqeVar, context));
        vqe vqeVar2 = vovVar.c;
        Context context2 = textView.getContext();
        context2.getClass();
        cww.r(textView, yyhVar.k(vqeVar2, context2));
    }
}
