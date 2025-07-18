package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class fff {
    public bq a;
    public String b;
    public String c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final Runnable e = new Runnable() { // from class: ffe
        @Override // java.lang.Runnable
        public final void run() {
            fff fffVar = this.a;
            fffVar.c();
            if (fffVar.a != null) {
                fffVar.b();
                fffVar.d();
            }
        }
    };
    public Runnable f;
    public boolean g;
    public boolean h;

    public abstract ffm a();

    public final void b() {
        bq bqVar = this.a;
        if (bqVar == null) {
            ((zdv) ffj.b.d().q("com/google/android/apps/tvsearch/controller/SearchController$OnDeviceLoading", "displayResponse", 1502, "SearchController.kt")).u("#displayResponse with null fragment");
            return;
        }
        if (a().D() == null) {
            ((zdv) ffj.b.d().q("com/google/android/apps/tvsearch/controller/SearchController$OnDeviceLoading", "displayResponse", 1494, "SearchController.kt")).u("#displayResponse tagged fragment is missing");
        }
        a().r(bqVar);
        this.a = null;
        if (this.h) {
            return;
        }
        d();
    }

    public abstract void c();

    public abstract void d();

    public final boolean e() {
        return (this.a == null || this.g) ? false : true;
    }
}
