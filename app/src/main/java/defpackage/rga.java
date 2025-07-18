package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class rga extends rgi {
    public rga(rgg rggVar, String str, Boolean bool) {
        super(rggVar, str, bool, true);
    }

    @Override // defpackage.rgi
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (lwz.c.matcher(str).matches()) {
                return true;
            }
            if (lwz.d.matcher(str).matches()) {
                return false;
            }
        }
        Log.e("PhenotypeFlag", "Invalid boolean value for " + super.d() + ": " + String.valueOf(obj));
        return null;
    }
}
