package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.widget.ImageView;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ekd extends dxv {

    @eau(a = eav.NONE)
    @eat(a = 0)
    float a;

    private ekd() {
        super("SolidColor");
        this.a = -1.0f;
    }

    public static ekc aA(dru druVar) {
        return new ekc(druVar, new ekd());
    }

    @Override // defpackage.dxv
    protected final drq ay(dru druVar) {
        float f = this.a;
        int iF = f >= 0.0f ? acr.f(0, (int) (Math.min(1.0f, f) * 255.0f)) : 0;
        egs egsVar = new egs(druVar, new egu());
        egu eguVar = egsVar.a;
        eguVar.b = ImageView.ScaleType.FIT_XY;
        eguVar.a = new ColorDrawable(iF);
        egsVar.d.set(0);
        return egsVar.a();
    }
}
