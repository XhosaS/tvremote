package defpackage;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.Display;
import com.google.android.apps.tvsearch.results.suggestion.SuggestionChipList;
import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: PG */
/* loaded from: classes.dex */
public class ffx extends Handler implements lyv {
    final /* synthetic */ fga a;
    private final agqi b;
    private boolean c;
    private final zvj d;
    private int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ffx(fga fgaVar) {
        super(Looper.getMainLooper());
        this.a = fgaVar;
        this.b = new agqi();
        this.d = new zvj(new ConcurrentHashMap());
    }

    private final void b() throws abxv {
        agqi agqiVar = this.b;
        int i = agqiVar.a;
        for (int i2 = 0; i2 < i; i2++) {
            Message message = (Message) agqiVar.c();
            if (message != null) {
                handleMessage(message);
            }
        }
    }

    private final void c(String str, Message message) throws abxv {
        String str2;
        fey feyVar;
        fey feyVar2;
        fey feyVar3;
        fey feyVar4;
        if (jhz.a.contains(str)) {
            ((gmd) this.a.l.a()).m(gmc.C);
        }
        fga fgaVar = this.a;
        fgaVar.a(str);
        boolean z = true;
        if (e(message, true)) {
            Object objA = fgaVar.m.a();
            objA.getClass();
            fgl fglVar = (fgl) objA;
            fglVar.I(fga.a.a(6, null));
            byte[] bArrB = irw.b(message.getData().getByteArray(str));
            if (agvy.c(str, fbo.S.a())) {
                aeal aealVarZ = fglVar.z(bArrB);
                if (aealVarZ != null && !fglVar.M(aealVarZ)) {
                    if ((aealVarZ.b & 2) != 0) {
                        adyj adyjVar = aealVarZ.c;
                        if (adyjVar == null) {
                            adyjVar = adyj.a;
                        }
                        z = !hky.p(adyjVar);
                    }
                    hky hkyVar = new hky(fglVar.s, aealVarZ, null, fglVar.t);
                    fey feyVar5 = fglVar.r;
                    if (feyVar5 != null) {
                        feyVar5.v(hkyVar);
                    }
                }
            } else if (agvy.c(str, fbo.T.a())) {
                xps xpsVarB = fgl.a.b(bArrB);
                if (xpsVarB != null && (feyVar4 = fglVar.r) != null) {
                    feyVar4.s(xpsVarB);
                }
            } else if (agvy.c(str, fbo.U.a())) {
                xpu xpuVarC = fgl.a.c(bArrB);
                if (xpuVarC != null && (feyVar3 = fglVar.r) != null) {
                    feyVar3.m(xpuVarC);
                }
            } else if (agvy.c(str, fbo.V.a())) {
                ahal.e(fglVar.e, null, 0, new fgh(bArrB, fglVar, null), 3);
            } else if (agvy.c(str, fbo.W.a())) {
                if (fglVar.y) {
                    xqe xqeVarE = fgl.a.e(bArrB);
                    if (xqeVarE != null) {
                        fglVar.y = false;
                        hky hkyVar2 = new hky(fglVar.s, agqq.e(xqeVarE), fglVar.t);
                        fey feyVar6 = fglVar.r;
                        if (feyVar6 != null) {
                            feyVar6.v(hkyVar2);
                        }
                        fey feyVar7 = fglVar.r;
                        if (feyVar7 != null) {
                            feyVar7.j(xqeVarE, false);
                        }
                    }
                } else {
                    ahal.e(fglVar.e, null, 0, new fgj(bArrB, fglVar, null), 3);
                }
            } else if (agvy.c(str, fbo.Y.a())) {
                ahdl ahdlVar = fglVar.B;
                if (ahdlVar != null) {
                    ahdlVar.s(null);
                }
                fglVar.B = null;
                fey feyVar8 = fglVar.r;
                if (feyVar8 != null) {
                    feyVar8.C(fglVar.w);
                }
                xqg xqgVarF = fgl.a.f(bArrB);
                if (xqgVarF != null && (feyVar2 = fglVar.r) != null) {
                    String str3 = fglVar.t;
                    if (str3 == null) {
                        str3 = "";
                    }
                    feyVar2.t(xqgVarF, str3);
                }
            } else if (agvy.c(str, fbo.Z.a())) {
                xqk xqkVarG = fgl.a.g(bArrB);
                if (xqkVarG == null || !fglVar.P(xqkVarG)) {
                    fglVar.E(xqkVarG);
                } else if ((((xqi) xqkVarG.b.get(0)).b & 1) != 0) {
                    ((zdv) fgl.b.c().q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "showShelves", 816, "LibAsHandler.kt")).x("Unsupported action [%s] received with exmo.", str);
                } else {
                    fey feyVar9 = fglVar.r;
                    if (feyVar9 != null) {
                        feyVar9.B();
                    }
                }
            } else if (agvy.c(str, fbo.ab.a())) {
                SuggestionChipList suggestionChipListY = fglVar.y(bArrB);
                if (suggestionChipListY != null && (feyVar = fglVar.r) != null) {
                    feyVar.w(suggestionChipListY);
                }
            } else if (agvy.c(str, fbo.ac.a())) {
                if (((Boolean) fglVar.g.a()).booleanValue() && (str2 = fglVar.t) != null) {
                    gfl gflVarA = ((gfn) fglVar.l.a()).a(rpm.cY()).a(str2);
                    gflVarA.h(str2);
                    gflVarA.c();
                }
                fglVar.B = ahal.e(fglVar.f, null, 0, new fgk(fglVar, bArrB, null), 3);
            } else if (agvy.c(str, fbo.ad.a())) {
                xqy xqyVarH = fgl.a.h(bArrB);
                if (xqyVarH != null) {
                    int iA = xqx.a(xqyVarH.c);
                    if (iA != 0 && iA == 2) {
                        jrs jrsVar = fglVar.i;
                        String str4 = xqyVarH.b;
                        str4.getClass();
                        ((jru) jrsVar).d(str4, jru.a);
                    } else {
                        jrs jrsVar2 = fglVar.i;
                        String str5 = xqyVarH.b;
                        str5.getClass();
                        jrsVar2.b(str5);
                    }
                }
            } else {
                ((zdv) fgl.b.c().q("com/google/android/apps/tvsearch/controller/libas/LibAsHandler", "displayUi", 733, "LibAsHandler.kt")).x("Unsupported action [%s] received with exmo.", str);
            }
            fglVar.v = z;
        }
    }

    private final void d(Intent intent) {
        ((zdv) fga.b.b().q("com/google/android/apps/tvsearch/controller/libas/KatnissSearchProcessServicePeer$IncomingHandler", "startResultsReceiverBinding", 584, "KatnissSearchProcessServicePeer.kt")).u("#startResultsReceiverBinding");
        fga fgaVar = this.a;
        Object objA = fgaVar.m.a();
        objA.getClass();
        ((fgl) objA).F(this);
        this.c = true;
        ((exz) fgaVar.i.a()).c(intent);
    }

    private final boolean e(Message message, boolean z) {
        fga fgaVar = this.a;
        if (((fgl) fgaVar.m.a()).O()) {
            return true;
        }
        ((zdv) fga.b.b().q("com/google/android/apps/tvsearch/controller/libas/KatnissSearchProcessServicePeer$IncomingHandler", "checkBindingStatusThenHandleUnboundCase", 555, "KatnissSearchProcessServicePeer.kt")).u("Waiting for the binding, no receiver to handle the operations right now");
        agqi agqiVar = this.b;
        Message messageObtain = Message.obtain(message);
        messageObtain.getClass();
        agqiVar.addLast(messageObtain);
        if (this.c || !z || ((Display) fgaVar.e.a()).getState() != 2) {
            return false;
        }
        d(new Intent());
        return false;
    }

    @Override // defpackage.lyv
    public final void a() throws abxv {
        Object objA = this.a.m.a();
        objA.getClass();
        fgl fglVar = (fgl) objA;
        fglVar.D(this);
        this.c = false;
        b();
        fglVar.I(fga.a.a(this.e, null));
        this.e = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (r3 != false) goto L23;
     */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleMessage(android.os.Message r25) throws defpackage.abxv {
        /*
            Method dump skipped, instructions count: 2174
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ffx.handleMessage(android.os.Message):void");
    }
}
