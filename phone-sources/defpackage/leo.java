package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import java.util.concurrent.ExecutionException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class leo implements idf {
    private final Context a;
    private final int b;
    private final int c;

    public leo(Context context, int i, int i2) {
        this.a = context;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.idf
    public final /* bridge */ /* synthetic */ Object b(Object obj) {
        try {
            return ieg.f((Bitmap) hjr.c(this.a).b().e((Uri) obj).j(this.b, this.c).get());
        } catch (InterruptedException | ExecutionException e) {
            return ieg.b(e);
        }
    }
}
