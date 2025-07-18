package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AlertController$RecycleListView;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class gb {
    public final fx a;
    private final int b;

    public gb(Context context) {
        this(context, gc.a(context, 0));
    }

    public final void a(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        fx fxVar = this.a;
        fxVar.g = charSequence;
        fxVar.h = onClickListener;
    }

    public gc create() {
        ListAdapter fuVar;
        fx fxVar = this.a;
        Context context = fxVar.a;
        gc gcVar = new gc(context, this.b);
        ga gaVar = gcVar.a;
        View view = fxVar.e;
        if (view != null) {
            gaVar.w = view;
        } else {
            CharSequence charSequence = fxVar.d;
            if (charSequence != null) {
                gaVar.c(charSequence);
            }
            Drawable drawable = fxVar.c;
            if (drawable != null) {
                gaVar.s = drawable;
                gaVar.r = 0;
                ImageView imageView = gaVar.t;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    gaVar.t.setImageDrawable(drawable);
                }
            }
        }
        CharSequence charSequence2 = fxVar.f;
        if (charSequence2 != null) {
            gaVar.e = charSequence2;
            TextView textView = gaVar.v;
            if (textView != null) {
                textView.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = fxVar.g;
        if (charSequence3 != null) {
            gaVar.e(-1, charSequence3, fxVar.h);
        }
        CharSequence charSequence4 = fxVar.i;
        if (charSequence4 != null) {
            gaVar.e(-2, charSequence4, fxVar.j);
        }
        if (fxVar.l != null || fxVar.m != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) fxVar.b.inflate(gaVar.B, (ViewGroup) null);
            if (fxVar.q) {
                fuVar = new fu(fxVar, context, gaVar.C, fxVar.l, alertController$RecycleListView);
            } else {
                int i = fxVar.r ? gaVar.D : gaVar.E;
                ListAdapter fzVar = fxVar.m;
                if (fzVar == null) {
                    fzVar = new fz(context, i, fxVar.l);
                }
                fuVar = fzVar;
            }
            gaVar.x = fuVar;
            gaVar.y = fxVar.s;
            if (fxVar.n != null) {
                alertController$RecycleListView.setOnItemClickListener(new fv(fxVar, gaVar));
            } else if (fxVar.t != null) {
                alertController$RecycleListView.setOnItemClickListener(new fw(fxVar, alertController$RecycleListView, gaVar));
            }
            if (fxVar.r) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (fxVar.q) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            gaVar.f = alertController$RecycleListView;
        }
        View view2 = fxVar.o;
        if (view2 != null) {
            gaVar.g = view2;
            gaVar.h = false;
        }
        gcVar.setCancelable(true);
        gcVar.setCanceledOnTouchOutside(true);
        gcVar.setOnCancelListener(null);
        gcVar.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = fxVar.k;
        if (onKeyListener != null) {
            gcVar.setOnKeyListener(onKeyListener);
        }
        return gcVar;
    }

    public Context getContext() {
        return this.a.a;
    }

    public gb setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        fx fxVar = this.a;
        fxVar.i = fxVar.a.getText(i);
        fxVar.j = onClickListener;
        return this;
    }

    public gb setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        fx fxVar = this.a;
        fxVar.g = fxVar.a.getText(i);
        fxVar.h = onClickListener;
        return this;
    }

    public gb setTitle(CharSequence charSequence) {
        this.a.d = charSequence;
        return this;
    }

    public gb setView(View view) {
        this.a.o = view;
        return this;
    }

    public gb(Context context, int i) {
        this.a = new fx(new ContextThemeWrapper(context, gc.a(context, i)));
        this.b = i;
    }
}
