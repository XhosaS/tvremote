package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class cga {
    public final cak a;
    public final cji b;
    public final WorkDatabase c;
    public final cld d;
    public final List e;
    public final Context f;
    public final coe g;

    public cga(Context context, cak cakVar, coe coeVar, cji cjiVar, WorkDatabase workDatabase, cld cldVar, List list) {
        context.getClass();
        workDatabase.getClass();
        this.a = cakVar;
        this.g = coeVar;
        this.b = cjiVar;
        this.c = workDatabase;
        this.d = cldVar;
        this.e = list;
        Context applicationContext = context.getApplicationContext();
        applicationContext.getClass();
        this.f = applicationContext;
        new cdf();
    }
}
