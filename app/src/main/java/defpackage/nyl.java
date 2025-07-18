package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* compiled from: PG */
/* loaded from: classes.dex */
public class nyl implements doq {
    private final int a;
    private final njs b;
    private final njw c;
    private final odj d;
    private final nyk e;
    private final boolean f;

    public nyl(int i, njs njsVar, njw njwVar, odj odjVar, nyk nykVar, boolean z) {
        this.a = i;
        this.b = njsVar;
        this.c = njwVar;
        this.d = odjVar;
        this.e = nykVar;
        this.f = z;
    }

    @Override // defpackage.doq
    public final void b(ddj ddjVar, dpf dpfVar) {
        odj odjVar;
        nyk nykVar;
        if (this.f && (odjVar = this.d) != null && dpfVar == (nykVar = this.e)) {
            nykVar.o();
            odjVar.a(this.a, this.b, this.c, ddjVar);
        }
    }

    @Override // defpackage.doq
    public final /* bridge */ /* synthetic */ void c(Object obj, dpf dpfVar, int i) {
        odj odjVar;
        nyk nykVar;
        Drawable drawable = (Drawable) obj;
        if (this.f && (odjVar = this.d) != null && dpfVar == (nykVar = this.e)) {
            nykVar.o();
            odjVar.c(this.a, this.b, this.c, drawable instanceof BitmapDrawable ? Integer.valueOf(((BitmapDrawable) drawable).getBitmap().getAllocationByteCount()) : null, i);
        }
    }
}
