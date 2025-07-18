package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nxz extends dow {
    private final njs a;
    private final ImageView.ScaleType b;
    private final oco d;
    private final obg e;
    private final int f;
    private final boolean g;
    private final mxn h;

    public nxz(njs njsVar, mxn mxnVar, int i, int i2, ImageView.ScaleType scaleType, oco ocoVar, obg obgVar, int i3, boolean z) {
        super(i, i2);
        this.a = njsVar;
        this.h = mxnVar;
        this.b = scaleType;
        this.d = ocoVar;
        this.e = obgVar;
        this.f = i3;
        this.g = false;
    }

    @Override // defpackage.dow, defpackage.dpf
    public final void a(Drawable drawable) {
        if (drawable != null) {
            mxn mxnVar = this.h;
            mxnVar.a = drawable;
            mxnVar.invalidateSelf();
        } else {
            obg obgVar = this.e;
            if (obgVar != null) {
                obgVar.a(this.f);
            }
        }
    }

    @Override // defpackage.dpf
    public final /* synthetic */ void b(Object obj, dpm dpmVar) {
        Drawable mjbVar = (Drawable) obj;
        if (mjbVar instanceof BitmapDrawable) {
            ImageView.ScaleType scaleType = this.b;
            if (scaleType == ImageView.ScaleType.CENTER_INSIDE) {
                scaleType = ImageView.ScaleType.FIT_CENTER;
            }
            mjbVar = new mjb(((BitmapDrawable) mjbVar).getBitmap(), scaleType, this.d, ypv.a);
        }
        nyp.c(mjbVar, this.a);
        mxn mxnVar = this.h;
        mxnVar.a = mjbVar;
        mxnVar.invalidateSelf();
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
        if (drawable != null) {
            mxn mxnVar = this.h;
            mxnVar.a = drawable;
            mxnVar.invalidateSelf();
        }
    }
}
