package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
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
import com.google.android.tv.remote.service.R;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bp {
    public final Context a;
    public final cl b;
    public final Window c;
    public CharSequence d;
    public ListView e;
    Button f;
    Button g;
    Button h;
    NestedScrollView i;
    public Drawable k;
    public ImageView l;
    public TextView m;
    public TextView n;
    public View o;
    public ListAdapter p;
    public final int r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final boolean w;
    public final Handler x;
    public int j = 0;
    public int q = -1;
    public final View.OnClickListener y = new er(this, 1);

    public bp(Context context, cl clVar, Window window) {
        this.a = context;
        this.b = clVar;
        this.c = window;
        this.x = new bn(clVar);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, cu.e, R.attr.alertDialogStyle, 0);
        this.r = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        this.s = typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.t = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.u = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.w = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        clVar.b().p(1);
    }

    public static final void b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    public static final ViewGroup c(View view, View view2) {
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

    public final void a(CharSequence charSequence) {
        this.d = charSequence;
        TextView textView = this.m;
        if (textView != null) {
            textView.setText(charSequence);
        }
        this.c.setTitle(charSequence);
    }
}
