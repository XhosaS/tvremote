package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import java.util.concurrent.ScheduledFuture;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class nva implements ont {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ nva(lcz lczVar, ksn ksnVar, Consumer consumer, int i) {
        this.d = i;
        this.b = lczVar;
        this.a = ksnVar;
        this.c = consumer;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.function.Consumer] */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object, java.util.concurrent.ScheduledFuture] */
    @Override // defpackage.ont
    public final void a(onz onzVar) {
        Object objR;
        int i = this.d;
        if (i == 0) {
            ko koVar = ((nvc) this.a).c;
            Object obj = this.b;
            synchronized (koVar) {
                koVar.remove(obj);
            }
            this.c.cancel(false);
            return;
        }
        int i2 = 1;
        if (i == 1) {
            boolean zI = onzVar.i();
            final ?? r0 = this.c;
            if (!zI) {
                r0.accept(false);
                return;
            }
            Object obj2 = this.a;
            Object obj3 = this.b;
            omm ommVar = (omm) obj3;
            ommVar.d(((ksn) obj2).a, new oml() { // from class: lcy
                @Override // defpackage.oml
                public final void a(boolean z) {
                    r0.accept(Boolean.valueOf(z));
                }
            });
            return;
        }
        boolean zI2 = onzVar.i();
        Object obj4 = this.c;
        Object obj5 = this.b;
        if (!zI2) {
            ((phz) obj4).d.j((oyd) obj5, pfq.FAILED_UNKNOWN);
            return;
        }
        tfa tfaVar = (tfa) onzVar.e();
        oyd oydVar = (oyd) obj5;
        uyr uyrVar = oydVar.c.f;
        if (uyrVar == null) {
            uyrVar = uyr.a;
        }
        if (uyrVar.f) {
            ((phz) obj4).d.j(oydVar, pfq.SUCCESS);
            return;
        }
        phz phzVar = (phz) obj4;
        phzVar.a.i(oydVar);
        tfc tfcVar = phzVar.c;
        if (tfaVar.b()) {
            objR = osk.r(null);
        } else {
            Object obj6 = this.a;
            Intent intent = new Intent((Context) obj6, (Class<?>) PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", tfaVar.a());
            Activity activity = (Activity) obj6;
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            kwy kwyVar = new kwy((byte[]) null, (byte[]) null);
            intent.putExtra("result_receiver", new tfb(tfcVar.b, kwyVar));
            activity.startActivity(intent);
            objR = kwyVar.a;
        }
        ((onz) objR).l(ugk.a, new tfl(obj4, obj5, i2));
    }

    public /* synthetic */ nva(nvc nvcVar, String str, ScheduledFuture scheduledFuture, int i) {
        this.d = i;
        this.a = nvcVar;
        this.b = str;
        this.c = scheduledFuture;
    }

    public /* synthetic */ nva(phz phzVar, oyd oydVar, by byVar, int i) {
        this.d = i;
        this.c = phzVar;
        this.b = oydVar;
        this.a = byVar;
    }
}
