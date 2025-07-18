package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.google.android.katniss.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ga {
    public final int A;
    final int B;
    final int C;
    final int D;
    final int E;
    public final boolean F;
    final Handler G;
    public final Context a;
    final hh b;
    public final Window c;
    public CharSequence d;
    public CharSequence e;
    public ListView f;
    public View g;
    Button i;
    public CharSequence j;
    Message k;
    Button l;
    public CharSequence m;
    Message n;
    Button o;
    public CharSequence p;
    NestedScrollView q;
    public Drawable s;
    public ImageView t;
    public TextView u;
    public TextView v;
    public View w;
    ListAdapter x;
    public final int z;
    public boolean h = false;
    public int r = 0;
    int y = -1;
    public final View.OnClickListener H = new ft(this);

    public ga(Context context, hh hhVar, Window window) {
        this.a = context;
        this.b = hhVar;
        this.c = window;
        this.G = new fy(hhVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, hs.e, R.attr.alertDialogStyle, 0);
        this.z = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.A = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.B = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.C = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.D = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.E = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.F = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        hhVar.b().o(1);
    }

    static boolean d(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (d(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public final ViewGroup a(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public final void c(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.u;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }

    public final void e(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        Message messageObtainMessage = onClickListener != null ? this.G.obtainMessage(i, onClickListener) : null;
        if (i != -2) {
            this.j = charSequence;
            this.k = messageObtainMessage;
        } else {
            this.m = charSequence;
            this.n = messageObtainMessage;
        }
    }
}
