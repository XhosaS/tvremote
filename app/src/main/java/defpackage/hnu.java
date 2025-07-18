package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class hnu implements View.OnClickListener {
    public final /* synthetic */ hny a;
    public final /* synthetic */ adwq b;
    public final /* synthetic */ String c;

    public /* synthetic */ hnu(hny hnyVar, adwq adwqVar, String str) {
        this.a = hnyVar;
        this.b = adwqVar;
        this.c = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hmb hmbVar = this.a.f;
        hmbVar.p().f();
        hmbVar.p().h(new hnv(this.b, this.c));
    }
}
