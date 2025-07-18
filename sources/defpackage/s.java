package defpackage;

import android.os.Handler;
import android.view.View;
import android.view.Window;

/* compiled from: PG */
/* loaded from: classes.dex */
final class s extends y implements ng, nh, az, ba, yc, kv, ld, abk, ap, pr {
    final /* synthetic */ t a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(t tVar) {
        super(tVar, tVar, new Handler());
        this.a = tVar;
    }

    @Override // defpackage.abk
    public final adx J() {
        return this.a.J();
    }

    @Override // defpackage.yc
    public final asv K() {
        return this.a.K();
    }

    @Override // defpackage.y, defpackage.v
    public final View a(int i) {
        return this.a.findViewById(i);
    }

    @Override // defpackage.y, defpackage.v
    public final boolean b() {
        Window window = this.a.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // defpackage.xf
    public final xc m() {
        return this.a.d;
    }

    @Override // defpackage.ap
    public final void c() {
    }
}
