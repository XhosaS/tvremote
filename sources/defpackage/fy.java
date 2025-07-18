package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ContextThemeWrapper;
import android.widget.ListAdapter;
import android.widget.ListView;

/* compiled from: PG */
/* loaded from: classes.dex */
final class fy implements DialogInterface.OnClickListener, gd {
    bq a;
    final /* synthetic */ ge b;
    private ListAdapter c;
    private CharSequence d;

    public fy(ge geVar) {
        this.b = geVar;
    }

    @Override // defpackage.gd
    public final int a() {
        return 0;
    }

    @Override // defpackage.gd
    public final int b() {
        return 0;
    }

    @Override // defpackage.gd
    public final Drawable c() {
        return null;
    }

    @Override // defpackage.gd
    public final CharSequence d() {
        return this.d;
    }

    @Override // defpackage.gd
    public final void e(ListAdapter listAdapter) {
        this.c = listAdapter;
    }

    @Override // defpackage.gd
    public final void f(Drawable drawable) {
        Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.gd
    public final void g(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.gd
    public final void h(int i) {
        Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.gd
    public final void i(CharSequence charSequence) {
        this.d = charSequence;
    }

    @Override // defpackage.gd
    public final void j(int i) {
        Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
    }

    @Override // defpackage.gd
    public final void k() {
        bq bqVar = this.a;
        if (bqVar != null) {
            bqVar.dismiss();
            this.a = null;
        }
    }

    @Override // defpackage.gd
    public final void l(int i, int i2) {
        if (this.c == null) {
            return;
        }
        ge geVar = this.b;
        Context context = geVar.a;
        int iA = bq.a(context, 0);
        bm bmVar = new bm(new ContextThemeWrapper(context, bq.a(context, iA)));
        CharSequence charSequence = this.d;
        if (charSequence != null) {
            bmVar.d = charSequence;
        }
        ListAdapter listAdapter = this.c;
        int selectedItemPosition = geVar.getSelectedItemPosition();
        bmVar.g = listAdapter;
        bmVar.h = this;
        bmVar.j = selectedItemPosition;
        bmVar.i = true;
        bq bqVarN = ii.N(bmVar, iA);
        this.a = bqVarN;
        ListView listView = bqVarN.a.e;
        listView.setTextDirection(i);
        listView.setTextAlignment(i2);
        this.a.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ge geVar = this.b;
        geVar.setSelection(i);
        if (geVar.getOnItemClickListener() != null) {
            geVar.performItemClick(null, i, this.c.getItemId(i));
        }
        k();
    }

    @Override // defpackage.gd
    public final boolean u() {
        bq bqVar = this.a;
        if (bqVar != null) {
            return bqVar.isShowing();
        }
        return false;
    }
}
