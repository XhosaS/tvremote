package defpackage;

import android.util.Log;

/* compiled from: PG */
/* loaded from: classes2.dex */
class aaxe implements zxe {
    final /* synthetic */ zyd a;
    final /* synthetic */ aaxz b;
    final /* synthetic */ aaxf c;

    public aaxe(aaxf aaxfVar, zyd zydVar, aaxz aaxzVar) {
        this.a = zydVar;
        this.b = aaxzVar;
        this.c = aaxfVar;
    }

    @Override // defpackage.zxe
    public final void a(Throwable th) {
        Log.e("ClientLoggingBackend", "Error while logging.", th);
    }

    @Override // defpackage.zxe
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        if (((Boolean) obj).booleanValue()) {
            zxn.p(this.a, wyo.f(new aaxd(this, this.b)), zwk.a);
        }
    }
}
