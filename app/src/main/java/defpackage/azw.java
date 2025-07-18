package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class azw extends azk {
    azv h;
    azt i;
    public azr j;
    Object k;
    int l;
    public boolean m;
    boolean n;
    boolean o;
    public float p;
    protected final aty q;
    public awl r;
    public awk s;

    public azw(View view) {
        super(view);
        this.l = 0;
        this.p = 0.0f;
        Context context = view.getContext();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(atk.b);
        int color = typedArrayObtainStyledAttributes.getColor(36, context.getResources().getColor(R.color.lb_view_dim_mask_color));
        float fraction = typedArrayObtainStyledAttributes.getFraction(34, 1, 1, context.getResources().getFraction(R.fraction.lb_view_active_level, 1, 0));
        float fraction2 = typedArrayObtainStyledAttributes.getFraction(35, 1, 1, context.getResources().getFraction(R.fraction.lb_view_dimmed_level, 1, 1));
        typedArrayObtainStyledAttributes.recycle();
        this.q = new aty(color, fraction, fraction2);
    }

    public final void c(View view) {
        int i = this.l;
        if (i == 1) {
            view.setActivated(true);
        } else if (i == 2) {
            view.setActivated(false);
        }
    }
}
