package defpackage;

import android.content.Context;
import android.database.ContentObserver;
import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class rfc implements rez {
    public static rfc a;
    public final Context b;
    public final ContentObserver c;
    public boolean d;

    public rfc() {
        this.d = false;
        this.b = null;
        this.c = null;
    }

    static synchronized void c() {
        Context context;
        rfc rfcVar = a;
        if (rfcVar != null && (context = rfcVar.b) != null && rfcVar.c != null && rfcVar.d) {
            context.getContentResolver().unregisterContentObserver(a.c);
        }
        a = null;
    }

    @Override // defpackage.rez
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final String b(final String str) {
        Context context = this.b;
        if (context != null && !mhv.g(context)) {
            try {
                return (String) rex.a(new rey() { // from class: rfa
                    @Override // defpackage.rey
                    public final Object a() {
                        Context context2 = this.a.b;
                        context2.getClass();
                        return lwy.a(context2.getContentResolver(), str, null);
                    }
                });
            } catch (IllegalStateException | NullPointerException | SecurityException e) {
                Log.e("GservicesLoader", "Unable to read GServices for: ".concat(String.valueOf(str)), e);
            }
        }
        return null;
    }

    public rfc(Context context) {
        this.d = false;
        this.b = context;
        this.c = new rfb();
    }
}
