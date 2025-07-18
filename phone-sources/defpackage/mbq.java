package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.database.Cursor;
import com.google.android.apps.play.movies.common.service.pinning.PinBroadcastReceiver;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mbq implements Runnable {
    private final /* synthetic */ int a;
    private final Object b;
    private final Object c;
    private final Object d;
    private final Object e;
    private final Object f;
    private final Object g;
    private final Object h;

    public mbq(BroadcastReceiver.PendingResult pendingResult, Context context, isy isyVar, hfx hfxVar, ksn ksnVar, String str, lgr lgrVar, int i) {
        this.a = i;
        this.b = pendingResult;
        this.c = context;
        this.d = isyVar;
        this.e = hfxVar;
        this.g = ksnVar;
        this.f = str;
        this.h = lgrVar;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, lgr] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, lgr] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, lgr] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (this.a != 0) {
            Object obj = this.f;
            Object obj2 = this.g;
            PinBroadcastReceiver.e((Context) this.c, (isy) this.d, this.h, (hfx) this.e, (ksn) obj2, (String) obj);
            ((BroadcastReceiver.PendingResult) this.b).finish();
            return;
        }
        boolean z = false;
        try {
            Cursor cursorQuery = ((lyz) this.g).b().query("purchased_assets", mbp.a, (String) this.e, (String[]) this.f, null, null, null);
            boolean zD = false;
            while (cursorQuery.moveToNext()) {
                try {
                    try {
                        zD |= ktw.D((isy) this.h, ksn.b(cursorQuery.getString(0)), cursorQuery.getString(1), false);
                    } finally {
                    }
                } catch (Throwable th) {
                    th = th;
                    z = zD;
                    if (z) {
                        PinBroadcastReceiver.d((Context) this.b, this.c, (hfx) this.d);
                    }
                    throw th;
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            if (zD) {
                PinBroadcastReceiver.d((Context) this.b, this.c, (hfx) this.d);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public mbq(Context context, lyz lyzVar, isy isyVar, lgr lgrVar, hfx hfxVar, String str, String[] strArr, int i) {
        this.a = i;
        this.b = context;
        this.g = lyzVar;
        this.h = isyVar;
        this.c = lgrVar;
        this.d = hfxVar;
        this.e = str;
        this.f = strArr;
    }
}
