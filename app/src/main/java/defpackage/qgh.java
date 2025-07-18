package defpackage;

import android.util.Log;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qgh implements zxe {
    final /* synthetic */ String a;
    final /* synthetic */ long b;

    public qgh(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        Log.e("MDDTikTokTaskScheduler", "Failed to scheduled periodic tasks for MDD lib " + this.a + " " + this.b);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        Log.d("MDDTikTokTaskScheduler", "Successfully scheduled periodic tasks for MDD lib " + this.a + " period " + this.b + " UUID " + String.valueOf((UUID) obj));
    }
}
