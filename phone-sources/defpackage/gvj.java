package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.media.DeniedByServerException;
import android.media.MediaDrm;
import android.media.NotProvisionedException;
import android.os.Handler;
import android.os.StrictMode;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.TextView;
import com.google.android.libraries.mediahome.providers.video.VideoProvider;
import com.google.android.libraries.mediahome.providers.video.broadcastreceivers.BootCompletedReceiver;
import com.google.android.tv.remote.virtual.ui.assistant.VirtualRemoteAssistantButton;
import com.google.android.videos.R;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class gvj implements Runnable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public gvj(gua guaVar, String str, int i) {
        this.c = i;
        this.a = guaVar;
        this.b = str;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [gsx, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r0v30, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r0v35, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v84, types: [ith, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.lang.Object, java.lang.Runnable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [itj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v21, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r2v46, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r2v83, types: [idy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Iterable, java.lang.Object] */
    @Override // java.lang.Runnable
    public final void run() {
        Object next;
        int i = 5;
        int i2 = 2;
        guw guwVar = null;
        switch (this.c) {
            case 0:
                String string = ((UUID) this.b).toString();
                string.getClass();
                fki.ax((grs) this.a, string);
                return;
            case 1:
                gqr gqrVar = ((gua) this.a).b.e;
                Object obj = gqrVar.i;
                Object obj2 = this.b;
                synchronized (obj) {
                    gsb gsbVarB = gqrVar.b((String) obj2);
                    if (gsbVarB != null) {
                        guwVar = gsbVarB.a;
                    }
                }
                if (guwVar == null || !guwVar.c()) {
                    return;
                }
                ?? r0 = this.a;
                synchronized (((gua) r0).c) {
                    ((gua) r0).f.put(fki.aM(guwVar), guwVar);
                    ((gua) r0).g.put(fki.aM(guwVar), gta.a(((gua) r0).j, guwVar, (yot) ((gua) r0).i.d, r0));
                }
                return;
            case 2:
                hia hiaVar = (hia) this.a;
                qtx qtxVar = hiaVar.p;
                if (hiaVar.p.c != null) {
                    ((pku) hiaVar.p.c).d((hij) this.b, ImmutableList.of());
                    return;
                } else {
                    hiy.e("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 3:
                ?? r02 = this.b;
                if (r02.isDone() || r02.isCancelled()) {
                    return;
                }
                ?? r2 = this.a;
                r02.cancel(true);
                hiy.e("BillingClient", "Async task is taking too long, cancel it!");
                if (r2 != 0) {
                    r2.run();
                    return;
                }
                return;
            case 4:
                Object obj3 = this.a;
                hij hijVar = hik.h;
                ((hia) obj3).u(24, 7, hijVar);
                ImmutableList immutableListOf = ImmutableList.of();
                ImmutableList.of();
                ((kmf) this.b).c(hijVar, new hfw(immutableListOf));
                return;
            case 5:
                if (((hpc) this.a).a) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.b.run();
                    return;
                } catch (Throwable th) {
                    if (Log.isLoggable("GlideExecutor", 6)) {
                        Log.e("GlideExecutor", "Request threw uncaught throwable", th);
                        return;
                    }
                    return;
                }
            case 6:
                this.b.a(this.a);
                return;
            case 7:
                this.b.a(this.a);
                return;
            case 8:
                ?? r03 = this.b;
                iui iuiVar = (iui) this.a;
                iuf iufVar = iuiVar.d;
                if (iufVar == null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : r03) {
                        if (((Boolean) iuiVar.e.a((ith) obj4)).booleanValue()) {
                            arrayList.add(obj4);
                        }
                    }
                    sqg sqgVar = iuiVar.i;
                    View viewFindViewById = sqgVar.findViewById(R.id.bottomsheet_title);
                    if (viewFindViewById == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    TextView textView = (TextView) viewFindViewById;
                    View viewFindViewById2 = sqgVar.findViewById(R.id.device_list_header_text);
                    if (viewFindViewById2 == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    iub iubVar = iuiVar.j;
                    TextView textView2 = (TextView) viewFindViewById2;
                    iubVar.clear();
                    iubVar.addAll(arrayList);
                    if (arrayList.isEmpty()) {
                        textView.setText(R.string.bottom_sheet_title_searching);
                        textView2.setVisibility(8);
                    } else {
                        textView.setText(R.string.bottom_sheet_title_select_device);
                        textView2.setVisibility(0);
                    }
                    iubVar.notifyDataSetChanged();
                    ith ithVarE = iuiVar.c.e();
                    if (ithVarE == null || yks.e(iuiVar.g, ithVarE) || !((Boolean) iuiVar.e.a(ithVarE)).booleanValue()) {
                        return;
                    }
                    iuiVar.c();
                    return;
                }
                View viewFindViewById3 = iuiVar.i.findViewById(R.id.bottomsheet_title);
                if (viewFindViewById3 == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                ((TextView) viewFindViewById3).setText(R.string.bottom_sheet_title_targeting);
                Iterator it = r03.iterator();
                while (true) {
                    if (it.hasNext()) {
                        next = it.next();
                        fux fuxVarA = ((ith) next).a();
                        if (yks.e(fuxVarA != null ? fuxVarA.d : null, iufVar.a)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ith iueVar = (ith) next;
                if (iueVar == null) {
                    iueVar = new iue(iufVar.b);
                }
                iub iubVar2 = iuiVar.j;
                iubVar2.clear();
                iubVar2.add(iueVar);
                iubVar2.notifyDataSetChanged();
                if (!iuiVar.h && iueVar.b() != null) {
                    krd.e("Found targeted device " + iueVar.d() + ". Making the switch.");
                    iuiVar.h = true;
                    iuiVar.c.k(iueVar);
                    iuiVar.c();
                }
                ith ithVarE2 = iuiVar.c.e();
                if ((ithVarE2 != null ? ((iua) ithVarE2).j : null) != null) {
                    String str = iufVar.a;
                    fux fuxVarA2 = iueVar.a();
                    if (yks.e(str, fuxVarA2 != null ? fuxVarA2.d : null)) {
                        iuiVar.c();
                        return;
                    }
                    return;
                }
                return;
            case 9:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = this.b.iterator();
                while (true) {
                    Object obj5 = this.a;
                    if (!it2.hasNext()) {
                        iul iulVar = (iul) obj5;
                        sqg sqgVar2 = iulVar.h;
                        View viewFindViewById4 = sqgVar2.findViewById(R.id.bottomsheet_title);
                        if (viewFindViewById4 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        TextView textView3 = (TextView) viewFindViewById4;
                        View viewFindViewById5 = sqgVar2.findViewById(R.id.device_list_header_text);
                        if (viewFindViewById5 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        iub iubVar3 = iulVar.i;
                        TextView textView4 = (TextView) viewFindViewById5;
                        iubVar3.clear();
                        iubVar3.addAll(arrayList2);
                        if (arrayList2.isEmpty()) {
                            textView3.setText(R.string.bottom_sheet_title_searching);
                            textView4.setVisibility(8);
                        } else {
                            textView3.setText(R.string.bottom_sheet_title_select_device);
                            textView4.setVisibility(0);
                        }
                        iubVar3.notifyDataSetChanged();
                        ith ithVarE3 = iulVar.c.e();
                        if (ithVarE3 == null || yks.e(iulVar.f, ithVarE3) || !((Boolean) iulVar.d.a(ithVarE3)).booleanValue() || !iulVar.g.compareAndSet(false, true)) {
                            return;
                        }
                        Handler handler = iulVar.e;
                        handler.removeCallbacksAndMessages(null);
                        handler.postDelayed(new iuc(obj5, 4), 1000L);
                        return;
                    }
                    Object next2 = it2.next();
                    if (((Boolean) ((iul) obj5).d.a((ith) next2)).booleanValue()) {
                        arrayList2.add(next2);
                    }
                }
                break;
            case 10:
                VirtualRemoteAssistantButton virtualRemoteAssistantButtonF = ((ivp) this.a).f();
                if (!virtualRemoteAssistantButtonF.a()) {
                    virtualRemoteAssistantButtonF.performHapticFeedback(3);
                }
                ?? r22 = this.b;
                nby nbyVar = virtualRemoteAssistantButtonF.b;
                if (!r22.isEmpty() && !VirtualRemoteAssistantButton.a.contains(r22.get(0))) {
                    i2 = 7;
                }
                nbyVar.e(i2, false);
                virtualRemoteAssistantButtonF.c = 0;
                return;
            case 11:
                ((taz) this.b).h();
                this.a.h();
                return;
            case 12:
                Object obj6 = this.b;
                jdd jddVar = (jdd) obj6;
                jddVar.j().a.O(jddVar.I, (enr) this.a, new izc(obj6, i));
                return;
            case 13:
                ((jgv) this.b).f.f(jgv.g((joz) this.a));
                return;
            case 14:
                Object obj7 = this.a;
                kko kkoVar = (kko) obj7;
                kkoVar.a.start();
                Object obj8 = this.b;
                ArrayList arrayList3 = (ArrayList) obj8;
                Iterator it3 = arrayList3.iterator();
                it3.getClass();
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    next3.getClass();
                    sei seiVar = (sei) next3;
                    Object obj9 = seiVar.e;
                    int i3 = seiVar.a;
                    int i4 = seiVar.b;
                    int i5 = seiVar.c;
                    int i6 = seiVar.d;
                    RecyclerView.ViewHolder viewHolder = (RecyclerView.ViewHolder) obj9;
                    View view = viewHolder.itemView;
                    view.getClass();
                    int i7 = i5 - i3;
                    if (i7 != 0) {
                        view.animate().translationX(0.0f);
                    }
                    int i8 = i6 - i4;
                    if (i8 != 0) {
                        view.animate().translationY(0.0f);
                    }
                    ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
                    kkoVar.f.add(obj9);
                    viewPropertyAnimatorAnimate.setDuration(((RecyclerView.ItemAnimator) obj7).getMoveDuration()).setListener(new kkm(kkoVar, viewHolder, i7, view, i8, viewPropertyAnimatorAnimate)).start();
                }
                arrayList3.clear();
                kkoVar.c.remove(obj8);
                return;
            case 15:
                Object obj10 = this.b;
                ArrayList arrayList4 = (ArrayList) obj10;
                Iterator it4 = arrayList4.iterator();
                it4.getClass();
                while (true) {
                    Object obj11 = this.a;
                    if (!it4.hasNext()) {
                        arrayList4.clear();
                        ((kko) obj11).d.remove(obj10);
                        return;
                    }
                    Object next4 = it4.next();
                    next4.getClass();
                    kki kkiVar = (kki) next4;
                    RecyclerView.ViewHolder viewHolder2 = kkiVar.a;
                    View view2 = viewHolder2 != null ? viewHolder2.itemView : null;
                    RecyclerView.ViewHolder viewHolder3 = kkiVar.b;
                    View view3 = viewHolder3 != null ? viewHolder3.itemView : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(((RecyclerView.ItemAnimator) obj11).getChangeDuration());
                        duration.getClass();
                        kko kkoVar2 = (kko) obj11;
                        kkoVar2.h.add(kkiVar.a);
                        duration.translationX(kkiVar.e - kkiVar.c);
                        duration.translationY(kkiVar.f - kkiVar.d);
                        duration.alpha(0.0f).setListener(new kkk(kkoVar2, kkiVar, duration, view2)).start();
                    }
                    if (view3 != null) {
                        kko kkoVar3 = (kko) obj11;
                        ArrayList arrayList5 = kkoVar3.h;
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2 = view3.animate();
                        arrayList5.add(kkiVar.b);
                        viewPropertyAnimatorAnimate2.translationX(0.0f).translationY(0.0f).setDuration(((RecyclerView.ItemAnimator) obj11).getChangeDuration()).alpha(1.0f).setListener(new kkl(kkoVar3, kkiVar, viewPropertyAnimatorAnimate2, view3)).start();
                    }
                }
            case 16:
                Object obj12 = this.b;
                ArrayList arrayList6 = (ArrayList) obj12;
                Iterator it5 = arrayList6.iterator();
                it5.getClass();
                while (true) {
                    Object obj13 = this.a;
                    if (!it5.hasNext()) {
                        arrayList6.clear();
                        ((kko) obj13).b.remove(obj12);
                        return;
                    }
                    Object next5 = it5.next();
                    next5.getClass();
                    RecyclerView.ViewHolder viewHolder4 = (RecyclerView.ViewHolder) next5;
                    View view4 = viewHolder4.itemView;
                    view4.getClass();
                    kko kkoVar4 = (kko) obj13;
                    ArrayList arrayList7 = kkoVar4.e;
                    ViewPropertyAnimator viewPropertyAnimatorAnimate3 = view4.animate();
                    arrayList7.add(viewHolder4);
                    viewPropertyAnimatorAnimate3.alpha(1.0f).setDuration(((RecyclerView.ItemAnimator) obj13).getAddDuration()).setListener(new kkj(kkoVar4, viewHolder4, view4, viewPropertyAnimatorAnimate3)).start();
                }
            case 17:
                kqy kqyVar = (kqy) this.b;
                Object obj14 = kqyVar.r;
                ieg iegVar = (ieg) this.a;
                ((lfx) obj14).e(iegVar, mep.a);
                ((omm) kqyVar.o).i(iegVar.m() ? ((ksn) iegVar.g()).a : "", 3);
                Context applicationContext = ((Context) kqyVar.b).getApplicationContext();
                ComponentName componentName = new ComponentName(applicationContext, VideoProvider.class.getName());
                ComponentName componentName2 = new ComponentName(applicationContext, BootCompletedReceiver.class.getName());
                PackageManager packageManager = applicationContext.getPackageManager();
                int componentEnabledSetting = packageManager.getComponentEnabledSetting(componentName);
                int componentEnabledSetting2 = packageManager.getComponentEnabledSetting(componentName2);
                if (!xcz.a.get().a(applicationContext)) {
                    if (ocv.by(componentEnabledSetting)) {
                        packageManager.setComponentEnabledSetting(componentName, 2, 0);
                    }
                    if (ocv.by(componentEnabledSetting2)) {
                        packageManager.setComponentEnabledSetting(componentName2, 2, 0);
                        return;
                    }
                    return;
                }
                if (!ocv.by(componentEnabledSetting)) {
                    packageManager.setComponentEnabledSetting(componentName, 1, 0);
                }
                if (!ocv.by(componentEnabledSetting2)) {
                    packageManager.setComponentEnabledSetting(componentName2, 1, 0);
                }
                psc pscVar = new psc();
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addDataScheme("package");
                intentFilter.addAction("android.intent.action.PACKAGE_ADDED");
                czi.f(applicationContext, pscVar, intentFilter, 2);
                pse pseVar = new pse();
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addDataScheme("package");
                intentFilter2.addAction("android.intent.action.PACKAGE_CHANGED");
                intentFilter2.addAction("android.intent.action.PACKAGE_FULLY_REMOVED");
                czi.f(applicationContext, pseVar, intentFilter2, 2);
                return;
            case 18:
                this.a.c(this.b);
                return;
            case 19:
                lfx lfxVar = (lfx) this.b;
                for (ksn ksnVar : lfxVar.a.a()) {
                    Object obj15 = this.a;
                    ieg iegVar2 = (ieg) obj15;
                    if (!iegVar2.m() || !ksnVar.equals(iegVar2.g())) {
                        lfxVar.d(ksnVar, lfxVar.b(ksnVar).c);
                    }
                }
                return;
            default:
                lmi lmiVar = ((lgy) this.a).h;
                lnr lnrVar = lmiVar.h;
                if (lnrVar.q) {
                    Object obj16 = this.b;
                    if (obj16 instanceof MediaDrm.MediaDrmStateException) {
                        lnrVar.T(24, llx.c(((MediaDrm.MediaDrmStateException) obj16).getDiagnosticInfo()), (Throwable) obj16, lmiVar.a());
                        return;
                    }
                    if (obj16 instanceof lzk) {
                        lnrVar.T(5, ((lzk) obj16).a, (Throwable) obj16, lmiVar.a());
                        return;
                    }
                    if (obj16 instanceof lgp) {
                        lgp lgpVar = (lgp) obj16;
                        Throwable cause = lgpVar.getCause();
                        lnrVar.T(23, llx.c(cause instanceof MediaDrm.MediaDrmStateException ? ((MediaDrm.MediaDrmStateException) cause).getDiagnosticInfo() : lgpVar.getMessage()), (Throwable) obj16, lmiVar.a());
                        return;
                    } else {
                        if (obj16 instanceof lgs) {
                            lnrVar.T(30, 0, (Throwable) obj16, lmiVar.a());
                            return;
                        }
                        int i9 = obj16 instanceof lgt ? 20 : obj16 instanceof NotProvisionedException ? 21 : obj16 instanceof DeniedByServerException ? 22 : 19;
                        Throwable th2 = (Throwable) obj16;
                        lnrVar.T(i9, llx.b(th2.getMessage()), th2, lmiVar.a());
                        return;
                    }
                }
                return;
        }
    }

    public gvj(hpc hpcVar, Runnable runnable, int i) {
        this.c = i;
        this.b = runnable;
        this.a = hpcVar;
    }

    public /* synthetic */ gvj(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ gvj(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public gvj(tbb tbbVar, ith ithVar, int i) {
        this.c = i;
        this.b = tbbVar;
        this.a = ithVar;
    }
}
