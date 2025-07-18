package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import com.google.android.apps.googletv.app.sherlog.SherlogMenuButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ixq implements DialogInterface.OnClickListener {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public /* synthetic */ ixq(View view, ixt ixtVar, ssn ssnVar, ixp ixpVar, int i) {
        this.e = i;
        this.a = view;
        this.b = ixtVar;
        this.c = ssnVar;
        this.d = ixpVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object, yjk] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object, kmo] */
    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.e;
        if (i2 == 0) {
            yow yowVarO = ihz.O((View) this.a);
            if (yowVarO != null) {
                Object obj = this.d;
                ykr.q(yowVarO, null, 0, new ixs((ixt) this.b, (ssn) this.c, (ixp) obj, (yih) null, 2, (byte[]) null), 3);
                return;
            }
            return;
        }
        if (i2 == 1) {
            yow yowVarO2 = ihz.O((View) this.a);
            if (yowVarO2 != null) {
                Object obj2 = this.d;
                ykr.q(yowVarO2, null, 0, new ixs((ixt) this.b, (ssn) this.c, (ixp) obj2, (yih) null, 0), 3);
                return;
            }
            return;
        }
        if (i2 == 2) {
            View view = (View) this.a;
            yow yowVarO3 = ihz.O(view);
            if (yowVarO3 != null) {
                Object obj3 = this.d;
                ykr.q(yowVarO3, null, 0, new ajo((ixt) this.b, view, (ssn) this.c, (ixp) obj3, (yih) null, 14), 3);
                return;
            }
            return;
        }
        if (i2 == 3) {
            ?? r14 = this.c;
            Object obj4 = this.b;
            ((jan) this.d).b((Context) this.a, (wpm) obj4, r14);
            return;
        }
        Object obj5 = this.c;
        yow yowVarO4 = ihz.O((View) obj5);
        if (yowVarO4 != null) {
            Object obj6 = this.a;
            ykr.q(yowVarO4, null, 0, new ajo((kmo) this.b, (View) this.d, (Context) obj6, (SherlogMenuButton) obj5, (yih) null, 18), 3);
        }
    }

    public /* synthetic */ ixq(SherlogMenuButton sherlogMenuButton, kmo kmoVar, View view, Context context, int i) {
        this.e = i;
        this.c = sherlogMenuButton;
        this.b = kmoVar;
        this.d = view;
        this.a = context;
    }

    public /* synthetic */ ixq(jan janVar, Context context, wpm wpmVar, yjk yjkVar, int i) {
        this.e = i;
        this.d = janVar;
        this.a = context;
        this.b = wpmVar;
        this.c = yjkVar;
    }
}
