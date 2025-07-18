package defpackage;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
class me implements DialogInterface.OnClickListener, ml {
    gc a;
    final /* synthetic */ mm b;
    private ListAdapter c;
    private CharSequence d;

    public me(mm mmVar) {
        this.b = mmVar;
    }

    @Override // defpackage.ml
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.ml
    public final int cm() {
        return 0;
    }

    @Override // defpackage.ml
    public final int cn() {
        return 0;
    }

    @Override // defpackage.ml
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.ml
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.ml
    public final void f() {
        gc gcVar = this.a;
        if (gcVar != null) {
            gcVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.ml
    public final void g(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ml
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ml
    public final void i(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ml
    public final void j(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.ml
    public final void k(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.ml
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        mm mmVar = this.b;
        gb gbVar = new gb(mmVar.getPopupContext());
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            gbVar.setTitle(charSequence);
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = mmVar.getSelectedItemPosition();
        fx fxVar = gbVar.a;
        fxVar.m = listAdapter;
        fxVar.n = this;
        fxVar.s = selectedItemPosition;
        fxVar.r = true;
        gc gcVarCreate = gbVar.create();
        this.a = gcVarCreate;
        ListView listView = gcVarCreate.a.f;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        mm mmVar = this.b;
        mmVar.setSelection(i);
        if (mmVar.getOnItemClickListener() != null) {
            mmVar.performItemClick(null, i, this.c.getItemId(i));
        }
        f();
    }

    @Override // defpackage.ml
    public final boolean u() {
        gc gcVar = this.a;
        if (gcVar != null) {
            return gcVar.isShowing();
        }
        return false;
    }
}
