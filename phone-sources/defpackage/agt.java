package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContextWrapper;
import android.net.Uri;
import android.view.DragEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class agt implements yjv {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ agt(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, yjv] */
    /* JADX WARN: Type inference failed for: r0v15, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [bxh, bxv, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v33, types: [bxh, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Iterable, java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v6, types: [bcb, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v7, types: [bxu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v49, types: [bxh, java.lang.Object] */
    @Override // defpackage.yjv
    public final Object a(Object obj) {
        so soVarA;
        so soVarA2;
        int i = 0;
        z = false;
        boolean z = false;
        Activity activity = null;
        switch (this.b) {
            case 0:
                this.a.b((bvc) obj);
                return ygi.a;
            case 1:
                Object obj2 = this.a;
                ((ags) obj2).c.d();
                return new gd(obj2, 9);
            case 2:
                this.a.b((bvc) obj);
                return ygi.a;
            case 3:
                ?? r0 = this.a;
                ((ahc) r0).a.a((bhi) obj, fh.P(r0, AndroidCompositionLocals_androidKt.c));
                return ygi.a;
            case 4:
                cak cakVar = (cak) obj;
                if (cakVar instanceof ahb) {
                    this.a.a(((ahb) cakVar).a);
                    return true;
                }
                if (!(cakVar instanceof ahd)) {
                    throw new IllegalStateException("TextContextMenuDataNode.TraverseKey key must only be attached to instances of TextContextMenuDataNode.");
                }
                throw null;
            case 5:
                ((yjv) obj).a(this.a);
                return ygi.a;
            case 6:
                return new gd(this.a, 10);
            case 7:
                this.a.b((bvc) obj);
                return ygi.a;
            case 8:
                return (cfx) ((ahx) this.a).a.get(((Integer) obj).intValue());
            case 9:
                bvc bvcVar = (bvc) obj;
                ajk ajkVar = (ajk) this.a;
                bmy bmyVarI = ajkVar.d.i();
                if (bmyVarI == null) {
                    bmyVarI = bmy.a;
                }
                bvc bvcVarK = ajkVar.k.k();
                if (bvcVarK != null) {
                    return (bvcVarK.s() && bvcVar.s()) ? d.w(bvcVar.i(bty.w(bvcVarK), bmyVarI.f()), bmyVarI.e()) : bmy.a;
                }
                wv.b("Required value was null.");
                throw new yfs();
            case 10:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                ajq ajqVar = (ajq) this.a;
                boolean z2 = ajqVar.c;
                if (!zBooleanValue) {
                    ajqVar.e();
                    akb akbVar = ajqVar.a;
                    aid aidVar = akbVar.a;
                    ahu ahuVar = akbVar.b;
                    aidVar.a.b().c();
                    ahw ahwVar = aidVar.a;
                    ahwVar.d();
                    akbVar.m(ahwVar);
                    aid.h(aidVar, true, 1);
                    ajqVar.a.g();
                } else if (z2) {
                    ajqVar.C();
                }
                ajqVar.v();
                return ygi.a;
            case 11:
                ?? r02 = this.a;
                kw kwVar = (kw) obj;
                if (sq.a(r02) != null) {
                    DragEvent dragEvent = (DragEvent) kwVar.a;
                    ClipData clipData = dragEvent.getClipData();
                    int itemCount = clipData.getItemCount();
                    while (true) {
                        if (i < itemCount) {
                            Uri uri = clipData.getItemAt(i).getUri();
                            if (uri == null || !yks.e(uri.getScheme(), "content")) {
                                i++;
                            } else if (((bko) r02).q.A) {
                                Object context = fh.E(r02).getContext();
                                while (true) {
                                    if (context instanceof ContextWrapper) {
                                        if (context instanceof Activity) {
                                            activity = (Activity) context;
                                        } else {
                                            context = ((ContextWrapper) context).getBaseContext();
                                        }
                                    }
                                }
                                if (activity != null) {
                                    activity.requestDragAndDropPermissions(dragEvent);
                                }
                            }
                        }
                    }
                }
                return ygi.a;
            case 12:
                wn wnVar = new wn();
                ?? r03 = this.a;
                ajq ajqVar2 = (ajq) r03;
                ajqVar2.o.i(wnVar);
                ajqVar2.h = wnVar;
                sp spVarA = sq.a(r03);
                if (spVarA != null && (soVarA = spVarA.a()) != null) {
                    soVarA.a();
                }
                return ygi.a;
            case 13:
                long jO = ((bmx) obj).a;
                ajq ajqVar3 = (ajq) this.a;
                bvc bvcVarJ = ajqVar3.p.j();
                if (bvcVarJ != null && bvcVarJ.s()) {
                    jO = bvcVarJ.o(jO);
                }
                int iG = ajqVar3.p.g(jO, true);
                if (iG >= 0) {
                    akb akbVar2 = ajqVar3.a;
                    long jN = ccf.N(iG, iG);
                    long j = chb.a;
                    akbVar2.j(jN);
                }
                ajqVar3.b.F(afo.a, jO);
                return ygi.a;
            case 14:
                ?? r12 = this.a;
                ajq ajqVar4 = (ajq) r12;
                ajqVar4.g();
                ajqVar4.b.u();
                sp spVarA2 = sq.a(r12);
                if (spVarA2 != null && (soVarA2 = spVarA2.a()) != null) {
                    soVarA2.b();
                }
                return ygi.a;
            case 15:
                ((ajq) this.a).g();
                return ygi.a;
            case 16:
                Object obj3 = this.a;
                ykr.q(((bko) obj3).F(), null, 4, new qd((afp) obj, (ajq) obj3, (yih) null, 14), 1);
                return ygi.a;
            case 17:
                List list = (List) obj;
                cgz cgzVarL = ((ajq) this.a).p.l();
                return Boolean.valueOf(cgzVarL != null ? list.add(cgzVarL) : false);
            case 18:
                ((ajq) this.a).a.i((cfy) obj);
                return true;
            case 19:
                akb.o(((ajq) this.a).a, (cfy) obj, true, 0, false, 12);
                return true;
            default:
                ClipDescription clipDescription = ((DragEvent) ((kw) obj).a).getClipDescription();
                ?? A = this.a.a();
                if (!(A instanceof Collection) || !A.isEmpty()) {
                    for (sn snVar : A) {
                        if (yks.e(snVar, sn.b) || clipDescription.hasMimeType(snVar.c)) {
                            z = true;
                        }
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
