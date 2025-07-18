package defpackage;

import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spanned;

/* compiled from: PG */
/* loaded from: classes.dex */
public class mxq {
    public mxp[] a = null;

    public final void a(Canvas canvas) {
        mxp[] mxpVarArr = this.a;
        if (mxpVarArr != null) {
            for (mxp mxpVar : mxpVarArr) {
                mxpVar.a(canvas);
            }
        }
    }

    public final void b(Layout layout, CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            mxp[] mxpVarArr = (mxp[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), mxp.class);
            this.a = mxpVarArr;
            for (mxp mxpVar : mxpVarArr) {
                mxpVar.c(layout);
            }
        }
    }

    public final void c() {
        mxp[] mxpVarArr = this.a;
        if (mxpVarArr != null) {
            for (mxp mxpVar : mxpVarArr) {
            }
        }
    }

    public final void d() {
        mxp[] mxpVarArr = this.a;
        if (mxpVarArr != null) {
            for (mxp mxpVar : mxpVarArr) {
            }
        }
    }
}
