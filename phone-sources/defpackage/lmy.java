package defpackage;

import android.content.ContentValues;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class lmy {
    public final ieg a;
    public final boolean b;
    public final Executor c;
    public final idr d;
    public final String e;
    public final mab f;
    public long g = 0;
    public long h = 0;
    public final ksy i;
    public final lyz j;
    public final ltw k;
    private final Executor l;
    private final kuw m;

    public lmy(lyz lyzVar, ExecutorService executorService, Executor executor, kuw kuwVar, ltw ltwVar, idr idrVar, mab mabVar, String str, boolean z, ieg iegVar, ksy ksyVar) {
        this.m = kuwVar;
        this.k = ltwVar;
        this.d = idrVar;
        this.f = mabVar;
        this.a = iegVar;
        this.b = z;
        this.j = lyzVar;
        this.c = executorService;
        this.l = executor;
        this.e = str;
        this.i = ksyVar;
    }

    public final void a(long j, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("last_playback_is_dirty", (Boolean) true);
        contentValues.put("last_playback_start_timestamp", Long.valueOf(this.g));
        contentValues.put("last_watched_timestamp", Long.valueOf(this.h));
        contentValues.put("resume_timestamp", Long.valueOf(j));
        this.c.execute(new fob(this, contentValues, (ksn) this.a.g(), z, 4));
    }

    public final void b() {
        this.l.execute(new ljl(this.m, 8, null));
    }
}
