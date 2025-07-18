package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
abstract class upd implements upx {
    final /* synthetic */ upe d;

    public upd(upe upeVar) {
        this.d = upeVar;
    }

    @Override // defpackage.upx
    public final void c() {
        Log.v("ASQLDB", uqk.a(this.d.a.rawQuery("EXPLAIN QUERY PLAN ".concat(b()), null)));
    }
}
