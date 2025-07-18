package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryChargingProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$BatteryNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$NetworkStateProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxy$StorageNotLowProxy;
import androidx.work.impl.background.systemalarm.ConstraintProxyUpdateReceiver;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class bd implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public bd(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult, int i) {
        this.d = i;
        this.b = intent;
        this.a = context;
        this.c = pendingResult;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r1v29, types: [eoz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r1v56, types: [android.view.ViewTreeObserver$OnDrawListener, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r2v24, types: [els, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v31, types: [fcf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, yoe] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yjz] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue = true;
        boolean z = true;
        switch (this.d) {
            case 0:
                bh bhVar = (bh) this.c;
                ir irVar = bhVar.e;
                cz.a(((C0038do) this.a).a, ((C0038do) this.b).a, bhVar.f, irVar, false);
                return;
            case 1:
                int i = ax.e;
                ((ViewGroup) this.b).endViewTransition((View) this.a);
                Object obj = this.c;
                ((ay) obj).a.a.f((dm) obj);
                return;
            case 2:
                Pair pair = (Pair) this.c;
                int iIntValue = ((Integer) pair.first).intValue();
                evz evzVar = (evz) pair.second;
                evzVar.getClass();
                ((ejs) this.a).a.j.di(iIntValue, evzVar, (evv) this.b);
                return;
            case 3:
                Pair pair2 = (Pair) this.c;
                ((ejs) this.a).a.j.f(((Integer) pair2.first).intValue(), (evz) pair2.second, (Exception) this.b);
                return;
            case 4:
                Pair pair3 = (Pair) this.c;
                ((ejs) this.a).a.j.cX(((Integer) pair3.first).intValue(), (evz) pair3.second, (evv) this.b);
                return;
            case 5:
                String str = edt.a;
                ((dwi) this.b).a.b((dze) this.c, (ehx) this.a);
                return;
            case 6:
                this.a.f(0, (evz) ((eph) this.c).c, (Exception) this.b);
                return;
            case 7:
                String str2 = edt.a;
                ((epm) this.b).b.cR((dze) this.c, (ehx) this.a);
                return;
            case 8:
                foh fohVar = (foh) this.b;
                foo fooVar = fohVar.b;
                fnw fnwVar = (fnw) this.a;
                if (fooVar.r(fnwVar)) {
                    fooVar.q((KeyEvent) this.c, false, false);
                } else {
                    fph fphVar = fooVar.g;
                    fphVar.d(1, new fop(fphVar, 2), fnwVar.a, true);
                }
                fohVar.a = null;
                return;
            case 9:
                try {
                    ?? r5 = this.b;
                    ykr.n(((yof) r5).b.minusKey(yii.k), new gey((gex) this.c, (yoe) r5, (yjz) this.a, (yih) null, 0));
                    return;
                } catch (Throwable th) {
                    this.b.e(th);
                    return;
                }
            case 10:
                nxb.f((AtomicBoolean) this.a, (com) this.c, this.b);
                return;
            case 11:
                nxb.f((AtomicBoolean) this.a, (com) this.c, this.b);
                return;
            case 12:
                Object obj2 = this.a;
                ?? r1 = this.b;
                Object obj3 = this.c;
                try {
                    zBooleanValue = ((Boolean) r1.get()).booleanValue();
                } catch (InterruptedException | ExecutionException unused) {
                }
                synchronized (((gqr) obj3).i) {
                    gun gunVarA = ((gsb) obj2).a();
                    String str3 = gunVarA.a;
                    if (((gqr) obj3).b(str3) == obj2) {
                        ((gqr) obj3).a(str3);
                    }
                    gpn.b();
                    obj3.getClass().getSimpleName();
                    Iterator it = ((gqr) obj3).h.iterator();
                    while (it.hasNext()) {
                        ((gqg) it.next()).a(gunVarA, zBooleanValue);
                    }
                }
                return;
            case 13:
                ((gqr) ((fse) this.b).a).g((cb) this.a);
                return;
            case 14:
                try {
                    Object obj4 = this.b;
                    boolean booleanExtra = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra2 = ((Intent) obj4).getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                    boolean booleanExtra3 = ((Intent) obj4).getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                    boolean booleanExtra4 = ((Intent) obj4).getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                    gpn.b();
                    int i2 = ConstraintProxyUpdateReceiver.a;
                    Object obj5 = this.a;
                    gvo.a((Context) obj5, ConstraintProxy$BatteryNotLowProxy.class, booleanExtra);
                    gvo.a((Context) obj5, ConstraintProxy$BatteryChargingProxy.class, booleanExtra2);
                    gvo.a((Context) obj5, ConstraintProxy$StorageNotLowProxy.class, booleanExtra3);
                    gvo.a((Context) obj5, ConstraintProxy$NetworkStateProxy.class, booleanExtra4);
                    return;
                } finally {
                    ((BroadcastReceiver.PendingResult) this.c).finish();
                }
            case 15:
                Iterator it2 = ((WorkDatabase) this.c).D().i((String) this.b).iterator();
                while (it2.hasNext()) {
                    fki.ax((grs) this.a, (String) it2.next());
                }
                return;
            case 16:
                Iterator it3 = ((WorkDatabase) this.c).D().j((String) this.b).iterator();
                while (it3.hasNext()) {
                    fki.ax((grs) this.a, (String) it3.next());
                }
                return;
            case 17:
                ((hif) this.c).F((hfx) this.a, (kmf) this.b);
                return;
            case 18:
                hsg hsgVarA = hsg.a();
                hwp.g();
                hsgVarA.c.set(true);
                hua huaVar = ((htz) this.b).b;
                huaVar.b = true;
                ((View) this.c).getViewTreeObserver().removeOnDrawListener(this.a);
                huaVar.a.clear();
                return;
            case 19:
                Object obj6 = this.a;
                Object obj7 = this.c;
                Object obj8 = this.b;
                ikc ikcVar = new ikc(obj7, obj8, obj6, 6);
                iwz iwzVar = (iwz) obj8;
                iwzVar.i = ikcVar;
                yjv yjvVar = iwzVar.i;
                kff.q((Activity) obj7, mvn.class, "download_preference_key", yjvVar != null ? new kad(yjvVar, z ? 1 : 0) : null);
                return;
            default:
                Object obj9 = this.b;
                if (obj9 != null) {
                    Object obj10 = this.a;
                    ImageView imageView = (ImageView) this.c;
                    hjr.c(imageView.getContext()).b().f(obj9).h((huu) obj10).k(imageView);
                    return;
                }
                return;
        }
    }

    public /* synthetic */ bd(C0038do c0038do, C0038do c0038do2, bh bhVar, int i) {
        this.d = i;
        this.a = c0038do;
        this.b = c0038do2;
        this.c = bhVar;
    }

    public bd(htz htzVar, View view, ViewTreeObserver.OnDrawListener onDrawListener, int i) {
        this.d = i;
        this.c = view;
        this.a = onDrawListener;
        this.b = htzVar;
    }

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.b = obj;
        this.a = obj2;
        this.c = obj3;
    }

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, int i, byte[] bArr) {
        this.d = i;
        this.a = obj;
        this.c = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, int i, char[] cArr) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, int i, int[] iArr) {
        this.d = i;
        this.c = obj;
        this.a = obj2;
        this.b = obj3;
    }

    public /* synthetic */ bd(Object obj, Object obj2, Object obj3, int i, short[] sArr) {
        this.d = i;
        this.b = obj;
        this.c = obj2;
        this.a = obj3;
    }

    public bd(yoe yoeVar, gex gexVar, yjz yjzVar, int i) {
        this.d = i;
        this.b = yoeVar;
        this.c = gexVar;
        this.a = yjzVar;
    }
}
