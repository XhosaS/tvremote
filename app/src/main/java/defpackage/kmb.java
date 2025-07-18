package defpackage;

import android.content.Context;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kmb {
    public static final kmb a = new kmb();
    private kma b = null;

    public final synchronized kma a(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new kma(context);
        }
        return this.b;
    }
}
