package defpackage;

import android.content.SharedPreferences;
import com.google.android.apps.play.movies.mobile.usecase.watch.BootstrapWatchActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lrc implements idf {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ lrc(Object obj, Object obj2, Object obj3, int i) {
        this.d = i;
        this.c = obj;
        this.b = obj2;
        this.a = obj3;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v21, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v26, types: [android.content.SharedPreferences, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [idp, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v34, types: [idw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v37, types: [idf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v38, types: [iea, java.lang.Object] */
    @Override // defpackage.idf
    public final Object b(Object obj) {
        int i = 11;
        boolean z = false;
        z = false;
        z = false;
        int i2 = 1;
        switch (this.d) {
            case 0:
                lre lreVar = (lre) obj;
                vyi vyiVarB = ((lrf) this.a).b(lreVar);
                ieg iegVar = lreVar.a;
                xsq xsqVarA = vyf.c;
                if (xsqVarA == null) {
                    synchronized (vyf.class) {
                        xsqVarA = vyf.c;
                        if (xsqVarA == null) {
                            xsn xsnVarA = xsq.a();
                            xsnVarA.d = xsp.UNARY;
                            xsnVarA.e = xsq.c("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService", "GetPlaylist");
                            xsnVarA.b();
                            vyi vyiVar = vyi.a;
                            vtp vtpVar = yer.a;
                            xsnVarA.b = new yep(vyiVar);
                            xsnVarA.c = new yep(vyj.a);
                            xsqVarA = xsnVarA.a();
                            vyf.c = xsqVarA;
                        }
                    }
                }
                return ((lql) this.b).a(iegVar, vyiVarB, xsqVarA, new lqp(i)).e(new ljt(this.c, 5));
            case 1:
                return this.c.c(this.b.b(obj), this.a.b(obj));
            case 2:
                lrj lrjVar = (lrj) obj;
                vyl vylVarB = ((lrk) this.a).b(lrjVar);
                Object obj2 = ((kqd) lrjVar.a).a;
                xsq xsqVarA2 = vyf.a;
                if (xsqVarA2 == null) {
                    synchronized (vyf.class) {
                        xsqVarA2 = vyf.a;
                        if (xsqVarA2 == null) {
                            xsn xsnVarA2 = xsq.a();
                            xsnVarA2.d = xsp.UNARY;
                            xsnVarA2.e = xsq.c("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService", "GetRelated");
                            xsnVarA2.b();
                            vyl vylVar = vyl.a;
                            vtp vtpVar2 = yer.a;
                            xsnVarA2.b = new yep(vylVar);
                            xsnVarA2.c = new yep(vym.a);
                            xsqVarA2 = xsnVarA2.a();
                            vyf.a = xsqVarA2;
                        }
                    }
                }
                return ((lql) this.b).a((ieg) obj2, vylVarB, xsqVarA2, new lqp(12)).e(new ljt(this.c, 6));
            case 3:
                lrn lrnVar = (lrn) obj;
                vyn vynVarB = ((lro) this.a).b(lrnVar);
                ieg iegVar2 = lrnVar.a;
                xsq xsqVarA3 = vyf.b;
                if (xsqVarA3 == null) {
                    synchronized (vyf.class) {
                        xsqVarA3 = vyf.b;
                        if (xsqVarA3 == null) {
                            xsn xsnVarA3 = xsq.a();
                            xsnVarA3.d = xsp.UNARY;
                            xsnVarA3.e = xsq.c("google.internal.play.movies.dfe.v1beta.discovery.DiscoveryService", "Suggest");
                            xsnVarA3.b();
                            vyn vynVar = vyn.a;
                            vtp vtpVar3 = yer.a;
                            xsnVarA3.b = new yep(vynVar);
                            xsnVarA3.c = new yep(vyp.a);
                            xsqVarA3 = xsnVarA3.a();
                            vyf.b = xsqVarA3;
                        }
                    }
                }
                return ((lql) this.b).c(iegVar2, vynVarB, xsqVarA3, new lqp(13)).e(new ljt(this.c, 7));
            case 4:
                lry lryVar = (lry) obj;
                vff vffVarS = ((gag) this.c).s(lryVar);
                ieg iegVar3 = lryVar.b;
                ieg iegVarC = ((lql) this.a).c(iegVar3, vffVarS, vfi.a(), new lqp(16));
                if (iegVarC.m()) {
                    SharedPreferences.Editor editorEdit = this.b.edit();
                    String strC = ktw.c(iegVar3);
                    vdo vdoVar = ((vfg) iegVarC.g()).c;
                    if (vdoVar == null) {
                        vdoVar = vdo.a;
                    }
                    vbm vbmVar = vdoVar.c;
                    if (vbmVar == null) {
                        vbmVar = vbm.a;
                    }
                    editorEdit.putString(strC, vbmVar.b == 1 ? (String) vbmVar.c : "").apply();
                }
                return iegVarC.e(new lqp(17));
            case 5:
                lry lryVar2 = (lry) obj;
                vff vffVarS2 = ((gag) this.c).s(lryVar2);
                ieg iegVar4 = lryVar2.b;
                ieg iegVarC2 = ((lql) this.a).c(iegVar4, vffVarS2, vfi.a(), new lqp(18));
                if (iegVarC2.m()) {
                    SharedPreferences.Editor editorEdit2 = this.b.edit();
                    String strC2 = ktw.c(iegVar4);
                    vdo vdoVar2 = ((vfg) iegVarC2.g()).c;
                    if (vdoVar2 == null) {
                        vdoVar2 = vdo.a;
                    }
                    vbm vbmVar2 = vdoVar2.c;
                    if (vbmVar2 == null) {
                        vbmVar2 = vbm.a;
                    }
                    editorEdit2.putString(strC2, vbmVar2.b == 1 ? (String) vbmVar2.c : "").apply();
                }
                return iegVarC2.e(new lqp(19));
            case 6:
                return ((lql) this.a).c(((ldy) this.b).a(), ((kuw) this.c).k((lsi) obj), wae.a(), new lqp(20)).c(new lsl(i2));
            case 7:
                return ((lql) this.a).c(((ldy) this.b).a(), ((kuw) this.c).k((lsi) obj), wae.a(), new lsl(z ? 1 : 0)).c(new lsl(2));
            case 8:
                ltm ltmVar = (ltm) obj;
                return ((lql) this.b).a((ieg) ((kqd) ltmVar.a).a, ((ltn) this.a).b(ltmVar), wbb.i(), new lsl(i)).e(new ljt(this.c, 10));
            case 9:
                kvf kvfVar = (kvf) obj;
                krk krkVar = new krk(this.a, i);
                ieg iegVar5 = (ieg) (this.c.b(kvfVar) ? this.b.b(kvfVar) : ieg.a);
                if (iegVar5.m() && kxg.c((kxg) iegVar5.g()) && krkVar.a()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return BootstrapWatchActivity.$r8$lambda$X_q5uL_GulmtU7CHi3RFA5SaFWw((BootstrapWatchActivity) this.c, this.b, (ksy) this.a, (ieg) obj);
        }
    }

    public /* synthetic */ lrc(Object obj, lql lqlVar, Object obj2, int i) {
        this.d = i;
        this.a = obj;
        this.b = lqlVar;
        this.c = obj2;
    }

    public /* synthetic */ lrc(Object obj, lql lqlVar, Object obj2, int i, byte[] bArr) {
        this.d = i;
        this.c = obj;
        this.a = lqlVar;
        this.b = obj2;
    }
}
