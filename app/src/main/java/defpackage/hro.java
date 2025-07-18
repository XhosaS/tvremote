package defpackage;

import android.os.Handler;
import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class hro extends hrt {
    final /* synthetic */ hrw a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hro(hrw hrwVar, View view) {
        super(view);
        this.a = hrwVar;
    }

    @Override // defpackage.hrt
    protected final Handler a() {
        return this.a.aJ;
    }

    @Override // defpackage.hrt
    protected final void b() {
        this.a.bn = null;
    }
}
