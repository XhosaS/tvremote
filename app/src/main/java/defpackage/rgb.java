package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rgb extends rgi {
    public rgb(rgg rggVar, String str, Double d) {
        super(rggVar, str, d, true);
    }

    @Override // defpackage.rgi
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid double value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
