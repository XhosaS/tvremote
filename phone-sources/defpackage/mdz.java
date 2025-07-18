package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class mdz implements mdy {
    private final /* synthetic */ int a;
    private final Object b;

    public mdz(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.mdy
    public final void a(Intent intent) {
        if (this.a != 0) {
            ((Activity) this.b).startActivity(intent);
        } else {
            ((bv) this.b).startActivity(intent);
        }
    }

    @Override // defpackage.mdy
    public final void b(Intent intent, int i) {
        if (this.a != 0) {
            ((Activity) this.b).startActivityForResult(intent, i);
        } else {
            ((bv) this.b).startActivityForResult(intent, i);
        }
    }
}
