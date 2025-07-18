package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rfz extends rgi {
    public rfz(rgg rggVar, String str, Long l) {
        super(rggVar, str, l, true);
    }

    @Override // defpackage.rgi
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        Log.e("PhenotypeFlag", "Invalid long value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
