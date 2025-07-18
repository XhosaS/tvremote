package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class brj extends ykt implements yjv {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brj(Object obj, int i) {
        super(1);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // defpackage.yjv
    public final /* synthetic */ Object a(Object obj) {
        boolean zDispatchTouchEvent;
        boolean z = true;
        switch (this.b) {
            case 0:
                bpq bpqVar = (bpq) obj;
                brk brkVar = (brk) this.a;
                float f = brkVar.g;
                float f2 = brkVar.h;
                bpn bpnVarP = bpqVar.p();
                long jA = bpnVarP.a();
                bpnVarP.b().g();
                bqk bqkVar = brkVar.a;
                try {
                    bpnVarP.c.x(f, f2, 0L);
                    bqkVar.b(bpqVar);
                    bpnVarP.b().e();
                    bpnVarP.h(jA);
                    return ygi.a;
                } catch (Throwable th) {
                    bpnVarP.b().e();
                    bpnVarP.h(jA);
                    throw th;
                }
            case 1:
                brk brkVar2 = (brk) this.a;
                brkVar2.c = true;
                brkVar2.d.a();
                return ygi.a;
            case 2:
                cak cakVar = (cak) obj;
                if (cakVar.E().A) {
                    ((ylf) this.a).a = cakVar;
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                bsn bsnVar = (bsn) obj;
                ylf ylfVar = (ylf) this.a;
                if (ylfVar.a == null && bsnVar.b) {
                    ylfVar.a = bsnVar;
                }
                return true;
            case 4:
                if (!((bsn) obj).b) {
                    return caj.a;
                }
                ((ylb) this.a).a = false;
                return caj.c;
            case 5:
                ((btf) this.a).d().a((MotionEvent) obj);
                return ygi.a;
            case 6:
                ((btf) this.a).d().a((MotionEvent) obj);
                return ygi.a;
            case 7:
                MotionEvent motionEvent = (MotionEvent) obj;
                switch (motionEvent.getActionMasked()) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = ((cmv) this.a).dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = ((cmv) this.a).dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            case 8:
                Throwable th2 = (Throwable) obj;
                btq btqVar = (btq) this.a;
                yoe yoeVar = btqVar.a;
                if (yoeVar != null) {
                    yoeVar.e(th2);
                }
                btqVar.a = null;
                return ygi.a;
            case 9:
                bwi.z((bwi) obj, (bwj) this.a, 0, 0);
                return ygi.a;
            case 10:
                bwi bwiVar = (bwi) obj;
                ?? r0 = this.a;
                int size = r0.size();
                for (int i = 0; i < size; i++) {
                    bwi.z(bwiVar, (bwj) r0.get(i), 0, 0);
                }
                return ygi.a;
            case 11:
                bxm bxmVar = (bxm) obj;
                if (bxmVar.o()) {
                    if (bxmVar.h().b) {
                        bxmVar.l();
                    }
                    Map map = bxmVar.h().h;
                    Object obj2 = this.a;
                    for (Map.Entry entry : map.entrySet()) {
                        ((bxl) obj2).d((bub) entry.getKey(), ((Number) entry.getValue()).intValue(), bxmVar.j());
                    }
                    bzq bzqVar = bxmVar.j().w;
                    bzqVar.getClass();
                    while (true) {
                        bxl bxlVar = (bxl) obj2;
                        if (!yks.e(bzqVar, bxlVar.a.j())) {
                            for (bub bubVar : bxlVar.c(bzqVar).keySet()) {
                                bxlVar.d(bubVar, bxlVar.a(bzqVar, bubVar), bzqVar);
                            }
                            bzqVar = bzqVar.w;
                            bzqVar.getClass();
                        }
                    }
                }
                return ygi.a;
            case 12:
                ((bfz) this.a).o((bkn) obj);
                return true;
            case 13:
                ((ylf) this.a).a = (bmr) obj;
                return true;
            case 14:
                return Boolean.valueOf(((bmr) obj).g(((blz) this.a).a));
            case 15:
                return Boolean.valueOf(((bmr) obj).g(((blz) this.a).a));
            case 16:
                yjk yjkVar = (yjk) obj;
                cbc cbcVar = (cbc) this.a;
                Handler handler = cbcVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    yjkVar.a();
                } else {
                    Handler handler2 = cbcVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new caw(yjkVar, 3));
                    }
                }
                return ygi.a;
            case 17:
                Object obj3 = this.a;
                return new cbv((View) obj3, ((cbc) obj3).F, (yow) obj);
            case 18:
                cbc cbcVar2 = ((cbi) this.a).b;
                return Boolean.valueOf(cbcVar2.getParent().requestSendAccessibilityEvent(cbcVar2, (AccessibilityEvent) obj));
            case 19:
                ((cbi) this.a).l((cdn) obj);
                return ygi.a;
            default:
                return Boolean.valueOf(((jc) this.a).b(((cff) obj).e));
        }
    }
}
