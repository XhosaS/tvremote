package defpackage;

import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes2.dex */
class uke implements zxe {
    final /* synthetic */ AtomicBoolean a;

    public uke(AtomicBoolean atomicBoolean) {
        this.a = atomicBoolean;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        Log.v("ProtoDataStoreWithLams", "RPC failed", th);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        acpt acptVar = (acpt) obj;
        if (Log.isLoggable("ProtoDataStoreWithLams", 2)) {
            if (this.a.get()) {
                Log.v("ProtoDataStoreWithLams", "RPC skipped");
            } else {
                Log.v("ProtoDataStoreWithLams", "RPC response: ".concat(String.valueOf(String.valueOf(acptVar))));
            }
        }
    }
}
