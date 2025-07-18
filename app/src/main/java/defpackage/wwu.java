package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class wwu implements View.OnClickListener {
    public final /* synthetic */ wxc a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ View.OnClickListener f;

    public /* synthetic */ wwu(wxc wxcVar, String str, String str2, int i, String str3, View.OnClickListener onClickListener) {
        this.a = wxcVar;
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = str3;
        this.f = onClickListener;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        wxc wxcVar = this.a;
        String str = this.e;
        String str2 = this.b;
        String str3 = this.c;
        View.OnClickListener onClickListener = this.f;
        wvl wvlVarB = wxcVar.b(str, str2, str3, this.d);
        try {
            onClickListener.onClick(view);
            wvlVarB.close();
        } catch (Throwable th) {
            try {
                wvlVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
