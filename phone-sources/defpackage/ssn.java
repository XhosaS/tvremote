package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.support.v7.app.AlertDialog;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.google.android.videos.R;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ssn extends AlertDialog.Builder {
    private Drawable a;
    private final Rect b;

    public ssn(Context context) {
        this(context, 0);
    }

    private static int q(Context context) {
        TypedValue typedValueD = sim.d(context, R.attr.materialAlertDialogTheme);
        if (typedValueD == null) {
            return 0;
        }
        return typedValueD.data;
    }

    public final void a(int i) {
        super.setIcon(i);
    }

    public final void b(Drawable drawable) {
        super.setIcon(drawable);
    }

    public final void c(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        super.setItems(charSequenceArr, onClickListener);
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final AlertDialog create() {
        AlertDialog alertDialogCreate = super.create();
        Window window = alertDialogCreate.getWindow();
        View decorView = window.getDecorView();
        Drawable drawable = this.a;
        if (drawable instanceof szk) {
            ((szk) drawable).M(decorView.getElevation());
        }
        Drawable drawable2 = this.a;
        Rect rect = this.b;
        window.setBackgroundDrawable(new InsetDrawable(drawable2, rect.left, rect.top, rect.right, rect.bottom));
        decorView.setOnTouchListener(new ssm(alertDialogCreate, rect));
        return alertDialogCreate;
    }

    public final void d(int i) {
        super.setMessage(i);
    }

    public final void e(CharSequence charSequence) {
        super.setMessage(charSequence);
    }

    public final void f(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
    }

    public final void g(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
    }

    public final void h(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(charSequence, onClickListener);
    }

    public final void i(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(i, onClickListener);
    }

    public final void j(DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton("Neutral", onClickListener);
    }

    public final void k(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
    }

    public final void l(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
    }

    public final void m(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(charSequence, onClickListener);
    }

    public final void n(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(charSequenceArr, 0, onClickListener);
    }

    public final void o(int i) {
        super.setTitle(i);
    }

    public final void p(CharSequence charSequence) {
        super.setTitle(charSequence);
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        super.setAdapter(listAdapter, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setCancelable(boolean z) {
        super.setCancelable(z);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        super.setCursor(cursor, onClickListener, str);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setCustomTitle(View view) {
        super.setCustomTitle(view);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setIcon(int i) {
        super.setIcon(i);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setIconAttribute(int i) {
        super.setIconAttribute(i);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setItems(int i, DialogInterface.OnClickListener onClickListener) throws Resources.NotFoundException {
        super.setItems(i, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setMessage(int i) {
        super.setMessage(i);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) throws Resources.NotFoundException {
        super.setMultiChoiceItems(i, zArr, onMultiChoiceClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(i, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setNegativeButtonIcon(Drawable drawable) {
        super.setNegativeButtonIcon(drawable);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(i, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setNeutralButtonIcon(Drawable drawable) {
        super.setNeutralButtonIcon(drawable);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        super.setOnCancelListener(onCancelListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        super.setOnDismissListener(onDismissListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        super.setOnKeyListener(onKeyListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(i, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setPositiveButtonIcon(Drawable drawable) {
        super.setPositiveButtonIcon(drawable);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) throws Resources.NotFoundException {
        super.setSingleChoiceItems(i, i2, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setTitle(int i) {
        super.setTitle(i);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setView(int i) {
        super.setView(i);
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ssn(Context context, int i) {
        int iQ = q(context);
        Context contextA = tde.a(context, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        super(iQ != 0 ? new hc(contextA, iQ) : contextA, i == 0 ? q(context) : i);
        Context context2 = getContext();
        Resources.Theme theme = context2.getTheme();
        int[] iArr = sso.a;
        TypedArray typedArrayA = suy.a(context2, null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents, new int[0]);
        int dimensionPixelSize = typedArrayA.getDimensionPixelSize(2, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_start));
        int dimensionPixelSize2 = typedArrayA.getDimensionPixelSize(3, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_top));
        int dimensionPixelSize3 = typedArrayA.getDimensionPixelSize(1, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_end));
        int dimensionPixelSize4 = typedArrayA.getDimensionPixelSize(0, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_alert_dialog_background_inset_bottom));
        typedArrayA.recycle();
        int layoutDirection = context2.getResources().getConfiguration().getLayoutDirection();
        this.b = new Rect(layoutDirection == 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize2, layoutDirection != 1 ? dimensionPixelSize3 : dimensionPixelSize, dimensionPixelSize4);
        int iE = sip.e(context2, R.attr.colorSurface, getClass().getCanonicalName());
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(null, iArr, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        int color = typedArrayObtainStyledAttributes.getColor(4, iE);
        typedArrayObtainStyledAttributes.recycle();
        szk szkVar = new szk(context2, null, R.attr.alertDialogStyle, R.style.MaterialAlertDialog_MaterialComponents);
        szkVar.J(context2);
        szkVar.N(ColorStateList.valueOf(color));
        if (Build.VERSION.SDK_INT >= 28) {
            TypedValue typedValue = new TypedValue();
            theme.resolveAttribute(android.R.attr.dialogCornerRadius, typedValue, true);
            float dimension = typedValue.getDimension(getContext().getResources().getDisplayMetrics());
            if (typedValue.type == 5 && dimension >= 0.0f) {
                szkVar.K(dimension);
            }
        }
        this.a = szkVar;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setIcon(Drawable drawable) {
        super.setIcon(drawable);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        super.setItems(charSequenceArr, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setMessage(CharSequence charSequence) {
        super.setMessage(charSequence);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.setMultiChoiceItems(cursor, str, str2, onMultiChoiceClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNegativeButton(charSequence, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setNeutralButton(charSequence, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        super.setPositiveButton(charSequence, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(cursor, i, str, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setView(View view) {
        super.setView(view);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        super.setMultiChoiceItems(charSequenceArr, zArr, onMultiChoiceClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(listAdapter, i, onClickListener);
        return this;
    }

    @Override // android.support.v7.app.AlertDialog.Builder
    public final /* synthetic */ AlertDialog.Builder setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        super.setSingleChoiceItems(charSequenceArr, i, onClickListener);
        return this;
    }
}
