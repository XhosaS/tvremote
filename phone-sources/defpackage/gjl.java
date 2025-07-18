package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjl implements gjr {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public gjl(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.gjr
    public final void b(gju gjuVar) {
        gjuVar.G(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.gjr
    public final void e(gju gjuVar) {
        gjuVar.G(this);
        gjuVar.C(this);
    }

    @Override // defpackage.gjr
    public final /* synthetic */ void f(gju gjuVar) {
        gli.h(this, gjuVar);
    }

    @Override // defpackage.gjr
    public final /* synthetic */ void g(gju gjuVar) {
        gli.i(this, gjuVar);
    }

    @Override // defpackage.gjr
    public final void c() {
    }

    @Override // defpackage.gjr
    public final void d() {
    }

    @Override // defpackage.gjr
    public final void a(gju gjuVar) {
    }
}
