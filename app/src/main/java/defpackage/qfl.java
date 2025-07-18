package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class qfl implements zxe {
    final /* synthetic */ rgi a;

    public qfl(rgi rgiVar) {
        this.a = rgiVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        Log.e("PhFileGroupPop", "Failed to add file group", th);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        String str = ((pgr) this.a.b()).c;
        if (((Boolean) obj).booleanValue()) {
            Log.d("PhFileGroupPop", "Added file groups ".concat(String.valueOf(str)));
        } else {
            Log.e("PhFileGroupPop", "Failed to add file group ".concat(String.valueOf(str)));
        }
    }
}
