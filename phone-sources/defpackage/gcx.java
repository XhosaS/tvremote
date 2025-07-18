package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
final class gcx implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ gcy a;

    public gcx(gcy gcyVar) {
        this.a = gcyVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        gcy gcyVar = this.a;
        if (z) {
            gcyVar.b = gcyVar.a.add(gcyVar.d[i].toString()) | gcyVar.b;
        } else {
            gcyVar.b = gcyVar.a.remove(gcyVar.d[i].toString()) | gcyVar.b;
        }
    }
}
