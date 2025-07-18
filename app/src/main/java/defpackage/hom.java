package defpackage;

import android.view.View;

/* compiled from: PG */
/* loaded from: classes.dex */
class hom implements View.OnClickListener {
    final /* synthetic */ hon a;
    final /* synthetic */ hoj b;
    final /* synthetic */ hkk c;

    public hom(hon honVar, hoj hojVar, hkk hkkVar) {
        this.a = honVar;
        this.b = hojVar;
        this.c = hkkVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        hon honVar = this.a;
        awk awkVar = honVar.s;
        if (awkVar != null) {
            awkVar.ew(this.b, this.c, honVar, honVar.j);
        }
    }
}
