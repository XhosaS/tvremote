package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ScrollCaptureSession;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;
import com.google.android.apps.googletv.app.presentation.pages.launcher.GtvLauncherActivity;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ajo extends yiz implements yjz {
    int a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    final /* synthetic */ Object d;
    final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(ajq ajqVar, alg algVar, bte bteVar, yjk yjkVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = ajqVar;
        this.c = algVar;
        this.d = bteVar;
        this.e = yjkVar;
    }

    @Override // defpackage.yjz
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        switch (this.f) {
            case 0:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 1:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 2:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 3:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 4:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 5:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 6:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 7:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 8:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 9:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 10:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 11:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 12:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 13:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 14:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 15:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 16:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 17:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 18:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            case 19:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
            default:
                return ((ajo) create((yow) obj, (yih) obj2)).invokeSuspend(ygi.a);
        }
    }

    /* JADX WARN: Type inference failed for: r4v35, types: [java.lang.Object, kmo] */
    /* JADX WARN: Type inference failed for: r6v0, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v10, types: [gpe, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r6v3, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v31, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r6v4, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r7v1, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r7v14, types: [gwj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v15, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r7v2, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v3, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v4, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object, yjz] */
    @Override // defpackage.yit
    public final yih create(Object obj, yih yihVar) {
        switch (this.f) {
            case 0:
                Object obj2 = this.b;
                return new ajo((ajq) obj2, (alg) this.c, (bte) this.d, (yjk) this.e, yihVar, 0);
            case 1:
                return new ajo(this.e, (mr) this.b, (bdy) this.c, (bdy) this.d, yihVar, 1);
            case 2:
                Object obj3 = this.c;
                return new ajo((cvi) obj3, (aid) this.b, (yow) this.e, (bdy) this.d, yihVar, 2);
            case 3:
                Object obj4 = this.b;
                return new ajo((mr) obj4, (bdl) this.e, (bcb) this.d, (bcb) this.c, yihVar, 3);
            case 4:
                Object obj5 = this.b;
                return new ajo((mr) obj5, (bdl) this.e, this.d, this.c, yihVar, 4, null);
            case 5:
                Object obj6 = this.d;
                Object obj7 = this.c;
                Object obj8 = this.b;
                ?? r7 = this.e;
                return new ajo((cel) obj6, ajo$$ExternalSyntheticApiModelOutline1.m60m(obj7), (Rect) obj8, (Consumer) r7, yihVar, 5);
            case 6:
                Object obj9 = this.c;
                Object obj10 = this.b;
                return new ajo((dsn) obj9, (Context) obj10, (Throwable) this.e, (dti) this.d, yihVar, 6);
            case 7:
                Object obj11 = this.c;
                return new ajo((dti) obj11, (czt) this.b, (yow) this.e, (yjz) this.d, yihVar, 7);
            case 8:
                Object obj12 = this.d;
                return new ajo((gpm) obj12, (guw) this.e, (gpe) this.c, (Context) this.b, yihVar, 8);
            case 9:
                Object obj13 = this.b;
                Object obj14 = this.c;
                return new ajo((cb) obj13, (guw) obj14, (AtomicInteger) this.e, (uhp) this.d, yihVar, 9);
            case 10:
                Object obj15 = this.e;
                Object obj16 = this.b;
                return new ajo((ConstraintTrackingWorker) obj15, (gpm) obj16, (cb) this.c, (guw) this.d, yihVar, 10);
            case 11:
                Object obj17 = this.d;
                Object obj18 = this.c;
                return new ajo((gzu) obj17, (riv) obj18, (haj) this.e, (gwj) this.b, yihVar, 11);
            case 12:
                Object obj19 = this.d;
                Object obj20 = this.b;
                return new ajo((isi) obj19, (ieg) obj20, (iod) this.c, (yjv) this.e, yihVar, 12);
            case 13:
                Object obj21 = this.b;
                Object obj22 = this.e;
                return new ajo((isn) obj21, (String) obj22, (vwe) this.c, (wll) this.d, yihVar, 13);
            case 14:
                Object obj23 = this.d;
                Object obj24 = this.b;
                return new ajo((ixt) obj23, (View) obj24, (ssn) this.e, (ixp) this.c, yihVar, 14);
            case 15:
                Object obj25 = this.b;
                Object obj26 = this.d;
                return new ajo((jkh) obj25, (jfr) obj26, (jfj) this.c, (jfr) this.e, yihVar, 15);
            case 16:
                Object obj27 = this.e;
                Object obj28 = this.b;
                return new ajo((EntityPageActivity) obj27, (Drawable) obj28, (Drawable) this.c, (Drawable) this.d, yihVar, 16);
            case 17:
                Object obj29 = this.d;
                Object obj30 = this.e;
                return new ajo((GtvLauncherActivity) obj29, (String) obj30, (GtvLauncherActivity) this.c, (Bundle) this.b, yihVar, 17);
            case 18:
                ?? r4 = this.d;
                Object obj31 = this.c;
                return new ajo((kmo) r4, (View) obj31, (Context) this.b, (SherlogMenuButton) this.e, yihVar, 18);
            case 19:
                Object obj32 = this.b;
                Object obj33 = this.c;
                return new ajo((pub) obj32, (qen) obj33, (vma) this.d, (Map) this.e, yihVar, 19);
            default:
                Object obj34 = this.c;
                Object obj35 = this.d;
                return new ajo((pzx) obj34, (qen) obj35, (Bundle) this.b, (Long) this.e, yihVar, 20);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0283, code lost:
    
        if (r15 == r0) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d2, code lost:
    
        if (((defpackage.ysx) r15).a(r6, r14) == r0) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r10v1, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r12v1, types: [gwj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v10, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v14, types: [bdy, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v153, types: [java.lang.Object, kmo] */
    /* JADX WARN: Type inference failed for: r15v47, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v48, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v60, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r15v64, types: [java.lang.Object, yow] */
    /* JADX WARN: Type inference failed for: r15v76, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r15v85, types: [java.lang.Object, uhp] */
    /* JADX WARN: Type inference failed for: r1v2, types: [bte, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, yfo] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object, yow] */
    @Override // defpackage.yit
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 1618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ajo.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(ConstraintTrackingWorker constraintTrackingWorker, gpm gpmVar, cb cbVar, guw guwVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = constraintTrackingWorker;
        this.b = gpmVar;
        this.c = cbVar;
        this.d = guwVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(cb cbVar, guw guwVar, AtomicInteger atomicInteger, uhp uhpVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = cbVar;
        this.c = guwVar;
        this.e = atomicInteger;
        this.d = uhpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(cel celVar, ScrollCaptureSession scrollCaptureSession, Rect rect, Consumer consumer, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = celVar;
        this.c = scrollCaptureSession;
        this.b = rect;
        this.e = consumer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(EntityPageActivity entityPageActivity, Drawable drawable, Drawable drawable2, Drawable drawable3, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = entityPageActivity;
        this.b = drawable;
        this.c = drawable2;
        this.d = drawable3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(GtvLauncherActivity gtvLauncherActivity, String str, GtvLauncherActivity gtvLauncherActivity2, Bundle bundle, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = gtvLauncherActivity;
        this.e = str;
        this.c = gtvLauncherActivity2;
        this.b = bundle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(cvi cviVar, aid aidVar, yow yowVar, bdy bdyVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = cviVar;
        this.b = aidVar;
        this.e = yowVar;
        this.d = bdyVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(dsn dsnVar, Context context, Throwable th, dti dtiVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = dsnVar;
        this.b = context;
        this.e = th;
        this.d = dtiVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(dti dtiVar, czt cztVar, yow yowVar, yjz yjzVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = dtiVar;
        this.b = cztVar;
        this.e = yowVar;
        this.d = yjzVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(gpm gpmVar, guw guwVar, gpe gpeVar, Context context, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = gpmVar;
        this.e = guwVar;
        this.c = gpeVar;
        this.b = context;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(gzu gzuVar, riv rivVar, haj hajVar, gwj gwjVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = gzuVar;
        this.c = rivVar;
        this.e = hajVar;
        this.b = gwjVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(isi isiVar, ieg iegVar, iod iodVar, yjv yjvVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = isiVar;
        this.b = iegVar;
        this.c = iodVar;
        this.e = yjvVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(isn isnVar, String str, vwe vweVar, wll wllVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = isnVar;
        this.e = str;
        this.c = vweVar;
        this.d = wllVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(ixt ixtVar, View view, ssn ssnVar, ixp ixpVar, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = ixtVar;
        this.b = view;
        this.e = ssnVar;
        this.c = ixpVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(Object obj, mr mrVar, bdy bdyVar, bdy bdyVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.e = obj;
        this.b = mrVar;
        this.c = bdyVar;
        this.d = bdyVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(jkh jkhVar, jfr jfrVar, jfj jfjVar, jfr jfrVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = jkhVar;
        this.d = jfrVar;
        this.c = jfjVar;
        this.e = jfrVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(kmo kmoVar, View view, Context context, SherlogMenuButton sherlogMenuButton, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.d = kmoVar;
        this.c = view;
        this.b = context;
        this.e = sherlogMenuButton;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(mr mrVar, bdl bdlVar, bcb bcbVar, bcb bcbVar2, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = mrVar;
        this.e = bdlVar;
        this.d = bcbVar;
        this.c = bcbVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(mr mrVar, bdl bdlVar, bcb bcbVar, bcb bcbVar2, yih yihVar, int i, byte[] bArr) {
        super(2, yihVar);
        this.f = i;
        this.b = mrVar;
        this.e = bdlVar;
        this.d = bcbVar;
        this.c = bcbVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(pub pubVar, qen qenVar, vma vmaVar, Map map, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.b = pubVar;
        this.c = qenVar;
        this.d = vmaVar;
        this.e = map;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ajo(pzx pzxVar, qen qenVar, Bundle bundle, Long l, yih yihVar, int i) {
        super(2, yihVar);
        this.f = i;
        this.c = pzxVar;
        this.d = qenVar;
        this.b = bundle;
        this.e = l;
    }
}
