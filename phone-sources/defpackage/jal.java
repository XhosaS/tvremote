package defpackage;

import android.os.Handler;
import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jal implements itj {
    final /* synthetic */ jan a;
    final /* synthetic */ yjk b;

    public jal(jan janVar, yjk yjkVar) {
        this.a = janVar;
        this.b = yjkVar;
    }

    @Override // defpackage.itj
    public final void a(ith ithVar) {
        this.a.d.j(this);
        new Handler(Looper.getMainLooper()).post(new iuc(this.b, 9));
    }
}
