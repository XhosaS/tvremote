package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kix implements kiw {
    public kiy a;

    @Override // defpackage.kiw
    public final void K(int i) {
        String string = a().a.getResources().getString(i);
        string.getClass();
        L(string);
    }

    @Override // defpackage.kiw
    public final void L(String str) {
        View view = a().b;
        a();
        kiu kiuVarA = kir.a(view, str);
        Float f = (Float) a().c.a();
        if (f != null) {
            kiuVarA.c(f.floatValue());
        }
        kiuVarA.a().h();
    }

    @Override // defpackage.kiw
    public final void M(int i, int i2, View.OnClickListener onClickListener) {
        View view = a().b;
        String string = a().a.getResources().getString(i);
        string.getClass();
        a();
        kiu kiuVarA = kir.a(view, string);
        Float f = (Float) a().c.a();
        if (f != null) {
            kiuVarA.c(f.floatValue());
        }
        a();
        kiuVarA.b(i2, onClickListener);
        kiuVarA.a().h();
    }

    public final kiy a() {
        kiy kiyVar = this.a;
        if (kiyVar != null) {
            return kiyVar;
        }
        yks.c("properties");
        return null;
    }
}
