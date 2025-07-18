package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class msr {
    public final ldv a;
    public final lzz b;
    public final Executor c;
    public final Executor d;
    public final lfn e;
    public final SharedPreferences f;
    public final xhw g;
    public final idf h;
    public final Handler i = new Handler(Looper.getMainLooper());
    public ieg j = null;
    public ieg k = null;
    public String l = "$ORIGINAL";
    public final lfz m;

    public msr(ldv ldvVar, lfz lfzVar, lzz lzzVar, Executor executor, Executor executor2, lfn lfnVar, SharedPreferences sharedPreferences, xhw xhwVar, idf idfVar) {
        this.a = ldvVar;
        this.m = lfzVar;
        this.b = lzzVar;
        this.c = executor;
        this.d = executor2;
        this.e = lfnVar;
        this.f = sharedPreferences;
        this.g = xhwVar;
        this.h = idfVar;
    }

    public static ieg a(nqj nqjVar) {
        if (nqjVar == null || nqjVar.e() == null) {
            return ieg.a;
        }
        String strA = nqjVar.e().a();
        try {
            return ieg.f(ksy.d(strA));
        } catch (IllegalArgumentException unused) {
            krd.b(String.format("Invalid asset id format found in RemoteMediaClient: %s", strA));
            return ieg.b;
        }
    }

    public static void b() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeNoException();
        parcelObtain.recycle();
    }
}
