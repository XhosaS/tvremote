package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hpr extends dow {
    final /* synthetic */ xo a;
    final /* synthetic */ xal b;
    final /* synthetic */ Drawable[] d;
    final /* synthetic */ int e;
    final /* synthetic */ String[] f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hpr(xo xoVar, xal xalVar, Drawable[] drawableArr, int i, String[] strArr) {
        super(Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.a = xoVar;
        this.b = xalVar;
        this.d = drawableArr;
        this.e = i;
        this.f = strArr;
    }

    @Override // defpackage.dow, defpackage.dpf
    public final void a(Drawable drawable) {
        this.a.b(drawable);
        this.d[this.e] = null;
    }

    @Override // defpackage.dpf
    public final /* bridge */ /* synthetic */ void b(Object obj, dpm dpmVar) {
        Drawable drawable = (Drawable) obj;
        this.a.b(drawable);
        xal xalVar = this.b;
        drawable.setBounds(0, 0, xalVar.f, xalVar.g);
        Drawable[] drawableArr = this.d;
        int i = this.e;
        drawableArr[i] = drawable;
        this.f[i] = xalVar.c;
    }

    @Override // defpackage.dpf
    public final void c(Drawable drawable) {
        this.a.b(drawable);
        Drawable[] drawableArr = this.d;
        int i = this.e;
        drawableArr[i] = drawable;
        this.f[i] = null;
    }
}
