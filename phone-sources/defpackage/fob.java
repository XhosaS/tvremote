package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.media.metrics.MediaMetricsManager;
import android.os.Bundle;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class fob implements Runnable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ fob(Context context, boolean z, eiz eizVar, elk elkVar, int i) {
        this.e = i;
        this.c = context;
        this.a = true;
        this.b = eizVar;
        this.d = elkVar;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.lang.Runnable
    public final void run() {
        int i = this.e;
        if (i == 0) {
            boolean z = this.a;
            Object obj = this.c;
            Object obj2 = this.b;
            if (z) {
                final fqw fqwVar = new fqw("androidx.media3.session.NOTIFICATION_DISMISSED_EVENT_KEY", Bundle.EMPTY);
                final Bundle bundle = Bundle.EMPTY;
                ((foo) obj2).u((fnw) obj, new fon() { // from class: fnz
                    @Override // defpackage.fon
                    public final void a(fnv fnvVar, int i2) {
                        int i3 = foo.y;
                        fnvVar.g(i2, fqwVar, bundle);
                    }
                });
            }
            this.d.run();
            ((foo) obj2).x.d.p((fnw) obj);
            return;
        }
        if (i == 1) {
            Context context = (Context) this.c;
            MediaMetricsManager mediaMetricsManagerM346m = elk$$ExternalSyntheticApiModelOutline0.m346m(context.getSystemService("media_metrics"));
            elh elhVar = mediaMetricsManagerM346m != null ? new elh(context, mediaMetricsManagerM346m.createPlaybackSession()) : null;
            if (elhVar == null) {
                edb.e("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return;
            } else {
                ((eiz) this.b).aq(elhVar);
                ((elk) this.d).b(elhVar.a.getSessionId());
                return;
            }
        }
        if (i == 2) {
            foo fooVar = ((fog) this.d).d;
            fki.s(fooVar.q, (fnx) this.b);
            edt.aF(fooVar.q);
            if (this.a) {
                fooVar.x((fnw) this.c);
                return;
            }
            return;
        }
        if (i == 3) {
            Object obj3 = this.b;
            foo fooVar2 = ((foz) this.d).c.b;
            fqt fqtVar = fooVar2.q;
            fki.s(fqtVar, (fnx) obj3);
            int iBf = fqtVar.bf();
            if (iBf == 1) {
                if (fqtVar.q(2)) {
                    fqtVar.W();
                }
            } else if (iBf == 4 && fqtVar.q(4)) {
                fqtVar.j();
            }
            boolean z2 = this.a;
            if (z2 && fqtVar.q(1)) {
                fqtVar.f();
            }
            Object obj4 = this.c;
            int[] iArr = eaj.a;
            rin rinVar = new rin(null, null);
            rinVar.l(31, 2);
            eaj.c(1, z2, rinVar);
            eaj.a(rinVar);
            fooVar2.x((fnw) obj4);
            return;
        }
        if (i != 4) {
            Object obj5 = this.d;
            quy quyVar = (quy) this.b;
            qva qvaVarO = quyVar.o(obj5);
            String str = qvaVarO.a;
            uzl uzlVarS = quy.s(qvaVarO, this.a);
            quyVar.j = str;
            qvg.b((View) this.c, quyVar.j, uzlVarS, quyVar.i);
            return;
        }
        Object obj6 = this.c;
        Object obj7 = this.b;
        boolean z3 = this.a;
        Object obj8 = this.d;
        lmy lmyVar = (lmy) obj8;
        SQLiteDatabase sQLiteDatabaseA = lmyVar.j.a();
        try {
            sQLiteDatabaseA.update("purchased_assets", (ContentValues) obj6, "account = ? AND asset_type IN (6,20) AND asset_id = ?", new String[]{((ksn) obj7).a, ((lmy) obj8).e});
            lmyVar.j.f(sQLiteDatabaseA, true, 11);
            if (z3) {
                lmyVar.b();
            }
        } catch (Throwable th) {
            lmyVar.j.f(sQLiteDatabaseA, false, 11);
            if (z3) {
                lmyVar.b();
            }
            throw th;
        }
    }

    public /* synthetic */ fob(foo fooVar, boolean z, fnw fnwVar, Runnable runnable, int i) {
        this.e = i;
        this.b = fooVar;
        this.a = z;
        this.c = fnwVar;
        this.d = runnable;
    }

    public /* synthetic */ fob(Object obj, fnx fnxVar, boolean z, fnw fnwVar, int i) {
        this.e = i;
        this.d = obj;
        this.b = fnxVar;
        this.a = z;
        this.c = fnwVar;
    }

    public /* synthetic */ fob(lmy lmyVar, ContentValues contentValues, ksn ksnVar, boolean z, int i) {
        this.e = i;
        this.d = lmyVar;
        this.c = contentValues;
        this.b = ksnVar;
        this.a = z;
    }

    public /* synthetic */ fob(quy quyVar, Object obj, View view, boolean z, int i) {
        this.e = i;
        this.b = quyVar;
        this.d = obj;
        this.c = view;
        this.a = z;
    }
}
