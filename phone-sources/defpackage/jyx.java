package defpackage;

import android.graphics.Bitmap;
import com.google.android.apps.googletv.app.presentation.pages.entity.EntityPageActivity;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jyx extends hvf {
    final /* synthetic */ EntityPageActivity b;

    public jyx(EntityPageActivity entityPageActivity) {
        this.b = entityPageActivity;
    }

    @Override // defpackage.hvm
    public final /* bridge */ /* synthetic */ void b(Object obj, hvv hvvVar) {
        xzg xzgVar = new xzg();
        xzgVar.a = (Bitmap) obj;
        sru.b(this.b, new srv(xzgVar));
    }
}
