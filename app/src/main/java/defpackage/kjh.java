package defpackage;

import android.app.Activity;
import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes.dex */
public class kjh extends kjj {
    final /* synthetic */ Intent a;
    final /* synthetic */ Activity b;

    public kjh(Intent intent, Activity activity) {
        this.a = intent;
        this.b = activity;
    }

    @Override // defpackage.kjj
    public final void a() {
        Intent intent = this.a;
        if (intent != null) {
            this.b.startActivityForResult(intent, 2);
        }
    }
}
