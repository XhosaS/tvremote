package defpackage;

import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gjw extends gjv {
    final /* synthetic */ ir a;
    final /* synthetic */ gjx b;

    public gjw(gjx gjxVar, ir irVar) {
        this.b = gjxVar;
        this.a = irVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.gjv, defpackage.gjr
    public final void b(gju gjuVar) {
        ((ArrayList) this.a.get(this.b.b)).remove(gjuVar);
        gjuVar.G(this);
    }
}
