package defpackage;

import android.content.DialogInterface;

/* compiled from: PG */
/* loaded from: classes.dex */
class bia implements DialogInterface.OnClickListener {
    final /* synthetic */ bib a;

    public bia(bib bibVar) {
        this.a = bibVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bib bibVar = this.a;
        bibVar.ah = i;
        ((bim) bibVar).al = -1;
        dialogInterface.dismiss();
    }
}
