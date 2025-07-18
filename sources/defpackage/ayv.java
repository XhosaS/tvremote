package defpackage;

import android.content.Context;
import java.util.HashSet;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ayv {
    public final Object a;
    public final Object b;

    public ayv(Context context, crv crvVar) {
        this.a = context;
        this.b = crvVar;
    }

    public ayv(awy awyVar, cov covVar) {
        this.a = awyVar;
        this.b = covVar;
    }

    public ayv(Context context) {
        this.b = new HashSet();
        this.a = context;
    }
}
