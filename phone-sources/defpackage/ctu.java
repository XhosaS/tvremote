package defpackage;

import android.content.Context;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ctu implements Callable {
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ ctt c;
    final /* synthetic */ int d;

    public ctu(String str, Context context, ctt cttVar, int i) {
        this.a = str;
        this.b = context;
        this.c = cttVar;
        this.d = i;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        return ctx.b(this.a, this.b, dhk.b(new Object[]{this.c}), this.d);
    }
}
