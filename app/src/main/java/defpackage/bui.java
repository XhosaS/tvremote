package defpackage;

import android.view.View;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public class bui implements buv {
    final /* synthetic */ View a;
    final /* synthetic */ ArrayList b;

    public bui(View view, ArrayList arrayList) {
        this.a = view;
        this.b = arrayList;
    }

    @Override // defpackage.buv
    public final void b(bvc bvcVar) {
        bvcVar.H(this);
        this.a.setVisibility(8);
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    @Override // defpackage.buv
    public final void e(bvc bvcVar) {
        bvcVar.H(this);
        bvcVar.F(this);
    }

    @Override // defpackage.buv
    public final /* synthetic */ void f(bvc bvcVar) {
        b(bvcVar);
    }

    @Override // defpackage.buv
    public final /* synthetic */ void g(bvc bvcVar) {
        e(bvcVar);
    }

    @Override // defpackage.buv
    public final void c() {
    }

    @Override // defpackage.buv
    public final void d() {
    }

    @Override // defpackage.buv
    public final void a(bvc bvcVar) {
    }
}
