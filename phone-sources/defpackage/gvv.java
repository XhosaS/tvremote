package defpackage;

import androidx.work.impl.WorkDatabase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gvv implements gpe {
    public final gty a;
    public final gux b;
    public final isy c;

    static {
        gpn.a("WMFgUpdater");
    }

    public gvv(WorkDatabase workDatabase, gty gtyVar, isy isyVar) {
        this.a = gtyVar;
        this.c = isyVar;
        this.b = workDatabase.D();
    }
}
