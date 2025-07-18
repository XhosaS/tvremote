package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class oba extends obb {
    final /* synthetic */ Intent a;
    final /* synthetic */ nzp b;

    public oba(Intent intent, nzp nzpVar) {
        this.a = intent;
        this.b = nzpVar;
    }

    @Override // defpackage.obb
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
