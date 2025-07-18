package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
final class cmz extends ykt implements yjk {
    final /* synthetic */ Context a;
    final /* synthetic */ yjv b;
    final /* synthetic */ baw c;
    final /* synthetic */ bie d;
    final /* synthetic */ int e;
    final /* synthetic */ View f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cmz(Context context, yjv yjvVar, baw bawVar, bie bieVar, int i, View view) {
        super(0);
        this.a = context;
        this.b = yjvVar;
        this.c = bawVar;
        this.d = bieVar;
        this.e = i;
        this.f = view;
    }

    @Override // defpackage.yjk
    public final /* bridge */ /* synthetic */ Object a() {
        KeyEvent.Callback callback = this.f;
        callback.getClass();
        yjv yjvVar = this.b;
        Context context = this.a;
        View view = (View) yjvVar.a(context);
        bse bseVar = new bse();
        bie bieVar = this.d;
        return new cmv(context, this.c, view, bseVar, bieVar, this.e, (bzz) callback).v;
    }
}
