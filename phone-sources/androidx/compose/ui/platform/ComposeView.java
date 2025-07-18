package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.bao;
import defpackage.bas;
import defpackage.bcb;
import defpackage.bci;
import defpackage.bcr;
import defpackage.bcz;
import defpackage.can;
import defpackage.cnq;
import defpackage.yjz;
import defpackage.ykn;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ComposeView extends can {
    private final bcb a;
    private boolean b;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    @Override // defpackage.can
    public final void a(bao baoVar, int i) {
        int i2;
        int i3 = i & 6;
        bao baoVarD = baoVar.d(420213850);
        if (i3 == 0) {
            i2 = (true != baoVarD.H(this) ? 2 : 4) | i;
        } else {
            i2 = i;
        }
        if (baoVarD.L((i2 & 3) != 2, i2 & 1)) {
            yjz yjzVar = (yjz) this.a.a();
            if (yjzVar == null) {
                baoVarD.x(-1238798753);
            } else {
                baoVarD.x(98586082);
                yjzVar.a(baoVarD, 0);
            }
            ((bas) baoVarD).aa();
        } else {
            baoVarD.t();
        }
        bcr bcrVarM = baoVarD.M();
        if (bcrVarM != null) {
            bcrVarM.d = new cnq(this, i, 1);
        }
    }

    public final void b(yjz yjzVar) {
        this.b = true;
        this.a.b(yjzVar);
        if (isAttachedToWindow()) {
            d();
        }
    }

    @Override // defpackage.can
    protected final boolean c() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new bci(null, bcz.c);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i, int i2, ykn yknVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
