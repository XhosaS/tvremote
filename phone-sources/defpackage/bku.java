package defpackage;

import android.view.View;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class bku {
    public final View a;
    public final blc b;
    public final AutofillManager c;
    public AutofillId d;

    public bku(View view, blc blcVar) {
        this.a = view;
        this.b = blcVar;
        AutofillManager autofillManagerM69m = bb$$ExternalSyntheticApiModelOutline1.m69m(view.getContext().getSystemService(bb$$ExternalSyntheticApiModelOutline1.m78m$1()));
        if (autofillManagerM69m == null) {
            throw new IllegalStateException("Autofill service could not be located.");
        }
        this.c = autofillManagerM69m;
        view.setImportantForAutofill(1);
        cvw cvwVarX = cbp.x(view);
        Object obj = cvwVarX != null ? cvwVarX.a : null;
        if (obj != null) {
            this.d = bb$$ExternalSyntheticApiModelOutline1.m(obj);
        } else {
            bty.a("Required value was null.");
            throw new yfs();
        }
    }
}
