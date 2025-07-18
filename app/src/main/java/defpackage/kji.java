package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kji extends kjj {
    final /* synthetic */ Intent a;
    final /* synthetic */ khb b;

    public kji(Intent intent, khb khbVar) {
        this.a = intent;
        this.b = khbVar;
    }

    @Override // defpackage.kjj
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
