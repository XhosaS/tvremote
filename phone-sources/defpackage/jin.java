package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class jin implements yjk {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    private final /* synthetic */ int f;

    public /* synthetic */ jin(jan janVar, wll wllVar, String str, wpm wpmVar, Context context, int i) {
        this.f = i;
        this.d = janVar;
        this.a = wllVar;
        this.c = str;
        this.e = wpmVar;
        this.b = context;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [bcb, java.lang.Object] */
    @Override // defpackage.yjk
    public final Object a() {
        int i = this.f;
        if (i == 0) {
            Object obj = this.e;
            Object obj2 = this.d;
            Object obj3 = this.c;
            ((jir) this.a).d((View) this.b, (wni) obj3, true, (jil) obj2, (jiv) obj);
            return ygi.a;
        }
        if (i == 1) {
            jan janVar = (jan) this.d;
            boolean zD = janVar.d();
            Object obj4 = this.e;
            Object obj5 = this.c;
            Object obj6 = this.a;
            if (zD) {
                janVar.n((wll) obj6, (String) obj5, (wpm) obj4);
            } else {
                janVar.h.c((Context) this.b, (wll) obj6, (String) obj5, (wpm) obj4, false);
            }
            return ygi.a;
        }
        wsa wsaVar = (wsa) this.c;
        wkg wkgVar = wsaVar.f;
        if (wkgVar == null) {
            wkgVar = wkg.a;
        }
        if (wkgVar.v()) {
            wkg wkgVar2 = wsaVar.f;
            if (wkgVar2 == null) {
                wkgVar2 = wkg.a;
            }
            Object obj7 = this.b;
            Object obj8 = this.a;
            wkgVar2.getClass();
            ((irc) obj8).e(wkgVar2, (Context) obj7, "");
        }
        kaz.d(this.d, ((kbc) this.e).b());
        return ygi.a;
    }

    public /* synthetic */ jin(jir jirVar, CompoundButton compoundButton, wni wniVar, jil jilVar, jiv jivVar, int i) {
        this.f = i;
        this.a = jirVar;
        this.b = compoundButton;
        this.c = wniVar;
        this.d = jilVar;
        this.e = jivVar;
    }

    public /* synthetic */ jin(wsa wsaVar, irc ircVar, Context context, kbc kbcVar, bcb bcbVar, int i) {
        this.f = i;
        this.c = wsaVar;
        this.a = ircVar;
        this.b = context;
        this.e = kbcVar;
        this.d = bcbVar;
    }
}
