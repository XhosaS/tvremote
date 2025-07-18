package defpackage;

import android.content.Context;
import android.database.ContentObserver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rwq {
    public static rwq a;
    public final Context b;
    public final ContentObserver c;
    public boolean d;

    public rwq() {
        this.d = false;
        this.b = null;
        this.c = null;
    }

    static synchronized void a() {
        Context context;
        rwq rwqVar = a;
        if (rwqVar != null && (context = rwqVar.b) != null && rwqVar.c != null && rwqVar.d) {
            context.getContentResolver().unregisterContentObserver(a.c);
        }
        a = null;
    }

    public rwq(Context context) {
        this.d = false;
        this.b = context;
        this.c = new rwp();
    }
}
