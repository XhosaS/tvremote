package defpackage;

import android.os.Bundle;

/* compiled from: PG */
/* loaded from: classes.dex */
public class crr {
    public crm a;
    public CharSequence b;

    protected String a() {
        return null;
    }

    public void d(fhy fhyVar) {
        throw null;
    }

    public void e(Bundle bundle) {
        CharSequence charSequence = this.b;
        if (charSequence != null) {
            bundle.putCharSequence("android.title.big", charSequence);
        }
        String strA = a();
        if (strA != null) {
            bundle.putString("android.support.v4.app.extra.COMPAT_TEMPLATE", strA);
        }
    }

    public void f() {
    }
}
