package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bik {
    public final MaterialButton a;
    public bkh b;
    public bku c;
    public ud d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public PorterDuff.Mode k;
    public ColorStateList l;
    public ColorStateList m;
    public ColorStateList n;
    public Drawable o;
    public boolean q;
    public LayerDrawable s;
    public int t;
    public byj u;
    public boolean p = false;
    public boolean r = true;

    public bik(MaterialButton materialButton, bkh bkhVar) {
        this.a = materialButton;
        this.b = bkhVar;
    }

    private final bkc f(boolean z) {
        LayerDrawable layerDrawable = this.s;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (bkc) ((LayerDrawable) ((InsetDrawable) this.s.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final bkc a() {
        return f(false);
    }

    public final void b() {
        this.p = true;
        MaterialButton materialButton = this.a;
        materialButton.e(this.l);
        materialButton.f(this.k);
    }

    public final void c(bkh bkhVar) {
        this.b = bkhVar;
        this.c = null;
        d();
    }

    public final void d() {
        bkc bkcVarA = a();
        if (bkcVarA != null) {
            bku bkuVar = this.c;
            if (bkuVar != null) {
                bkcVarA.o(bkuVar);
            } else {
                bkcVarA.d(this.b);
            }
            ud udVar = this.d;
            if (udVar != null) {
                bkcVarA.k(udVar);
            }
        }
        bkc bkcVarF = f(true);
        if (bkcVarF != null) {
            bku bkuVar2 = this.c;
            if (bkuVar2 != null) {
                bkcVarF.o(bkuVar2);
            } else {
                bkcVarF.d(this.b);
            }
            ud udVar2 = this.d;
            if (udVar2 != null) {
                bkcVarF.k(udVar2);
            }
        }
        LayerDrawable layerDrawable = this.s;
        bks bksVar = null;
        if (layerDrawable != null && layerDrawable.getNumberOfLayers() > 1) {
            bksVar = this.s.getNumberOfLayers() > 2 ? (bks) this.s.getDrawable(2) : (bks) this.s.getDrawable(1);
        }
        if (bksVar != null) {
            bksVar.d(this.b);
            if (bksVar instanceof bkc) {
                bkc bkcVar = (bkc) bksVar;
                bku bkuVar3 = this.c;
                if (bkuVar3 != null) {
                    bkcVar.o(bkuVar3);
                }
                ud udVar3 = this.d;
                if (udVar3 != null) {
                    bkcVar.k(udVar3);
                }
            }
        }
    }

    public final void e(byj byjVar) {
        this.u = byjVar;
        bkc bkcVarA = a();
        if (bkcVarA != null) {
            bkcVarA.i = byjVar;
        }
    }
}
