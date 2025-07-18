package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class bid implements DialogInterface.OnMultiChoiceClickListener {
    final /* synthetic */ bie a;

    public bid(bie bieVar) {
        this.a = bieVar;
    }

    @Override // android.content.DialogInterface.OnMultiChoiceClickListener
    public final void onClick(DialogInterface dialogInterface, int i, boolean z) {
        bie bieVar = this.a;
        if (z) {
            bieVar.ai = bieVar.ah.add(bieVar.ak[i].toString()) | bieVar.ai;
        } else {
            bieVar.ai = bieVar.ah.remove(bieVar.ak[i].toString()) | bieVar.ai;
        }
    }
}
