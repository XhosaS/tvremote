package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes2.dex */
class vcv extends ArrayAdapter {
    final /* synthetic */ vcw a;
    private ColorStateList b;
    private ColorStateList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vcv(vcw vcwVar, Context context, int i, String[] strArr) {
        super(context, i, strArr);
        this.a = vcwVar;
        a();
    }

    private final boolean b() {
        return this.a.b != 0;
    }

    private final boolean c() {
        return this.a.c != null;
    }

    final void a() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = null;
        if (c()) {
            int[] iArr = {R.attr.state_pressed};
            colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{this.a.c.getColorForState(iArr, 0), 0});
        } else {
            colorStateList = null;
        }
        this.c = colorStateList;
        if (b() && c()) {
            int[] iArr2 = {R.attr.state_hovered, -16842919};
            int[] iArr3 = {R.attr.state_selected, -16842919};
            vcw vcwVar = this.a;
            ColorStateList colorStateList3 = vcwVar.c;
            colorStateList2 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{acr.e(colorStateList3.getColorForState(iArr3, 0), vcwVar.b), acr.e(colorStateList3.getColorForState(iArr2, 0), vcwVar.b), vcwVar.b});
        }
        this.b = colorStateList2;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        View view2 = super.getView(i, view, viewGroup);
        if (view2 instanceof TextView) {
            TextView textView = (TextView) view2;
            vcw vcwVar = this.a;
            Drawable rippleDrawable = null;
            if (vcwVar.getText().toString().contentEquals(textView.getText()) && b()) {
                ColorDrawable colorDrawable = new ColorDrawable(vcwVar.b);
                if (this.c != null) {
                    colorDrawable.setTintList(this.b);
                    rippleDrawable = new RippleDrawable(this.c, colorDrawable, null);
                } else {
                    rippleDrawable = colorDrawable;
                }
            }
            textView.setBackground(rippleDrawable);
        }
        return view2;
    }
}
